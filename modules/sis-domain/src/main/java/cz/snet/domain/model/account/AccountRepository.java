package cz.snet.domain.model.account;

import java.util.Iterator;

import cz.snet.domain.model.billing.Billing;
import cz.snet.domain.shared.Repository;

public interface AccountRepository extends Repository<Account, AccountNumber> {

  Iterator<Account> findByBilling(Billing billing);

}
