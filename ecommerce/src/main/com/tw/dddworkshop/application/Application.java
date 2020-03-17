package com.tw.dddworkshop.application;

import com.tw.dddworkshop.domain.Cart;
import com.tw.dddworkshop.domain.Item;
import com.tw.dddworkshop.domain.Product;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product ipadPro = new Product("Ipad Pro");
        Item ipadProItem = new Item(ipadPro, 1);
        cart.addItem(ipadProItem);

        Product inkPen = new Product("Hero Ink Pen");
        Item inkPenItem = new Item(inkPen, 1);
        cart.addItem(inkPenItem);

    }
}
