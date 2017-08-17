package com.stage.designpatterntest.bridge.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/10.
 * @Version:1.0.0
 */

public class Pen1 extends Pen {

    public Pen1(Color color) {
        super.color = color;
    }

    @Override
    String initPen() {
        return "一号画笔";
    }
}
