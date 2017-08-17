package com.stage.designpatterntest.observer.bean;


import com.stage.designpatterntest.observer.utils.WatchedAbstract;

import java.util.Random;

/**
 * @Title: 被观察者 （继承抽象类的写法）
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public class GirlAbstract extends WatchedAbstract {
    String[] strs = {"美女在吃饭", "美女在打电话", "美女在学习", "美女在跑步", "美女在逛街"};
    Random radom = new Random();

    /**
     * 美女数据变化
     */
    public void change() {
        int position = radom.nextInt(5);
        String str = strs[position];
        notifyWatchers(str);
    }
}
