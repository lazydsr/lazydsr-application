package com.lazydsr.manager.repository;

import com.lazydsr.manager.po.Permission;
import com.lazydsr.manager.po.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PermissionRepository
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.repository
 * Created by Lazy on 2018/1/10 22:11
 * Version: 0.1
 * Info: @TODO:...
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    @Query(value = "select t.* from sys_role t,sys_user_role t1 where t.id=t1.roleId and t1.userid=?1", nativeQuery = true)
    List<Role> findRolesByUserid(String userid);
}
