package misc.domain;

import java.util.List;

public class Customer {

    private Address address;
    private List<Account> accounts;

    public Customer(Address address) {
        this.address = address;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach( account -> {
            account.updateAddress(address);
        });

    }
}
