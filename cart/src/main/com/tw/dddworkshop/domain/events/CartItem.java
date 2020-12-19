package com.tw.dddworkshop.domain.events;

import com.tw.dddworkshop.domain.Price;

public class CartItem {
    String name;
    Price price;

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    int quantity;

    public CartItem(String name, Price price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
