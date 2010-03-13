//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.parameter;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.type.Boolean;
import cz.stormware.schema.type.ParameterDataType;
import cz.stormware.schema.type.RefType;


/**
 * Definice voliteln�ho parametru.
 * 
 * <p>Java class for parameterDefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameterDefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.stormware.cz/schema/type.xsd}string32"/>
 *         &lt;element name="name" type="{http://www.stormware.cz/schema/type.xsd}string16"/>
 *         &lt;element name="type" type="{http://www.stormware.cz/schema/type.xsd}parameterDataType"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="list" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="use0" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="use1" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="use2" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="use3" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="use4" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="use5" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterDefType", propOrder = {
    "label",
    "name",
    "type",
    "length",
    "list",
    "use0",
    "use1",
    "use2",
    "use3",
    "use4",
    "use5"
})
public class ParameterDefType {

    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ParameterDataType type;
    protected BigInteger length;
    protected RefType list;
    @XmlElement(defaultValue = "false")
    protected Boolean use0;
    @XmlElement(defaultValue = "false")
    protected Boolean use1;
    @XmlElement(defaultValue = "false")
    protected Boolean use2;
    @XmlElement(defaultValue = "false")
    protected Boolean use3;
    @XmlElement(defaultValue = "false")
    protected Boolean use4;
    @XmlElement(defaultValue = "false")
    protected Boolean use5;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterDataType }
     *     
     */
    public ParameterDataType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterDataType }
     *     
     */
    public void setType(ParameterDataType value) {
        this.type = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
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

    /**
     * Gets the value of the use0 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse0() {
        return use0;
    }

    /**
     * Sets the value of the use0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse0(Boolean value) {
        this.use0 = value;
    }

    /**
     * Gets the value of the use1 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse1() {
        return use1;
    }

    /**
     * Sets the value of the use1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse1(Boolean value) {
        this.use1 = value;
    }

    /**
     * Gets the value of the use2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse2() {
        return use2;
    }

    /**
     * Sets the value of the use2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse2(Boolean value) {
        this.use2 = value;
    }

    /**
     * Gets the value of the use3 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse3() {
        return use3;
    }

    /**
     * Sets the value of the use3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse3(Boolean value) {
        this.use3 = value;
    }

    /**
     * Gets the value of the use4 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse4() {
        return use4;
    }

    /**
     * Sets the value of the use4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse4(Boolean value) {
        this.use4 = value;
    }

    /**
     * Gets the value of the use5 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUse5() {
        return use5;
    }

    /**
     * Sets the value of the use5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUse5(Boolean value) {
        this.use5 = value;
    }

}