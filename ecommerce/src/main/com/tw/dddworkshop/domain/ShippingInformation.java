package com.tw.dddworkshop.domain;

public class ShippingInformation {
    private Address address;

    public ShippingInformation(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
