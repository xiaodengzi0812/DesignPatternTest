package com.stage.designpatterntest.abstractfactory.mainboardimpl;

import com.stage.designpatterntest.abstractfactory.base.MainBoard;

/**
 * @author Djk
 * @Title: Intel品牌的主板
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class IntelMainBoard extends MainBoard {
    @Override
    public String getMainBoard() {
        return "Intel品牌的主板";
    }
}
