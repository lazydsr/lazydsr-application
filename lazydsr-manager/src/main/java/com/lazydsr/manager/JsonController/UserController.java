package com.lazydsr.manager.JsonController;

import com.lazydsr.manager.po.User;
import com.lazydsr.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * UserController
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager.JsonController
 * Created by Lazy on 2017/12/29 9:06
 * Version: 0.1
 * Info: @TODO:...
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("users")
    public List<User> test() {
        List<User> userList = userService.findUserByName("dd");
        return userList;
    }
    @RequestMapping("users1")
    public List<User> test1() {
        List<User> userList = userService.findUserByName2("dd");
        return userList;
    }
    @RequestMapping("users2")
    public List<String> test2() {
        List<String> userList = userService.findUserNameBytest();
        return userList;
    }
}
