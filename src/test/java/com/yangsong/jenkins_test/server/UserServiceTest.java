package com.yangsong.jenkins_test.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ProjectName: jenkins_test
 * @Package: com.yangsong.jenkins_test.server
 * @ClassName: UserServiceTest
 * @Author: song_yang
 * @Description:
 * @Date: 2020/8/2 15:48
 */
@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void test01() {

    userService.test01();



    }
}