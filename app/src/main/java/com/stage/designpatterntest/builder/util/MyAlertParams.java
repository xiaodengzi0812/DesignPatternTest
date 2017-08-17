package com.stage.designpatterntest.builder.util;

import android.content.Context;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */

public class MyAlertParams {

    public Context context;

    public MyAlertParams(Context context) {
        this.context = context;
    }

    public String title;

    public boolean cancelable;

    public String message;

}
