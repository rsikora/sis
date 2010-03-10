package cz.snet.domain.model.invoice.tax;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;
import cz.snet.domain.shared.ValueObject;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 4:07:09 PM
 */
public class Tax implements ValueObject<Tax> {
    private static final BigDecimal MAX_ROUNDING = new BigDecimal("0.01");
    private final Amount net;
    private final int pct;
    private final Amount value;

    public static Tax from(final Amount net, final int pct, final RoundingStrategy rounding) {
        Amount taxValue = rounding.amountFrom(taxFrom(net, pct));
        return new Tax(net, pct, taxValue);
    }

    protected static BigDecimal taxFrom(Amount amount, int pct) {
        return amount.value().multiply(multiplierFrom(pct));
    }

    protected static BigDecimal multiplierFrom(int pct) {
        return BigDecimal.valueOf(pct, 2);
    }

    protected Tax(Amount net, int pct, Amount value) {
        this.net = net;
        this.pct = pct;
        this.value = value;
        if (invariantIsNotSatisfied())
            throw new IllegalArgumentException("Tax invariant { result = net * (pct/100) } is not satisfied by " + toString());
    }

    protected boolean invariantIsNotSatisfied() {
        BigDecimal exactTax = net.value().multiply(BigDecimal.valueOf(pct, 2));
        Amount tax = value;
        BigDecimal delta = tax.value().subtract(exactTax).abs();
        return MAX_ROUNDING.compareTo(delta) < 0;
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

    public Amount value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tax)) return false;
        Tax tax1 = (Tax) o;
        if (pct != tax1.pct) return false;
        if (!net.equals(tax1.net)) return false;
        if (!value.equals(tax1.value)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = net.hashCode();
        result = 31 * result + pct;
        result = 31 * result + value.hashCode();
        return result;
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
