package com.jing.modules.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 9:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

//    使用了传统的日志打印输出
    private final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void getUserById() {
        logger.info("获得的用户信息是:{}",userService.getUserById("1"));
    }
}