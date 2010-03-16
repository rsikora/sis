package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.addressbook.AddressbookHeaderType;
import cz.stormware.schema.addressbook.AddressbookResponseType;
import cz.stormware.schema.addressbook.AddressbookType;
import cz.stormware.schema.data.DataPackItemType;
import cz.stormware.schema.data.DataPackType;
import cz.stormware.schema.invoice.InvoiceHeaderType;
import cz.stormware.schema.invoice.InvoiceType;
import cz.stormware.schema.invoice.InvoiceTypeType;
import cz.stormware.schema.response.ResponsePackItemType;
import cz.stormware.schema.response.ResponsePackType;
import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
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

        AddressbookType customer = new AddressbookType();
        AddressbookHeaderType customerHeader = new AddressbookHeaderType();
        customerHeader.setRegion("REGION");
        customer.setAddressbookHeader(customerHeader);

        DataPackItemType dataPackItem = new DataPackItemType();
        dataPackItem.setAddressbook(customer);

        DataPackType dataPack = new DataPackType();
        dataPack.getDataPackItem().add(dataPackItem);
        JAXBElement dataPackElement = new JAXBElement(new QName("dataPack"), DataPackType.class, dataPack);

        StringWriter writer = new StringWriter();
        marshaller.marshal(dataPackElement, writer);

        String expected = "" +
                "<dataPack xmlns:dat='http://www.stormware.cz/schema/data.xsd' xmlns:adb='http://www.stormware.cz/schema/addressbook.xsd'>\n" +
                "  <dat:dataPackItem>\n" +
                "    <adb:addressbook>\n" +
                "      <adb:addressbookHeader>\n" +
                "        <adb:region>REGION</adb:region>\n" +
                "      </adb:addressbookHeader>\n" +
                "    </adb:addressbook>\n" +
                "  </dat:dataPackItem>\n" +
                "</dataPack>";

        System.out.println(expected);
        System.out.println(writer);

        XMLUnit.setIgnoreAttributeOrder(true);
        XMLUnit.setIgnoreWhitespace(true);

        Diff diff = XMLUnit.compareXML(expected, writer.toString());
        assertThat(diff.toString(), diff.similar(), is(true));
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
