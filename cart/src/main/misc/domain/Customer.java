package misc.domain;

import com.tw.dddworkshop.domain.events.DomainEvent;
import misc.domain.event.CustomerAddressUpdatedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private Address address;
    private List<Account> accounts = new ArrayList<>();

    private List<DomainEvent> events = new ArrayList<>();

    public Customer(Address address) {
        this.customerId = UUID.randomUUID();
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void updateAddress(Address address) {
        this.address = address;

        events.add(new CustomerAddressUpdatedEvent(this.customerId, address));

        accounts.forEach( account -> {
            account.updateAddress(address);
        });

    }
}
