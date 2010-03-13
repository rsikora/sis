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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for numberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="numberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.stormware.cz/schema/type.xsd}idType" minOccurs="0"/>
 *         &lt;element name="ids" type="{http://www.stormware.cz/schema/type.xsd}idsType" minOccurs="0"/>
 *         &lt;element name="numberRequested" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.stormware.cz/schema/type.xsd>string10">
 *                 &lt;attribute name="checkDuplicity" type="{http://www.stormware.cz/schema/type.xsd}boolean" default="true" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "numberType", propOrder = {
    "id",
    "ids",
    "numberRequested"
})
public class NumberType {

    protected BigInteger id;
    protected String ids;
    protected NumberType.NumberRequested numberRequested;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the ids property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIds() {
        return ids;
    }

    /**
     * Sets the value of the ids property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIds(String value) {
        this.ids = value;
    }

    /**
     * Gets the value of the numberRequested property.
     * 
     * @return
     *     possible object is
     *     {@link NumberType.NumberRequested }
     *     
     */
    public NumberType.NumberRequested getNumberRequested() {
        return numberRequested;
    }

    /**
     * Sets the value of the numberRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType.NumberRequested }
     *     
     */
    public void setNumberRequested(NumberType.NumberRequested value) {
        this.numberRequested = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.stormware.cz/schema/type.xsd>string10">
     *       &lt;attribute name="checkDuplicity" type="{http://www.stormware.cz/schema/type.xsd}boolean" default="true" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class NumberRequested {

        @XmlValue
        protected String value;
        @XmlAttribute
        protected Boolean checkDuplicity;

        /**
         * \u0158et\u011bzec o d�lce 10 znak\u016f.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the checkDuplicity property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean getCheckDuplicity() {
            if (checkDuplicity == null) {
                return Boolean.TRUE;
            } else {
                return checkDuplicity;
            }
        }

        /**
         * Sets the value of the checkDuplicity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckDuplicity(Boolean value) {
            this.checkDuplicity = value;
        }

    }

}
