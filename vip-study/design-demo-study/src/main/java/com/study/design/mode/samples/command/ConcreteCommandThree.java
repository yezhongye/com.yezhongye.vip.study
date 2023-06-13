package com.study.design.mode.samples.command;

/**
 * 命令模式-ConcreteCommand（具体命令类）：对Command类进行实现，说白了就是具体的命令的实际实现类
 * 具体命令类two，颁布圣旨
 * @author zjx
 * @Date: 2022/11/4
 */
public class ConcreteCommandThree implements Command{

    // 接受者，这里可以理解为公公
    private ReceiverThree receiver;

    public ConcreteCommandThree(ReceiverThree receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 颁布圣旨
        receiver.Issue();
    }
}
