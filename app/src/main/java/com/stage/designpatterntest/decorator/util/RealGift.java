package com.stage.designpatterntest.decorator.util;

/**
 * @author Djk
 * @Title: 礼物的原始数据（未装饰之前）
 * @Time: 2017/8/14.
 * @Version:1.0.0
 */
public class RealGift implements InterfaceGift {
    @Override
    public String getGift() {
        return "生日礼物";
    }
}
