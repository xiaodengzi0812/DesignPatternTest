package com.stage.designpatterntest.mementor;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import com.stage.designpatterntest.BaseActivity;
import com.stage.designpatterntest.IntroduceUtil;
import com.stage.designpatterntest.R;
import com.stage.designpatterntest.mementor.util.GameRole;
import com.stage.designpatterntest.mementor.util.RoleUtil;

public class MementorActivity extends BaseActivity {

    private TextView tv;

    @Override
    protected int getContentView() {
        return R.layout.mementor_activity;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        tv = (TextView) findViewById(R.id.tv);
        init();
        initTitle();
    }

    private void initTitle() {
        setTitle("备忘录模式");
        setRightClick(IntroduceUtil.MEMENTOR);
    }

    private void init() {
        StringBuffer result = new StringBuffer();

        // 当前正在游戏的进度
        GameRole gameRole = new GameRole();
        result.append(gameRole.getState());

        result.append("----保存一下进度，准备打boss----\n");
        // 保存进度
        RoleUtil roleUtil = new RoleUtil();
        roleUtil.saveRoleMementor("boss1", gameRole.saveMem());

        // 开始打boss
        result.append(gameRole.fightBoss());

        result.append("----打boss失败，恢复进度----\n");
        gameRole.recove(roleUtil.getRoleMementor("boss1"));
        result.append(gameRole.getState());
        tv.setText(result.toString());
    }

}
