package com.stage.designpatterntest.singleton;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10
 * @Version V1.0
 * @Description 懒汉式DCL(比较常用)
 * volatile 关键字：
 * 1 防止重排序
 * 2 线程可见性 - 某一个线程改了公用对象（变量），短时间内另一个线程可能是不可见的，因为每一个线程都有自己的缓存区（线程工作区）
 * @Change
 */
public class Single2 {
    // 加上volatile关键字
    private static volatile Single2 mInstance = null;

    // 构造私有
    private Single2() {
    }

    // 双判断检测
    public static Single2 getInstance() {
        if (mInstance == null) {
            synchronized (Single2.class) {
                // 必须要有下面这个判断，如果没这个判断就跟没有锁是一个效果
                if (mInstance == null) {
                    mInstance = new Single2();
                }
            }
        }
        return mInstance;
    }
}

    