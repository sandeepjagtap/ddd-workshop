package com.tw.dddworkshop.domain;

import com.tw.dddworkshop.domain.events.CartCheckedOutEvent;
import com.tw.dddworkshop.domain.events.DomainEvent;
import com.tw.dddworkshop.domain.events.ItemAddedToCartEvent;
import com.tw.dddworkshop.domain.events.ItemRemovedFromCartEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Cart implements Entity {


    private final UUID id;

    private List<DomainEvent>events = new ArrayList<>();

    private List<Item> items = new ArrayList<>();

    private Status status;

    public Cart() {
      this.id = UUID.randomUUID();
    }

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

    public void checkOut() {
        this.status = Status.CHECKEDOUT;

        events.add(new CartCheckedOutEvent(items));
        System.out.println("Cart with id " + id + " checkout out");
    }

    public List<Item> allItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean sameIdentityAs(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id);
    }
}

enum Status {
    CHECKEDOUT,AVAILABLE
}
