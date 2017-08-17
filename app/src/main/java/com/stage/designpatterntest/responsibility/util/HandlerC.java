package com.stage.designpatterntest.responsibility.util;

/**
 * @author Djk
 * @Title: 具体实现类（老板）
 * @Time: 2017/8/15.
 * @Version:1.0.0
 */
public class HandlerC extends Handler {

    @Override
    public String exeRequest(int day) {
        return "请假不限天数  由老板审批";
    }
}
