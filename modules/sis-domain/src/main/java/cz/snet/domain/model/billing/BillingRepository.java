package cz.snet.domain.model.billing;

import cz.snet.domain.shared.Repository;

public interface BillingRepository extends Repository<Billing, BillingName> {

  Billing[] findAll();

}
