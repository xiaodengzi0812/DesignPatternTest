package com.stage.designpatterntest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * @Title:Activity基类
 * @Author: djk
 * @Time: 2017/8/2
 * @Version:1.0.0
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected Context mActivity;

    Toolbar toolbar;
    FrameLayout viewContent;
    TextView tvTitle;
    TextView rightTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_top_bar);
        mActivity = this;
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewContent = (FrameLayout) findViewById(R.id.viewContent);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        rightTv = (TextView) findViewById(R.id.right_tv);
        //将继承 TopBarBaseActivity 的布局解析到 FrameLayout 里面
        LayoutInflater.from(this).inflate(getContentView(), viewContent);
        //初始化设置 Toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        init(savedInstanceState);
    }

    protected void setTitle(String title) {
        if (!TextUtils.isEmpty(title)) {
            tvTitle.setText(title);
        }
    }

    protected void setRightClick(final String url) {
        rightTv.setVisibility(View.VISIBLE);
        rightTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntroduceUtil.doIntroduce(mActivity, url);
            }
        });
    }

    protected abstract int getContentView();

    protected abstract void init(Bundle savedInstanceState);

}
