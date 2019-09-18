package com.lovo.boot.controller;

import com.lovo.boot.entity.UserBean;
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

  @Autowired
   private UserBean userBean;

    @RequestMapping("info/{tag}")
    public  String hello(@PathVariable int tag){
           int i=1/0;
        if(tag==0){
            return "hello world"+userBean.getUserName();
        }else if(tag==1){
            return "hello spring boot";
        }else {
            return "error";
        }
    }

}
