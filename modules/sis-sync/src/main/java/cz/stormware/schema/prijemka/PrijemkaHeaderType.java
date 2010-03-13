//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.prijemka;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import cz.stormware.schema.type.Address;
import cz.stormware.schema.type.NumberType;
import cz.stormware.schema.type.ParameterDocType;
import cz.stormware.schema.type.RefType;


/**
 * <p>Java class for prijemkaHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prijemkaHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.stormware.cz/schema/type.xsd}idType" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.stormware.cz/schema/type.xsd}numberType" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="text" type="{http://www.stormware.cz/schema/type.xsd}string48"/>
 *         &lt;element name="partnerIdentity" type="{http://www.stormware.cz/schema/type.xsd}address" minOccurs="0"/>
 *         &lt;element name="centre" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://www.stormware.cz/schema/type.xsd}parameterDocType" maxOccurs="64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prijemkaHeaderType", propOrder = {
    "id",
    "number",
    "date",
    "text",
    "partnerIdentity",
    "centre",
    "activity",
    "contract",
    "note",
    "intNote",
    "parameter"
})
public class PrijemkaHeaderType {

    protected BigInteger id;
    protected NumberType number;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(required = true)
    protected String text;
    protected Address partnerIdentity;
    protected RefType centre;
    protected RefType activity;
    protected RefType contract;
    protected String note;
    protected String intNote;
    protected List<ParameterDocType> parameter;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link NumberType }
     *     
     */
    public NumberType getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberType }
     *     
     */
    public void setNumber(NumberType value) {
        this.number = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the partnerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPartnerIdentity() {
        return partnerIdentity;
    }

    /**
     * Sets the value of the partnerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPartnerIdentity(Address value) {
        this.partnerIdentity = value;
    }

    /**
     * Gets the value of the centre property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getCentre() {
        return centre;
    }

    /**
     * Sets the value of the centre property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setCentre(RefType value) {
        this.centre = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setActivity(RefType value) {
        this.activity = value;
    }

    /**
     * Gets the value of the contract property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getContract() {
        return contract;
    }

    /**
     * Sets the value of the contract property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setContract(RefType value) {
        this.contract = value;
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

    /**
     * Gets the value of the intNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntNote() {
        return intNote;
    }

    /**
     * Sets the value of the intNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntNote(String value) {
        this.intNote = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterDocType }
     * 
     * 
     */
    public List<ParameterDocType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ParameterDocType>();
        }
        return this.parameter;
    }

}
