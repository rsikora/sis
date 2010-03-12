package cz.snet.domain.model.invoice.amount.tax;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 4:07:09 PM
 */
public class Tax extends Amount {
    private static final BigDecimal MAX_ROUNDING = new BigDecimal("0.01");
    private final Amount net;
    private final int pct;

    protected Tax(Amount net, int pct, BigDecimal value) {
        super(value);
        this.net = net;
        this.pct = pct;
        if (invariantIsNotSatisfied())
            throw new IllegalArgumentException("Tax invariant { tax = net * (pct/100) } is not satisfied by " + toString());
    }

    private boolean invariantIsNotSatisfied() {
        BigDecimal exactTax = net.value().multiply(BigDecimal.valueOf(pct, 2));
        BigDecimal delta = value.subtract(exactTax).abs();
        return MAX_ROUNDING.compareTo(delta) < 0;
    }

    public static Tax from(final Amount net, final int pct, final RoundingStrategy rounding) {
        BigDecimal tax = rounding.round(taxFrom(net, pct));
        return new Tax(net, pct, tax);
    }

    protected static BigDecimal taxFrom(Amount amount, int pct) {
        return amount.value().multiply(multiplierFrom(pct));
    }

    protected static BigDecimal multiplierFrom(int pct) {
        return BigDecimal.valueOf(pct, 2);
    }

    public Tax add(Tax other) {
        if (pct != other.pct())
            throw new IllegalArgumentException("Can not add tax with different percentage " + other.toString());
        return new Tax(net.add(other.net()), pct, value.add(other.value()));
    }

    public Amount net() {
        return net;
    }

    public int pct() {
        return pct;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "net=" + net +
                ", pct=" + pct +
                ", value=" + value +
                '}';
    }

}
