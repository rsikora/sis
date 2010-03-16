package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.response.ResponsePackItemType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

/**
 * User: der3k
 * Date: Mar 13, 2010
 * Time: 10:59:40 PM
 */
public class InvoiceTest {

    @Test
    public void testUnmarshalMapping() throws Exception {

        // create unmarshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response:cz.stormware.schema.list:cz.stormware.schema.invoice:cz.stormware.schema.documentresponse");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // configure StAX parser
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        InputStream customers = ClassLoader.getSystemResourceAsStream("xml/invoices-response-20100313.xml");
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(customers);

        // move to the first item
        streamReader.nextTag();
        streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePack");
        streamReader.nextTag();

        // loop over the items
        while(streamReader.getEventType() == XMLStreamConstants.START_ELEMENT) {
            streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePackItem");
            JAXBElement<ResponsePackItemType> customerResponse = unmarshaller.unmarshal(streamReader, ResponsePackItemType.class);
            System.out.println(customerResponse.getValue().getInvoiceResponse().getProducedDetails().getNumber());
            System.out.println(customerResponse.getValue().getInvoiceResponse().getImportDetails().getDetail().get(0).getState());
            streamReader.nextTag();
        }
    }
}