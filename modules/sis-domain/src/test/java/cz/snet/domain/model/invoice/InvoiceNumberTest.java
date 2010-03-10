package cz.snet.domain.model.invoice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 8, 2010
 * Time: 9:22:46 PM
 */
public class InvoiceNumberTest {
    @Test
    public void testNextNumber() throws Exception {
        InvoiceNumber invoiceNumber = InvoiceNumber.from("A001");
        assertThat(invoiceNumber.nextNumber(), is(InvoiceNumber.from("A002")));
    }

    @Test(expected = IllegalStateException.class)
    public void testNextNumberOverflow() throws Exception {
        InvoiceNumber invoiceNumber = InvoiceNumber.from("A999");
        invoiceNumber.nextNumber();
    }

    @Test
    public void testToString() throws Exception {
        assertThat(InvoiceNumber.from("A001").toString(), is("A001"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void failWhenIllegalFormat() throws Exception {
        InvoiceNumber.from(" A001");
    }

    @Test
    public void testEquals() throws Exception {
        InvoiceNumber invoiceNumber = InvoiceNumber.from("A001");
        assertThat(invoiceNumber.equals(InvoiceNumber.from("A001")), is(true));
    }

    @Test
    public void testNotEquals() throws Exception {
        InvoiceNumber invoiceNumber = InvoiceNumber.from("A001");
        assertThat(invoiceNumber.equals(InvoiceNumber.from("B001")), is(false));
    }

    @Test
    public void testHashCode() throws Exception {
        assertThat(InvoiceNumber.from("A001").hashCode(), is(InvoiceNumber.from("A001").hashCode()));
    }
}
