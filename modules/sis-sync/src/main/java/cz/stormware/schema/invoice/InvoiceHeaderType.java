//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
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
import cz.stormware.schema.type.AccountType;
import cz.stormware.schema.type.AccountingType;
import cz.stormware.schema.type.Address;
import cz.stormware.schema.type.ClassificationVATType;
import cz.stormware.schema.type.LiquidationType;
import cz.stormware.schema.type.MyAddress;
import cz.stormware.schema.type.NumberType;
import cz.stormware.schema.type.ParameterDocType;
import cz.stormware.schema.type.PaymentType;
import cz.stormware.schema.type.RefType;


/**
 * <p>Java class for invoiceHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoiceHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.stormware.cz/schema/type.xsd}idType" minOccurs="0"/>
 *         &lt;element name="invoiceType" type="{http://www.stormware.cz/schema/invoice.xsd}invoiceTypeType"/>
 *         &lt;element name="sphereType" type="{http://www.stormware.cz/schema/invoice.xsd}sphereTypeType" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.stormware.cz/schema/type.xsd}numberType" minOccurs="0"/>
 *         &lt;element name="symVar" type="{http://www.stormware.cz/schema/type.xsd}symVarType" minOccurs="0"/>
 *         &lt;element name="originalDocument" type="{http://www.stormware.cz/schema/type.xsd}documentNumberType" minOccurs="0"/>
 *         &lt;element name="symPar" type="{http://www.stormware.cz/schema/type.xsd}symVarType" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateTax" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateAccounting" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dateDue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="accounting" type="{http://www.stormware.cz/schema/type.xsd}accountingType" minOccurs="0"/>
 *         &lt;element name="classificationVAT" type="{http://www.stormware.cz/schema/type.xsd}classificationVATType" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.stormware.cz/schema/type.xsd}string240"/>
 *         &lt;element name="partnerIdentity" type="{http://www.stormware.cz/schema/type.xsd}address" minOccurs="0"/>
 *         &lt;element name="myIdentity" type="{http://www.stormware.cz/schema/type.xsd}myAddress" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="numberOrder" type="{http://www.stormware.cz/schema/type.xsd}documentNumberType" minOccurs="0"/>
 *         &lt;element name="dateOrder" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="paymentType" type="{http://www.stormware.cz/schema/type.xsd}paymentType" minOccurs="0"/>
 *         &lt;element name="account" type="{http://www.stormware.cz/schema/type.xsd}accountType" minOccurs="0"/>
 *         &lt;element name="symConst" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="symSpec" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="paymentAccount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;group ref="{http://www.stormware.cz/schema/type.xsd}myGroupOfAccount"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="centre" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="contract" type="{http://www.stormware.cz/schema/type.xsd}refType" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liquidation" type="{http://www.stormware.cz/schema/type.xsd}liquidationType" minOccurs="0"/>
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
@XmlType(name = "invoiceHeaderType", propOrder = {
    "id",
    "invoiceType",
    "sphereType",
    "number",
    "symVar",
    "originalDocument",
    "symPar",
    "date",
    "dateTax",
    "dateAccounting",
    "dateDue",
    "accounting",
    "classificationVAT",
    "text",
    "partnerIdentity",
    "myIdentity",
    "order",
    "numberOrder",
    "dateOrder",
    "priceLevel",
    "paymentType",
    "account",
    "symConst",
    "symSpec",
    "paymentAccount",
    "centre",
    "activity",
    "contract",
    "note",
    "intNote",
    "liquidation",
    "parameter"
})
public class InvoiceHeaderType {

    protected BigInteger id;
    @XmlElement(required = true)
    protected InvoiceTypeType invoiceType;
    @XmlElement(defaultValue = "business")
    protected SphereTypeType sphereType;
    protected NumberType number;
    protected String symVar;
    protected String originalDocument;
    protected String symPar;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTax;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateAccounting;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDue;
    protected AccountingType accounting;
    protected ClassificationVATType classificationVAT;
    @XmlElement(required = true)
    protected String text;
    protected Address partnerIdentity;
    protected MyAddress myIdentity;
    protected RefType order;
    protected String numberOrder;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOrder;
    protected RefType priceLevel;
    protected PaymentType paymentType;
    protected AccountType account;
    protected String symConst;
    protected String symSpec;
    protected InvoiceHeaderType.PaymentAccount paymentAccount;
    protected RefType centre;
    protected RefType activity;
    protected RefType contract;
    protected String note;
    protected String intNote;
    protected LiquidationType liquidation;
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
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTypeType }
     *     
     */
    public InvoiceTypeType getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTypeType }
     *     
     */
    public void setInvoiceType(InvoiceTypeType value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the sphereType property.
     * 
     * @return
     *     possible object is
     *     {@link SphereTypeType }
     *     
     */
    public SphereTypeType getSphereType() {
        return sphereType;
    }

    /**
     * Sets the value of the sphereType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SphereTypeType }
     *     
     */
    public void setSphereType(SphereTypeType value) {
        this.sphereType = value;
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
     * Gets the value of the symVar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymVar() {
        return symVar;
    }

    /**
     * Sets the value of the symVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymVar(String value) {
        this.symVar = value;
    }

    /**
     * Gets the value of the originalDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDocument() {
        return originalDocument;
    }

    /**
     * Sets the value of the originalDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDocument(String value) {
        this.originalDocument = value;
    }

    /**
     * Gets the value of the symPar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymPar() {
        return symPar;
    }

    /**
     * Sets the value of the symPar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymPar(String value) {
        this.symPar = value;
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
     * Gets the value of the dateTax property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTax() {
        return dateTax;
    }

    /**
     * Sets the value of the dateTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTax(XMLGregorianCalendar value) {
        this.dateTax = value;
    }

    /**
     * Gets the value of the dateAccounting property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAccounting() {
        return dateAccounting;
    }

    /**
     * Sets the value of the dateAccounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAccounting(XMLGregorianCalendar value) {
        this.dateAccounting = value;
    }

    /**
     * Gets the value of the dateDue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDue() {
        return dateDue;
    }

    /**
     * Sets the value of the dateDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDue(XMLGregorianCalendar value) {
        this.dateDue = value;
    }

    /**
     * Gets the value of the accounting property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingType }
     *     
     */
    public AccountingType getAccounting() {
        return accounting;
    }

    /**
     * Sets the value of the accounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingType }
     *     
     */
    public void setAccounting(AccountingType value) {
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
     * Gets the value of the myIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link MyAddress }
     *     
     */
    public MyAddress getMyIdentity() {
        return myIdentity;
    }

    /**
     * Sets the value of the myIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyAddress }
     *     
     */
    public void setMyIdentity(MyAddress value) {
        this.myIdentity = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setOrder(RefType value) {
        this.order = value;
    }

    /**
     * Gets the value of the numberOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOrder() {
        return numberOrder;
    }

    /**
     * Sets the value of the numberOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOrder(String value) {
        this.numberOrder = value;
    }

    /**
     * Gets the value of the dateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOrder() {
        return dateOrder;
    }

    /**
     * Sets the value of the dateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOrder(XMLGregorianCalendar value) {
        this.dateOrder = value;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RefType }
     *     
     */
    public RefType getPriceLevel() {
        return priceLevel;
    }

    /**
     * Sets the value of the priceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefType }
     *     
     */
    public void setPriceLevel(RefType value) {
        this.priceLevel = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the symConst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymConst() {
        return symConst;
    }

    /**
     * Sets the value of the symConst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymConst(String value) {
        this.symConst = value;
    }

    /**
     * Gets the value of the symSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymSpec() {
        return symSpec;
    }

    /**
     * Sets the value of the symSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymSpec(String value) {
        this.symSpec = value;
    }

    /**
     * Gets the value of the paymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeaderType.PaymentAccount }
     *     
     */
    public InvoiceHeaderType.PaymentAccount getPaymentAccount() {
        return paymentAccount;
    }

    /**
     * Sets the value of the paymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeaderType.PaymentAccount }
     *     
     */
    public void setPaymentAccount(InvoiceHeaderType.PaymentAccount value) {
        this.paymentAccount = value;
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
     * Gets the value of the liquidation property.
     * 
     * @return
     *     possible object is
     *     {@link LiquidationType }
     *     
     */
    public LiquidationType getLiquidation() {
        return liquidation;
    }

    /**
     * Sets the value of the liquidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiquidationType }
     *     
     */
    public void setLiquidation(LiquidationType value) {
        this.liquidation = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;group ref="{http://www.stormware.cz/schema/type.xsd}myGroupOfAccount"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountNo",
        "bankCode"
    })
    public static class PaymentAccount {

        @XmlElement(namespace = "http://www.stormware.cz/schema/type.xsd", required = true)
        protected String accountNo;
        @XmlElement(namespace = "http://www.stormware.cz/schema/type.xsd", required = true)
        protected String bankCode;

        /**
         * Gets the value of the accountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNo() {
            return accountNo;
        }

        /**
         * Sets the value of the accountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNo(String value) {
            this.accountNo = value;
        }

        /**
         * Gets the value of the bankCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankCode() {
            return bankCode;
        }

        /**
         * Sets the value of the bankCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankCode(String value) {
            this.bankCode = value;
        }

    }

}
