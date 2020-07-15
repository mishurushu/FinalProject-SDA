package com.sapianos.sapianos.models;

import javax.persistence.*;
@Entity
@Table(name = "userType")
public class UserType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeId")
    private int typeId;
    @Column(name = "userType")
    private String userType;


    public UserType(){

    }

    public UserType(String userType){
        this.userType = userType;
    }

    public UserType(int typeId, String userType) {
        this.typeId = typeId;
        this.userType = userType;
    }

    public int getTypeId() {
        return typeId;
    }

    public String getUserType() {
        return userType;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "typeId=" + typeId +
                ", userType='" + userType + '\'' +
                '}';
    }
}
