package com.stage.designpatterntest.observer.utils;

/**
 * @Title: 观察者
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public interface Watcher {
    /**
     * 更新数据
     */
    void updateData(Object obj);
}
