package com.stage.designpatterntest.template;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.template.util.Child;
import com.stage.designpatterntest.template.util2.MyAsynTask;

public class TemplateActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.template_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
        init();
    }

    private void initTitle() {
        setTitle("模板方法模式");
        setRightClick(IntroduceUtil.TEMPLATE);
    }

    private void init() {
        Child child = new Child();
        String result = child.findMM();
        tv.setText(result);
    }

    public void test(View view) {
        final String[] result = {"", "", ""};
        MyAsynTask myAsynTask = new MyAsynTask() {
            @Override
            public void onPreExecute() {
                result[0] = "onPreExecute \n";
            }

            @Override
            public Object doInBackground() {
                return "doInBackground";
            }

            @Override
            public void onPostExecute(Object o) {
                result[1] = o.toString() + " \n";
                result[2] = "onPostExecute \n";

                String resultStr = result[0] + result[1] + result[2];
                tv.setText(resultStr);
            }
        };
        myAsynTask.execute();
    }

}
