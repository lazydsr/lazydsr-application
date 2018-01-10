package com.lazydsr.manager.repository;

import com.lazydsr.manager.po.Permission;
import com.lazydsr.manager.po.PermissionRole;
import com.lazydsr.manager.po.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PermissionRepository
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.repository
 * Created by Lazy on 2018/1/10 22:11
 * Version: 0.1
 * Info: @TODO:...
 */
@Repository
public interface PermissionRoleRepository extends JpaRepository<PermissionRole, String> {

}
