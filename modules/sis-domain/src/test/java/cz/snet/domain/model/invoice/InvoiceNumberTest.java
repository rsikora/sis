package cz.snet.domain.model.invoice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 8, 2010
 * Time: 9:22:46 PM
 */
public class InvoiceNumberTest {
    private InvoiceNumber invoiceNumber;
    private static final String INVOICE_NUMBER = "A001";

    @Before
    public void setUp() throws Exception {
        invoiceNumber = new InvoiceNumber(INVOICE_NUMBER);
    }

    @After
    public void tearDown() throws Exception {
        invoiceNumber = null;
    }

    @Test
    public void testNextNumber() throws Exception {
        assertThat(invoiceNumber.nextNumber(), is(new InvoiceNumber("A002")));
    }
}
