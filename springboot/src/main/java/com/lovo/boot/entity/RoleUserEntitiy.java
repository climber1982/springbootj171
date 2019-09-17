package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name ="sys_role_user" )
public class RoleUserEntitiy {
    @Id
    @GenericGenerator(name = "ruuuid",strategy = "uuid")
    @GeneratedValue(generator = "ruuuid")
    @Column(length = 32,name = "ru_id")
    private  String roleUserId;
    @ManyToOne
    @JoinColumn(name = "r_id")
    private  RoleEntity role;
    @ManyToOne
    @JoinColumn(name = "u_id")
    private  UserEntity user;

    public String getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(String roleUserId) {
        this.roleUserId = roleUserId;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
