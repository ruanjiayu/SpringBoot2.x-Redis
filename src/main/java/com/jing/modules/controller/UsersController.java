package com.jing.modules.controller;

import com.jing.modules.dto.UsersDTO;
import com.jing.modules.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/12 15:34
 */
@RestController
@RequestMapping("users")
@Slf4j
public class UsersController {

    @Resource
    private UserService userService;


    @GetMapping("id")
    public UsersDTO getUsers(@RequestParam("id") String id){
       return  userService.getUserById(id);
    }


    @GetMapping(value = "delete")
    public String delete(){
        userService.clear();
        return "清除成功";
    }


}
