package com.lovo.boot.service.impl;

import com.lovo.boot.dao.IUserDao;
import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

  @Transactional
    public void savaUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }
}
