package com.stage.designpatterntest.responsibility.util;

/**
 * @author Djk
 * @Title: 总的职责抽象方法
 * @Time: 2017/8/15.
 * @Version:1.0.0
 */
public abstract class Handler {
    protected Handler mHandler;

    public Handler getNextHandler() {
        return mHandler;
    }

    public void setNextHandler(Handler mHandler) {
        this.mHandler = mHandler;
    }

    public abstract String exeRequest(int day);
}
