package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.addressbook.AddressbookResponseType;
import cz.stormware.schema.response.ResponsePackItemType;
import cz.stormware.schema.response.ResponsePackType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
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
        // create unmarshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response:cz.stormware.schema.list:cz.stormware.schema.addressbook:cz.stormware.schema.documentresponse");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // configure StAX parser
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream customers = ClassLoader.getSystemResourceAsStream("xml/customers-response-20100313.xml");
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(customers);

        // move to the first item
        streamReader.nextTag();
        streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePack");
        streamReader.nextTag();

        // loop over the items
        while(streamReader.getEventType() == XMLStreamConstants.START_ELEMENT) {
            streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePackItem");
            JAXBElement<ResponsePackItemType> customerResponse = unmarshaller.unmarshal(streamReader, ResponsePackItemType.class);
            System.out.println(customerResponse.getValue().getAddressbookResponse().getProducedDetails().getCode());
            streamReader.nextTag();
        }
    }
}
