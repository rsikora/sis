//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.category;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.stormware.schema.category package. 
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

    private final static QName _CategoryDetail_QNAME = new QName("http://www.stormware.cz/schema/category.xsd", "categoryDetail");
    private final static QName _CategoryResponse_QNAME = new QName("http://www.stormware.cz/schema/category.xsd", "categoryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.stormware.schema.category
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InternetParamsType }
     * 
     */
    public InternetParamsType createInternetParamsType() {
        return new InternetParamsType();
    }

    /**
     * Create an instance of {@link SubCategoriesType }
     * 
     */
    public SubCategoriesType createSubCategoriesType() {
        return new SubCategoriesType();
    }

    /**
     * Create an instance of {@link CategoryResponseType }
     * 
     */
    public CategoryResponseType createCategoryResponseType() {
        return new CategoryResponseType();
    }

    /**
     * Create an instance of {@link CategoryDetailType }
     * 
     */
    public CategoryDetailType createCategoryDetailType() {
        return new CategoryDetailType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/category.xsd", name = "categoryDetail")
    public JAXBElement<CategoryDetailType> createCategoryDetail(CategoryDetailType value) {
        return new JAXBElement<CategoryDetailType>(_CategoryDetail_QNAME, CategoryDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.stormware.cz/schema/category.xsd", name = "categoryResponse")
    public JAXBElement<CategoryResponseType> createCategoryResponse(CategoryResponseType value) {
        return new JAXBElement<CategoryResponseType>(_CategoryResponse_QNAME, CategoryResponseType.class, null, value);
    }

}
