package com.stage.designpatterntest.abstractfactory.cpuimpl;

import com.stage.designpatterntest.abstractfactory.base.Cpu;

/**
 * @author Djk
 * @Title: AMD品牌的Cpu
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */

public class AmdCpu extends Cpu {
    @Override
    public String getCpu() {
        return "AMD品牌的Cpu";
    }
}
