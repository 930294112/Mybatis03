package com.lanou.domain;

import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public class Order {
    private int id; //订单主键
    private int user_id; //用户id
    private String order_number; //订单编号
    private double order_price; //订单价格

    private User user; //订单中关联的用户对象(一对一)

    private List<OrderDetail> orderDetails; //订单明细集合(一对多)

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Order() {
    }

    public Order(int id, int user_id, String order_number, double order_price) {
        this.id = id;
        this.user_id = user_id;
        this.order_number = order_number;
        this.order_price = order_price;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", order_number='" + order_number + '\'' +
                ", order_price=" + order_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }
}
