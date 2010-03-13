//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.enquiry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.enquiry package. 
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

    private final static QName _EnquiryResponse_QNAME = new QName("http://www.stormware.cz/schema/enquiry.xsd", "enquiryResponse");
    private final static QName _Enquiry_QNAME = new QName("http://www.stormware.cz/schema/enquiry.xsd", "enquiry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.enquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnquiryDetailType }
     * 
     */
    public EnquiryDetailType createEnquiryDetailType() {
        return new EnquiryDetailType();
    }

    /**
     * Create an instance of {@link EnquiryHeaderType }
     * 
     */
    public EnquiryHeaderType createEnquiryHeaderType() {
        return new EnquiryHeaderType();
    }

    /**
     * Create an instance of {@link EnquirySummaryType }
     * 
     */
    public EnquirySummaryType createEnquirySummaryType() {
        return new EnquirySummaryType();
    }

    /**
     * Create an instance of {@link EnquiryItemType }
     * 
     */
    public EnquiryItemType createEnquiryItemType() {
        return new EnquiryItemType();
    }

    /**
     * Create an instance of {@link EnquiryResponseType }
     * 
     */
    public EnquiryResponseType createEnquiryResponseType() {
        return new EnquiryResponseType();
    }

    /**
     * Create an instance of {@link EnquiryType }
     * 
     */
    public EnquiryType createEnquiryType() {
        return new EnquiryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquiryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/enquiry.xsd", name = "enquiryResponse")
    public JAXBElement<EnquiryResponseType> createEnquiryResponse(EnquiryResponseType value) {
        return new JAXBElement<EnquiryResponseType>(_EnquiryResponse_QNAME, EnquiryResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnquiryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/enquiry.xsd", name = "enquiry")
    public JAXBElement<EnquiryType> createEnquiry(EnquiryType value) {
        return new JAXBElement<EnquiryType>(_Enquiry_QNAME, EnquiryType.class, null, value);
    }

}