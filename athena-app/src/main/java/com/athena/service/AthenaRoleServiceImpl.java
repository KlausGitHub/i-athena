package com.athena.service;

import com.athena.dao.AthenaRoleMapper;
import com.athena.dto.RoleDTO;
import com.athena.entity.AthenaRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangsheng on 2017/7/1.
 */
@Service
public class AthenaRoleServiceImpl implements IAthenaRoleService {

    @Resource
    AthenaRoleMapper athenaRoleMapper;


    @Override
    public RoleDTO findById(Long id) {
        AthenaRole role = athenaRoleMapper.selectByPrimaryKey(id);
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName("aaaaaaa");
        return roleDTO;
    }
}
