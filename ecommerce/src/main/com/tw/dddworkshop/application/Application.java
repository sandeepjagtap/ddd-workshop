package com.tw.dddworkshop.application;

import com.tw.dddworkshop.domain.Cart;
import com.tw.dddworkshop.domain.Product;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("Ipad Pro");
        cart.addProduct(product);

        Product inkPen = new Product("Hero Ink Pen");
        cart.addProduct(inkPen);
    }
}
