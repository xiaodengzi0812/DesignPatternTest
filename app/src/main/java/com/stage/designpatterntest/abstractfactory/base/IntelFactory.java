package com.stage.designpatterntest.abstractfactory.base;

import com.stage.designpatterntest.abstractfactory.cpuimpl.IntelCpu;
import com.stage.designpatterntest.abstractfactory.mainboardimpl.IntelMainBoard;

/**
 * @author Djk
 * @Title: Intel工厂
 * @Time: 2017/8/9.
 * @Version:1.0.0
 */
public class IntelFactory extends AbsFactory {
    @Override
    public String getCpu() {
        String cpuStr = "";
        try {
            IntelCpu intelCpu = IntelCpu.class.newInstance();
            cpuStr = intelCpu.getCpu();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cpuStr;
    }

    @Override
    public String getMainBoard() {
        String mainBoardStr = "";
        try {
            IntelMainBoard intelMainBoard = IntelMainBoard.class.newInstance();
            mainBoardStr = intelMainBoard.getMainBoard();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mainBoardStr;
    }
}
