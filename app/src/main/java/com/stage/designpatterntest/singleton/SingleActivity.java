package com.stage.designpatterntest.singleton;

import android.os.Bundle;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;

public class SingleActivity extends BaseActivity {

    private TextView tv;


    @Override
    protected int getContentView() {
        return R.layout.single_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initTitle();
        initView();
    }

    private void initView() {
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("public class Single6 {\n" +
                "\tprivate static class SingletonHolder {  \n" +
                "\t\t/**\n" +
                "\t\t * 单例对象实例  \n" +
                "\t\t */\n" +
                "\t\tstatic final Single6 INSTANCE = new Single6();    \n" +
                "\t}\n" +
                "\t\n" +
                "\t/**\n" +
                "\t * 对外暴露的访问方法\n" +
                "\t */\n" +
                "\tpublic static Single6 getInstance() {    \n" +
                "\t\treturn SingletonHolder.INSTANCE;  \n" +
                "\t}\n" +
                "\t\n" +
                "\t/**\n" +
                "\t * 避免外界直接使用new来实例化对象 \n" +
                "\t */\n" +
                "\tprivate Single6() {}\n" +
                "\t\n" +
                "\t/**\n" +
                "\t * readResolve方法应对单例对象被序列化时候  \n" +
                "\t */\n" +
                "\tprivate Object readResolve() {    \n" +
                "\t\treturn getInstance();    \n" +
                "\t}\n" +
                "\n" +
                "}");
    }

    private void initTitle() {
        setTitle("单例设计模式");
        setRightClick(IntroduceUtil.SINGLE);
    }

}
