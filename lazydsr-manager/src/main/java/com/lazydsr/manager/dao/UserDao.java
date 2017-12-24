package com.lazydsr.manager.dao;

import com.lazydsr.manager.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.dao
 * Created by Lazy on 2017/12/25 4:07
 * Version: 0.1
 * Info: 用户Dao
 */
public interface UserDao extends JpaRepository<User, String> {
    @Query(value = "select * from user t where username=:username", nativeQuery = true)
    List<User> findUserByName(@Param("username") String username);
}
