package com.lanou.domain_ext;

import com.lanou.domain.Order;

/**
 * Created by dllo on 17/11/6.
 */
public class OrderExt extends Order {
    /*订单的扩展表*/

    /*定义用户表的相关属性*/
    private int id;
    private String loginName;
    private String loginPassword;
    private String gender;
    private String age;

    @Override
    public String toString() {
        return "OrderExt{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                "} " + super.toString();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
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
