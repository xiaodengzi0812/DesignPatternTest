package com.stage.designpatterntest.visitor.util;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */
public interface Element {
    void accept(IVistor vistor);
}
