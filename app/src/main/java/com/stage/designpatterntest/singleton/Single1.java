package com.stage.designpatterntest.singleton;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10
 * @Version V1.0
 * @Description 饿汉式
 * 有一种问题就是浪费资源，我们不调用的时候他也会在系统启动的时候创建Single1类
 * @Change
 */
public class Single1 {
    private static Single1 mInstance = new Single1();

    // 构造私有
    private Single1() {
    }

    // 直接返回
    public static Single1 getInstance() {
        return mInstance;
    }
}

    