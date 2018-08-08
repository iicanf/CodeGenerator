package com.iicanf.dao.impl;

import com.iicanf.dao.mapper.UserMapper;
import com.iicanf.model.User;
import com.iicanf.dao.UserDao;
import com.iicanf.dao.AbstractDao;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by iicanf on 2018/08/08.
 */
@Repository
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    @Autowired
    private UserMapper userMapper;

}
