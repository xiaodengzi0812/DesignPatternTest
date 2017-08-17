package com.stage.designpatterntest.command.util;

import android.os.SystemClock;
import android.util.Log;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class MyRunnableImpl implements MyRunnable {
    private static final String TAG = "dengzi";
    private boolean flag = true;

    @Override
    public void run() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                    Log.e(TAG, "正在执行命令");
                    SystemClock.sleep(2000);
                }
            }
        }).start();
    }

    @Override
    public void stop() {
        flag = false;
        Log.e(TAG, "停止执行命令");
    }

    @Override
    public void redo() {
        Log.e(TAG, "重新开始执行命令");
        flag = true;
        run();
    }
}
