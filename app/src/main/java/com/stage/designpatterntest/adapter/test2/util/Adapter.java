package com.stage.designpatterntest.adapter.test2.util;

/**
 * @author Djk
 * @Title: 适配器类，实现标准接口
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public class Adapter implements Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return this.adaptee.specificRequest();
    }
}
