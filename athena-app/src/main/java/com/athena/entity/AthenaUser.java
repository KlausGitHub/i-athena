package com.athena.entity;

import lombok.Data;

import java.util.Date;

@Data
public class AthenaUser {
    private Long id;

    private String name;

    private String phone;

    private String nickName;

    private Byte gender;

    private Date birthday;

    private Integer status;

    private Long orgId;

    private Integer level;

    private String email;

    private String address;

    private String avatar;

    private String englishName;

    private Integer isDeleted;

    private Date createTime;

    private Date modifyTime;

    private String creator;

    private String modifier;

 }