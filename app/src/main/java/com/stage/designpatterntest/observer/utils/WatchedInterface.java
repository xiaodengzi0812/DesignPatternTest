package com.stage.designpatterntest.observer.utils;

/**
 * @Title: 被观察者（接口，需要实现类去实现了三个方法）
 * 实现此方法即可使用，但需要实现三个方法（这点很蛋疼）
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public interface WatchedInterface {
    /**
     * 定义一个用来增加观察者的方法
     *
     * @param watcher
     */
    void addWatcher(Watcher watcher);

    /**
     * 定义一个用来删除观察者的方法
     *
     * @param watcher
     */
    void removeWatcher(Watcher watcher);

    /**
     * 定义一个可以实现行为变现并向观察者传输信息的方法
     *
     * @param obj
     */
    void notifyWatchers(Object obj);
}
