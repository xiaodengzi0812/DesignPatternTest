package com.stage.designpatterntest.singleton;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10
 * @Version V1.0
 * @Description 静态内部类写法(比较常用)
 * @Change
 */
public class Single3 {

    // 构造私有
    private Single3() {
    }

    // 静态内部类
    private static class Single3Holder {
        private static volatile Single3 INSTANCE = new Single3();
    }

    // 能保证线程安全，还能在用的时候再去new对象
    public static Single3 getInstance() {
        return Single3Holder.INSTANCE;
    }
}

    