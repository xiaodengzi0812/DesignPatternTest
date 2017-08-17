package com.stage.designpatterntest.factory.impl;

import com.stage.designpatterntest.factory.base.BanZhengWindows;

/**
 * @author Djk
 * @Title: 脑残证
 * @Time: 2017/8/8.
 * @Version:1.0.0
 */
public class NaoCanZheng extends BanZhengWindows {

    @Override
    protected String banZheng() {
        return "办理了一个脑残证";
    }
}
