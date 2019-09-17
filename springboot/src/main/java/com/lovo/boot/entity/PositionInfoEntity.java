package com.lovo.boot.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "p_info")
public class PositionInfoEntity {
    @Id
    @Column(length = 32)
    @GenericGenerator(strategy = "uuid",name = "iuuid")
    @GeneratedValue(generator = "iuuid")
    private String infoId;
    @Column(length = 48)
    private String position;
    private float money;
    @Column(length = 48,columnDefinition = "TIMESTAMP")
    private String inDate;
    @ManyToOne
    @JoinColumn(name = "positionId")
    private BasicPositionEntity positionEntity;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public BasicPositionEntity getPositionEntity() {
        return positionEntity;
    }

    public void setPositionEntity(BasicPositionEntity positionEntity) {
        this.positionEntity = positionEntity;
    }
}
