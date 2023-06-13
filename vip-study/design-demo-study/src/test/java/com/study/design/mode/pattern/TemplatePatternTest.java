package com.study.design.mode.pattern;

import com.study.design.mode.samples.temp.AskForLeaveFlow;
import com.study.design.mode.samples.temp.CompanyA;
import com.study.design.mode.samples.temp.CompanyB;
import org.junit.Test;

/**
 * 模板方法测试类
 * @author zjx
 * @Date: 2022/11/4
 */
public class TemplatePatternTest {

    @Test
    public void templateTest(){
        // 公司A请假流程模版
        AskForLeaveFlow companyA = new CompanyA();
        companyA.askForLeave("Mike");


        AskForLeaveFlow companyB = new CompanyB();
        companyB.askForLeave("Tom");

    }

}
