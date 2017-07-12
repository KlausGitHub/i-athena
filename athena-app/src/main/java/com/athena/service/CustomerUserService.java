package com.athena.service;

import com.athena.bean.CustomUserDetails;
import com.athena.dto.AthenaAccountDTO;
import com.athena.entity.AthenaAccount;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by yangsheng on 2017/7/8.
 */
@Service
public class CustomerUserService implements UserDetailsService {

    @Autowired
    private IAthenaAccountService accountService;

    @Autowired
    private IAthenaRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        if (StringUtils.isBlank(userName)) {
            throw new UsernameNotFoundException("登陆用户名不能为空");
        }

        AthenaAccountDTO account = accountService.findByUserName(userName);

//        if (account == null) {
//            throw new UsernameNotFoundException("登录用户名:" + userName + "不存在");
//        }
        AthenaAccount user = new AthenaAccount();
        user.setUsername("yang");
        user.setPassword("123");
        user.setUserId(1L);

        return new CustomUserDetails(user, true, true, true, true, null);
    }


    /**
     * 获取用户的角色权限
     *
     * @param userId
     * @return
     */
    private Collection<GrantedAuthority> getAuthorities(Long userId) {
        List<GrantedAuthority> authList = Lists.newArrayList();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));
        authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return authList;
    }
}
