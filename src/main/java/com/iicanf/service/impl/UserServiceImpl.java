package com.iicanf.service.impl;

import com.iicanf.dao.UserDao;
import com.iicanf.model.User;
import com.iicanf.service.UserService;

import com.iicanf.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

/**
 *
 * Created by iicanf on 2018/08/08.
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserDao userDao;

    public void test(){
        Example example = new Example(User.class);
        example.selectProperties();

    }

}
