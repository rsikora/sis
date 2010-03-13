//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.list;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listOfferRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listOfferRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="requestOffer" type="{http://www.stormware.cz/schema/list.xsd}requestOfferType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/list.xsd}listOfferRequestVerType" />
 *       &lt;attribute name="offerVersion" use="required" type="{http://www.stormware.cz/schema/offer.xsd}ofrVersionType" />
 *       &lt;attribute name="extSystem" type="{http://www.stormware.cz/schema/type.xsd}string64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listOfferRequestType", propOrder = {
    "requestOffer"
})
public class ListOfferRequestType {

    @XmlElement(required = true)
    protected List<RequestOfferType> requestOffer;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected String offerVersion;
    @XmlAttribute
    protected String extSystem;

    /**
     * Gets the value of the requestOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestOfferType }
     * 
     * 
     */
    public List<RequestOfferType> getRequestOffer() {
        if (requestOffer == null) {
            requestOffer = new ArrayList<RequestOfferType>();
        }
        return this.requestOffer;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the offerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferVersion() {
        return offerVersion;
    }

    /**
     * Sets the value of the offerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferVersion(String value) {
        this.offerVersion = value;
    }

    /**
     * Gets the value of the extSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtSystem() {
        return extSystem;
    }

    /**
     * Sets the value of the extSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtSystem(String value) {
        this.extSystem = value;
    }

}