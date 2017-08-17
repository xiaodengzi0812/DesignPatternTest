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
 * @Description 单例模式改进4(饿汉式)  不会出现并发问题，但浪费资源
 
	  这种写法不会出现并发问题，但是它是饿汉式的，在ClassLoader加载类后

Kerrigan的实例就会第一时间被创建，
	  饿汉式的创建方式在一些场景中将无法使用：譬如实例的创建是依赖参数或者

配置文件的，
	  在getInstance()之前必须调用某个方法设置参数给它，那样这种单例写法就无

法使用了。
   
 * @Change
 */
public class Single4 {
	
	private static Single4 instance = new Single4();
	
	public synchronized static  Single4 getInstance(){
		return instance;
	}
}

    