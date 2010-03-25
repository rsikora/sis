package cz.snet.domain.model.invoice.charge;

import cz.snet.domain.model.invoice.amount.Amount;
import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * User: der3k
 * Date: Mar 25, 2010
 * Time: 9:33:12 PM
 */
public class ChargeTest {
    public static final String TEXT = "TEXT";
    private static final String TEXT2 = "TEXT2";

    @Test
    public void testNet() throws Exception {
        Charge charge = Charge.Build
                .from(TEXT, BigDecimal.TEN, Amount.from("10.00"))
                .asCharge();
        assertThat(charge.net(), is(Amount.from("100.00")));
    }

    @Test
    public void testTax() throws Exception {
        Charge charge = Charge.Build
                .from(TEXT, BigDecimal.ONE, Amount.from("10.00"))
                .withTaxRate(25)
                .asCharge();
        assertThat(charge.tax(), is(Amount.from("2.50")));
    }

    @Test
    public void testBrt() throws Exception {
        Charge charge = Charge.Build
                .from(TEXT, BigDecimal.ONE, Amount.from("10.00"))
                .withTaxRate(25)
                .asCharge();
        assertThat(charge.brt(), is(Amount.from("12.50")));
    }

    @Test
    public void testToString() throws Exception {
        Charge charge = Charge.Build
                .from(TEXT, BigDecimal.TEN, Amount.from("10.00"))
                .asCharge();
        assertThat(charge.toString(), is("Charge{text='TEXT', pcs=10, price=10.00, net=100.00, taxRate=0%, tax=0.00, brt=100.00}"));
    }

    @Test
    public void testOtherAccessors() throws Exception {
        Charge charge = Charge.Build
                .from(TEXT, BigDecimal.TEN, Amount.from("10.00"))
                .asCharge();

        Charge otherCharge = charge.build()
                .withText(TEXT2)
                .withPcs(BigDecimal.valueOf(20))
                .withPrice(Amount.from("0.50"))
                .withTaxRate(25)
                .asCharge();
        assertThat(otherCharge.brt(), is(Amount.from("12.50")));
        assertThat(otherCharge.text(), is(TEXT2));

        assertThat(charge, is(not(sameInstance(otherCharge))));
        assertThat(charge.text(), is(TEXT));
        assertThat(charge.pcs(), is(BigDecimal.TEN));
        assertThat(charge.price(), is(Amount.from("10.00")));
        assertThat(charge.taxRate(), is(0));
    }
}
