package cz.snet.domain.model.invoice.amount.rounding;

import cz.snet.domain.model.invoice.amount.Amount;
import org.apache.log4j.Logger;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 10:30:32 AM
 */
@RunWith(Theories.class)
public class DefaultRoundingStrategyTest {
    private static final DefaultRoundingStrategy rounding = new DefaultRoundingStrategy();
    public static final Logger log = Logger.getLogger(DefaultRoundingStrategyTest.class);

    private static final String ZERO = "0.00";
    private static final String ONE = "1.00";
    @DataPoints
    public static final RoundingFixture[] fixtures = new RoundingFixture[]{
            // amountFrom() fixture starts with "0.00"
            RoundingFixture.from(ZERO, "0.004", ZERO),
            RoundingFixture.from(ZERO, "0.005", "0.01"),
            RoundingFixture.from(ZERO, "0.006", "0.01"),
            RoundingFixture.from(ZERO, "0.011", "0.01"),
            RoundingFixture.from(ZERO, "0.015", "0.02"),
            // rounding() fixture starts with != "0.00"
            RoundingFixture.from(ONE, "0.49", "0.00"),
            RoundingFixture.from(ONE, "0.50", "1.00"),
            RoundingFixture.from(ONE, "1.49", "1.00"),
            RoundingFixture.from(ONE, "1.50", "2.00")
    };

    @Theory
    public void testAmountFrom(RoundingFixture fixture) throws Exception {
        // pick only amountFrom() fixtures
        assumeTrue(fixture.param1.toString().equals(ZERO));
        log.debug("amountFrom() " + fixture.param2 + " => " + fixture.result);
        assertThat(rounding.amountFrom(fixture.param2).value(), is(fixture.result));
    }

    @Theory
    public void testIntRoundingFor(RoundingFixture fixture) throws Exception {
        // pick only rounding() fixtures
        assumeTrue(fixture.param1.toString().equals(ONE));
        log.debug("totalSumRoundingFrom() " + fixture.param2 + " => " + fixture.result);
        Amount amount = Amount.from(fixture.param2);
        Rounding rounding = DefaultRoundingStrategyTest.rounding.totalSumRoundingFrom(amount);
        log.debug(rounding);
        assertThat(rounding.value().add(fixture.param2), is(fixture.result));
    }

}
