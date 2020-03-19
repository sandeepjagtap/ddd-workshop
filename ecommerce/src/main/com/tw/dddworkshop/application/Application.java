package com.tw.dddworkshop.application;

import com.tw.dddworkshop.domain.*;
import com.tw.dddworkshop.domain.domainservice.Shipper;
import com.tw.dddworkshop.domain.factory.OrderFactory;

import java.math.BigDecimal;
import java.util.Currency;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Product ipadPro = new Product("Ipad Pro", new Price(new BigDecimal(10000), Currency.getInstance("INR")), 20.0);
        Item ipadProItem = new Item(ipadPro, 1);
        cart.addItem(ipadProItem);

        Product inkPen = new Product("Hero Ink Pen", new Price(new BigDecimal(120), Currency.getInstance("INR")), 20.0);
        Item inkPenItem = new Item(inkPen, 1);
        cart.addItem(inkPenItem);

        Product bat = new Product("GM Cricket Bat", new Price(new BigDecimal(3000), Currency.getInstance("INR")), 20.0);
        Item batItem = new Item(bat, 2);
        cart.addItem(batItem);

        Product ipadProToBeRemoved = new Product("Ipad Pro", new Price(new BigDecimal(10000), Currency.getInstance("INR")), 20.0);
        Item ipadProToBeRemovedItem = new Item(ipadProToBeRemoved, 1);
        cart.removeItem(ipadProToBeRemovedItem);

        //Use case 6
        Cart cart1 = new Cart();

        Cart cart2 = new Cart();

        System.out.println("cart1 and cart 2 are different? = " + !cart1.equals(cart2));

        System.out.println("cart1 and cart 2 are different? = " + !cart1.sameIdentityAs(cart2));

        Product inkPen1 = new Product("Hero Ink Pen", new Price(new BigDecimal(10000), Currency.getInstance("INR")), 20.0);
        Product inkPen2 = new Product("Hero Ink Pen", new Price(new BigDecimal(10000), Currency.getInstance("INR")), 20.0);

        System.out.println("inkPen1 can be replaced by inkPen2 = "+ inkPen1.sameValueAs(inkPen2) );

        cart.checkOut();

        ShippingInformation shippingInformation = new ShippingInformation(new Address("line1", "Pune"));
        Order order = OrderFactory.create(cart, shippingInformation);

        System.out.println("order has these products = " + order.getProducts());

        order.ship();

       // Shipper.ship(new ShippingInformation(new Address("line1", "Pune")), order);

    }
}
