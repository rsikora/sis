package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.addressbook.AddressbookResponseType;
import cz.stormware.schema.response.ResponsePackType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.InputStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 13, 2010
 * Time: 10:59:40 PM
 */
public class CustomerTest {
    @Test
    public void testUnmarshalMapping() throws Exception {
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response:cz.stormware.schema.list");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InputStream customers = ClassLoader.getSystemResourceAsStream("xml/customers-response-20100313.xml");
        JAXBElement responsePackElement = (JAXBElement) unmarshaller.unmarshal(customers);
        ResponsePackType responsePack = (ResponsePackType) responsePackElement.getValue();
        System.out.println("customer = " + responsePack.getId());
        JAXBElement<?> element = responsePack.getResponsePackItem().get(0).getContent().get(0);
        AddressbookResponseType adreAddressbookResponseType = (AddressbookResponseType) element.getValue();
        System.out.println(adreAddressbookResponseType.getProducedDetails().getCode());
    }
}
