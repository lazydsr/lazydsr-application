package com.lazydsr.manager.service.impl;

import com.lazydsr.manager.repository.UserRepository;
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
   private UserRepository userRepository;


    @Override
    public User findUserById(String id) {
        return userRepository.findOne(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findUserByName(String name) {
        System.out.println("aaaaaaa111111111111"+name);

        return userRepository.findUserByName(name);
    }

    @Override
    public List<User> findUserByName2(String name) {
        return userRepository.findUserByName2(name);
    }

    @Override
    public List<String> findUserNameBytest() {
        return userRepository.findUserNameBytest();
    }
}
