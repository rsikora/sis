package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 10:32:23 AM
 */
public class DefaultRoundingStrategy implements RoundingStrategy {
    private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;

    @Override
    public Amount amountFrom(BigDecimal value) {
        return Amount.from(value.setScale(2, ROUNDING_MODE));
    }

    @Override
    public Rounding totalSumRoundingFrom(Amount amount) {
        BigDecimal rounded = amount.value().setScale(0, ROUNDING_MODE);
        BigDecimal rounding = rounded.subtract(amount.value());
        return new Rounding(rounding);
    }
}
