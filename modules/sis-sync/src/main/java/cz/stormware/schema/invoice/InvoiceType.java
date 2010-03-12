//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 12:22:34 AM CET 
//


package cz.stormware.schema.invoice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for invoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="invoiceHeader" type="{http://www.stormware.cz/schema/invoice.xsd}invoiceHeaderType"/>
 *         &lt;element name="invoiceDetail" type="{http://www.stormware.cz/schema/invoice.xsd}invoiceDetailType" minOccurs="0"/>
 *         &lt;element name="invoiceSummary" type="{http://www.stormware.cz/schema/invoice.xsd}invoiceSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/invoice.xsd}invVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoiceType", propOrder = {
    "invoiceHeader",
    "invoiceDetail",
    "invoiceSummary"
})
public class InvoiceType {

    @XmlElement(required = true)
    protected InvoiceHeaderType invoiceHeader;
    protected InvoiceDetailType invoiceDetail;
    protected InvoiceSummaryType invoiceSummary;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the invoiceHeader property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public InvoiceHeaderType getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Sets the value of the invoiceHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeaderType }
     *     
     */
    public void setInvoiceHeader(InvoiceHeaderType value) {
        this.invoiceHeader = value;
    }

    /**
     * Gets the value of the invoiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceDetailType }
     *     
     */
    public InvoiceDetailType getInvoiceDetail() {
        return invoiceDetail;
    }

    /**
     * Sets the value of the invoiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceDetailType }
     *     
     */
    public void setInvoiceDetail(InvoiceDetailType value) {
        this.invoiceDetail = value;
    }

    /**
     * Gets the value of the invoiceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceSummaryType }
     *     
     */
    public InvoiceSummaryType getInvoiceSummary() {
        return invoiceSummary;
    }

    /**
     * Sets the value of the invoiceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceSummaryType }
     *     
     */
    public void setInvoiceSummary(InvoiceSummaryType value) {
        this.invoiceSummary = value;
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
