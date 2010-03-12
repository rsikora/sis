package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import org.junit.Test;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:38:22 AM
 */
public class RoundingTest {
    @Test(expected = IllegalArgumentException.class)
    public void failWhenInvariantNotSatisfiedLeftBound() throws Exception {
        new Rounding(Amount.from("-1.00"));
    }

    @Test
    public void testInvariantIsSatisfiedLeftBound() throws Exception {
        new Rounding(Amount.from("-0.99"));
    }

    @Test
    public void testInvariantIsSatisfiedRightBound() throws Exception {
        new Rounding(Amount.from("0.99"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenInvariantNotSatisfiedRightBound() throws Exception {
        new Rounding(Amount.from("1.00"));
    }
}
