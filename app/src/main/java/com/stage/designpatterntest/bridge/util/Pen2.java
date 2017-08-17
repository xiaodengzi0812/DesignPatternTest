package com.stage.designpatterntest.bridge.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/10.
 * @Version:1.0.0
 */

public class Pen2 extends Pen {

    public Pen2(Color color) {
        super.color = color;
    }

    @Override
    String initPen() {
        return "二号画笔";
    }
}
