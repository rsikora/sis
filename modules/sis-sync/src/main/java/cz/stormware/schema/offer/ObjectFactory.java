//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.offer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.offer package. 
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

    private final static QName _Offer_QNAME = new QName("http://www.stormware.cz/schema/offer.xsd", "offer");
    private final static QName _OfferResponse_QNAME = new QName("http://www.stormware.cz/schema/offer.xsd", "offerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.offer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OfferResponseType }
     * 
     */
    public OfferResponseType createOfferResponseType() {
        return new OfferResponseType();
    }

    /**
     * Create an instance of {@link OfferDetailType }
     * 
     */
    public OfferDetailType createOfferDetailType() {
        return new OfferDetailType();
    }

    /**
     * Create an instance of {@link OfferHeaderType }
     * 
     */
    public OfferHeaderType createOfferHeaderType() {
        return new OfferHeaderType();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link OfferSummaryType }
     * 
     */
    public OfferSummaryType createOfferSummaryType() {
        return new OfferSummaryType();
    }

    /**
     * Create an instance of {@link OfferItemType }
     * 
     */
    public OfferItemType createOfferItemType() {
        return new OfferItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/offer.xsd", name = "offer")
    public JAXBElement<OfferType> createOffer(OfferType value) {
        return new JAXBElement<OfferType>(_Offer_QNAME, OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/offer.xsd", name = "offerResponse")
    public JAXBElement<OfferResponseType> createOfferResponse(OfferResponseType value) {
        return new JAXBElement<OfferResponseType>(_OfferResponse_QNAME, OfferResponseType.class, null, value);
    }

}
