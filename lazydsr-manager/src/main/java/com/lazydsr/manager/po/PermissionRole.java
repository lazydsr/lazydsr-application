package com.lazydsr.manager.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * PermissionRole
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.po
 * Created by Lazy on 2018/1/10 21:49
 * Version: 0.1
 * Info: 权限角色po
 */
@Data
@Entity
@Table(name = "sys_permission_role")
public class PermissionRole {
    @Id
    String id;
    @Column(name = "permissionid")
    String permissionid;
    @Column(name = "roleid")
    String roleid;
    /**
     * 映射关系
     * 0  启用
     * 1  禁用
     */
    int status = 0;


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
     * 0 为正常
     * 1 为删除
     */
    @Column(name = "datastatus")
    int dataStatus = 0;
}
