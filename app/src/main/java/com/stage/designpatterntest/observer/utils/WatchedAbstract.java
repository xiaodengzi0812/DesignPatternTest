package com.stage.designpatterntest.observer.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: 被观察者（抽象类，实现了三个常用的方法）
 * 只能被继承使用（这点很蛋疼）
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public abstract class WatchedAbstract {
    private List<Watcher> watcherList = new ArrayList<Watcher>();// 观察者的集合

    /**
     * 定义一个用来增加观察者的方法
     *
     * @param watcher
     */
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    /**
     * 定义一个用来删除观察者的方法
     *
     * @param watcher
     */
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    /**
     * 定义一个可以实现行为变现并向观察者传输信息的方法
     *
     * @param obj
     */
    public void notifyWatchers(Object obj) {
        for (Watcher watcher : watcherList) {
            watcher.updateData(obj);
        }
    }

}
