package cz.snet.domain.model.invoice.amount;

import cz.snet.domain.model.invoice.amount.rounding.RoundingStrategy;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * User: der3k
 * Date: Mar 9, 2010
 * Time: 1:37:21 PM
 */
public class AmountTest {
    public static final Amount AMOUNT = Amount.from("1.00");

    @Test
    public void testValue() throws Exception {
        assertThat(AMOUNT.value(), is(new BigDecimal("1.00")));
    }

    @Test
    public void testScaleRise() throws Exception {
        Amount amount = Amount.from("1.0");
        assertThat(amount.value().scale(), is(2));
        assertThat(amount.value(), is(new BigDecimal("1.00")));
    }

    @Test
    public void testScaleShrink() throws Exception {
        Amount amount = Amount.from("1.000");
        assertThat(amount.value().scale(), is(2));
        assertThat(amount.value(), is(new BigDecimal("1.00")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenRoundingNecessary() throws Exception {
        Amount.from("1.001");
    }

    @Test
    public void testEqualsAndHashcode() throws Exception {
        Amount otherAmount = Amount.from("1.00");
        assertThat(AMOUNT.equals(otherAmount), is(true));
        assertThat(AMOUNT.hashCode(), is(otherAmount.hashCode()));
    }

    @Test
    public void testNotEquals() throws Exception {
        Amount otherAmount = Amount.from("2.00");
        assertThat(AMOUNT.equals(otherAmount), is(false));
    }

    @Test
    public void testAdd() throws Exception {
        assertThat(AMOUNT.add(AMOUNT).value(), is(new BigDecimal("2.00")));
    }

    @Test
    public void testSubtract() throws Exception {
        assertThat(AMOUNT.subtract(AMOUNT).value(), is(new BigDecimal("0.00")));

    }

    @Test
    public void testToString() throws Exception {
        assertThat(AMOUNT.toString(), is("1.00"));
    }

    @Test
    public void testFromBigDecimal() throws Exception {
        assertThat(Amount.from(new BigDecimal("1.00")), is(AMOUNT));
    }

    @Test
    public void testFromString() throws Exception {
        assertThat(Amount.from("1.00"), is(AMOUNT));
    }

    @Test
    public void testIsRoundingNeeded() throws Exception {
        assertThat(Amount.isRoundingNeededFor(new BigDecimal("1.001")), is(true));
    }

    @Test
    public void testIsRoundingNotNeeded() throws Exception {
        assertThat(Amount.isRoundingNeededFor(new BigDecimal("1.00")), is(false));
    }

    @Test
    public void testFromWithRounding() throws Exception {
        RoundingStrategy rounding = mock(RoundingStrategy.class);
        BigDecimal value = new BigDecimal("1.001");
        BigDecimal rounded = new BigDecimal("1.00");
        when(rounding.round(value)).thenReturn(rounded);

        assertThat(Amount.from(value, rounding), is(AMOUNT));
    }

}

