package com.tw.dddworkshop.order.domain;

import com.tw.dddworkshop.domain.Price;

public class Product {
    private String name;
    private Price price;
    private Double weightInGrams;

    public Product(String name, Price price, Double weightInGrams) {
        this.name = name;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }

    public Price price() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weightInGrams=" + weightInGrams +
                '}';
    }


}
