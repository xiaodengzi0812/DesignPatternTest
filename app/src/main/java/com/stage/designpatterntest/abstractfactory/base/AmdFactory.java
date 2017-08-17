package com.stage.designpatterntest.abstractfactory.base;

import com.stage.designpatterntest.abstractfactory.cpuimpl.AmdCpu;
import com.stage.designpatterntest.abstractfactory.mainboardimpl.AmdMainBoard;

/**
 * @author Djk
 * @Title: Amd工厂
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */
public class AmdFactory extends AbsFactory {
    @Override
    public String getCpu() {
        String cpuStr = "";
        try {
            AmdCpu amdCpu = AmdCpu.class.newInstance();
            cpuStr = amdCpu.getCpu();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cpuStr;
    }

    @Override
    public String getMainBoard() {
        String mainBoardStr = "";
        try {
            AmdMainBoard amdMainBoard = AmdMainBoard.class.newInstance();
            mainBoardStr = amdMainBoard.getMainBoard();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mainBoardStr;
    }
}
