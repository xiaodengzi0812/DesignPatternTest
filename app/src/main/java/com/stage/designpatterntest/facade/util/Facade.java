package com.stage.designpatterntest.facade.util;

/**
 * @author dengzi
 * @Date 2014-12-15 上午9:46:52
 * @Version V1.0
 * @Description 外观模式的总抽象接口
 * @Change
 */
public class Facade {
    private BanZheng diaoSi;
    private BanZheng naoCan;
    private BanZheng sb;

    public Facade() {
        this.diaoSi = new DiaoSi();
        this.naoCan = new NaoCan();
        this.sb = new SB();
    }

    public String getDiaoSiZheng() {
        return diaoSi.getZheng();
    }

    public String getNaoCanZheng() {
        return naoCan.getZheng();
    }

    public String getSbZheng() {
        return sb.getZheng();
    }


}

    