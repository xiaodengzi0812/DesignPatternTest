package com.stage.designpatterntest.porxy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.porxy.base.BanZheng;
import com.stage.designpatterntest.porxy.base.GongZuoRen;
import com.stage.designpatterntest.porxy.util1.HuangNiu;
import com.stage.designpatterntest.porxy.util2.HuangNiuHandler;

import java.lang.reflect.Proxy;

public class PorxyActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.porxy_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("代理模式");
        setRightClick(IntroduceUtil.PROXY);
    }

    /**
     * 静态代理
     */
    public void test1(View view) {
        BanZheng banZheng = new HuangNiu();
        String result = banZheng.banZheng();
        setResult(result);
    }

    /**
     * 动态代理
     */
    public void test2(View view) {
        BanZheng banZheng = new GongZuoRen();
        HuangNiuHandler handler = new HuangNiuHandler(banZheng);
        Class clazz = banZheng.getClass();

        // loader：定义了代理类的ClassLoder;
        // interfaces：代理类实现的接口列表
        // h：调用处理器，也就是我们上面定义的实现了InvocationHandler接口的类实例handler
        BanZheng banZhengProxy = (BanZheng) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                handler);
        String result = banZhengProxy.banZheng();
        setResult(result);
    }

    private void setResult(String result) {
        tv.setText(result);
    }
}
