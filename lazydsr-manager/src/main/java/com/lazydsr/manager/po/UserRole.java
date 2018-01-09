package com.lazydsr.manager.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * UserRole
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2018/1/9 22:32
 * Version: 0.1
 * Info: @TODO:...
 */
@Data
@Entity
@Table(name = "sys_user_role")
public class UserRole {
    @Id
    String id;
    @Column(name = "userid")
    String userId;
    @Column(name = "roleId")
    String roleId;


    /**
     * 创建人
     */
    String creater;
    /**
     * 创建时间
     */
    @Column(name = "createdatetime")
    Date createDateTime = new Date();
    /**
     * 最后修改人
     */
    @Column(name = "lastmodifier")
    String lastModifier;
    /**
     * 最后修改时间
     */
    @Column(name = "lastmodifydatetime")
    Date lastModifyDateTime = new Date();
    /**
     * 数据状态
     */
    @Column(name = "datastatus")
    int dataStatus = 0;

}
