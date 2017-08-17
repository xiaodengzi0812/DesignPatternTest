package com.stage.designpatterntest.builder;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.builder.util.MyAlertDialog;

public class BuilderActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.builder_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initTitle();
    }

    private void initTitle() {
        setTitle("builder模式");
        setRightClick(IntroduceUtil.BUILDER);
    }

    /**
     * 系统的AlertDialog使用
     */
    public void test1(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("title").setCancelable(true).setMessage("msg").create().show();
    }

    /**
     * 自己的AlertDialog使用
     */
    public void test2(View view) {
        MyAlertDialog.Builder dialog = new MyAlertDialog.Builder(this);
        dialog.setTitle("title").setCancelable(true).setMessage("msg").creat().show();
    }

}
