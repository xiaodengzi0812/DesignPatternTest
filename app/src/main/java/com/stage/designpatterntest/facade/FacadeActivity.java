package com.stage.designpatterntest.facade;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.facade.util.Facade;

public class FacadeActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.facade_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        init();
        initTitle();
    }

    private void initTitle() {
        setTitle("外观模式");
        setRightClick(IntroduceUtil.FACADE);
    }

    private void init() {
        Facade facade = new Facade();
        String diaoSiStr = facade.getDiaoSiZheng();
        String naoCanStr = facade.getNaoCanZheng();
        String sbStr = facade.getSbZheng();
        tv.setText(diaoSiStr + "\n" + naoCanStr + "\n" + sbStr);
    }

}
