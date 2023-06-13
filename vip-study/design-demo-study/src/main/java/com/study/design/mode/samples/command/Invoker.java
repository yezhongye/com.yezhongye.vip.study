package com.study.design.mode.samples.command;

/**
 * 命令模式-Invoker（调用者）：触发命令类，即外部操作事件触发执行。
 * 调用者，皇帝
 * @author zjx
 * @Date: 2022/11/4
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    // 本次需要执行的命令
    public void action() {
        command.execute();
    }
}
