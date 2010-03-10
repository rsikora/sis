package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:38:22 AM
 */
public class IntRoundingTest {
    public static final Amount ORIGINAL = Amount.from("0.93");
    public static final Amount ROUNDED = Amount.from("1.00");
    public static final Amount ROUNDING_VALUE = Amount.from("0.07");

    public static final IntRounding ROUNDING = new IntRounding(ORIGINAL, ROUNDED);

    @Test
    public void testConstructor() throws Exception {
        assertThat(ROUNDING.value(), is(ROUNDING_VALUE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenInvariantNotSatisfiedLeftBound() throws Exception {
        new IntRounding(ORIGINAL, ORIGINAL.add(Amount.from("-1.00")));
    }

    @Test
    public void testInvariantIsSatisfiedLeftBound() throws Exception {
        new IntRounding(ORIGINAL, ORIGINAL.add(Amount.from("-0.99")));
    }

    @Test
    public void testInvariantIsSatisfiedRightBound() throws Exception {
        new IntRounding(ORIGINAL, ORIGINAL.add(Amount.from("0.99")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenInvariantNotSatisfiedRightBound() throws Exception {
        new IntRounding(ORIGINAL, ORIGINAL.add(Amount.from("1.00")));
    }

    @Test
    public void testNegativeRounding() throws Exception {
        IntRounding rounding = new IntRounding(Amount.from("1.07"), ROUNDED);
        assertThat(rounding.value(), is(Amount.from("-0.07")));
    }
}
