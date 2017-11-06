package com.stage.designpatterntest.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengzi
 * @Date 2014-12-4 下午5:01:10
 * @Version V1.0
 * @Description 容器管理类   系统的Service写法
 * @Change
 */
public class Single4 {
    private static Map<String, Single4> mSingleMap = new HashMap<>();

    static {
        mSingleMap.put("SINGLE", new Single4());
    }

    // 构造私有
    private Single4() {
    }

    // 通过名字去获取，系统的Service就使用这种单例模式
    public static Single4 getInstance(String singleName) {
        return mSingleMap.get(singleName);
    }
}

    