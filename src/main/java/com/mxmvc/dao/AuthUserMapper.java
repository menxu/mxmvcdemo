package com.mxmvc.dao;

import com.mxmvc.model.DbAuthUser;

/**
 * Created by menxu on 18/5/28.
 */
public interface AuthUserMapper {
    public DbAuthUser selectUserById(Integer authUserId);
}
