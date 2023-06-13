package com.study.design.mode.pattern;

import com.study.design.mode.samples.command.*;
import com.study.design.mode.samples.temp.AskForLeaveFlow;
import com.study.design.mode.samples.temp.CompanyA;
import com.study.design.mode.samples.temp.CompanyB;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 命令方法测试类
 * @author zjx
 * @Date: 2022/11/4
 */
public class CommandPatternTest {

    @Test
    public void commandTest(){
        // 实例化一个公公 接收者
        Receiver receiver =new Receiver();
        ReceiverThree receiver1 =new ReceiverThree();
        // 公公 当前能有接收到的几种命令
        Command commandOne = new ConcreteCommandOne(receiver);
        Command commandTwo = new ConcreteCommandTwo(receiver);
        Command commandThree = new ConcreteCommandThree(receiver1);

        // 皇帝 发号命令 触发执行方法
        Invoker invoker =new Invoker(commandOne);
        invoker.action();
        // result: 收取奏折

        Invoker invokerTwo =new Invoker(commandTwo);
        invokerTwo.action();
        // result：颁布圣旨

        Invoker invokerThree =new Invoker(commandThree);
        invokerThree.action();
        // result：拒绝圣旨

    }
    @Test
    public void commandTestOne(){
        // 实例化一个公公 接收者
        Receiver receiver = new Receiver();
        // 公公 当前能有接收到的几种命令
        Command commandOne = new ConcreteCommandOne(receiver);
        Command commandTwo = new ConcreteCommandTwo(receiver);
        // 存储命令
        Queue<Command> queue = new LinkedList<>();
        queue.add(commandOne);
        queue.add(commandTwo);
        // 批量执行
        for (Command command : queue) {
            Invoker invoker = new Invoker(command);
            invoker.action();
        }
    }

}
