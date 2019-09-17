package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "sys_power")
public class PowerEntity {
    @Id
    @GenericGenerator(name = "puuid",strategy = "uuid")
    @GeneratedValue(generator = "puuid")
    @Column(length = 32,name = "p_id")
    private  String powerId;
    @Column(length = 48)
    private  String powerName;
    private  String urlPath;

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }
}
