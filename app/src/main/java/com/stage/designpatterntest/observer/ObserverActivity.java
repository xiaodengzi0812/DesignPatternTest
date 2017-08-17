package com.stage.designpatterntest.observer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.observer.bean.Boy;
import com.stage.designpatterntest.observer.bean.GirlAbstract;

public class ObserverActivity extends BaseActivity {
    private TextView tv1, tv2;
    private GirlAbstract girl;

    @Override
    protected int getContentView() {
        return R.layout.observer_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        initTitle();
        addWatcher();
    }

    private void initTitle() {
        setTitle("观察者模式");
        setRightClick(IntroduceUtil.OBSERVER);
    }

    public void addWatcher() {
        girl = new GirlAbstract();
        Boy timeWatcher1 = new Boy(tv1, "男孩1观察到->");
        Boy timeWatcher2 = new Boy(tv2, "男孩2观察到->");
        girl.addWatcher(timeWatcher1);
        girl.addWatcher(timeWatcher2);
    }

    public void girlClick(View view) {
        girl.change();
    }
}
