package com.lovo.boot.service.impl;

import com.lovo.boot.dao.IUserDao;
import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import com.lovo.boot.util.JedisDB;
import com.lovo.boot.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;

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
      //从缓存中查询
        String key=user.getUserName()+"_"+user.getPassword();
       Jedis j= JedisDB.createJedis();
        byte[] userbyte= j.get(key.getBytes());
       if(null==userbyte){
           //查询数据库
           user=       userDao.findByUserNameAndPasssword(user.getUserName(),user.getPassword());
         byte[] bytes=  SerializeUtil.serialize(user);
           //放入缓存
           j.set(key.getBytes(),bytes);
       }  else {
           //获取缓存数据
           user= (UserEntity) SerializeUtil.unserizlize(userbyte);
       }
        return user;
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
