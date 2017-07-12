package com.athena.service;

import com.athena.dao.AthenaOrgMapper;
import com.athena.dto.OrgDTO;
import com.athena.entity.AthenaOrg;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangsheng on 2017/7/8.
 */
@Service
public class AthenaOrgServiceImpl implements IAthenaOrgService {

    @Resource
    AthenaOrgMapper orgMapper;

    @Override
    public OrgDTO findById(Long id) {
        AthenaOrg org = orgMapper.selectByPrimaryKey(id);
        if (org == null) return null;
        OrgDTO orgDTO = new OrgDTO();
        orgDTO.setId(org.getId());
        orgDTO.setName(org.getOrgName());
        orgDTO.setCreateDate(org.getCreateTime());
        return orgDTO;
    }
}
