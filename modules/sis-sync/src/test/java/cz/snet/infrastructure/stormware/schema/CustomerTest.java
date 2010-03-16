package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.addressbook.AddressbookResponseType;
import cz.stormware.schema.data.DataPackItemType;
import cz.stormware.schema.data.DataPackType;
import cz.stormware.schema.invoice.InvoiceType;
import cz.stormware.schema.response.ResponsePackItemType;
import cz.stormware.schema.response.ResponsePackType;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 13, 2010
 * Time: 10:59:40 PM
 */
public class CustomerTest {

    @Test
    public void testMarshalMapping() throws Exception {
        // create marshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.data");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        InvoiceType invoice = new InvoiceType();
        invoice.setVersion("1.5");

        DataPackItemType dataPackItem = new DataPackItemType();
        dataPackItem.setInvoice(invoice);

        DataPackType dataPack = new DataPackType();
        dataPack.getDataPackItem().add(dataPackItem);
        JAXBElement dataPackElement = new JAXBElement(new QName("dataPack"), DataPackType.class, dataPack);

        StringWriter writer = new StringWriter();
        marshaller.marshal(dataPackElement, writer);

        System.out.println(writer);
    }

    @Test
    public void testUnmarshalMapping() throws Exception {
        // create unmarshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response");
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
