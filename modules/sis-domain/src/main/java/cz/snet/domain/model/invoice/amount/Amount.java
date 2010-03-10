package cz.snet.domain.model.invoice.amount;

import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;
import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Amount implements ValueObject<Amount> {
    private final BigDecimal value;

    private Amount(BigDecimal value) {
        if (isRoundingNeededFor(value))
            throw new IllegalArgumentException("IntRounding is needed for " + value);
        this.value = value.setScale(2, RoundingMode.UNNECESSARY);
    }

    public static Amount from(BigDecimal value) {
        return new Amount(value);
    }

    public static Amount from(String value) {
        return new Amount(new BigDecimal(value));
    }

    public static Amount from(BigDecimal value, RoundingStrategy rounding) {
        return rounding.amountFrom(value);
    }

    public static boolean isRoundingNeededFor(BigDecimal value) {
        try {
            value.setScale(2, RoundingMode.UNNECESSARY);
        } catch (ArithmeticException e) {
            return true;
        }
        return false;
    }
    
    public BigDecimal value() {
        return value;
    }

    public Amount add(Amount amount) {
        return new Amount(value.add(amount.value()));
    }

    public Amount subtract(Amount amount) {
        return new Amount(value.subtract(amount.value()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amount)) return false;
        Amount amount = (Amount) o;
        if (!value.equals(amount.value)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
