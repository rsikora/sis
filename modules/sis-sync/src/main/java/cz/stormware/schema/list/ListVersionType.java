//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import cz.stormware.schema.accountingunit.ListAccountingUnitType;
import cz.stormware.schema.documentresponse.ImportDetailsType;
import cz.stormware.schema.type.StavType2;


/**
 * <p>Java class for listVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importDetails" type="{http://www.stormware.cz/schema/documentresponse.xsd}importDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dateTimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="dateValidFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="state" use="required" type="{http://www.stormware.cz/schema/type.xsd}stavType2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listVersionType", propOrder = {
    "importDetails"
})
@XmlSeeAlso({
    ListAccountingUnitType.class,
    ListPrijemkaType.class,
    ListAccountingDoubleEntryType.class,
    ListBalanceType.class,
    ListInvoiceType.class,
    ListEnquiryType.class,
    ListOfferType.class,
    ListAddressBookType.class,
    ListSellingPriceType.class,
    ListNumericSeriesType.class,
    ListActivityType.class,
    ListCashType.class,
    ListCentreType.class,
    ListStockType.class,
    ListAccountingSingleEntryType.class,
    cz.stormware.schema.list.ListContractType.class,
    ListOrderType.class,
    ListAccountType.class,
    ListVydejkaType.class,
    ListCategoryType.class,
    ListStorageType.class,
    ListUserCodePackType.class,
    ListParameterType.class,
    ListIntParamType.class,
    cz.stormware.schema.list_2.ListContractType.class
})
public class ListVersionType {

    protected ImportDetailsType importDetails;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateValidFrom;
    @XmlAttribute(required = true)
    protected StavType2 state;

    /**
     * Gets the value of the importDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ImportDetailsType }
     *     
     */
    public ImportDetailsType getImportDetails() {
        return importDetails;
    }

    /**
     * Sets the value of the importDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportDetailsType }
     *     
     */
    public void setImportDetails(ImportDetailsType value) {
        this.importDetails = value;
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
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the dateValidFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateValidFrom() {
        return dateValidFrom;
    }

    /**
     * Sets the value of the dateValidFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateValidFrom(XMLGregorianCalendar value) {
        this.dateValidFrom = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StavType2 }
     *     
     */
    public StavType2 getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavType2 }
     *     
     */
    public void setState(StavType2 value) {
        this.state = value;
    }

}
