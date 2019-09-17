package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
   @Autowired
    private IUserService userService;

    @RequestMapping("info/{tag}")
    public  String hello(@PathVariable int tag){
        if(tag==0){
            return "hello world";
        }else if(tag==1){
            return "hello spring boot";
        }else {
            return "error";
        }
    }
    @RequestMapping("savaUser")
    public  String savaUser(){
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("赵云");
        userEntity.setPassword("123456");
        userService.savaUser(userEntity);
        return "保持成功";
    }
}
