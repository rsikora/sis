package cz.snet.domain.model.invoice.tax;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.model.invoice.amount.rounding.DefaultRoundingStrategy;
import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 7:12:13 PM
 */
public class TaxTest {
    private static final Amount NET_AMOUNT = Amount.from("100.00");
    private static final int PCT = 1;
    private static final Amount TAX_AMOUNT = Amount.from("1.00");
    private static final Tax TAX = new Tax(NET_AMOUNT, PCT, TAX_AMOUNT);

    @Test
    public void testConstructor() throws Exception {
        assertThat(TAX.net(), is(NET_AMOUNT));
        assertThat(TAX.pct(), is(PCT));
        assertThat(TAX.value(), is(TAX_AMOUNT));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvariantIsNotSatisfiedFromLeftBound() throws Exception {
        new Tax(NET_AMOUNT, PCT, Amount.from("0.98"));
    }

    @Test
    public void testInvariantIsSatisfiedFromLeftBound() throws Exception {
        Tax tax = new Tax(NET_AMOUNT, PCT, Amount.from("0.99"));
        assertThat(tax, is(not(nullValue())));
    }

    @Test
    public void testInvariantIsSatisfiedFromRightBound() throws Exception {
        Tax tax = new Tax(NET_AMOUNT, PCT, Amount.from("1.01"));
        assertThat(tax, is(not(nullValue())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvariantIsNotSatisfiedFromRightBound() throws Exception {
        new Tax(NET_AMOUNT, PCT, Amount.from("1.02"));
    }

    @Test
    public void testAdd() throws Exception {
        Tax otherTax = TAX.add(TAX);
        assertThat(otherTax.net(), is(Amount.from("200.00")));
        assertThat(otherTax.value(), is(Amount.from("2.00")));
        assertThat(otherTax.pct(), is(PCT));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenAddingWithDifferentPct() throws Exception {
        Tax otherTax = new Tax(NET_AMOUNT, 2, Amount.from("2.00"));
        TAX.add(otherTax);
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Tax otherTax = new Tax(NET_AMOUNT, PCT, TAX_AMOUNT);
        assertThat(TAX.equals(otherTax), is(true));
        assertThat(TAX.hashCode(), is(otherTax.hashCode()));
    }

    @Test
    public void testNotEquals() throws Exception {
        Tax otherTax = new Tax(NET_AMOUNT, 2, Amount.from("2.00"));
        assertThat(TAX.equals(otherTax), is(false));
    }

    @Test
    public void testToString() throws Exception {
        assertThat(TAX.toString(), is("Tax{net=100.00, pct=1, value=1.00}"));
    }

    @Test
    public void testMultiplierFrom() throws Exception {
        assertThat(Tax.multiplierFrom(1), is(new BigDecimal("0.01")));
    }

    @Test
    public void testTaxFrom() throws Exception {
        assertThat(Tax.taxFrom(Amount.from("0.01"), 1), is(new BigDecimal("0.0001")));
    }

    @Test
    public void testFrom() throws Exception {
        RoundingStrategy rounding = mock(RoundingStrategy.class);
        any(BigDecimal.class);
        when(rounding.amountFrom(new BigDecimal("1.0000"))).thenReturn(TAX_AMOUNT);

        Tax tax = Tax.from(NET_AMOUNT, PCT, rounding);
        assertThat(tax.value(), is(TAX_AMOUNT));
    }
}