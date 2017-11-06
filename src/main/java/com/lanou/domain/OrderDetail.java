package com.lanou.domain;

/**
 * Created by dllo on 17/11/6.
 */
public class OrderDetail {
    private int id;
    private int order_id;
    private int item_id;
    private int item_count;
    private double item_total_price;

    private Order order; //订单明细的订单

    private Item item; //订单明细对应的商品对象信息

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderDetail() {
    }

    public OrderDetail(int id, int order_id, int item_id, int item_count, double item_total_price) {

        this.id = id;
        this.order_id = order_id;
        this.item_id = item_id;
        this.item_count = item_count;
        this.item_total_price = item_total_price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", item_id=" + item_id +
                ", item_count=" + item_count +
                ", item_total_price=" + item_total_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getItem_count() {
        return item_count;
    }

    public void setItem_count(int item_count) {
        this.item_count = item_count;
    }

    public double getItem_total_price() {
        return item_total_price;
    }

    public void setItem_total_price(double item_total_price) {
        this.item_total_price = item_total_price;
    }


}
