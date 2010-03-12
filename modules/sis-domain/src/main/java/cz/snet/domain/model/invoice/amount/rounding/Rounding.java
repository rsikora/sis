package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:51:16 AM
 */
public class Rounding implements ValueObject<Rounding> {
    private static final BigDecimal MAX_ROUNDING = new BigDecimal("0.99");
    private final Amount value;

    protected Rounding(Amount value) {
        this.value = value;
        if (invariantIsNotSatisfied())
            throw new IllegalArgumentException("Rounding invariant { |rounding| <= 0.99 } is not satisfied for " + toString());
    }

    private boolean invariantIsNotSatisfied() {
        BigDecimal absoluteRounding = value.value().abs();
        return MAX_ROUNDING.compareTo(absoluteRounding) < 0;
    }

    public Amount value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rounding)) return false;
        Rounding that = (Rounding) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "Rounding{" +
                "value=" + value +
                '}';
    }
}
