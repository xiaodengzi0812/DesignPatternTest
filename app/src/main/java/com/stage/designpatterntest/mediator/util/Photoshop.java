package com.stage.designpatterntest.mediator.util;

import android.util.Log;

/**
 * @author dengzi
 * @Date 2014-12-10 下午1:41:37
 * @Version V1.0
 * @Description 美工
 * @Change
 */
public class Photoshop extends ProjectPerson {

    /**
     * 美工认识-->项目经理
     */
    public Photoshop(PM pm) {
        this.pm = pm;
    }

    /**
     * 美工设计效果图
     */
    public void drawPic() {
        Log.e(TAG, "美工正在设计效果图。。。");
        Log.e(TAG, "效果图设计完成，通知安卓和苹果端开始画页面了");
        communicate(this, "效果图完成");
    }

    /**
     * 美工切图
     */
    public void cutPic() {
        Log.e(TAG, "美工又重新切了一套图。。。");
    }
}
