package com.stage.designpatterntest.strategy.util;


/**
 * @author dengzi
 * @Date 2014-12-9 下午4:00:35
 * @Version V1.0
 * @Description 定义一个上下文对象。这里的上下文对象主要用来切换算法，上下文对象里面也是针对接口编程，具体算法实现被封装了。
 * @Change
 */
public class DstPrice {
    private PriceStrategy priceStrategy;

    public DstPrice(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public int ExeCalPrice(int price) {
        return priceStrategy.setPrice(price);
    }
}
