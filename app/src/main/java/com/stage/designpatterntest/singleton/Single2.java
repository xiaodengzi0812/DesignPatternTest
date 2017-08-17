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
 * @Description 单例模式改进2
 
  比起单例1仅仅在方法中多了一个synchronized修饰符，现在可以保证不会出线程问题了。但是这里有个很大（至少耗时比例上很大）的性能问题。
  除了第一次调用时是执行了SingletonKerriganB的构造函数之外，以后的每一次调用都是直接返回instance对象。
  返回对象这个操作耗时是很小的，绝大部分的耗时都用在synchronized修饰符的同步准备上，因此从性能上说很不划算。
   
 * @Change
 */
public class Single2 {
	private static Single2 instance = null;
	
	public synchronized static  Single2 getInstance(){
		if(instance == null){
			instance = new Single2();
		}
		return instance;
	}
}

    