package com.stage.designpatterntest.mediator.util;

/**
 * @author dengzi
 * @Date 2014-12-10 下午1:44:17
 * @Version V1.0
 * @Description 项目经理 --> 起到中介的模式（有什么问题都找项目经理，然后项目经理去解决这些问题）
 * @Change
 */
public class PM {
    //项目经理要知道他手下有多少工作人员
    private Android android;
    private Ios ios;
    private Photoshop ps;

    public PM() {
        this.android = new Android(this);
        this.ios = new Ios(this);
        this.ps = new Photoshop(this);
    }

    /**
     * 项目经理开启了一个新的项目
     */
    public void startNewProject() {
        this.ps.drawPic();
    }

    /**
     * 几个开发人员沟通的方法
     *
     * @param project     哪个开发人员发的信息
     * @param information 信息
     */

    public void communicate(Object project, String information) {
        if (project instanceof Photoshop) {
            this.ios.coding();
            this.android.coding();
        } else if (project instanceof Android) {
            if ("切图不正确".equals(information)) {
                this.ps.cutPic();
            } else if ("跟ios统一UI".equals(information)) {
                this.ios.UnityUi();
            }
        } else if (project instanceof Ios) {
            this.android.UnityUi();
        }
    }

}
