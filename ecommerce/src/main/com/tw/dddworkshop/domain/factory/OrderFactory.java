package com.tw.dddworkshop.domain.factory;

import com.tw.dddworkshop.domain.Cart;
import com.tw.dddworkshop.domain.Item;
import com.tw.dddworkshop.domain.Order;
import com.tw.dddworkshop.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderFactory {
    public static Order create(Cart cart) {
        List<Item> items = cart.allItems();

        List<Product> products = items.stream().map( item -> {
            int quantity = item.getQuantity();
            List<Product> tempProducts = new ArrayList<>();
            while(quantity > 0 ) {
                tempProducts.add(item.getProduct());
                quantity --;
            }
            return tempProducts;
        }).flatMap(List::stream).collect(Collectors.toList());


        return new Order(products);
    }
}
