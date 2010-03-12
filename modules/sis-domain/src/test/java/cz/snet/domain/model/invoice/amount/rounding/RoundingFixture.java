package cz.snet.domain.model.invoice.amount.rounding;

import java.math.BigDecimal;

public class RoundingFixture {
    public final BigDecimal value;
    public final BigDecimal rounded;

    private RoundingFixture(BigDecimal value, BigDecimal rounded) {
        this.value = value;
        this.rounded = rounded;
    }

    public static RoundingFixture from(String value, String rounded) {
        return new RoundingFixture(new BigDecimal(value), new BigDecimal(rounded));
    }
}