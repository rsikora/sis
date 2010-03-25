package cz.snet.domain.model.invoice;

import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;

/**
 * User: der3k
 * Date: Mar 25, 2010
 * Time: 9:29:18 PM
 */
public interface InvoicingPolicy {
    RoundingStrategy amountRounding();

    RoundingStrategy totalSumRounding();
}
