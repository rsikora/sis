package cz.snet.domain.service;

import cz.snet.domain.model.account.Account;
import cz.snet.domain.model.account.AccountRepository;
import cz.snet.domain.model.invoice.charge.Charge;
import cz.snet.domain.model.invoice.charge.ChargeFactory;

public class SalesServiceTest implements SalesService {
    private AccountRepository accountRepository;

    public void testDesign() throws Exception {
        Account account = new Account();
        account.subscriptions()[0].add(new ChargeFactory() {
            @Override
            public Charge newCharge() {
                return null;  //To change body of implemented methods use File | Settings | File Templates.
            }
        });
        accountRepository.store(account);
    }
}
