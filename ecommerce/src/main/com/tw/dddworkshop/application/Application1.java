package com.tw.dddworkshop.application;

import misc.domain.Account;
import misc.domain.Address;
import misc.domain.Customer;

public class Application1 {

    public static void main(String[] args) {
        Address address = new Address("1 Daffodils", "Pune");
        Customer customer = new Customer(address);

        Account account = new Account(address);
        customer.addAccount(account);

        Address newAddress = new Address("1 Tulips", "Bangalore");
        customer.updateAddress(newAddress);

    }
}
