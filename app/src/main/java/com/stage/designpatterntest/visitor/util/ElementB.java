package com.stage.designpatterntest.visitor.util;

import android.util.Log;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */

public class ElementB implements Element {
    @Override
    public void accept(IVistor vistor) {
        vistor.visit(this);
    }

    public void doB() {
        Log.e("dengzi", "B");
    }
}
