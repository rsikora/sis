//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.list_stock_1_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.list_stock_1_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListStockRequest_QNAME = new QName("http://www.stormware.cz/schema/list_stock_1.1.xsd", "listStockRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.list_stock_1_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListRequestStockType }
     * 
     */
    public ListRequestStockType createListRequestStockType() {
        return new ListRequestStockType();
    }

    /**
     * Create an instance of {@link RequestStockType }
     * 
     */
    public RequestStockType createRequestStockType() {
        return new RequestStockType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRequestStockType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/list_stock_1.1.xsd", name = "listStockRequest")
    public JAXBElement<ListRequestStockType> createListStockRequest(ListRequestStockType value) {
        return new JAXBElement<ListRequestStockType>(_ListStockRequest_QNAME, ListRequestStockType.class, null, value);
    }

}
