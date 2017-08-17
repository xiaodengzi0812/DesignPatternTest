package com.stage.designpatterntest.adapter.test2.util;

/**
 * @author Djk
 * @Title: 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public class Adaptee {
    public String specificRequest() {
        return "被适配类具有 特殊功能...";
    }
}
