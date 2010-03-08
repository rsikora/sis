package cz.snet.domain.model.billing;

import java.util.Date;

public interface BillingPolicy {
  boolean isBillable(Date due);
}
