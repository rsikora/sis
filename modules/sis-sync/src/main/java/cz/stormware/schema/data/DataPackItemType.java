//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.14 at 09:43:22 PM CET 
//


package cz.stormware.schema.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.addressbook.AddressbookType;
import cz.stormware.schema.invoice.InvoiceType;
import cz.stormware.schema.list.ListAddressBookRequestType;
import cz.stormware.schema.list.ListInvoiceRequestType;


/**
 * <p>Java class for dataPackItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataPackItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.stormware.cz/schema/addressbook.xsd}addressbook"/>
 *         &lt;element ref="{http://www.stormware.cz/schema/invoice.xsd}invoice"/>
 *         &lt;element ref="{http://www.stormware.cz/schema/list.xsd}listAddressBookRequest"/>
 *         &lt;element ref="{http://www.stormware.cz/schema/list.xsd}listInvoiceRequest"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/data.xsd}dataPackItemVersionType" />
 *       &lt;attribute name="id" use="required" type="{http://www.stormware.cz/schema/type.xsd}string64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataPackItemType", propOrder = {
    "addressbook",
    "invoice",
    "listAddressBookRequest",
    "listInvoiceRequest"
})
public class DataPackItemType {

    @XmlElement(namespace = "http://www.stormware.cz/schema/addressbook.xsd")
    protected AddressbookType addressbook;
    @XmlElement(namespace = "http://www.stormware.cz/schema/invoice.xsd")
    protected InvoiceType invoice;
    @XmlElement(namespace = "http://www.stormware.cz/schema/list.xsd")
    protected ListAddressBookRequestType listAddressBookRequest;
    @XmlElement(namespace = "http://www.stormware.cz/schema/list.xsd")
    protected ListInvoiceRequestType listInvoiceRequest;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the addressbook property.
     * 
     * @return
     *     possible object is
     *     {@link AddressbookType }
     *     
     */
    public AddressbookType getAddressbook() {
        return addressbook;
    }

    /**
     * Sets the value of the addressbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressbookType }
     *     
     */
    public void setAddressbook(AddressbookType value) {
        this.addressbook = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType }
     *     
     */
    public InvoiceType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType }
     *     
     */
    public void setInvoice(InvoiceType value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the listAddressBookRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListAddressBookRequestType }
     *     
     */
    public ListAddressBookRequestType getListAddressBookRequest() {
        return listAddressBookRequest;
    }

    /**
     * Sets the value of the listAddressBookRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAddressBookRequestType }
     *     
     */
    public void setListAddressBookRequest(ListAddressBookRequestType value) {
        this.listAddressBookRequest = value;
    }

    /**
     * Gets the value of the listInvoiceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ListInvoiceRequestType }
     *     
     */
    public ListInvoiceRequestType getListInvoiceRequest() {
        return listInvoiceRequest;
    }

    /**
     * Sets the value of the listInvoiceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListInvoiceRequestType }
     *     
     */
    public void setListInvoiceRequest(ListInvoiceRequestType value) {
        this.listInvoiceRequest = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
