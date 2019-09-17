package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sys_role_power")
public class RolePowerEntity {

    @Id
    @GenericGenerator(name = "rpuuid",strategy = "uuid")
    @GeneratedValue(generator = "rpuuid")
    @Column(length = 32,name = "r_p_id")
    private  String rolePowerId;
    @ManyToOne
    @JoinColumn(name = "r_id")
    private RoleEntity role;
    @ManyToOne
    @JoinColumn(name = "p_id")
    private  PowerEntity power;


    public String getRolePowerId() {
        return rolePowerId;
    }

    public void setRolePowerId(String rolePowerId) {
        this.rolePowerId = rolePowerId;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public PowerEntity getPower() {
        return power;
    }

    public void setPower(PowerEntity power) {
        this.power = power;
    }
}
