package com.tw.dddworkshop.domain.events;

import com.tw.dddworkshop.domain.Item;

import java.util.List;

public class CartCheckedOutEvent implements  DomainEvent {
    private List<CartItem> items;

    public List<CartItem> getItems() {
        return items;
    }

    public CartCheckedOutEvent(List<CartItem> items) {
        this.items = items;
    }
}
