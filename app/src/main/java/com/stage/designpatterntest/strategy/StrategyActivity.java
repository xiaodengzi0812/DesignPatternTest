package com.stage.designpatterntest.strategy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.strategy.util.DstPrice;
import com.stage.designpatterntest.strategy.util.FivePercentStrategy;
import com.stage.designpatterntest.strategy.util.PriceStrategy;
import com.stage.designpatterntest.strategy.util.SixPercentStrategy;

public class StrategyActivity extends BaseActivity {

    TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.strategy_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        initTitle();
    }

    private void initTitle() {
        setTitle("策略模式");
        setRightClick(IntroduceUtil.STRATEGY);
    }

    public void test1(View view) {
        PriceStrategy fivePercent = new FivePercentStrategy();
        setPrice(fivePercent);
    }

    public void test2(View view) {
        PriceStrategy sixPercent = new SixPercentStrategy();
        setPrice(sixPercent);
    }

    private void setPrice(PriceStrategy priceStrategy) {
        DstPrice dstPrice = new DstPrice(priceStrategy);
        int exeCalPrice = dstPrice.ExeCalPrice(200);
        String result = "200元的商品打折之后为-->" + exeCalPrice + "元";
        tv.setText(result);
    }

}
