package cz.snet.domain.model.account;

import cz.snet.domain.model.billing.Billing;
import cz.snet.domain.shared.Repository;

import java.util.Iterator;

public interface AccountRepository extends Repository<Account, AccountNumber> {
    Iterator<Account> findByBilling(Billing billing);
}
