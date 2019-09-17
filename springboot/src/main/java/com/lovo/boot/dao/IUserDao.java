package com.lovo.boot.dao;

import com.lovo.boot.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<UserEntity,String> {

    @Query("from UserEntity where  userName=?1 and password=?2")
    public UserEntity findByUserNameAndPasssword(String userName,String password);
}
