package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:31:40 AM
 */
public interface RoundingStrategy {
    Amount amountFrom(BigDecimal value);
    Rounding totalSumRoundingFrom(Amount amount);
}
