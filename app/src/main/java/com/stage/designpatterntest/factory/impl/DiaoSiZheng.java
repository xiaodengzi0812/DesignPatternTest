package com.stage.designpatterntest.factory.impl;

import com.stage.designpatterntest.factory.base.BanZhengWindows;

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
