package com.stage.designpatterntest.command.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class MyThread {
    private MyRunnable myRunnable;

    public MyThread(MyRunnable myRunnable) {
        this.myRunnable = myRunnable;
    }

    public void start() {
        myRunnable.run();
    }

    public void stop() {
        myRunnable.stop();
    }

    public void redo() {
        myRunnable.redo();
    }
}
