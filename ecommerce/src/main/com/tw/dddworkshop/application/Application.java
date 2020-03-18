package com.tw.dddworkshop.application;

import com.tw.dddworkshop.domain.Cart;
import com.tw.dddworkshop.domain.Item;
import com.tw.dddworkshop.domain.Product;

import javax.lang.model.SourceVersion;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Product ipadPro = new Product("Ipad Pro");
        Item ipadProItem = new Item(ipadPro, 1);
        cart.addItem(ipadProItem);

        Product inkPen = new Product("Hero Ink Pen");
        Item inkPenItem = new Item(inkPen, 1);
        cart.addItem(inkPenItem);

        Product bat = new Product("GM Cricket Bat");
        Item batItem = new Item(bat, 2);
        cart.addItem(batItem);

        Product ipadProToBeRemoved = new Product("Ipad Pro");
        Item ipadProToBeRemovedItem = new Item(ipadProToBeRemoved, 1);
        cart.removeItem(ipadProToBeRemovedItem);

        //Use case 6
        Cart cart1 = new Cart();

        Cart cart2 = new Cart();

        System.out.println("cart1 and cart 2 are different? = " + !cart1.equals(cart2));

        System.out.println("cart1 and cart 2 are different? = " + !cart1.sameIdentityAs(cart2));

        Product inkPen1 = new Product("Hero Ink Pen");
        Product inkPen2 = new Product("Hero Ink Pen");

        System.out.println("inkPen1 can be replaced by inkPen2 = "+ inkPen1.sameValueAs(inkPen2) );

    }
}
