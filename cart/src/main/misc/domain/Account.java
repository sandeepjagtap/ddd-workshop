package misc.domain;

import java.util.UUID;

public class Account {

    private UUID accountId;
    private Address address;

    public Account(Address address) {
        this.accountId =  UUID.randomUUID();
        this.address = address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }
}
