//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.stock;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for intParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterID" type="{http://www.stormware.cz/schema/type.xsd}idType" minOccurs="0"/>
 *         &lt;element name="parameterValue" type="{http://www.stormware.cz/schema/type.xsd}string255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intParameterType", propOrder = {
    "parameterID",
    "parameterValue"
})
public class IntParameterType {

    protected BigInteger parameterID;
    protected String parameterValue;

    /**
     * Gets the value of the parameterID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParameterID() {
        return parameterID;
    }

    /**
     * Sets the value of the parameterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParameterID(BigInteger value) {
        this.parameterID = value;
    }

    /**
     * Gets the value of the parameterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterValue() {
        return parameterValue;
    }

    /**
     * Sets the value of the parameterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterValue(String value) {
        this.parameterValue = value;
    }

}