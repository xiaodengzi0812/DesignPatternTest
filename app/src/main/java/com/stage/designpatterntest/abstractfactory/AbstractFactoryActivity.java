package com.stage.designpatterntest.abstractfactory;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.abstractfactory.base.AbsFactory;
import com.stage.designpatterntest.abstractfactory.base.AmdFactory;
import com.stage.designpatterntest.abstractfactory.base.IntelFactory;

public class AbstractFactoryActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.abstract_factory_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("抽象工厂模式");
        setRightClick(IntroduceUtil.ABSTRACT_FACTORY);
    }

    public void intelCpuClick(View view) {
        getCpu(IntelFactory.class);
    }

    public void intelBoardClick(View view) {
        getMainBoard(IntelFactory.class);
    }

    public void amdCpuClick(View view) {
        getCpu(AmdFactory.class);
    }

    public void amdBoardClick(View view) {
        getMainBoard(AmdFactory.class);
    }

    private void getCpu(Class<? extends AbsFactory> clazz) {
        AbsFactory absFactory = AbsFactory.getFactory(clazz);
        tv.setText(absFactory.getCpu());
    }

    private void getMainBoard(Class<? extends AbsFactory> clazz) {
        AbsFactory absFactory = AbsFactory.getFactory(clazz);
        tv.setText(absFactory.getMainBoard());
    }

}
