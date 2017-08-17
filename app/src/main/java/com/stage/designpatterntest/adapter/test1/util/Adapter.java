package com.stage.designpatterntest.adapter.test1.util;

/**
 * @author Djk
 * @Title: 适配器类，继承了被适配类，同时实现标准接口
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public String request() {
        return super.specificRequest();
    }
}
