package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:51:16 AM
 */
public class IntRounding implements ValueObject<IntRounding> {
    private static final BigDecimal MAX_ROUNDING = new BigDecimal("0.99");

    private final Amount original;
    private final Amount rounded;
    private final Amount value;

    protected IntRounding(Amount original, Amount rounded) {
        this.original = original;
        this.rounded = rounded;
        this.value = rounded.subtract(original);
        if (isInvariantNotSatisfied())
            throw new IllegalArgumentException("IntRounding invariant { rounding <= 0.99} is not satisfied for " + toString());
    }

    private boolean isInvariantNotSatisfied() {
        BigDecimal absoluteRounding = value.value().abs();
        return MAX_ROUNDING.compareTo(absoluteRounding) < 0;
    }

    public Amount value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntRounding)) return false;
        IntRounding rounding = (IntRounding) o;
        if (!value.equals(rounding.value)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return "IntRounding{" +
                "value=" + value +
                '}';
    }
}
