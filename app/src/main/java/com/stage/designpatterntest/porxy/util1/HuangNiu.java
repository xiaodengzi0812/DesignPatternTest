
package com.stage.designpatterntest.porxy.util1;

import com.stage.designpatterntest.porxy.base.BanZheng;
import com.stage.designpatterntest.porxy.base.GongZuoRen;

public class HuangNiu implements BanZheng {

    private GongZuoRen gongZuoRen;

    public HuangNiu() {
        this.gongZuoRen = new GongZuoRen();
    }

    @Override
    public String banZheng() {
        return getGuanXi() + gongZuoRen.banZheng();
    }

    private String getGuanXi() {
        return "黄牛走关系之后。。\n";
    }
}

    