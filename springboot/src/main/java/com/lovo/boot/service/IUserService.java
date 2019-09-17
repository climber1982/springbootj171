package com.lovo.boot.service;

import com.lovo.boot.entity.UserEntity;

public interface IUserService {

    public void savaUser(UserEntity userEntity);

    /**
     * 根据用户名和密码查询对象
     * @param user
     * @return
     */
    public UserEntity findByUserNameAndPasssword(UserEntity user);
}
