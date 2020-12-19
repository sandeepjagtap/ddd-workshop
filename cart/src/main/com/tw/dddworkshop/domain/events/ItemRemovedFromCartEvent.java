package com.tw.dddworkshop.domain.events;

public class ItemRemovedFromCartEvent implements DomainEvent {
    private String name;

    public ItemRemovedFromCartEvent(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
