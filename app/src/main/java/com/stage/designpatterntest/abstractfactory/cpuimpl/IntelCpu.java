package com.stage.designpatterntest.abstractfactory.cpuimpl;

import com.stage.designpatterntest.abstractfactory.base.Cpu;

/**
 * @author Djk
 * @Title: Intel品牌的Cpu
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class IntelCpu extends Cpu {
    @Override
    public String getCpu() {
        return "Intel品牌的Cpu";
    }
}
