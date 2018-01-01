package com.lazydsr.manager.po;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

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
    /**
     * 编号
     */
    String workcode;
    /**
     * 用户名
     */
    @Column(name = "username")
    @NotNull
    String username;
    /**
     * 密码
     */
    @NotNull
    String password;
    /**
     * 密码连续输入错误次数
     */
    int sumpasswordwrong = 0;
    /**
     * 密码锁定标记
     */
    int passwordlock = 1;
    /**
     * 旧密码1
     */
    String oldpassword1;
    /**
     * 旧密码2
     */
    String oldpassword2;

    /**
     * 邮箱
     */
    String email;
    /**
     * 手机
     */
    String mobile;
    /**
     * 座机
     */
    String telphone;
    /**
     * 组织
     */
    String organization;
    /**
     * 公司
     */
    String company;
    /**
     * 部门
     */
    String department;
    /**
     * 身份证
     */
    String idcard;
    /**
     * 排序
     */
    @Nullable
    double ordernum = 1000;
    /**
     * 账号类型
     */
    @Nullable
    int accounttype;
    /**
     * 账号状态
     */
    int status = 1;

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
