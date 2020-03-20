package com.tw.dddworkshop.order.domain;

import com.tw.dddworkshop.domain.Price;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

public class Order {

    private List<Product> products;
    Currency INR = Currency.getInstance("INR");


    public Order(List<Product> products) {

        this.products = products;
    }

    public Price totalPrice() {
        return products
                .stream()
                .map(product -> product.price())
                .reduce(
                        new Price(BigDecimal.ZERO, INR), (price1, price2) ->
                                price1.add(price2));
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}
