package com.lazydsr.manager.po;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2017/12/25 3:58
 * Version: 0.1
 * Info: 用户的持久化对象
 */
@Data
@Entity
public class User {
    @Id
    String id;
    @Column(name = "username")
    String userName;
    String password;
}
