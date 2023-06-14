package com.study.design.mode.bing;

import com.study.design.mode.bing.factory.EnumShareType;
import com.study.design.mode.bing.factory.Share;
import com.study.design.mode.bing.factory.ShareFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zjx
 * @Date: 2023/6/13
 */
public class FactoryTest{


    @Test
    public void factoryTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        ShareFactory shareFactory = (ShareFactory) applicationContext.getBean("shareFactory");
        Share shareFunction =shareFactory.getShareFunction(EnumShareType.ONE_ORDER.getName());
        String success_order = shareFunction.mainProcess( "Success order" );
        System.out.println(success_order);

    }
}
