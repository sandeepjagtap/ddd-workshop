package com.tw.dddworkshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
        System.out.println("item added to chart = " + item);
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("Cart now has "+ items);
    }
}
