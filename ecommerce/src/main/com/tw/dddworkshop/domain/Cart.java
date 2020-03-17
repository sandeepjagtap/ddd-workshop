package com.tw.dddworkshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> productList = new ArrayList<Item>();
    public void addItem(Item item) {
        productList.add(item);
        System.out.println("item added to chart = " + item);
    }

}
