package com.stage.designpatterntest.mediator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.mediator.util.Android;
import com.stage.designpatterntest.mediator.util.Ios;
import com.stage.designpatterntest.mediator.util.PM;
import com.stage.designpatterntest.mediator.util.Photoshop;

public class MediatorActivity extends BaseActivity {

    TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.mediator_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
        initView();
    }

    private void initView() {
        tv.setText("中介者模式：\n" +
                "\n" +
                "\t业务介绍：\n" +
                "\t\t我们现在有一个新项目要启动开发，有三个项目开发人员： android工程师，ios工程师，美工;\n" +
                "\t\t三个开发人员互相不认识对方，也不知道联系方式，但他们之间需要沟通协作来共同完成项目的开发。。。\n" +
                "\t\t\n" +
                "\t\t现在有一个项目经理PM同时认识这三个开发人员，那么这个沟通协作的任务就交给这个PM来完成了！！\n" +
                "\t\t\n" +
                "\t使用中介者模式的场合\n" +
                "\n" +
                "    1.一组定义良好的对象，现在要进行复杂的通信。\n" +
                "\n" +
                "    2.定制一个分布在多个类中的行为，而又不想生成太多的子类。\n" +
                "\n" +
                "    可以看出，中介对象主要是用来封装行为的，行为的参与者就是那些对象，但是通过中介者，这些对象不用相互知道。呵呵~~~\n" +
                "\n" +
                "    使用中介者模式的优点：\n" +
                "\n" +
                "    1.降低了系统对象之间的耦合性，使得对象易于独立的被复用。\n" +
                "\n" +
                "    2.提高系统的灵活性，使得系统易于扩展和维护。\n" +
                "\n" +
                "    使用中介者模式的缺点：\n" +
                "\n" +
                "    中介者模式的缺点是显而易见的，因为这个“中介“承担了较多的责任，所以一旦这个中介对象出现了问题，那么整个系统就会受到重大的影响。");
        init();
    }

    private void initTitle() {
        setTitle("中介者模式");
//        setRightClick(IntroduceUtil.ABSTRACT_FACTORY);
    }

    private void init() {
        PM pm = new PM();
        pm.startNewProject();
    }

}
