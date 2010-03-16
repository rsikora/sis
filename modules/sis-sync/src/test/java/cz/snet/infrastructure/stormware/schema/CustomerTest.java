package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.addressbook.AddressbookHeaderType;
import cz.stormware.schema.addressbook.AddressbookType;
import cz.stormware.schema.data.DataPackItemType;
import cz.stormware.schema.data.DataPackType;
import cz.stormware.schema.response.ResponsePackItemType;
import org.apache.log4j.Logger;
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
import java.io.StringReader;
import java.io.StringWriter;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: der3k
 * Date: Mar 13, 2010
 * Time: 10:59:40 PM
 */
public class CustomerTest {

    private static final Logger log = Logger.getLogger(InvoiceTest.class);

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
        JAXBElement<DataPackType> dataPackElement = new JAXBElement<DataPackType>(new QName("dataPack"), DataPackType.class, dataPack);

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

        log.debug("EXPECTED:\n" + expected);
        log.debug("ACTUAL:\n" + writer.toString());

        XMLUnit.setIgnoreAttributeOrder(true);
        XMLUnit.setIgnoreWhitespace(true);

        Diff diff = XMLUnit.compareXML(expected, writer.toString());
        assertThat(diff.toString(), diff.similar(), is(true));
    }

    @Test
    public void testUnmarshalMapping() throws Exception {

        String customersResponseXml = "" +
                "<?xml version=\"1.0\" encoding=\"Windows-1250\"?>\n" +
                "<rsp:responsePack version=\"1.0\" id=\"2010-03-08T10:37:25.152\" state=\"ok\" note=\"\" programVersion=\"9403.5 E1 (17.2.2010)\" xmlns:rsp=\"http://www.stormware.cz/schema/response.xsd\" xmlns:rdc=\"http://www.stormware.cz/schema/documentresponse.xsd\" xmlns:typ=\"http://www.stormware.cz/schema/type.xsd\" xmlns:lst=\"http://www.stormware.cz/schema/list.xsd\" xmlns:acu=\"http://www.stormware.cz/schema/accountingunit.xsd\" xmlns:inv=\"http://www.stormware.cz/schema/invoice.xsd\" xmlns:vch=\"http://www.stormware.cz/schema/voucher.xsd\" xmlns:int=\"http://www.stormware.cz/schema/intDoc.xsd\" xmlns:stk=\"http://www.stormware.cz/schema/stock.xsd\" xmlns:ord=\"http://www.stormware.cz/schema/order.xsd\" xmlns:ofr=\"http://www.stormware.cz/schema/offer.xsd\" xmlns:enq=\"http://www.stormware.cz/schema/enquiry.xsd\" xmlns:vyd=\"http://www.stormware.cz/schema/vydejka.xsd\" xmlns:pri=\"http://www.stormware.cz/schema/prijemka.xsd\" xmlns:bal=\"http://www.stormware.cz/schema/balance.xsd\" xmlns:pre=\"http://www.stormware.cz/schema/prevodka.xsd\" xmlns:vyr=\"http://www.stormware.cz/schema/vyroba.xsd\" xmlns:pro=\"http://www.stormware.cz/schema/prodejka.xsd\" xmlns:con=\"http://www.stormware.cz/schema/contract.xsd\" xmlns:adb=\"http://www.stormware.cz/schema/addressbook.xsd\" xmlns:prm=\"http://www.stormware.cz/schema/parameter.xsd\" xmlns:lst2=\"http://www.stormware.cz/schema/list_2.xsd\" xmlns:ctg=\"http://www.stormware.cz/schema/category.xsd\" xmlns:ipm=\"http://www.stormware.cz/schema/intParam.xsd\">\n" +
                "<rsp:responsePackItem version=\"1.0\" id=\"2010-03-08T10:37:25.152_0000000000_6237\" state=\"ok\">\n" +
                "\t<adb:addressbookResponse version=\"1.5\" state=\"ok\">\n" +
                "\t\t<rdc:producedDetails>\n" +
                "\t\t\t<rdc:id>9226</rdc:id>\n" +
                "\t\t\t<rdc:code>Nieslanik Jan</rdc:code>\n" +
                "\t\t</rdc:producedDetails>\n" +
                "\t</adb:addressbookResponse>\n" +
                "</rsp:responsePackItem>\n" +
                "<rsp:responsePackItem version=\"1.0\" id=\"2010-03-08T10:37:25.152_0000000001_5680\" state=\"ok\">\n" +
                "\t<adb:addressbookResponse version=\"1.5\" state=\"ok\">\n" +
                "\t\t<rdc:producedDetails>\n" +
                "\t\t\t<rdc:id>8707</rdc:id>\n" +
                "\t\t\t<rdc:code>Wawreczka David</rdc:code>\n" +
                "\t\t</rdc:producedDetails>\n" +
                "\t</adb:addressbookResponse>\n" +
                "</rsp:responsePackItem>\n" +
                "</rsp:responsePack>\n" +
                "";

        // create unmarshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // configure StAX parser
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(new StringReader(customersResponseXml));

        // move to the first item
        streamReader.nextTag();
        streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePack");
        streamReader.nextTag();

        String[] expectedNames = new String[] {"Nieslanik Jan", "Wawreczka David"};
        
        // loop over customer responses
        LinkedList<String> names = new LinkedList<String>();
        while (streamReader.getEventType() == XMLStreamConstants.START_ELEMENT) {
            streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePackItem");
            JAXBElement<ResponsePackItemType> customerResponse = unmarshaller.unmarshal(streamReader, ResponsePackItemType.class);
            String name = customerResponse.getValue().getAddressbookResponse().getProducedDetails().getCode();
            log.debug(name);
            names.add(name);
            streamReader.nextTag();
        }
        assertThat(names.toArray(new String[names.size()]), is(expectedNames));
    }
}
