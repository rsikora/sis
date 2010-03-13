//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.intdoc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.intdoc package. 
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

    private final static QName _IntDocResponse_QNAME = new QName("http://www.stormware.cz/schema/intDoc.xsd", "intDocResponse");
    private final static QName _IntDoc_QNAME = new QName("http://www.stormware.cz/schema/intDoc.xsd", "intDoc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.intdoc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntDocHeaderType }
     * 
     */
    public IntDocHeaderType createIntDocHeaderType() {
        return new IntDocHeaderType();
    }

    /**
     * Create an instance of {@link IntDocResponseType }
     * 
     */
    public IntDocResponseType createIntDocResponseType() {
        return new IntDocResponseType();
    }

    /**
     * Create an instance of {@link IntDocSummaryType }
     * 
     */
    public IntDocSummaryType createIntDocSummaryType() {
        return new IntDocSummaryType();
    }

    /**
     * Create an instance of {@link IntDocDetailType }
     * 
     */
    public IntDocDetailType createIntDocDetailType() {
        return new IntDocDetailType();
    }

    /**
     * Create an instance of {@link IntDocType }
     * 
     */
    public IntDocType createIntDocType() {
        return new IntDocType();
    }

    /**
     * Create an instance of {@link IntDocItemType }
     * 
     */
    public IntDocItemType createIntDocItemType() {
        return new IntDocItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntDocResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/intDoc.xsd", name = "intDocResponse")
    public JAXBElement<IntDocResponseType> createIntDocResponse(IntDocResponseType value) {
        return new JAXBElement<IntDocResponseType>(_IntDocResponse_QNAME, IntDocResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntDocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/intDoc.xsd", name = "intDoc")
    public JAXBElement<IntDocType> createIntDoc(IntDocType value) {
        return new JAXBElement<IntDocType>(_IntDoc_QNAME, IntDocType.class, null, value);
    }

}