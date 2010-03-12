package cz.snet.domain.model.invoice.amount.rounding;

import org.apache.log4j.Logger;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.math.BigDecimal;

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
public class TotalSumRoundingStrategyTest {
    public static final Logger log = Logger.getLogger(TotalSumRoundingStrategyTest.class);

    public static final RoundingStrategy ROUNDING = new TotalSumRoundingStrategy();

    @DataPoints
    public static final RoundingFixture[] fixtures = new RoundingFixture[]{
            RoundingFixture.from("0.49", "0.00"),
            RoundingFixture.from("0.50", "1.00"),
            RoundingFixture.from("1.49", "1.00"),
            RoundingFixture.from("1.50", "2.00")
    };

    @Theory
    public void testRound(RoundingFixture fixture) throws Exception {
        log.debug("Total sum round() " + fixture.value + " => " + fixture.rounded);
        BigDecimal rounding = ROUNDING.round(fixture.value);
        assertThat(fixture.value.add(rounding), is(fixture.rounded));
    }
}