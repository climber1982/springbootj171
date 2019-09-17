package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("findUserEntity")
    public ModelAndView findUserEntity(){
        ModelAndView mv=new ModelAndView("index");
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("赵云");
        userEntity.setPassword("123456");
     UserEntity user=   userService.findByUserNameAndPasssword(userEntity);
     //把对象放入模型
        mv.addObject("user",user);
        return  mv;
    }
}
