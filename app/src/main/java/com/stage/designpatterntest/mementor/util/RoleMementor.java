package com.stage.designpatterntest.mementor.util;

/**
 * @author Djk
 * @Title: 存储游戏记录
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */
public class RoleMementor {
    private int vit;
    private int atk;

    public RoleMementor(int vit, int atk) {
        this.vit = vit;
        this.atk = atk;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
