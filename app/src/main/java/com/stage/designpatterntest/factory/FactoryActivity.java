package com.stage.designpatterntest.factory;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.factory.base.BanZhengFactory;
import com.stage.designpatterntest.factory.base.BanZhengWindows;
import com.stage.designpatterntest.factory.impl.DiaoSiZheng;
import com.stage.designpatterntest.factory.impl.NaoCanZheng;
import com.stage.designpatterntest.factory.impl.SBZheng;

public class FactoryActivity extends BaseActivity {

    private TextView tv;


    @Override
    protected int getContentView() {
        return R.layout.factory_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("工厂模式");
        setRightClick(IntroduceUtil.FACTORY);
    }

    public void diaosiClick(View view) {
        banZheng(DiaoSiZheng.class);
    }

    public void naocanClick(View view) {
        banZheng(NaoCanZheng.class);
    }

    public void sbClick(View view) {
        banZheng(SBZheng.class);
    }

    private void banZheng(Class<? extends BanZhengWindows> clazz) {
        // 从办证工厂中获取对应的办证窗口
        BanZhengWindows baseZhengWindow = BanZhengFactory.getBanZhengWindow(clazz);
        // 从办证窗口获取对应的证书
        tv.setText(baseZhengWindow.getZheng());
    }

}
