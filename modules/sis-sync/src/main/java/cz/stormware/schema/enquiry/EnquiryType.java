//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.enquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enquiryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enquiryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enquiryHeader" type="{http://www.stormware.cz/schema/enquiry.xsd}enquiryHeaderType"/>
 *         &lt;element name="enquiryDetail" type="{http://www.stormware.cz/schema/enquiry.xsd}enquiryDetailType" minOccurs="0"/>
 *         &lt;element name="enquirySummary" type="{http://www.stormware.cz/schema/enquiry.xsd}enquirySummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/enquiry.xsd}enqVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enquiryType", propOrder = {
    "enquiryHeader",
    "enquiryDetail",
    "enquirySummary"
})
public class EnquiryType {

    @XmlElement(required = true)
    protected EnquiryHeaderType enquiryHeader;
    protected EnquiryDetailType enquiryDetail;
    protected EnquirySummaryType enquirySummary;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the enquiryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryHeaderType }
     *     
     */
    public EnquiryHeaderType getEnquiryHeader() {
        return enquiryHeader;
    }

    /**
     * Sets the value of the enquiryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryHeaderType }
     *     
     */
    public void setEnquiryHeader(EnquiryHeaderType value) {
        this.enquiryHeader = value;
    }

    /**
     * Gets the value of the enquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryDetailType }
     *     
     */
    public EnquiryDetailType getEnquiryDetail() {
        return enquiryDetail;
    }

    /**
     * Sets the value of the enquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryDetailType }
     *     
     */
    public void setEnquiryDetail(EnquiryDetailType value) {
        this.enquiryDetail = value;
    }

    /**
     * Gets the value of the enquirySummary property.
     * 
     * @return
     *     possible object is
     *     {@link EnquirySummaryType }
     *     
     */
    public EnquirySummaryType getEnquirySummary() {
        return enquirySummary;
    }

    /**
     * Sets the value of the enquirySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquirySummaryType }
     *     
     */
    public void setEnquirySummary(EnquirySummaryType value) {
        this.enquirySummary = value;
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