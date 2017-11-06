package com.stage.designpatterntest.singleton;

import android.os.Bundle;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;

public class SingleActivity extends BaseActivity {

    private TextView tv;


    @Override
    protected int getContentView() {
        return R.layout.single_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initTitle();
        initView();
    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("");
    }

    private void initTitle() {
        setTitle("单例设计模式");
        setRightClick(IntroduceUtil.SINGLE);
    }

}
