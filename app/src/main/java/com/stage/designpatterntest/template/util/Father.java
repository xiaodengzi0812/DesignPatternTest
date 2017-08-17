package com.stage.designpatterntest.template.util;

/**
 * @author dengzi
 * @Date 2014-12-9 下午1:00:39
 * @Version V1.0
 * @Description 模板方法模式
 * @Change
 */
public abstract class Father {

    /**
     * 父类定义一个方法执行顺序的模板(找美女的方法)
     */
    public String findMM() {
        // 调用基本方法,定义好顺序
        String condition = condition();
        String name = getName();
        int age = getAge();

        return condition + "找到一" + age + "岁的美女,名叫" + name;
    }

    /**
     * 基本方法的声明（由子类实现）
     */
    public abstract int getAge();

    /**
     * 基本方法(空实现)
     * 这就是传说中的-->钩子方法
     */
    public String getName() {
        return "";
    }

    /**
     * 基本方法（已经实现）
     */
    public String condition() {
        return "祖训:找美女前自身的必备条件-->高.富.帅\n";
    }
}
