package com.stage.designpatterntest.decorator.util;

/**
 * @author Djk
 * @Title: 具体的装饰类1
 * @Time: 2017/8/14.
 * @Version:1.0.0
 */
public class DecoratorGift1 extends AbstractGift {

    public DecoratorGift1(InterfaceGift interfaceGift) {
        this.interfaceGift = interfaceGift;
    }

    @Override
    public String getGift() {
        return interfaceGift.getGift() + getDec();
    }

    private String getDec() {
        return " + 纸盒包装";
    }
}
