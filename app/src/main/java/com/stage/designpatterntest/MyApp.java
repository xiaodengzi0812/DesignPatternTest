package com.stage.designpatterntest;

import android.app.Application;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */

public class MyApp extends Application {

    private static MyApp myApp;

    public static MyApp getInstance() {
        return myApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApp = this;
    }
}
