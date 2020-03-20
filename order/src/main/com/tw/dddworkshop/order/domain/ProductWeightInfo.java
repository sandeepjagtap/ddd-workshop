package com.tw.dddworkshop.order.domain;

import com.tw.dddworkshop.domain.Price;

public class ProductWeightInfo {
    private String name;
    private Double weightInGrams;

    public ProductWeightInfo(String name, Double weightInGrams) {
        this.name = name;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }

    public Double getWeightInGrams() {
        return weightInGrams;
    }
}
