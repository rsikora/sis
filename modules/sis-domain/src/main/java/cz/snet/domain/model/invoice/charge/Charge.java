package cz.snet.domain.model.invoice.charge;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.model.invoice.amount.rounding.DefaultAmountRoundingStrategy;
import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 25, 2010
 * Time: 9:40:11 PM
 */
public class Charge {
    private final Amount net;
    private final Amount tax;
    private final Amount brt;
    private final Build build;

    public Charge(Amount net, Amount tax, Build build) {
        this.net = net;
        this.tax = tax;
        this.brt = net.add(tax);
        this.build = build;
    }

    public Amount net() {
        return net;
    }

    public Amount tax() {
        return tax;
    }

    public Amount brt() {
        return brt;
    }

    public BigDecimal pcs() {
        return build.pcs;
    }

    public Amount price() {
        return build.price;
    }

    public int taxRate() {
        return build.taxRate;
    }

    public String text() {
        return build.text;
    }

    public Build build() {
        return Build
                .from(build.text, build.pcs, build.price)
                .withTaxRate(build.taxRate)
                .withRounding(build.rounding);
    }

    @Override
    public String toString() {
        return "Charge{" +
                "text='" + build.text + "'" +
                ", pcs=" + build.pcs +
                ", price=" + build.price +
                ", net=" + net +
                ", taxRate=" + build.taxRate + "%" +
                ", tax=" + tax +
                ", brt=" + brt +
                '}';
    }

    public static class Build {
        public static final RoundingStrategy DEFAULT_ROUNDING = new DefaultAmountRoundingStrategy();
        private String text;
        private BigDecimal pcs;
        private Amount price;
        private int taxRate = 0;
        private RoundingStrategy rounding = DEFAULT_ROUNDING;

        public Build(String text, BigDecimal pcs, Amount price) {
            this.text = text;
            this.pcs = pcs;
            this.price = price;
        }

        public static Build from(String text, BigDecimal pcs, Amount price) {
            return new Build(text, pcs, price);
        }

        public Charge asCharge() {
            Amount net = Amount.from(pcs.multiply(price.value()), rounding);
            BigDecimal rate = BigDecimal.valueOf(taxRate).movePointLeft(2);
            Amount tax = Amount.from(net.value().multiply(rate));
            return new Charge(net, tax, this);
        }

        public Build withText(String text) {
            this.text = text;
            return this;
        }

        public Build withPcs(BigDecimal pcs) {
            this.pcs = pcs;
            return this;
        }

        public Build withPrice(Amount price) {
            this.price = price;
            return this;
        }

        public Build withTaxRate(int taxRate) {
            this.taxRate = taxRate;
            return this;
        }

        public Build withRounding(RoundingStrategy rounding) {
            this.rounding = rounding;
            return this;
        }
    }
}

