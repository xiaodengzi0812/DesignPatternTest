package com.stage.designpatterntest.mementor.util;

import java.util.Random;

/**
 * @author Djk
 * @Title: 游戏进度
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */

public class GameRole {
    private int vit;
    private int atk;

    private Random random = new Random();

    public GameRole() {
        init();
    }

    private void init() {
        vit = 90;
        atk = 80;
    }

    /**
     * 获取当前游戏状态
     *
     * @return
     */
    public String getState() {
        return "当前状态：体力->" + vit + ",攻击->" + atk + "\n";
    }

    public String fightBoss() {
        vit = random.nextInt(99);
        atk = random.nextInt(99);
        return "打BOSS：体力->" + vit + ",攻击->" + atk + "\n";
    }

    public RoleMementor saveMem() {
        return new RoleMementor(vit, atk);
    }

    public void recove(RoleMementor roleMementor) {
        this.vit = roleMementor.getVit();
        this.atk = roleMementor.getAtk();
    }

}
