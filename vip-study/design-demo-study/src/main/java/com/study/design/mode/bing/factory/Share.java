package com.study.design.mode.bing.factory;

/**
 * 抽象工厂方法-分享商品类
 */
public interface Share {

    /**
     * 获取分享类型
     * @return 枚举code
     */
    String getShareFunctionType();

    /**
     *
     * @param shareName
     * @return
     */
    String mainProcess(String shareName);
}
