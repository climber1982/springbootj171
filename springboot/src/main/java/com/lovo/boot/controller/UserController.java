package com.lovo.boot.controller;

import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import com.lovo.boot.util.StringMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

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

    @RequestMapping("savaUser")
    public  ModelAndView savaUser(UserEntity userEntity){
     ModelAndView mv=new ModelAndView("savauser");
        userService.savaUser(userEntity);
        mv.addObject("ok", StringMessage.SAVAOK);
        return mv;
    }
    @RequestMapping("findUser")
    @ResponseBody
    public UserEntity getUserEntityByUserNameAndPassword(UserEntity user){
       return userService.findByUserNameAndPasssword(user);

    }

    @RequestMapping("findListUser")
    public ModelAndView findListUser(){
        ModelAndView mv=new ModelAndView("listUser");
      List<UserEntity> list=  userService.findListUser();
      mv.addObject("userList",list);
        return mv;
    }
  @RequestMapping("delUser")
    public ModelAndView delUser(String id){
        ModelAndView mv=new ModelAndView();
        //删除
      userService.delUser(id);
        //重定向到查询页面
      RedirectView rv=new RedirectView("findListUser");
      mv.setView(rv);
        return mv;
    }

    @RequestMapping("gotoUpdate")
    public ModelAndView gotoUpdate(String id){
        ModelAndView mv=new ModelAndView("update");
        //根据ID查询出对象
     UserEntity user=   userService.findUserById(id);
     mv.addObject("user",user);
     return mv;
    }
}
