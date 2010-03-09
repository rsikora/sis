package cz.snet.domain.model.invoice;

import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;

public class Amount implements ValueObject<Amount> {

    private final static int ROUNDING = BigDecimal.ROUND_HALF_UP;

    private final BigDecimal net;
    private final BigDecimal taxPct;
    private final BigDecimal tax;
    private final BigDecimal brt;

    private Amount(BigDecimal net, BigDecimal taxPct) {
        this.net = normalizeScale(net);
        this.taxPct = taxPct;
        this.tax = normalizeScale(net.multiply(taxPct).movePointLeft(2));
        brt = net.add(tax);
    }

    public static Amount from(BigDecimal net) {
        return new Amount(net, BigDecimal.ZERO);
    }

    public static Amount from(BigDecimal net, BigDecimal taxPct) {
        return new Amount(net, taxPct);
    }

    private BigDecimal normalizeScale(BigDecimal value) {
        return value.setScale(2, ROUNDING);
    }

    public BigDecimal net() {
        return net;
    }

    public BigDecimal tax() {
        return tax;
    }

    public BigDecimal taxPct() {
        return taxPct;
    }

    public BigDecimal brt() {
        return brt;
    }

}
