package com.study.design.mode.samples.temp;

/**
 * 模板模式
 * @author zjx
 * @Date: 2022/11/4
 */
public abstract class AskForLeaveFlow {

    // 一级组长直接审批
    protected abstract void firstGroupLeader(String name);

    // 二级组长部门负责人审批
    protected void secondGroupLeader(String name) {
    }

    // 告知HR有人请假了
    private final void notifyHr(String name) {
        System.out.println("当前有人请假了，请假人：" + name);
    }

    // 请假流模版
    public void askForLeave(String name) {
        firstGroupLeader(name);
        secondGroupLeader(name);
        notifyHr(name);
    }

}
