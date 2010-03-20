package cz.snet.infrastructure;

import org.testng.annotations.Test;
import org.w3c.dom.Document;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

/**
 * User: der3k
 * Date: Mar 20, 2010
 * Time: 2:38:00 PM
 */
public class TestNGTest {
    @Test
    public void testTestNG() throws Exception {
        Document document = mock(Document.class);
        assertThat(document.getTextContent(), is(nullValue()));
    }
}
