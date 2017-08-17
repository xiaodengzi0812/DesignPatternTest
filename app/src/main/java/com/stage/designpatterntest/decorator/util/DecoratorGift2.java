package com.stage.designpatterntest.decorator.util;

/**
 * @author Djk
 * @Title: 具体的装饰类1
 * @Time: 2017/8/14.
 * @Version:1.0.0
 */
public class DecoratorGift2 extends AbstractGift {

    public DecoratorGift2(InterfaceGift interfaceGift) {
        this.interfaceGift = interfaceGift;
    }

    @Override
    public String getGift() {
        return interfaceGift.getGift() + getDec();
    }

    private String getDec() {
        return " + 彩带包装";
    }
}
