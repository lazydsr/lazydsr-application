package com.lazydsr.manager;

import com.lazydsr.manager.po.User;
import com.lazydsr.manager.service.UserService;
import com.lazydsr.util.id.UtilUUId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * UserServiceTest
 * PROJECT_NAME: lazydsr-application
 * PACKAGE_NAME: com.lazydsr.manager
 * Created by Lazy on 2017/12/25 4:18
 * Version: 0.1
 * Info: @TODO:...
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void saveTest() {
        User user = new User();
        user.setId(UtilUUId.getId());
        user.setUserName("dd");
        user.setPassword("aa");
        User save = userService.save(user);
        System.out.println(save);
    }

    @Test
    public void findById() {
        User user = userService.findUserById("9WWVPTWPKYSXB93KNESAY8RSBUUBMFVH");
        System.out.println(user);
    }

    @Test
    public void findByUserName() {
        List<User> users = userService.findUserByName("aa");
        System.out.println(users);
    }

}
