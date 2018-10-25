package com.dao;

import com.pojo.User;

/**
 * Created by Administrator on 2017/9/14.
 */
public interface UserDao {
    User selectUser(long id);
}
