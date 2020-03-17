package com.tw.dddworkshop.domain;

import com.tw.dddworkshop.domain.events.DomainEvent;
import com.tw.dddworkshop.domain.events.ItemAddedToCartEvent;
import com.tw.dddworkshop.domain.events.ItemRemovedFromCartEvent;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<DomainEvent>events = new ArrayList<>();

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);

        ItemAddedToCartEvent itemAddedEvent = new ItemAddedToCartEvent(item.getProduct(), item.getQuantity());
        events.add(itemAddedEvent);

        System.out.println("item added to chart = " + item);
    }

    public void removeItem(Item item) {
        items.remove(item);

        ItemRemovedFromCartEvent itemRemovedFromCartEvent =
                new ItemRemovedFromCartEvent(item.getProduct(), item.getQuantity());
        events.add(itemRemovedFromCartEvent);

        System.out.println("Cart now has "+ items);
    }
}
