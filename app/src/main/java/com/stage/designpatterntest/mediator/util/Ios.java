package com.stage.designpatterntest.mediator.util;

import android.util.Log;

/**
 * @author dengzi
 * @Date 2014-12-10 下午1:41:37
 * @Version V1.0
 * @Description 苹果工程师
 * @Change
 */
public class Ios extends ProjectPerson {
    /**
     * 苹果工程师 认识-->项目经理
     */
    public Ios(PM pm) {
        this.pm = pm;
    }

    public void coding() {
        Log.e(TAG, "Ios工程师开始编写代码。。。");
    }

    public void UnityUi() {
        Log.e(TAG, "Ios工程师收到了Android工程师的统一UI的邮件");
        communicate(this, "Ios工程师统一UI成功。。");
    }
}
