package com.study.design.mode.samples.command;

/**
 * 命令模式-ConcreteCommand（具体命令类）：对Command类进行实现，说白了就是具体的命令的实际实现类
 * 具体命令类one，收取奏折命令
 * @author zjx
 * @Date: 2022/11/4
 */
public class ConcreteCommandOne implements Command{

    // 接受者，这里可以理解为公公
    private Receiver receiver;


    public ConcreteCommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 收取奏折
        receiver.Charge();
    }
}
