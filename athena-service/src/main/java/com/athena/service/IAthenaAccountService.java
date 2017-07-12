package com.athena.service;

import com.athena.dto.AthenaAccountDTO;

/**
 * Created by yangsheng on 2017/7/9.
 */
public interface IAthenaAccountService {

    AthenaAccountDTO findByUserName(String userName);
}
