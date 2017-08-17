package com.stage.designpatterntest.mementor.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Djk
 * @Title: 备忘录记录工具类
 * @Time: 2017/8/17.
 * @Version:1.0.0
 */
public class RoleUtil {
    // 备忘录集合
    private Map<String, RoleMementor> mementorMaps = new HashMap<>();

    // 通过key获取游戏记录
    public RoleMementor getRoleMementor(String introduce) {
        return mementorMaps.get(introduce);
    }

    // 通过key存储游戏记录
    public void saveRoleMementor(String introduce, RoleMementor roleMementor) {
        mementorMaps.put(introduce, roleMementor);
    }
}
