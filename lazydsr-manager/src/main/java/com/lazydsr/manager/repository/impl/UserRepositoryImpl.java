package com.lazydsr.manager.repository.impl;

import com.lazydsr.manager.repository.UserCustomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * UserDaoImpl
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.dao.impl
 * Created by Lazy on 2017/12/26 9:29
 * Version: 0.1
 * Info: User复杂业务自定义Dao实现
 */
public class UserRepositoryImpl implements UserCustomRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<String> findUserNameBytest() {
        //jdbcTemplate.query("select count(1) from user",new RowMapperResultSetExtractor<Integer>());
        List<String> idList = jdbcTemplate.queryForList("select id from user", String.class);
        return idList;
    }
}
