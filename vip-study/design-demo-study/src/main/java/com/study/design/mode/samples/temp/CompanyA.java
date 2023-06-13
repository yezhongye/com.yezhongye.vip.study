package com.study.design.mode.samples.temp;

/**
 * @author zjx
 * @Date: 2022/11/4
 */
public class CompanyA extends AskForLeaveFlow{

    @Override
    protected void firstGroupLeader(String name) {
        System.out.println("CompanyA 组内有人请假，请假人：" + name);
    }
}

