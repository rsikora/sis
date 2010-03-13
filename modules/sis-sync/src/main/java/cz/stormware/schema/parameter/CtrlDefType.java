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
import cz.stormware.schema.type.CtrlType;
import cz.stormware.schema.type.Rectangle;


/**
 * Definice prvku formul�\u0159e.
 * 
 * <p>Java class for ctrlDefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctrlDefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.stormware.cz/schema/type.xsd}string16"/>
 *         &lt;element name="label" type="{http://www.stormware.cz/schema/type.xsd}string240"/>
 *         &lt;element name="rect" type="{http://www.stormware.cz/schema/type.xsd}rectangle"/>
 *         &lt;element name="type" type="{http://www.stormware.cz/schema/type.xsd}ctrlType"/>
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctrlDefType", propOrder = {
    "name",
    "label",
    "rect",
    "type",
    "style"
})
public class CtrlDefType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(required = true)
    protected Rectangle rect;
    @XmlElement(required = true)
    protected CtrlType type;
    @XmlElement(required = true)
    protected BigInteger style;

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
     * Gets the value of the rect property.
     * 
     * @return
     *     possible object is
     *     {@link Rectangle }
     *     
     */
    public Rectangle getRect() {
        return rect;
    }

    /**
     * Sets the value of the rect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectangle }
     *     
     */
    public void setRect(Rectangle value) {
        this.rect = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CtrlType }
     *     
     */
    public CtrlType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtrlType }
     *     
     */
    public void setType(CtrlType value) {
        this.type = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStyle(BigInteger value) {
        this.style = value;
    }

}