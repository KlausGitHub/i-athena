package com.athena.enums;

/**
 * 性别 枚举
 * Created by yangsheng on 2017/7/5.
 */
public enum GenderEnum implements BaseEnum<String, GenderEnum, Integer> {

    MALE("M", "男", 1),
    FEMALE("F", "女", 0),
    UNKNOW("O", "不详", -1);


    private String key;
    private String name;
    private int value;


    GenderEnum(String key, String name, int value) {
        this.key = key;
        this.name = name;
        this.value = value;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
