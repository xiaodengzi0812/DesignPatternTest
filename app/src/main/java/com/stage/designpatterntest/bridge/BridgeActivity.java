package com.stage.designpatterntest.bridge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.bridge.util.Color;
import com.stage.designpatterntest.bridge.util.GreenColor;
import com.stage.designpatterntest.bridge.util.Pen;
import com.stage.designpatterntest.bridge.util.Pen2;

import java.lang.reflect.Method;

public class BridgeActivity extends BaseActivity {

    TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.bridge_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("桥梁模式");
        setRightClick(IntroduceUtil.BRIDGE);
    }

    public void test1(View view) {
        // 正统写法
//        Pen pen1 = new Pen1(new GrayColor());
//        tv.setText(pen1.draw());

        // 反射写法
        try {
            Class grayClazz = Class.forName("com.stage.designpatterntest.bridge.util.GrayColor");
            Object grayObj = grayClazz.newInstance();
            Class pen1Clazz = Class.forName("com.stage.designpatterntest.bridge.util.Pen1");
            Object pen1Obj = pen1Clazz.getDeclaredConstructor(Color.class).newInstance(grayObj);
            Method pen1Method = pen1Clazz.getMethod("draw");
            Object resultObj = pen1Method.invoke(pen1Obj);
            String resultStr = resultObj.toString();
            tv.setText(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test2(View view) {
        Pen pen2 = new Pen2(new GreenColor());
        tv.setText(pen2.draw());
    }

}
