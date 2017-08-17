package com.stage.designpatterntest.responsibility;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.responsibility.util.Handler;
import com.stage.designpatterntest.responsibility.util.HandlerA;
import com.stage.designpatterntest.responsibility.util.HandlerB;
import com.stage.designpatterntest.responsibility.util.HandlerC;

public class ResponsibilityActivity extends BaseActivity {
    TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.responsibility_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("职责链模式");
        setRightClick(IntroduceUtil.RESPONSIBILITY);
    }

    /**
     * 请假2天
     */
    public void test1(View view) {
        doRequest(2);
    }

    /**
     * 请假5天
     */
    public void test2(View view) {
        doRequest(5);
    }

    /**
     * 请假10天
     */
    public void test3(View view) {
        doRequest(10);
    }

    /**
     * 正统写法
     *
     * @param day
     */
    private void doRequest(int day) {
        // ------------正统写法------------
        // 创建三个具体的职责类
//        Handler handlerA = new HandlerA();
//        Handler handlerB = new HandlerB();
//        Handler handlerC = new HandlerC();
//
//        // 设定具体的职责链
//        handlerA.setNextHandler(handlerB);
//        handlerB.setNextHandler(handlerC);
//
//        // 发送请求
//        String result = handlerA.exeRequest(day);
//        tv.setText(result);

        // ------------反射写法------------
        try {
            Class classA = Class.forName("com.stage.designpatterntest.responsibility.util.HandlerA");
            Object objA = classA.newInstance();
            Class classB = Class.forName("com.stage.designpatterntest.responsibility.util.HandlerB");
            Object objB = classB.newInstance();
            Class classC = Class.forName("com.stage.designpatterntest.responsibility.util.HandlerC");
            Object objC = classC.newInstance();

            classA.getMethod("setNextHandler", Handler.class).invoke(objA, objB);
            classB.getMethod("setNextHandler", Handler.class).invoke(objB, objC);

            Object resultObj = classA.getMethod("exeRequest", int.class).invoke(objA, day);
            String resultStr = resultObj.toString();
            tv.setText(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
