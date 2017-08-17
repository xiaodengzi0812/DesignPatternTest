package com.stage.designpatterntest.observer.bean;

import com.stage.designpatterntest.observer.utils.WatchedInterface;
import com.stage.designpatterntest.observer.utils.Watcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Title: 被观察者 （实现接口的写法）
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public class GirlInterface implements WatchedInterface {

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

    private List<Watcher> watcherList = new ArrayList<Watcher>();

    @Override
    public void addWatcher(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyWatchers(Object obj) {
        for (Watcher watcher : watcherList) {
            watcher.updateData(obj);
        }
    }

}
