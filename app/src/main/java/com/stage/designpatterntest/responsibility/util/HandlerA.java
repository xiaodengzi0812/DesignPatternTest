package com.stage.designpatterntest.responsibility.util;

/**
 * @author Djk
 * @Title: 具体实现类（小组长）
 * @Time: 2017/8/15.
 * @Version:1.0.0
 */
public class HandlerA extends Handler {

    @Override
    public String exeRequest(int day) {
        if (day < 3) {
            return "请假天数小于3天  由小组长审批";
        }
        return getNextHandler().exeRequest(day);
    }
}
