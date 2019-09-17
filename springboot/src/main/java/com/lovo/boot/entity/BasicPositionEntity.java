package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "p_position")
public class BasicPositionEntity {
    @Id
    @Column(length = 32)
    @GenericGenerator(strategy = "uuid",name = "puuid")
    @GeneratedValue(generator = "puuid")
    private  String positionId;
    @Column(length = 48)
    private  String userName;
    private  int age;
    @Column(length = 48)
    private  String sex;
    @Column(length = 48)
    private String birthday;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
