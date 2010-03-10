package cz.snet.domain.model.invoice.amount.rounding;

import java.math.BigDecimal;

public class RoundingFixture {
    public final BigDecimal param1;
    public final BigDecimal param2;
    public final BigDecimal result;

    private RoundingFixture(BigDecimal param1, BigDecimal param2, BigDecimal result) {
        this.param1 = param1;
        this.param2 = param2;
        this.result = result;
    }

    public static RoundingFixture from(String param1, String param2, String result) {
        return new RoundingFixture(new BigDecimal(param1), new BigDecimal(param2), new BigDecimal(result));
    }
}