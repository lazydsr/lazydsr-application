package com.lazydsr.manager.service;

import com.lazydsr.manager.po.User;

import java.util.List;

/**
 * UserService
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.service
 * Created by Lazy on 2017/12/25 4:09
 * Version: 0.1
 * Info: 用户service
 */
public interface UserService {
    User findUserById(String id);

    User save(User user);

    List<User> findUserByName(String name);
    List<User> findUserByName2(String name);

}
