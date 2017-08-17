package com.stage.designpatterntest.abstractfactory.base;


/**
 * @Title:抽象工厂类
 * @Author: djk
 * @Time: 2017/8/8
 * @Version:1.0.0
 */
public abstract class AbsFactory {

    /**
     * 获取cpu
     *
     * @return
     */
    public abstract String getCpu();

    /**
     * 获取主板
     *
     * @return
     */
    public abstract String getMainBoard();

    /**
     * 办证工厂类，获取证书的办理窗口
     *
     * @param clazz
     * @return
     */
    public static <T extends AbsFactory> T getFactory(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
