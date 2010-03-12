//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 12:22:34 AM CET 
//


package cz.stormware.schema.addressbook;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.type.Boolean;
import cz.stormware.schema.type.ExtIdType;


/**
 * Pokud je u atributu nastavena hodnota actualize="false", prob\u011bhne kontrola duplicity podle n�sleduj�c�ch pol�. Pokud 
 * 					bude nalezena duplicita, doklad se nenaimportuje.
 * 					Pokud je nastavewna hodnota actualize="true", provede se aktualizace z�znamu v adres�\u0159i dle zadan�ch hodnot v XML. Podle n�sleduj�c� 
 * 					z�znam\u016f se vyfiltruje z�znam pro �pravu.
 * 
 * <p>Java class for duplicityFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="duplicityFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="id" type="{http://www.stormware.cz/schema/type.xsd}idType" minOccurs="0"/>
 *         &lt;element name="extId" type="{http://www.stormware.cz/schema/type.xsd}extIdType" minOccurs="0"/>
 *         &lt;element name="fieldFirma" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldJmeno" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldObec" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldPSC" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldICO" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldDIC" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="fieldNumber" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="actualize" type="{http://www.stormware.cz/schema/type.xsd}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "duplicityFieldsType", propOrder = {

})
public class DuplicityFieldsType {

    protected BigInteger id;
    protected ExtIdType extId;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldFirma;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldJmeno;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldObec;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldPSC;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldICO;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldDIC;
    @XmlElement(defaultValue = "false")
    protected Boolean fieldNumber;
    @XmlAttribute
    protected Boolean actualize;

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
     * Gets the value of the extId property.
     * 
     * @return
     *     possible object is
     *     {@link ExtIdType }
     *     
     */
    public ExtIdType getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtIdType }
     *     
     */
    public void setExtId(ExtIdType value) {
        this.extId = value;
    }

    /**
     * Gets the value of the fieldFirma property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldFirma() {
        return fieldFirma;
    }

    /**
     * Sets the value of the fieldFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldFirma(Boolean value) {
        this.fieldFirma = value;
    }

    /**
     * Gets the value of the fieldJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldJmeno() {
        return fieldJmeno;
    }

    /**
     * Sets the value of the fieldJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldJmeno(Boolean value) {
        this.fieldJmeno = value;
    }

    /**
     * Gets the value of the fieldObec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldObec() {
        return fieldObec;
    }

    /**
     * Sets the value of the fieldObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldObec(Boolean value) {
        this.fieldObec = value;
    }

    /**
     * Gets the value of the fieldPSC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldPSC() {
        return fieldPSC;
    }

    /**
     * Sets the value of the fieldPSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldPSC(Boolean value) {
        this.fieldPSC = value;
    }

    /**
     * Gets the value of the fieldICO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldICO() {
        return fieldICO;
    }

    /**
     * Sets the value of the fieldICO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldICO(Boolean value) {
        this.fieldICO = value;
    }

    /**
     * Gets the value of the fieldDIC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldDIC() {
        return fieldDIC;
    }

    /**
     * Sets the value of the fieldDIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldDIC(Boolean value) {
        this.fieldDIC = value;
    }

    /**
     * Gets the value of the fieldNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFieldNumber() {
        return fieldNumber;
    }

    /**
     * Sets the value of the fieldNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFieldNumber(Boolean value) {
        this.fieldNumber = value;
    }

    /**
     * Gets the value of the actualize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getActualize() {
        if (actualize == null) {
            return Boolean.FALSE;
        } else {
            return actualize;
        }
    }

    /**
     * Sets the value of the actualize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActualize(Boolean value) {
        this.actualize = value;
    }

}
