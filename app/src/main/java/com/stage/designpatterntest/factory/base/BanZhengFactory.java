package com.stage.designpatterntest.factory.base;


/**
 * @Title:办证工厂类
 * @Author: djk
 * @Time: 2017/8/8
 * @Version:1.0.0
 */
public class BanZhengFactory {

    /**
     * 办证工厂类，获取证书的办理窗口
     *
     * @param clazz
     * @return
     */
    public static <T extends BanZhengWindows> T getBanZhengWindow(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

}
