package com.lazydsr.manager.repository;

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
@Repository
public interface UserRepository extends JpaRepository<User, String>,UserCustomRepository {
    //@Query(value = "select * from user t where username=?1", nativeQuery = true)
    //List<User> findUserByName(@Param("username") String username);
    //
    //@Query(value = "select t from User t where username=?1")
    //List<User> findUserByName2(@Param("username") String username);
    User findUserByUsername(String username);
}
