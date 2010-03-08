package cz.snet.domain.model.billing;

import cz.snet.domain.shared.Entity;

public class Billing implements Entity<Billing, BillingName> {

  @Override
  public BillingName id() {
    // TODO Auto-generated method stub
    return null;
  }

  public Billing next() {
    return null;
  }

  public Invoicing[] invoicings() {
    return null;
  }

  public BillingPolicy policy() {
    return null;
  }

  public void add(Invoicing invoicing) {
    // TODO Auto-generated method stub

  }

}
