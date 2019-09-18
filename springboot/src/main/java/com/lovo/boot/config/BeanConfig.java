package com.lovo.boot.config;

import com.lovo.boot.entity.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
   @Bean
    public UserBean userBean(){
        UserBean user=new UserBean();
        user.setUserName("林冲");
        return user;
    }

}
