package cz.snet.domain.model.account;

import cz.snet.domain.shared.Entity;

public class Subscription implements Entity<Subscription, SubscriptionId> {

  @Override
  public SubscriptionId id() {
    // TODO Auto-generated method stub
    return null;
  }

  public Charge[] charges() {
    return null;
  }

  public void add(Charge charge) {
  }
}
