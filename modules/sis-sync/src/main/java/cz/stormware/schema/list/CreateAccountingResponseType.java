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
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.type.StavType2;


/**
 * <p>Java class for createAccountingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAccountingResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.stormware.cz/schema/list.xsd}itemAccountingTypeDoubleEntry">
 *       &lt;attribute name="state" use="required" type="{http://www.stormware.cz/schema/type.xsd}stavType2" />
 *       &lt;attribute name="note" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAccountingResponseType")
public class CreateAccountingResponseType
    extends ItemAccountingTypeDoubleEntry
{

    @XmlAttribute(required = true)
    protected StavType2 state;
    @XmlAttribute
    protected String note;

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

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}