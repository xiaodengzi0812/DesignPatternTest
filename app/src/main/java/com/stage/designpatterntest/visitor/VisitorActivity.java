package com.stage.designpatterntest.visitor;

import android.os.Bundle;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.visitor.util.Element;
import com.stage.designpatterntest.visitor.util.ElementA;
import com.stage.designpatterntest.visitor.util.ElementB;
import com.stage.designpatterntest.visitor.util.Vistor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VisitorActivity extends BaseActivity {

    List<Element> elementList = new ArrayList<>();
    Random random = new Random();

    @Override
    protected int getContentView() {
        return R.layout.visitor_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initTitle();
        initView();
        initList();
        init();
    }

    private void initTitle() {
        setTitle("访问者模式");
        setRightClick(IntroduceUtil.VISITOR);
    }

    private void initList() {
        for (int i = 0; i < 6; i++) {
            int ran = random.nextInt(20);
            if (ran > 10) {
                elementList.add(new ElementA());
            } else {
                elementList.add(new ElementB());
            }
        }
    }

    private void init() {
        for (Element element : elementList) {
            element.accept(new Vistor());
        }
    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText("");
    }

}
