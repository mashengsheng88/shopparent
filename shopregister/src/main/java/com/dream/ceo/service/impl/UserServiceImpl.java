package com.dream.ceo.service.impl;

import com.dream.ceo.dao.IUserDao;
import com.dream.ceo.model.User;
import javax.annotation.Resource;

/**
 * Created by masheng on 2017/9/24.
 */
public class UserServiceImpl implements IUserDao {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
