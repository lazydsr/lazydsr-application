package com.lazydsr.manager.service.impl;

import com.lazydsr.manager.po.Role;
import com.lazydsr.manager.po.User;
import com.lazydsr.manager.po.UserRole;
import com.lazydsr.manager.repository.*;
import com.lazydsr.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.service.impl
 * Created by Lazy on 2017/12/25 4:09
 * Version: 0.1
 * Info: @TODO:...
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PermissionRepository permissionRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private PermissionRoleRepository permissionRoleRepository;

    @Override
    public User findUserById(String id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByUsername(username);
        if (user != null) {
            List<Role> roleList = roleRepository.findRolesByUserid(user.getId());
            List<UserRole> userRoleList = userRoleRepository.findUserRolesByUserid(user.getId());

            //List<Permission> permissions = permissionDao.findByAdminUserId(user.getId());
            //List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            //for (Permission permission : permissions) {
            //    if (permission != null && permission.getName()!=null) {
            //
            //        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
            //        //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
            //        grantedAuthorities.add(grantedAuthority);
            //    }
            //}
            //return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
        return null;
    }

}
