package com.athena.enums;

/**
 * Created by yangsheng on 2017/7/1.
 */
public interface BaseEnum<K, T extends Enum<T> & BaseEnum<K, T, V>, V> {
    K getKey();

    String getName();

    V getValue();
}
