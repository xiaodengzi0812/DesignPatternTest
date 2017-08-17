package com.stage.designpatterntest.decorator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.decorator.util.InterfaceGift;

import java.lang.reflect.Method;

public class DecoratorActivity extends BaseActivity {
    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.decorator_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        init();
        initTitle();
    }

    private void initTitle() {
        setTitle("装饰模式");
        setRightClick(IntroduceUtil.DECORATOR);
    }

    /**
     * 未装饰之前的礼物
     */
    private void init() {
        // 正统写法
//        InterfaceGift gift = new RealGift();
//        tv.setText(gift.getGift());

        // 反射写法
        try {
            Class realGiftClazz = Class.forName("com.stage.designpatterntest.decorator.util.RealGift");
            Object realGiftObj = realGiftClazz.newInstance();
            Method method = realGiftClazz.getMethod("getGift");
            Object resultObj = method.invoke(realGiftObj);
            String resultStr = resultObj.toString();
            tv.setText(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加装饰一
     */
    public void test1(View view) {
        // 正统写法
//        InterfaceGift gift = new RealGift();
//        InterfaceGift decoratorGift1 = new DecoratorGift1(gift);
//        tv.setText(decoratorGift1.getGift());

        // 反射写法
        try {
            Class realGiftClazz = Class.forName("com.stage.designpatterntest.decorator.util.RealGift");
            Object realGiftObj = realGiftClazz.newInstance();
            Class decGift1Clazz = Class.forName("com.stage.designpatterntest.decorator.util.DecoratorGift1");
            Object decGift1Obj = decGift1Clazz.getDeclaredConstructor(InterfaceGift.class).newInstance(realGiftObj);
            Method decGift1Method = decGift1Clazz.getMethod("getGift");
            Object resultObj = decGift1Method.invoke(decGift1Obj);
            String resultStr = resultObj.toString();
            tv.setText(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加装饰一 再添加装饰二
     */
    public void test2(View view) {
        // 正统写法
//        InterfaceGift gift = new RealGift();
//        InterfaceGift decoratorGift1 = new DecoratorGift1(gift);
//        InterfaceGift decoratorGift2 = new DecoratorGift2(decoratorGift1);
//        tv.setText(decoratorGift2.getGift());

        // 反射写法
        try {
            Class realGiftClazz = Class.forName("com.stage.designpatterntest.decorator.util.RealGift");
            Object realGiftObj = realGiftClazz.newInstance();
            Class decGift1Clazz = Class.forName("com.stage.designpatterntest.decorator.util.DecoratorGift1");
            Object decGift1Obj = decGift1Clazz.getDeclaredConstructor(InterfaceGift.class).newInstance(realGiftObj);
            Class decGift2Clazz = Class.forName("com.stage.designpatterntest.decorator.util.DecoratorGift2");
            Object decGift2Obj = decGift2Clazz.getDeclaredConstructor(InterfaceGift.class).newInstance(decGift1Obj);
            Method decGift2Method = decGift2Clazz.getMethod("getGift");
            Object resultObj = decGift2Method.invoke(decGift2Obj);
            String resultStr = resultObj.toString();
            tv.setText(resultStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
