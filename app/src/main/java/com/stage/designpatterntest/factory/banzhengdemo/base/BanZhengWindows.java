package com.stage.designpatterntest.factory.banzhengdemo.base;

/**
 * @author Djk
 * @Title: 办证窗口，办理各种证书
 * @Time: 2017/8/8.
 * @Version:1.0.0
 */
public abstract class BanZhengWindows {

    /**
     * 获取证书
     *
     * @return 证书
     */
    public String getZheng() {
        return banZheng();
    }

    /**
     * 办证的具体方法，让子类去实现
     *
     * @return 证书
     */
    protected abstract String banZheng();

}
