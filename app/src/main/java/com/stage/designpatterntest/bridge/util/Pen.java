package com.stage.designpatterntest.bridge.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/10.
 * @Version:1.0.0
 */

public abstract class Pen {
    protected Color color;

    public String draw() {
        return initPen() + "-->" + color.penColor;
    }

    abstract String initPen();

}
