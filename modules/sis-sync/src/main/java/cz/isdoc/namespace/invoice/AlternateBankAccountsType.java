//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.isdoc.namespace.invoice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Kolekce dal��ch bankovn�ch �\u010dt\u016f, na kter� je mo�no tak�
 *         platit
 * 
 * <p>Java class for AlternateBankAccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateBankAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateBankAccount" type="{http://isdoc.cz/namespace/invoice}AlternateBankAccountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateBankAccountsType", propOrder = {
    "alternateBankAccount"
})
public class AlternateBankAccountsType {

    @XmlElement(name = "AlternateBankAccount", required = true)
    protected List<AlternateBankAccountType> alternateBankAccount;

    /**
     * Gets the value of the alternateBankAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateBankAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateBankAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateBankAccountType }
     * 
     * 
     */
    public List<AlternateBankAccountType> getAlternateBankAccount() {
        if (alternateBankAccount == null) {
            alternateBankAccount = new ArrayList<AlternateBankAccountType>();
        }
        return this.alternateBankAccount;
    }

}