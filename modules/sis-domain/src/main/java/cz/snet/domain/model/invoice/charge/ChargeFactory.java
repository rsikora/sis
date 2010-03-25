package cz.snet.domain.model.invoice.charge;

import cz.snet.domain.shared.ValueObject;

public interface ChargeFactory {
    Charge newCharge();
}
