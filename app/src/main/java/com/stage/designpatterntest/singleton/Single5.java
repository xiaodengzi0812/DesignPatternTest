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
 * @Description 单例模式改进5

           这种写法仍然使用JVM本身机制保证了线程安全问题；由于SingletonHolder是私有的，除了getInstance()之外没有办法访问它，
           因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖JDK版本。
	当然，用户以其它方式构造单例的对象，如果设计者不希望这样的情况发生，则需要做规避措施。其它途径创建单例实例的方式有：
	1.直接new单例对象
	2.通过反射构造单例对象
	3.通过序列化构造单例对象。
	对于第一种情况，一般我们会加入一个private或者protected的构造函数，这样系统就不会自动添加那个public的构造函数了，
		因此只能调用里面的static方法，无法通过new创建对象。
	对于第二种情况，反射时可以使用setAccessible方法来突破private的限制，我们需要做到第一点工作的同时，
		还需要在在 ReflectPermission("suppressAccessChecks") 权限下使用安全管理器（SecurityManager）
		的checkPermission方法来限制这种突破。一般来说，不会真的去做这些事情，都是通过应用服务器进行后台配置实现。
	对于第三种情况，如果单例对象有必要实现Serializable接口（很少出现），则应当同时实现readResolve()
		方法来保证反序列化的时候得到原来的对象。
		
 * 
 * @Change
 */
public class Single5 {

	private static class SingletonHolder {
		static final Single5 INSTANCE = new Single5();
	}
	
	public static Single5 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
