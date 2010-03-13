//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.intparam;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.intparam package. 
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

    private final static QName _IntParamResponse_QNAME = new QName("http://www.stormware.cz/schema/intParam.xsd", "intParamResponse");
    private final static QName _IntParamDetail_QNAME = new QName("http://www.stormware.cz/schema/intParam.xsd", "intParamDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.intparam
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IntParamType }
     * 
     */
    public IntParamType createIntParamType() {
        return new IntParamType();
    }

    /**
     * Create an instance of {@link IntParamDetailType }
     * 
     */
    public IntParamDetailType createIntParamDetailType() {
        return new IntParamDetailType();
    }

    /**
     * Create an instance of {@link ParameterSettingsType }
     * 
     */
    public ParameterSettingsType createParameterSettingsType() {
        return new ParameterSettingsType();
    }

    /**
     * Create an instance of {@link IntParamResponseType }
     * 
     */
    public IntParamResponseType createIntParamResponseType() {
        return new IntParamResponseType();
    }

    /**
     * Create an instance of {@link ParameterListType }
     * 
     */
    public ParameterListType createParameterListType() {
        return new ParameterListType();
    }

    /**
     * Create an instance of {@link ParameterListItemType }
     * 
     */
    public ParameterListItemType createParameterListItemType() {
        return new ParameterListItemType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntParamResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/intParam.xsd", name = "intParamResponse")
    public JAXBElement<IntParamResponseType> createIntParamResponse(IntParamResponseType value) {
        return new JAXBElement<IntParamResponseType>(_IntParamResponse_QNAME, IntParamResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntParamDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/intParam.xsd", name = "intParamDetail")
    public JAXBElement<IntParamDetailType> createIntParamDetail(IntParamDetailType value) {
        return new JAXBElement<IntParamDetailType>(_IntParamDetail_QNAME, IntParamDetailType.class, null, value);
    }

}