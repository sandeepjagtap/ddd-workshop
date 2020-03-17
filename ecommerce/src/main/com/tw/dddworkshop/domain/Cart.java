package com.tw.dddworkshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> productList = new ArrayList<Product>();
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("product added to chart = " + product);
    }

}
