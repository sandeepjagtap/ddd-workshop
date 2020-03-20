package com.tw.dddworkshop.order.application;

import com.tw.dddworkshop.domain.Item;
import com.tw.dddworkshop.domain.Price;
import com.tw.dddworkshop.domain.Product;
import com.tw.dddworkshop.domain.events.CartCheckedOutEvent;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

public class ApplicationForOrder {

    public static void main(String[] args) {

        Product inkPen = new Product("Hero Ink Pen", new Price(new BigDecimal(120), Currency.getInstance("INR")), 20.0);
        Item inkPenItem = new Item(inkPen, 1);

        Product bat = new Product("GM Cricket Bat", new Price(new BigDecimal(3000), Currency.getInstance("INR")), 20.0);
        Item batItem = new Item(bat, 2);

        List<Item>

        CartCheckedOutEvent cartCheckedOutEvent = new CartCheckedOutEvent()
    }
}
