package com.study.design.mode.bing.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zjx
 * @Date: 2023/6/13
 */
@Component
public class ShareFactory {

    @Autowired
    private List<Share> shareFunctionList;


    public Share getShareFunction(String type) {
        for (Share shareFunction : shareFunctionList) {
            if (shareFunction.getShareFunctionType().equals(type)) return shareFunction;
        }
        return null;
    }




}
