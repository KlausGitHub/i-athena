package com.athena.client;

import lombok.Data;

/**
 * Created by yangsheng on 2017/7/8.
 */
@Data
public class CurrentUser {

    /**
     * 使用ThreadLocal存储用户信息
     */
    private static ThreadLocal<CurrentUser> CLIENTS = new ThreadLocal();

    private String sid;//随机生成的sid

    private Long id;//用户ID

    private String name;//名字

    private String phone;//手机号码

    private Long orgId;//公司ID

    private String email;//邮箱

    public static CurrentUser getClient() {
        CurrentUser current = CLIENTS.get();
        return current;
    }

    public static void setClient(CurrentUser client) {
        CLIENTS.set(client);
    }

    public static void remove() {
        CLIENTS.remove();
    }
}
