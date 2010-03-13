//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.type;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data volitelného parametru.
 * 
 * <p>Java class for parameterDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameterDocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.stormware.cz/schema/type.xsd}string16"/>
 *         &lt;choice>
 *           &lt;element name="textValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="currencyValue" type="{http://www.stormware.cz/schema/type.xsd}currencyType"/>
 *           &lt;element name="booleanValue" type="{http://www.stormware.cz/schema/type.xsd}boolean"/>
 *           &lt;element name="numberValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *           &lt;element name="datetimeValue" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="listValue" type="{http://www.stormware.cz/schema/type.xsd}idType"/>
 *           &lt;element name="integerValue" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;/choice>
 *         &lt;element name="list" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterDocType", propOrder = {
    "name",
    "textValue",
    "currencyValue",
    "booleanValue",
    "numberValue",
    "datetimeValue",
    "listValue",
    "integerValue",
    "list"
})
public class ParameterDocType {

    @XmlElement(required = true)
    protected String name;
    protected String textValue;
    protected Double currencyValue;
    protected Boolean booleanValue;
    protected Float numberValue;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datetimeValue;
    protected BigInteger listValue;
    protected BigInteger integerValue;
    protected RefType list;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the textValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * Sets the value of the textValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextValue(String value) {
        this.textValue = value;
    }

    /**
     * Gets the value of the currencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrencyValue() {
        return currencyValue;
    }

    /**
     * Sets the value of the currencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrencyValue(Double value) {
        this.currencyValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the numberValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNumberValue() {
        return numberValue;
    }

    /**
     * Sets the value of the numberValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNumberValue(Float value) {
        this.numberValue = value;
    }

    /**
     * Gets the value of the datetimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatetimeValue() {
        return datetimeValue;
    }

    /**
     * Sets the value of the datetimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatetimeValue(XMLGregorianCalendar value) {
        this.datetimeValue = value;
    }

    /**
     * Gets the value of the listValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListValue() {
        return listValue;
    }

    /**
     * Sets the value of the listValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListValue(BigInteger value) {
        this.listValue = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerValue(BigInteger value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setList(RefType value) {
        this.list = value;
    }

}
