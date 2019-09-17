package com.lovo.boot.service;

import com.lovo.boot.entity.UserEntity;

import java.util.List;

public interface IUserService {

    public void savaUser(UserEntity userEntity);

    /**
     * 根据用户名和密码查询对象
     * @param user
     * @return
     */
    public UserEntity findByUserNameAndPasssword(UserEntity user);

    public List<UserEntity> findListUser();

    public void delUser(String id);

    public  UserEntity findUserById(String id);
}
