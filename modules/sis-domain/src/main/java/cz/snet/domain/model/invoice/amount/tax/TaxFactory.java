package cz.snet.domain.model.invoice.amount.tax;

import cz.snet.domain.model.invoice.amount.Amount;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 3:59:12 PM
 */
public interface TaxFactory {
    Tax taxFrom(Amount net, int pct);
}
