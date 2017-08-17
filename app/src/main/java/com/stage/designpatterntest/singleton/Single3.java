/**
 结构是简单的，但是却存在以下情况；
1.每次从getInstance()都能返回一个且唯一的一个对象。
2.资源共享情况下，getBanZhengWindow()必须适应多线程并发访问。
3.提高访问性能。
4.懒加载（Lazy Load），在需要的时候才被构造。
 */
package com.stage.designpatterntest.singleton;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10 
 * @Version V1.0
 * @Description 单例模式改进3
 
	  看起来这样已经达到了我们的要求，除了第一次创建对象之外，其他的访问在第一个if中就返回了，因此不会走到同步块中。已经完美了吗？
	我们来看看这个场景：假设线程一执行到instance = new SingletonKerriganD()这句，这里看起来是一句话，
	但实际上它并不是一个原子操作（原子操作的意思就是这条语句要么就被执行完，要么就没有被执行过，不能出现执行了一半这种情形）。
	事实上高级语言里面非原子操作有很多，我们只要看看这句话被编译后在JVM执行的对应汇编代码就发现，这句话被编译成8条汇编指令，大致做了3件事情：
	1.给Kerrigan的实例分配内存。
	2.初始化Kerrigan的构造器
	3.将instance对象指向分配的内存空间（注意到这步instance就非null了）。
	但是，由于Java编译器允许处理器乱序执行（out-of-order），以及JDK1.5之前JMM（Java Memory Medel）中Cache、寄存器到主内存回写顺序的规定，
	上面的第二点和第三点的顺序是无法保证的，也就是说，执行顺序可能是1-2-3也可能是1-3-2，如果是后者，并且在3执行完毕、2未执行之前，被切换到线程二上，
	这时候instance因为已经在线程一内执行过了第三点，instance已经是非空了，所以线程二直接拿走instance，然后使用，然后顺理成章地报错，
	而且这种难以跟踪难以重现的错误估计调试上一星期都未必能找得出来，真是一茶几的杯具啊。
	DCL的写法来实现单例是很多技术书、教科书（包括基于JDK1.4以前版本的书籍）上推荐的写法，
	实际上是不完全正确的。的确在一些语言（譬如C语言）上DCL是可行的，取决于是否能保证2、3步的顺序。在JDK1.5之后，
	官方已经注意到这种问题，因此调整了JMM、具体化了volatile关键字，因此如果JDK是1.5或之后的版本，
	只需要将instance的定义改成“private volatile static SingletonKerriganD instance = null;”就可以保证每次都去instance都从主内存读取，
	就可以使用DCL的写法来完成单例模式。当然volatile或多或少也会影响到性能，最重要的是我们还要考虑JDK1.42以及之前的版本，
	所以本文中单例模式写法的改进还在继续。 

 * @Change
 */
public class Single3 {
	private static Single3 instance = null;
	
	public static  Single3 getInstance(){
		if(instance == null){
			synchronized (Single3.class){
				if(instance == null){
					instance = new Single3();
				}
			}
		}
		return instance;
	}
}

    