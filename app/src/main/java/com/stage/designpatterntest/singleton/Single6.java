package com.stage.designpatterntest.singleton;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10
 * @Version V1.0
 * @Description 单例模式改进6（懒汉式）  第一次加载的时候比较消耗资源
 * @Change
 */
public class Single6 {
	private static class SingletonHolder {  
		/**
		 * 单例对象实例  
		 */
		static final Single6 INSTANCE = new Single6();    
	}
	
	/**
	 * 对外暴露的访问方法
	 */
	public static Single6 getInstance() {    
		return SingletonHolder.INSTANCE;  
	}
	
	/**
	 * private的构造函数用于避免外界直接使用new来实例化对象 
	 */
	private Single6() {}
	
	/**
	 * readResolve方法应对单例对象被序列化时候  
	 */
	private Object readResolve() {    
		return getInstance();    
	}

}
