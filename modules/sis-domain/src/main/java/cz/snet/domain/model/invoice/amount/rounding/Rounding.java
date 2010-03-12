package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:51:16 AM
 */
public class Rounding extends Amount {
    private static final BigDecimal MAX_ROUNDING = new BigDecimal("0.99");

    protected Rounding(BigDecimal value) {
        super(value);
        if (invariantIsNotSatisfied())
            throw new IllegalArgumentException("Rounding invariant { |rounding| <= 0.99 } is not satisfied for " + toString());
    }

    private boolean invariantIsNotSatisfied() {
        BigDecimal absoluteRounding = value.abs();
        return MAX_ROUNDING.compareTo(absoluteRounding) < 0;
    }

    @Override
    public String toString() {
        return "Rounding{" +
                "value=" + value +
                '}';
    }
}
