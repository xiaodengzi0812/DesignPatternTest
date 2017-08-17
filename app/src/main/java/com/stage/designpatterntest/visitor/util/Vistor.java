package com.stage.designpatterntest.visitor.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */
public class Vistor implements IVistor {
    @Override
    public void visit(ElementA a) {
        a.doA();
    }

    @Override
    public void visit(ElementB b) {
        b.doB();
    }
}
