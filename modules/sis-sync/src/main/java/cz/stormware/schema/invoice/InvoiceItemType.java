//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 12:22:34 AM CET 
//


package cz.stormware.schema.invoice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import cz.stormware.schema.type.Boolean;
import cz.stormware.schema.type.ClassificationVATType;
import cz.stormware.schema.type.GuaranteeTypeType;
import cz.stormware.schema.type.ParameterDocType;
import cz.stormware.schema.type.RefType;
import cz.stormware.schema.type.StockItemType;
import cz.stormware.schema.type.TypeCurrencyForeignItem;
import cz.stormware.schema.type.TypeCurrencyHomeItem;
import cz.stormware.schema.type.VatRateType;


/**
 * <p>Java class for invoiceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoiceItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.stormware.cz/schema/type.xsd}string90" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.stormware.cz/schema/type.xsd}unitType" minOccurs="0"/>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="payVAT" type="{http://www.stormware.cz/schema/type.xsd}boolean" minOccurs="0"/>
 *         &lt;element name="rateVAT" type="{http://www.stormware.cz/schema/type.xsd}vatRateType" minOccurs="0"/>
 *         &lt;element name="discountPercentage" type="{http://www.stormware.cz/schema/type.xsd}typePercentage" minOccurs="0"/>
 *         &lt;element name="homeCurrency" type="{http://www.stormware.cz/schema/type.xsd}typeCurrencyHomeItem" minOccurs="0"/>
 *         &lt;element name="foreignCurrency" type="{http://www.stormware.cz/schema/type.xsd}typeCurrencyForeignItem" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.stormware.cz/schema/type.xsd}string90" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.stormware.cz/schema/type.xsd}stockIdsType" minOccurs="0"/>
 *         &lt;element name="guarantee" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="guaranteeType" type="{http://www.stormware.cz/schema/type.xsd}guaranteeTypeType" minOccurs="0"/>
 *         &lt;element name="stockItem" type="{http://www.stormware.cz/schema/type.xsd}stockItemType" minOccurs="0"/>
 *         &lt;element name="accounting" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="classificationVAT" type="{http://www.stormware.cz/schema/type.xsd}classificationVATType" minOccurs="0"/>
 *         &lt;element name="centre" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "invoiceItemType", propOrder = {
    "text",
    "quantity",
    "unit",
    "coefficient",
    "payVAT",
    "rateVAT",
    "discountPercentage",
    "homeCurrency",
    "foreignCurrency",
    "note",
    "code",
    "guarantee",
    "guaranteeType",
    "stockItem",
    "accounting",
    "classificationVAT",
    "centre",
    "activity",
    "contract",
    "expirationDate",
    "parameter"
})
public class InvoiceItemType {

    protected String text;
    protected Float quantity;
    protected String unit;
    @XmlElement(defaultValue = "1.0")
    protected Float coefficient;
    @XmlElement(defaultValue = "false")
    protected Boolean payVAT;
    @XmlElement(defaultValue = "none")
    protected VatRateType rateVAT;
    @XmlElement(defaultValue = "0")
    protected Float discountPercentage;
    protected TypeCurrencyHomeItem homeCurrency;
    protected TypeCurrencyForeignItem foreignCurrency;
    protected String note;
    protected String code;
    protected BigInteger guarantee;
    protected GuaranteeTypeType guaranteeType;
    protected StockItemType stockItem;
    protected RefType accounting;
    protected ClassificationVATType classificationVAT;
    protected RefType centre;
    protected RefType activity;
    protected RefType contract;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    protected List<ParameterDocType> parameter;

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
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the coefficient property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCoefficient() {
        return coefficient;
    }

    /**
     * Sets the value of the coefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCoefficient(Float value) {
        this.coefficient = value;
    }

    /**
     * Gets the value of the payVAT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPayVAT() {
        return payVAT;
    }

    /**
     * Sets the value of the payVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayVAT(Boolean value) {
        this.payVAT = value;
    }

    /**
     * Gets the value of the rateVAT property.
     * 
     * @return
     *     possible object is
     *     {@link VatRateType }
     *     
     */
    public VatRateType getRateVAT() {
        return rateVAT;
    }

    /**
     * Sets the value of the rateVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatRateType }
     *     
     */
    public void setRateVAT(VatRateType value) {
        this.rateVAT = value;
    }

    /**
     * Gets the value of the discountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDiscountPercentage() {
        return discountPercentage;
    }

    /**
     * Sets the value of the discountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDiscountPercentage(Float value) {
        this.discountPercentage = value;
    }

    /**
     * Gets the value of the homeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrencyHomeItem }
     *     
     */
    public TypeCurrencyHomeItem getHomeCurrency() {
        return homeCurrency;
    }

    /**
     * Sets the value of the homeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrencyHomeItem }
     *     
     */
    public void setHomeCurrency(TypeCurrencyHomeItem value) {
        this.homeCurrency = value;
    }

    /**
     * Gets the value of the foreignCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCurrencyForeignItem }
     *     
     */
    public TypeCurrencyForeignItem getForeignCurrency() {
        return foreignCurrency;
    }

    /**
     * Sets the value of the foreignCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCurrencyForeignItem }
     *     
     */
    public void setForeignCurrency(TypeCurrencyForeignItem value) {
        this.foreignCurrency = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the guarantee property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGuarantee() {
        return guarantee;
    }

    /**
     * Sets the value of the guarantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGuarantee(BigInteger value) {
        this.guarantee = value;
    }

    /**
     * Gets the value of the guaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeTypeType }
     *     
     */
    public GuaranteeTypeType getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * Sets the value of the guaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeTypeType }
     *     
     */
    public void setGuaranteeType(GuaranteeTypeType value) {
        this.guaranteeType = value;
    }

    /**
     * Gets the value of the stockItem property.
     * 
     * @return
     *     possible object is
     *     {@link StockItemType }
     *     
     */
    public StockItemType getStockItem() {
        return stockItem;
    }

    /**
     * Sets the value of the stockItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockItemType }
     *     
     */
    public void setStockItem(StockItemType value) {
        this.stockItem = value;
    }

    /**
     * Gets the value of the accounting property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getAccounting() {
        return accounting;
    }

    /**
     * Sets the value of the accounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setAccounting(RefType value) {
        this.accounting = value;
    }

    /**
     * Gets the value of the classificationVAT property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationVATType }
     *     
     */
    public ClassificationVATType getClassificationVAT() {
        return classificationVAT;
    }

    /**
     * Sets the value of the classificationVAT property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationVATType }
     *     
     */
    public void setClassificationVAT(ClassificationVATType value) {
        this.classificationVAT = value;
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
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
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
