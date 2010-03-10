package cz.snet.domain.model.invoice.amount;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 9:40:00 PM
 */
public interface AmountFactory {
    Amount amountFrom(BigDecimal amountValue);

    Amount amountFrom(BigDecimal amountValue, BigDecimal multiplier);
}
