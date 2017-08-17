package com.stage.designpatterntest.porxy.util2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/10.
 * @Version:1.0.0
 */

public class HuangNiuHandler implements InvocationHandler {
    private Object obj;

    public HuangNiuHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        String guanXi = getGuanXi();
        Object result = method.invoke(obj, args);
        return guanXi + result;
    }

    private String getGuanXi() {
        return "黄牛走关系之后。。\n";
    }
}
