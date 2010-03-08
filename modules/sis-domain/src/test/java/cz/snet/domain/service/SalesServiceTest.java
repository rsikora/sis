package cz.snet.domain.service;

import cz.snet.domain.model.account.Account;
import cz.snet.domain.model.account.AccountRepository;
import cz.snet.domain.model.account.Charge;

public class SalesServiceTest implements SalesService {

  private AccountRepository accountRepository;

  public void testDesign() throws Exception {
    Account account = new Account();
    account.subscriptions()[0].add(new Charge());
    accountRepository.store(account);
  }
}
