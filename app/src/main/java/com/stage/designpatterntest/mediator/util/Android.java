package com.stage.designpatterntest.mediator.util;

import java.util.Random;

import android.util.Log;

/**
 * @author dengzi
 * @Date 2014-12-10 下午1:41:37
 * @Version V1.0
 * @Description 安卓工程师
 * @Change
 */
public class Android extends ProjectPerson {
    /**
     * 安卓工程师认识-->项目经理
     */
    public Android(PM pm) {
        this.pm = pm;
    }

    public void coding() {
        Log.e(TAG, "Android工程师开始编写代码。。。");
        String[] informations = {"切图不正确", "跟ios统一UI"};
        Random rd = new Random();
        int chose = rd.nextInt(2);
        Log.e(TAG, informations[chose]);
        communicate(this, informations[chose]);
    }

    public void UnityUi() {
        Log.e(TAG, "Android工程师收到了Ios工程师的回复");
    }

}
