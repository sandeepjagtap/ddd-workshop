package com.tw.dddworkshop.order.application;


import com.tw.dddworkshop.domain.Price;
import com.tw.dddworkshop.domain.events.CartCheckedOutEvent;
import com.tw.dddworkshop.domain.events.CartItem;
import com.tw.dddworkshop.order.domain.Order;
import com.tw.dddworkshop.order.domain.ProductWeightInfo;
import com.tw.dddworkshop.order.domain.factory.OrderFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class ApplicationForOrder {

    public static void main(String[] args) {

        Currency INR = Currency.getInstance("INR");

        CartItem inkPen = new CartItem("Hero Ink Pen", new Price(new BigDecimal(120), INR), 1);
        CartItem bat = new CartItem("GM Cricket Bat", new Price(new BigDecimal(3000), INR),1);

        List<CartItem> items = new ArrayList<>();
        items.add(inkPen);
        items.add(bat);

        // Assume that we received this event via message broker like kafka.
        CartCheckedOutEvent cartCheckedOutEvent = new CartCheckedOutEvent(items);

        List<ProductWeightInfo> productWeights = new ArrayList<>();
        productWeights.add(new ProductWeightInfo("Hero Ink Pen", 10D));
        productWeights.add(new ProductWeightInfo("GM Cricket Bat", 500D));

        Order order = OrderFactory.build(cartCheckedOutEvent.getItems(),productWeights);

        System.out.println("order total price= " + order.totalPrice());


    }
}
