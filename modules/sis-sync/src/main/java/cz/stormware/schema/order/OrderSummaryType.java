//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.type.TypeCurrencyForeign;
import cz.stormware.schema.type.TypeCurrencyHome;
import cz.stormware.schema.type.TypeRoundingDocument;
import cz.stormware.schema.type.TypeRoundingVAT;


/**
 * <p>Java class for orderSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roundingDocument" type="{http://www.stormware.cz/schema/type.xsd}typeRoundingDocument" minOccurs="0"/>
 *         &lt;element name="roundingVAT" type="{http://www.stormware.cz/schema/type.xsd}typeRoundingVAT" minOccurs="0"/>
 *         &lt;element name="homeCurrency" type="{http://www.stormware.cz/schema/type.xsd}typeCurrencyHome" minOccurs="0"/>
 *         &lt;element name="foreignCurrency" type="{http://www.stormware.cz/schema/type.xsd}typeCurrencyForeign" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderSummaryType", propOrder = {
    "roundingDocument",
    "roundingVAT",
    "homeCurrency",
    "foreignCurrency"
})
public class OrderSummaryType {

    protected TypeRoundingDocument roundingDocument;
    protected TypeRoundingVAT roundingVAT;
    protected TypeCurrencyHome homeCurrency;
    protected TypeCurrencyForeign foreignCurrency;

    /**
     * Gets the value of the roundingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRoundingDocument }
     *     
     */
    public TypeRoundingDocument getRoundingDocument() {
        return roundingDocument;
    }

    /**
     * Sets the value of the roundingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRoundingDocument }
     *     
     */
    public void setRoundingDocument(TypeRoundingDocument value) {
        this.roundingDocument = value;
    }

    /**
     * Gets the value of the roundingVAT property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRoundingVAT }
     *     
     */
    public TypeRoundingVAT getRoundingVAT() {
        return roundingVAT;
    }

    /**
     * Sets the value of the roundingVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRoundingVAT }
     *     
     */
    public void setRoundingVAT(TypeRoundingVAT value) {
        this.roundingVAT = value;
    }

    /**
     * Gets the value of the homeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrencyHome }
     *     
     */
    public TypeCurrencyHome getHomeCurrency() {
        return homeCurrency;
    }

    /**
     * Sets the value of the homeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrencyHome }
     *     
     */
    public void setHomeCurrency(TypeCurrencyHome value) {
        this.homeCurrency = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrencyForeign }
     *     
     */
    public TypeCurrencyForeign getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrencyForeign }
     *     
     */
    public void setForeignCurrency(TypeCurrencyForeign value) {
        this.foreignCurrency = value;
    }

}
