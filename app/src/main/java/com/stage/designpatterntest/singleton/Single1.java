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
 * @Description 最基本的单例模式写法
 
   假设这样的场景：两个线程并发调用Singleton.getBanZhengWindow()，假设线程一先判断完instance是否为null，
   既代码中的line 27进入到line 28的位置。刚刚判断完毕后，JVM将CPU资源切换给线程二，由于线程一还没执行line 28，
   所以instance仍然是空的，因此线程二执行了new Signleton()操作。片刻之后，线程一被重新唤醒，它执行的仍然是new Signleton()操作。
   所以这种设计的单例模式不能满足第2点需求。
   
 * @Change
 */
public class Single1 {
	private static Single1 instance = null;
	
	public static  Single1 getInstance(){
		if(instance == null){
			instance = new Single1();
		}
		return instance;
	}
}

    