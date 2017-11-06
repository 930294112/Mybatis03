package com.lanou.domain;

import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public class User {
    private int id;
    private String loginName;
    private String loginPassword;
    private String gender;
    private String age;

    private List<Order> orders; //订单的集合(一对多)
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }



    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public User(String loginName, String loginPassword, String gender, String age) {
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.gender = gender;
        this.age = age;
    }

    public User(int id, String loginName, String loginPassword, String gender, String age) {

        this.id = id;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
