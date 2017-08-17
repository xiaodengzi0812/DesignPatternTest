package com.stage.designpatterntest.adapter.test2.util;

/**
 * @author Djk
 * @Title: 具体目标类，只提供普通功能
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public class ConcreteTarget implements Target {
    @Override
    public String request() {
        return "普通类 具有 普通功能...";
    }
}
