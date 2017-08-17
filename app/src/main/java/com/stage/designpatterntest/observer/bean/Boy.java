package com.stage.designpatterntest.observer.bean;

import android.widget.TextView;

import com.stage.designpatterntest.observer.utils.Watcher;

/**
 * @Title: 观察者
 * @Author: djk
 * @Time: 2017/8/9
 * @Version:1.0.0
 */
public class Boy implements Watcher {

    TextView tv;
    String boyStr;

    public Boy(TextView tv, String boyStr) {
        this.tv = tv;
        this.boyStr = boyStr;
    }

    /**
     * 当被观察者变化之后，观察者就可以在这里得到回调
     */
    @Override
    public void updateData(Object obj) {
        if (tv != null) {
            tv.setText(boyStr + obj.toString());
        }
    }

}
