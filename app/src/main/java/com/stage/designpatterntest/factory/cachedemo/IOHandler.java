package com.stage.designpatterntest.factory.cachedemo;

/**
 * @author Djk
 * @Title: 缓存接口
 * @Time: 2017/11/8.
 * @Version:1.0.0
 */
public interface IoHandler {

    // 存储
    void save(String key, Object value);

    // 读取
    void read(String key);
}
