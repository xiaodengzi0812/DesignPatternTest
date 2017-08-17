package com.stage.designpatterntest.command;


import android.os.Bundle;
import android.view.View;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.command.util.MyRunnableImpl;
import com.stage.designpatterntest.command.util.MyThread;

public class CommandActivity extends BaseActivity {
    MyThread myThread;

    @Override
    protected int getContentView() {
        return R.layout.command_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        myThread = new MyThread(new MyRunnableImpl());
        initTitle();
    }

    private void initTitle() {
        setTitle("命令模式");
        setRightClick(IntroduceUtil.COMMAND);
    }


    /* 运行结果：
        点击执行命令：
            正在执行命令
            正在执行命令
            正在执行命令
        点击结束：
            停止执行命令
        点击重新开始：
            重新开始执行命令
            正在执行命令
            正在执行命令
            停止执行命令
    * */
    public void start(View view) {
        myThread.start();
    }

    public void stop(View view) {
        myThread.stop();
    }

    public void redo(View view) {
        myThread.redo();
    }

}
