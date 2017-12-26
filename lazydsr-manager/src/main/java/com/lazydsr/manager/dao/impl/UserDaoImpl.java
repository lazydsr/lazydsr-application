package com.lazydsr.manager.dao.impl;

import com.lazydsr.manager.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * UserDaoImpl
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.dao.impl
 * Created by Lazy on 2017/12/26 9:29
 * Version: 0.1
 * Info: User复杂业务自定义Dao实现
 */
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public String findUserNameBytest() {
        //jdbcTemplate.query()
        return null;
    }
}
