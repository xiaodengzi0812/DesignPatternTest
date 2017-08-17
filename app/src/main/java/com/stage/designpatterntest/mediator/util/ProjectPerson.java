
package com.stage.designpatterntest.mediator.util;

/**
 * @author dengzi
 * @Date 2014-12-10 下午2:08:36
 * @Version V1.0
 * @Description 项目开发人员父类(所有开发人员的公共方法)
 * @Change
 */
public abstract class ProjectPerson {

    protected static final String TAG = "dengzi";

    protected PM pm;//找到中介人（项目经理）

    /**
     * 通过中介人来沟通
     *
     * @param obj         具体开发人员
     * @param information 沟通信息
     */
    protected void communicate(Object obj, String information) {
        pm.communicate(obj, information);
    }
}

    