package com.stage.designpatterntest.iterator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.iterator.util.MyArrayList;
import com.stage.designpatterntest.iterator.util.MyIterator;
import com.stage.designpatterntest.iterator.util.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.iterator_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initTitle();
    }

    private void initTitle() {
        setTitle("迭代器模式");
        setRightClick(IntroduceUtil.ITERATOR);
    }

    public void test1(View view) {
        List<String> strList = new ArrayList<>();
        strList.add("fuck");
        strList.add("ok");
        strList.add("no");
        strList.add("yes");
        Iterator iterator = strList.iterator();
        while (iterator.hasNext()) {
            Log.e("dengzi", iterator.next().toString());
        }
    }

    public void test2(View view) {
        MyList<String> strList = new MyArrayList<>();
        strList.add("0");
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");
        strList.add("6");
        MyIterator iterator = strList.iterator();
        while (iterator.hasNext()) {
            if ("3".equals(iterator.next().toString())) {
                iterator.remove();
            }
        }
        for (int i = 0; i < strList.size(); i++) {
            Log.e("dengzi", strList.get(i));
        }
    }

}
