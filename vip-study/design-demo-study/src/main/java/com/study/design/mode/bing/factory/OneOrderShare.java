package com.study.design.mode.bing.factory;

import org.springframework.stereotype.Component;

/**
 * @author zjx
 * @Date: 2023/6/13
 */
@Component
public class OneOrderShare implements Share{

    @Override
    public String getShareFunctionType() {
        return EnumShareType.ONE_ORDER.getName();
    }

    @Override
    public String mainProcess(String shareName) {
        //这里写一些处理视频ONE业务逻辑代码
        System.out.println("OneOrderShare=================处理视频ONE");
        return shareName;
    }

}
