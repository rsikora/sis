package cz.snet.infrastructure.stormware.schema;

import cz.stormware.schema.data.DataPackItemType;
import cz.stormware.schema.data.DataPackType;
import cz.stormware.schema.invoice.InvoiceHeaderType;
import cz.stormware.schema.invoice.InvoiceType;
import cz.stormware.schema.invoice.InvoiceTypeType;
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
import java.io.InputStream;
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
public class InvoiceTest {

    private static final Logger log = Logger.getLogger(InvoiceTest.class);

    @Test
    public void testMarshalMapping() throws Exception {
        // create marshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.data");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        InvoiceType invoice = new InvoiceType();
        invoice.setVersion("1.5");
        InvoiceHeaderType invoiceHeader = new InvoiceHeaderType();
        invoiceHeader.setInvoiceType(InvoiceTypeType.ISSUED_INVOICE);
        invoice.setInvoiceHeader(invoiceHeader);

        DataPackItemType dataPackItem = new DataPackItemType();
        dataPackItem.setInvoice(invoice);

        DataPackType dataPack = new DataPackType();
        dataPack.getDataPackItem().add(dataPackItem);
        JAXBElement dataPackElement = new JAXBElement(new QName("dataPack"), DataPackType.class, dataPack);

        StringWriter writer = new StringWriter();
        marshaller.marshal(dataPackElement, writer);

        String expected = "" +
                "<dataPack xmlns:dat='http://www.stormware.cz/schema/data.xsd' xmlns:inv='http://www.stormware.cz/schema/invoice.xsd'>\n" +
                "  <dat:dataPackItem>\n" +
                "    <inv:invoice version='1.5'>\n" +
                "      <inv:invoiceHeader>\n" +
                "        <inv:invoiceType>issuedInvoice</inv:invoiceType>\n" +
                "      </inv:invoiceHeader>\n" +
                "    </inv:invoice>\n" +
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
        String invoicesResponseXml = "" +
                "<?xml version=\"1.0\" encoding=\"Windows-1250\"?>\n" +
                "<rsp:responsePack version=\"1.0\" id=\"2010-03-10T17:02:48.593\" state=\"ok\" note=\"\" programVersion=\"9403.5 E1 (17.2.2010)\" xmlns:rsp=\"http://www.stormware.cz/schema/response.xsd\" xmlns:rdc=\"http://www.stormware.cz/schema/documentresponse.xsd\" xmlns:typ=\"http://www.stormware.cz/schema/type.xsd\" xmlns:lst=\"http://www.stormware.cz/schema/list.xsd\" xmlns:acu=\"http://www.stormware.cz/schema/accountingunit.xsd\" xmlns:inv=\"http://www.stormware.cz/schema/invoice.xsd\" xmlns:vch=\"http://www.stormware.cz/schema/voucher.xsd\" xmlns:int=\"http://www.stormware.cz/schema/intDoc.xsd\" xmlns:stk=\"http://www.stormware.cz/schema/stock.xsd\" xmlns:ord=\"http://www.stormware.cz/schema/order.xsd\" xmlns:ofr=\"http://www.stormware.cz/schema/offer.xsd\" xmlns:enq=\"http://www.stormware.cz/schema/enquiry.xsd\" xmlns:vyd=\"http://www.stormware.cz/schema/vydejka.xsd\" xmlns:pri=\"http://www.stormware.cz/schema/prijemka.xsd\" xmlns:bal=\"http://www.stormware.cz/schema/balance.xsd\" xmlns:pre=\"http://www.stormware.cz/schema/prevodka.xsd\" xmlns:vyr=\"http://www.stormware.cz/schema/vyroba.xsd\" xmlns:pro=\"http://www.stormware.cz/schema/prodejka.xsd\" xmlns:con=\"http://www.stormware.cz/schema/contract.xsd\" xmlns:adb=\"http://www.stormware.cz/schema/addressbook.xsd\" xmlns:prm=\"http://www.stormware.cz/schema/parameter.xsd\" xmlns:lst2=\"http://www.stormware.cz/schema/list_2.xsd\" xmlns:ctg=\"http://www.stormware.cz/schema/category.xsd\" xmlns:ipm=\"http://www.stormware.cz/schema/intParam.xsd\">\n" +
                "  <rsp:responsePackItem version=\"1.0\" id=\"2010-03-10T17:02:48.593_0000000000_134409\" state=\"ok\">\n" +
                "    <inv:invoiceResponse version=\"1.3\" state=\"ok\">\n" +
                "      <rdc:importDetails>\n" +
                "        <rdc:detail>\n" +
                "          <rdc:state>warning</rdc:state>\n" +
                "          <rdc:errno>606</rdc:errno>\n" +
                "          <rdc:note>Datum není z úèetního období.</rdc:note>\n" +
                "          <rdc:XPath>dat:dataPack/dat:dataPackItem[1]/inv:invoice/inv:invoiceHeader/inv:date</rdc:XPath>\n" +
                "          <rdc:valueRequested>08.03.2010</rdc:valueRequested>\n" +
                "          <rdc:valueProduced>08.03.2010</rdc:valueProduced>\n" +
                "        </rdc:detail>\n" +
                "        <rdc:detail>\n" +
                "          <rdc:state>warning</rdc:state>\n" +
                "          <rdc:errno>606</rdc:errno>\n" +
                "          <rdc:note>Datum mùže být nejvýše 31.12.2009.\n" +
                "\n" +
                "Tip: Pokud chcete zadat doklad z poèátku dalšího období,\n" +
                "nastavte Úèetnictví/Uzávìrka/Úètování na pøelomu úèetního období.</rdc:note>\n" +
                "          <rdc:XPath>dat:dataPack/dat:dataPackItem[1]/inv:invoice/inv:invoiceHeader/inv:date</rdc:XPath>\n" +
                "          <rdc:valueRequested>08.03.2010</rdc:valueRequested>\n" +
                "          <rdc:valueProduced>08.03.2010</rdc:valueProduced>\n" +
                "        </rdc:detail>\n" +
                "      </rdc:importDetails>\n" +
                "      <rdc:producedDetails>\n" +
                "        <rdc:id>60925</rdc:id>\n" +
                "        <rdc:number>2010008197</rdc:number>\n" +
                "      </rdc:producedDetails>\n" +
                "    </inv:invoiceResponse>\n" +
                "  </rsp:responsePackItem>\n" +
                "  <rsp:responsePackItem version=\"1.0\" id=\"2010-03-10T17:02:48.593_0000000001_134410\" state=\"ok\">\n" +
                "    <inv:invoiceResponse version=\"1.3\" state=\"ok\">\n" +
                "      <rdc:importDetails>\n" +
                "        <rdc:detail>\n" +
                "          <rdc:state>warning</rdc:state>\n" +
                "          <rdc:errno>606</rdc:errno>\n" +
                "          <rdc:note>Datum není z úèetního období.</rdc:note>\n" +
                "          <rdc:XPath>dat:dataPack/dat:dataPackItem[2]/inv:invoice/inv:invoiceHeader/inv:date</rdc:XPath>\n" +
                "          <rdc:valueRequested>08.03.2010</rdc:valueRequested>\n" +
                "          <rdc:valueProduced>08.03.2010</rdc:valueProduced>\n" +
                "        </rdc:detail>\n" +
                "        <rdc:detail>\n" +
                "          <rdc:state>warning</rdc:state>\n" +
                "          <rdc:errno>606</rdc:errno>\n" +
                "          <rdc:note>Datum mùže být nejvýše 31.12.2009.\n" +
                "\n" +
                "Tip: Pokud chcete zadat doklad z poèátku dalšího období,\n" +
                "nastavte Úèetnictví/Uzávìrka/Úètování na pøelomu úèetního období.</rdc:note>\n" +
                "          <rdc:XPath>dat:dataPack/dat:dataPackItem[2]/inv:invoice/inv:invoiceHeader/inv:date</rdc:XPath>\n" +
                "          <rdc:valueRequested>08.03.2010</rdc:valueRequested>\n" +
                "          <rdc:valueProduced>08.03.2010</rdc:valueProduced>\n" +
                "        </rdc:detail>\n" +
                "      </rdc:importDetails>\n" +
                "      <rdc:producedDetails>\n" +
                "        <rdc:id>60926</rdc:id>\n" +
                "        <rdc:number>2010008198</rdc:number>\n" +
                "      </rdc:producedDetails>\n" +
                "    </inv:invoiceResponse>\n" +
                "  </rsp:responsePackItem>\n" +
                "</rsp:responsePack>\n" +
                "";

        // create unmarshaller
        JAXBContext context = JAXBContext.newInstance("cz.stormware.schema.response");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // configure StAX parser
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLStreamReader streamReader = inputFactory.createXMLStreamReader(new StringReader(invoicesResponseXml));

        // move to the first item
        streamReader.nextTag();
        streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePack");
        streamReader.nextTag();

        String[] expectedNumbers = new String[] {"2010008197 WARNING", "2010008198 WARNING"};

        // loop over the invoice responses
        LinkedList<String> numbers = new LinkedList<String>();
        while (streamReader.getEventType() == XMLStreamConstants.START_ELEMENT) {
            streamReader.require(XMLStreamConstants.START_ELEMENT, null, "responsePackItem");
            JAXBElement<ResponsePackItemType> invoiceResponse = unmarshaller.unmarshal(streamReader, ResponsePackItemType.class);
            StringBuilder number = new StringBuilder(invoiceResponse.getValue().getInvoiceResponse().getProducedDetails().getNumber());
            number.append(" ").
                    append(invoiceResponse.getValue().getInvoiceResponse().getImportDetails().getDetail().get(0).getState());
            String numberString = number.toString();
            log.debug(numberString);
            numbers.add(numberString);
            streamReader.nextTag();
        }
        assertThat(numbers.toArray(new String[numbers.size()]), is(expectedNumbers));
    }
}