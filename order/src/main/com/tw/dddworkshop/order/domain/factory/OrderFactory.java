package com.tw.dddworkshop.order.domain.factory;

import com.tw.dddworkshop.domain.events.CartItem;
import com.tw.dddworkshop.order.domain.Order;
import com.tw.dddworkshop.order.domain.Product;
import com.tw.dddworkshop.order.domain.ProductWeightInfo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderFactory {

    public static Order build(List<CartItem> items,
                              List<ProductWeightInfo> productWeights) {

        Map<String, Double> productWeightInfoMap =
                productWeights.stream().collect(
                        Collectors.toMap(item -> item.getName(), item -> item.getWeightInGrams()));

        return new Order(items.stream().map(cartItem ->
                   new Product(cartItem.getName(), cartItem.getPrice(),
                           productWeightInfoMap.get(cartItem.getName()))
                ).collect(Collectors.toList()));

    }

}

