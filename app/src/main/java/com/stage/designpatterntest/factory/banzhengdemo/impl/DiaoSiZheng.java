package com.stage.designpatterntest.factory.banzhengdemo.impl;

import com.stage.designpatterntest.factory.banzhengdemo.base.BanZhengWindows;

/**
 * @author Djk
 * @Title: 屌丝证
 * @Time: 2017/8/8.
 * @Version:1.0.0
 */
public class DiaoSiZheng extends BanZhengWindows {

    @Override
    protected String banZheng() {
        return "办理了一个屌丝证";
    }
}
