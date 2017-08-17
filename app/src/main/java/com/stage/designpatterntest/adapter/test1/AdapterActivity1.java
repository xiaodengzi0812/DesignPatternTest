package com.stage.designpatterntest.adapter.test1;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.adapter.test1.util.Adapter;
import com.stage.designpatterntest.adapter.test1.util.ConcreteTarget;
import com.stage.designpatterntest.adapter.test1.util.Target;

public class AdapterActivity1 extends BaseActivity {
    TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.adapter_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        setTitle("类适配器模式");
        setRightClick(IntroduceUtil.ADAPTER);
    }

    public void test1(View view) {
        Target target = new ConcreteTarget();
        String result = target.request();
        tv.setText(result);
    }

    public void test2(View view) {
        Target target = new Adapter();
        String result = target.request();
        tv.setText(result);
    }
}
