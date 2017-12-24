package com.lazydsr.manager.service.impl;

import com.lazydsr.manager.dao.UserDao;
import com.lazydsr.manager.po.User;
import com.lazydsr.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.service.impl
 * Created by Lazy on 2017/12/25 4:09
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(String id) {
        return userDao.findOne(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> findUserByName(String name) {
        System.out.println("aaaaaaa111111111111"+name);
        return userDao.findUserByName(name);
    }
}
