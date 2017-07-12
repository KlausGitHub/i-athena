package com.athena.service;

import com.athena.dto.OrgDTO;

/**
 * Created by yangsheng on 2017/7/8.
 */
public interface IAthenaOrgService {

    OrgDTO findById(Long id);
}
