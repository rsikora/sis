package cz.snet.application;

import java.util.Date;
import java.util.Iterator;

import cz.snet.application.AccountantService;
import cz.snet.domain.model.account.Account;
import cz.snet.domain.model.account.AccountRepository;
import cz.snet.domain.model.billing.Billing;
import cz.snet.domain.model.billing.BillingName;
import cz.snet.domain.model.billing.BillingRepository;
import cz.snet.domain.model.billing.Invoicing;
import cz.snet.domain.model.billing.InvoicingFactory;
import cz.snet.domain.model.invoice.Invoice;
import cz.snet.domain.model.invoice.InvoiceFactory;
import cz.snet.domain.model.invoice.InvoiceNumber;
import cz.snet.domain.model.invoice.InvoiceNumberFactory;
import cz.snet.domain.model.invoice.InvoiceRepository;
import cz.snet.domain.service.DeliveryService;

public class AccountantServiceTest {
  private BillingRepository billingRepository;
  private AccountantService invoicingService;
  private AccountRepository accountRepository;
  private InvoiceFactory invoiceFactory;
  private InvoiceNumberFactory invoiceNumberFactory;
  private InvoiceRepository invoiceRepository;
  private DeliveryService deliveryService;
  private AccountantService accountant;

  public void testBilling() throws Exception {
    Billing billing = billingRepository.find(new BillingName());
    InvoiceNumberFactory numberFactory = new InvoiceNumberFactory(InvoiceNumber.from("000001"));
    Invoicing invoicing = InvoicingFactory.newInstance(billing, numberFactory);
    invoicingService.invoice(invoicing);

    Iterator<Account> accountIterator = accountRepository.findByBilling(billing);
    while (accountIterator.hasNext()) {
      Account account = accountIterator.next();
      Invoice invoice = invoiceFactory.create(invoiceNumberFactory.nextNumber(), account);
      invoiceRepository.store(invoice);
      deliveryService.deliver(invoice);
    }
  }

  public void testAccountant() throws Exception {
    Date due = new Date();
    for (Billing billing : billingRepository.findAll()) {
      if (billing.policy().isBillable(due)) {
        InvoiceNumber currentInvoiceNumber = accountant.currentInvoiceNumber();
        InvoiceNumberFactory numberFactory = new InvoiceNumberFactory(currentInvoiceNumber);
        Invoicing invoicing = InvoicingFactory.newInstance(billing, numberFactory);
        accountant.invoice(invoicing);
        billing.add(invoicing);
        billingRepository.store(billing);
      }
    }
  }
}
