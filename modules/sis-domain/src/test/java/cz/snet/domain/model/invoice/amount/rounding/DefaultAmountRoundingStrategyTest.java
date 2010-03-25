package cz.snet.domain.model.invoice.amount.rounding;

import org.apache.log4j.Logger;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: sikorric
 * Date: Mar 12, 2010
 * Time: 4:33:54 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Theories.class)
public class DefaultAmountRoundingStrategyTest {
    public static final Logger log = Logger.getLogger(DefaultAmountRoundingStrategyTest.class);

    public static final RoundingStrategy ROUNDING = new DefaultAmountRoundingStrategy();

    @DataPoints
    public static final RoundingFixture[] fixtures = new RoundingFixture[]{
            // amountFrom() fixture starts with "0.00"
            RoundingFixture.from("0.004", "0.00"),
            RoundingFixture.from("0.005", "0.01"),
            RoundingFixture.from("0.006", "0.01"),
            RoundingFixture.from("0.011", "0.01"),
            RoundingFixture.from("0.015", "0.02"),
    };

    @Theory
    public void testRound(RoundingFixture fixture) throws Exception {
        log.debug("Amount round() " + fixture.value + " => " + fixture.rounded);
        assertThat(ROUNDING.round(fixture.value), is(fixture.rounded));
    }
}
