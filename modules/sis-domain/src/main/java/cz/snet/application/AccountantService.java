package cz.snet.application;

import java.util.Date;

import cz.snet.domain.model.billing.Billing;
import cz.snet.domain.model.billing.Invoicing;
import cz.snet.domain.model.invoice.InvoiceNumber;

public interface AccountantService {

  void invoice(Invoicing invoicing);
  Billing[] getBillableDue(Date due);
  InvoiceNumber currentInvoiceNumber();
}
