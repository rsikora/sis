//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.prijemka;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prijemkaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prijemkaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prijemkaHeader" type="{http://www.stormware.cz/schema/prijemka.xsd}prijemkaHeaderType"/>
 *         &lt;element name="prijemkaDetail" type="{http://www.stormware.cz/schema/prijemka.xsd}prijemkaDetailType" minOccurs="0"/>
 *         &lt;element name="prijemkaSummary" type="{http://www.stormware.cz/schema/prijemka.xsd}prijemkaSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/prijemka.xsd}priVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prijemkaType", propOrder = {
    "prijemkaHeader",
    "prijemkaDetail",
    "prijemkaSummary"
})
public class PrijemkaType {

    @XmlElement(required = true)
    protected PrijemkaHeaderType prijemkaHeader;
    protected PrijemkaDetailType prijemkaDetail;
    protected PrijemkaSummaryType prijemkaSummary;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the prijemkaHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PrijemkaHeaderType }
     *     
     */
    public PrijemkaHeaderType getPrijemkaHeader() {
        return prijemkaHeader;
    }

    /**
     * Sets the value of the prijemkaHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrijemkaHeaderType }
     *     
     */
    public void setPrijemkaHeader(PrijemkaHeaderType value) {
        this.prijemkaHeader = value;
    }

    /**
     * Gets the value of the prijemkaDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrijemkaDetailType }
     *     
     */
    public PrijemkaDetailType getPrijemkaDetail() {
        return prijemkaDetail;
    }

    /**
     * Sets the value of the prijemkaDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrijemkaDetailType }
     *     
     */
    public void setPrijemkaDetail(PrijemkaDetailType value) {
        this.prijemkaDetail = value;
    }

    /**
     * Gets the value of the prijemkaSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PrijemkaSummaryType }
     *     
     */
    public PrijemkaSummaryType getPrijemkaSummary() {
        return prijemkaSummary;
    }

    /**
     * Sets the value of the prijemkaSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrijemkaSummaryType }
     *     
     */
    public void setPrijemkaSummary(PrijemkaSummaryType value) {
        this.prijemkaSummary = value;
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

}
