package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sys_role")
public class RoleEntity {
    @Id
    @GenericGenerator(name = "ruuid",strategy = "uuid")
    @GeneratedValue(generator = "ruuid")
    @Column(length = 32,name = "r_id")
    private  String roleId;
    @Column(length = 48)
    private  String roleName;
    @Column(length = 128)
    private String roleInfo;
     @OneToMany(mappedBy = "role")
    private List<RoleUserEntitiy> listUserRole;
    @OneToMany(mappedBy ="role" )
     private  List<RolePowerEntity> listRolePower;

    public List<RolePowerEntity> getListRolePower() {
        return listRolePower;
    }

    public void setListRolePower(List<RolePowerEntity> listRolePower) {
        this.listRolePower = listRolePower;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public List<RoleUserEntitiy> getListUserRole() {
        return listUserRole;
    }

    public void setListUserRole(List<RoleUserEntitiy> listUserRole) {
        this.listUserRole = listUserRole;
    }
}
