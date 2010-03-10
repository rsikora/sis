package cz.snet.domain.model.account;

import cz.snet.domain.shared.Entity;

public class Account implements Entity<Account, AccountNumber> {
    @Override
    public AccountNumber id() {
        // TODO Auto-generated method stub
        return null;
    }

    public Subscription[] subscriptions() {
        return null;
    }
}
