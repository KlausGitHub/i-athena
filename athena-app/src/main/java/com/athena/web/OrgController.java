package com.athena.web;

import com.athena.common.BaseResult;
import com.athena.dto.OrgDTO;
import com.athena.service.IAthenaOrgService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by yangsheng on 2017/7/8.
 */

@RestController
@RequestMapping(path = "/v1/org")
public class OrgController {

    @Resource
    IAthenaOrgService orgService;

    @RequestMapping(path = "/{orgId}", method = RequestMethod.GET)
    @ResponseBody
    public BaseResult<OrgDTO> findOrg(@PathVariable Long orgId) {
        BaseResult<OrgDTO> result = new BaseResult<>();
        OrgDTO orgDTO = orgService.findById(orgId);
        result.setSuccess(orgDTO);
        return result;
    }
}
