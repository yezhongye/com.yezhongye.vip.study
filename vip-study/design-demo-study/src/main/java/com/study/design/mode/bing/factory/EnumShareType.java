package com.study.design.mode.bing.factory;

public enum EnumShareType {

    SUCCESS_ORDER("successOrder"),
    ONE_ORDER("oneOrder"),


    NINE_999_ORDER("999Order");

    private String name;

    EnumShareType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
