package com.study.design.mode.bing.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author zjx
 * @Date: 2023/6/13
 */
@Component
public class SuccessOrderShare implements Share{

    @Override
    public String getShareFunctionType() {
        return EnumShareType.SUCCESS_ORDER.getName();
    }

    @Override
    public String mainProcess(String shareName) {
        //这里写一些处理分享的业务逻辑代码
        System.out.println("SuccessOrderShare=================分享图片的东西哦");
        return shareName;
    }

}
