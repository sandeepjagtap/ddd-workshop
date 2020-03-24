package com.tw.dddworkshop.application.misc;

import misc.domain.Account;
import misc.domain.Address;
import misc.domain.Customer;
import misc.domain.event.CustomerAddressUpdatedEvent;

import java.util.UUID;

public class Application1 {

    public static void main(String[] args) {
        Address address = new Address("1 Daffodils", "Pune");
        Customer customer = new Customer(address);

        Account account = new Account(address);
        customer.addAccount(account);

        Address newAddress = new Address("1 Tulips", "Bangalore");
        customer.updateAddress(newAddress);

        //Read event from message broker like kafka
        CustomerAddressUpdatedEvent event  =
                new CustomerAddressUpdatedEvent(UUID.randomUUID(),new Address("1", "2"));

        //Get Account for given customerId
        customer.updateAddress(event.getAddress());

    }
}
