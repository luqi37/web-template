package com.service.impl;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/14.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
