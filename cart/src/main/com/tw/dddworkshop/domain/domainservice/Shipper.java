package com.tw.dddworkshop.domain.domainservice;

import com.tw.dddworkshop.domain.Address;
import com.tw.dddworkshop.domain.Order;
import com.tw.dddworkshop.domain.Product;
import com.tw.dddworkshop.domain.ShippingInformation;

public class Shipper {


    public static void ship(ShippingInformation shippingInformation, Order order) {
        order.getProducts().forEach(product ->
                shipInternal(product, shippingInformation.getAddress(), product.getWeightInGms()));
    }

    private static void shipInternal(Product product, Address address, Double weightInGrams) {
        // does some stuff with weight, decides packet type etc
        System.out.println("Shipped =  " + product.getName() + " with weight " + weightInGrams );
    }
}
