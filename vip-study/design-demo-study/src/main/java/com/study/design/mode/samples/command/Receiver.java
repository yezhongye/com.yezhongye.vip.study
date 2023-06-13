package com.study.design.mode.samples.command;

/**
 * 命令模式-Receiver（接收者）：执行命令关联的操作类
 * @author zjx
 * @Date: 2022/11/4
 */
public class Receiver {

    public void Charge(){
        System.out.println("收取奏折");
    }

    public void Issue(){
        System.out.println("颁布圣旨");
    }
}
