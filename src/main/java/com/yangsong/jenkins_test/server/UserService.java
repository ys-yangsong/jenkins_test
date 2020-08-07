package com.yangsong.jenkins_test.server;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: jenkins_test
 * @Package: com.yangsong.jenkins_test.server
 * @ClassName: UserService
 * @Author: song_yang
 * @Description:
 * @Date: 2020/8/2 15:47
 */

@Service
public class UserService {

    public String test01() {

        boolean flag = false;

        if (flag) {
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }

        System.out.println("这是一个小测试........");
        System.out.println("这是2个小测试........");
        System.out.println("这是3个小测试........");
        System.out.println("这是branch-1的第一次修改........");
        System.out.println("这是branch-1的第二次修改........");


        return "hello world!!!!";

    }

}
