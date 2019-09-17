package com.lovo.boot.service.impl;

import com.lovo.boot.dao.IUserDao;
import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

  @Transactional
    public void savaUser(UserEntity userEntity) {
        userDao.save(userEntity);
    }


    public UserEntity findByUserNameAndPasssword(UserEntity user) {
        return userDao.findByUserNameAndPasssword(user.getUserName(),user.getPassword());
    }

    @Override
    public List<UserEntity> findListUser() {
        return (List<UserEntity>) userDao.findAll();
    }

    @Override
    public void delUser(String id) {
        userDao.deleteById(id);
    }

    @Override
    public UserEntity findUserById(String id) {
        return userDao.findById(id).get();
    }
}
