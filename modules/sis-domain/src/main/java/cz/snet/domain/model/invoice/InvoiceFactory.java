package cz.snet.domain.model.invoice;

import cz.snet.domain.model.account.Account;

public interface InvoiceFactory {

  Invoice create(InvoiceNumber nextNumber, Account account);

}
