package com.stage.designpatterntest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.stage.designpatterntest.abstractfactory.AbstractFactoryActivity;
import com.stage.designpatterntest.adapter.test1.AdapterActivity1;
import com.stage.designpatterntest.adapter.test2.AdapterActivity2;
import com.stage.designpatterntest.builder.BuilderActivity;
import com.stage.designpatterntest.bridge.BridgeActivity;
import com.stage.designpatterntest.command.CommandActivity;
import com.stage.designpatterntest.decorator.DecoratorActivity;
import com.stage.designpatterntest.facade.FacadeActivity;
import com.stage.designpatterntest.factory.FactoryActivity;
import com.stage.designpatterntest.iterator.IteratorActivity;
import com.stage.designpatterntest.mediator.MediatorActivity;
import com.stage.designpatterntest.mementor.MementorActivity;
import com.stage.designpatterntest.observer.ObserverActivity;
import com.stage.designpatterntest.porxy.PorxyActivity;
import com.stage.designpatterntest.responsibility.ResponsibilityActivity;
import com.stage.designpatterntest.singleton.SingleActivity;
import com.stage.designpatterntest.strategy.StrategyActivity;
import com.stage.designpatterntest.template.TemplateActivity;
import com.stage.designpatterntest.visitor.VisitorActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return R.layout.main_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        setTitle("设计模式汇总");
        setRightClick(IntroduceUtil.DESIGN);
    }

    public void singleClick(View view) {
        startActivity(new Intent(MainActivity.this, SingleActivity.class));
    }

    public void factoryClick(View view) {
        startActivity(new Intent(MainActivity.this, FactoryActivity.class));
    }

    public void abstractFactoryClick(View view) {
        startActivity(new Intent(MainActivity.this, AbstractFactoryActivity.class));
    }

    public void adapterClick1(View view) {
        startActivity(new Intent(MainActivity.this, AdapterActivity1.class));
    }

    public void adapterClick2(View view) {
        startActivity(new Intent(MainActivity.this, AdapterActivity2.class));
    }

    public void observerClick(View view) {
        startActivity(new Intent(MainActivity.this, ObserverActivity.class));
    }

    public void commandClick(View view) {
        startActivity(new Intent(MainActivity.this, CommandActivity.class));
    }

    public void porxyClick(View view) {
        startActivity(new Intent(MainActivity.this, PorxyActivity.class));
    }

    public void visitorClick(View view) {
        startActivity(new Intent(MainActivity.this, VisitorActivity.class));
    }

    public void bridgeClick(View view) {
        startActivity(new Intent(MainActivity.this, BridgeActivity.class));
    }

    public void builderClick(View view) {
        startActivity(new Intent(MainActivity.this, BuilderActivity.class));
    }

    public void decoratorClick(View view) {
        startActivity(new Intent(MainActivity.this, DecoratorActivity.class));
    }

    public void facadeClick(View view) {
        startActivity(new Intent(MainActivity.this, FacadeActivity.class));
    }

    public void iteratorClick(View view) {
        startActivity(new Intent(MainActivity.this, IteratorActivity.class));
    }

    public void mediatorClick(View view) {
        startActivity(new Intent(MainActivity.this, MediatorActivity.class));
    }

    public void mementorClick(View view) {
        startActivity(new Intent(MainActivity.this, MementorActivity.class));
    }

    public void responsibilityClick(View view) {
        startActivity(new Intent(MainActivity.this, ResponsibilityActivity.class));
    }

    public void strategyClick(View view) {
        startActivity(new Intent(MainActivity.this, StrategyActivity.class));
    }

    public void templateClick(View view) {
        startActivity(new Intent(MainActivity.this, TemplateActivity.class));
    }


}
