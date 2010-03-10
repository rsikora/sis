package cz.snet.domain.service;

import cz.snet.domain.model.invoice.Invoice;

public interface DeliveryService {
    void deliver(Invoice invoice);
}
