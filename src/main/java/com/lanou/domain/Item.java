package com.lanou.domain;

/**
 * Created by dllo on 17/11/6.
 */
public class Item {
    private int id; //商品id
    private String item_name; //商品名字
    private double item_price; //商品价格

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", item_name='" + item_name + '\'' +
                ", item_price=" + item_price +
                '}';
    }

    public Item() {
    }

    public Item(int id, String item_name, double item_price) {

        this.id = id;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }
}
