package com.mxmvc.service.impl;

import com.mxmvc.dao.AuthUserMapper;
import com.mxmvc.model.DbAuthUser;
import com.mxmvc.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by menxu on 18/5/28.
 */
@Service
public class AuthUserServiceImpl implements AuthUserService{

    @Autowired
    private AuthUserMapper authUserMapper;

    public String getByTest() {
        return "test getByTest";
    }

    public DbAuthUser getById(Integer id) {
        return authUserMapper.selectUserById(id);
    }


}
