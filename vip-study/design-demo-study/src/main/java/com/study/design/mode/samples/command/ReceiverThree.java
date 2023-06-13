package com.study.design.mode.samples.command;

/**
 * 命令模式-Receiver（接收者）：执行命令关联的操作类
 * @author zjx
 * @Date: 2022/11/4
 */
public class ReceiverThree {

    public void Charge(){
        System.out.println("拒绝奏折");
    }

    public void Issue(){
        System.out.println("打回圣旨");
    }
}
