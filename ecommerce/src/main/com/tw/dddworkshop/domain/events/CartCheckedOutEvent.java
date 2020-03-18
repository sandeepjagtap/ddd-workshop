package com.tw.dddworkshop.domain.events;

import com.tw.dddworkshop.domain.Item;

import java.util.List;

public class CartCheckedOutEvent implements  DomainEvent {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public CartCheckedOutEvent(List<Item> items) {
        this.items = items;
    }
}
