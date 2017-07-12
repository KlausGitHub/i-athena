package com.athena.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by yangsheng on 2017/7/9.
 */
@Data
public class AthenaAccountDTO implements Serializable {
    private static final long serialVersionUID = 6013539343957326277L;

    private Long id;

    private String userName;

    private String password;

    private Long userId;
}
