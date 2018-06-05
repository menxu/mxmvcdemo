package com.mxmvc.service;

import com.mxmvc.model.DbAuthUser;

/**
 * Created by menxu on 18/5/28.
 */
public interface AuthUserService {
    String getByTest();

    DbAuthUser getById(Integer id);
}
