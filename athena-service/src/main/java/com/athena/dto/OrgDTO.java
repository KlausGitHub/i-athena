package com.athena.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangsheng on 2017/7/8.
 */
@Data
public class OrgDTO implements Serializable {
    private static final long serialVersionUID = -9032439502880150979L;

    private Long id;

    private String name;

    private Date createDate;
}
