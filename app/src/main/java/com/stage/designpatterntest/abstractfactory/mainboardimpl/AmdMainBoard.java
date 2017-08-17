package com.stage.designpatterntest.abstractfactory.mainboardimpl;

import com.stage.designpatterntest.abstractfactory.base.MainBoard;

/**
 * @author Djk
 * @Title: Amd品牌的主板
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class AmdMainBoard extends MainBoard {
    @Override
    public String getMainBoard() {
        return "Amd品牌的主板";
    }
}
