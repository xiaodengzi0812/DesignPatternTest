package com.stage.designpatterntest.responsibility.util;

/**
 * @author Djk
 * @Title: 具体实现类（主管）
 * @Time: 2017/8/15.
 * @Version:1.0.0
 */
public class HandlerB extends Handler {

    @Override
    public String exeRequest(int day) {
        if (day < 6) {
            return "请假天数小于6天  由主管审批";
        }
        return getNextHandler().exeRequest(day);
    }
}
