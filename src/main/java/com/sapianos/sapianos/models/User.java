package com.sapianos.sapianos.models;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId ;
    @Column(name ="userName")
    private String userName;

    @OneToOne
    @JoinColumn(name = "userType")
    private UserType userType;

    public User(){

    }

    public User(String userName,UserType userType){
        this.userName = userName;
        this.userType = userType;
    }

    public User(int userId, String userName, UserType userType) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                '}';
    }
}
