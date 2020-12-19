package com.tw.dddworkshop.domain.factory;

import com.tw.dddworkshop.domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderFactory {
    public static Order create(Cart cart, ShippingInformation shippingInformation) {
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


        return new Order(products, shippingInformation );
    }
}
