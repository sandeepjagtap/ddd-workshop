package com.tw.dddworkshop.domain;

import java.util.Objects;

public class Product implements ValueObject<Product> {

    private String name;

    private Price price;
    private Double weightInGrams;


    public Product(String name, Price price, Double weightInGrams) {
        this.name = name;
        this.price = price;
        this.weightInGrams = weightInGrams;
    }

    public String getName() {
        return name;
    }


    public Price getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean sameValueAs(Product o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) &&
                price.equals(product.price);
    }

    public Double getWeightInGms() {
        return weightInGrams;
    }
}
