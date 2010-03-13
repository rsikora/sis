//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.list;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agendaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agendaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cashReceived"/>
 *     &lt;enumeration value="cashPaid"/>
 *     &lt;enumeration value="internalDocument"/>
 *     &lt;enumeration value="issuedInvoice"/>
 *     &lt;enumeration value="issuedAdvanceInvoice"/>
 *     &lt;enumeration value="claim"/>
 *     &lt;enumeration value="receivedInvoice"/>
 *     &lt;enumeration value="receivedAdvanceInvoice"/>
 *     &lt;enumeration value="commitment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agendaType")
@XmlEnum
public enum AgendaType {


    /**
     * Pokladna p\u0159�jem.
     * 
     */
    @XmlEnumValue("cashReceived")
    CASH_RECEIVED("cashReceived"),

    /**
     * Pokladna v�dej.
     * 
     */
    @XmlEnumValue("cashPaid")
    CASH_PAID("cashPaid"),

    /**
     * Intern� doklady.
     * 
     */
    @XmlEnumValue("internalDocument")
    INTERNAL_DOCUMENT("internalDocument"),

    /**
     * Vydan� faktury.
     * 
     */
    @XmlEnumValue("issuedInvoice")
    ISSUED_INVOICE("issuedInvoice"),

    /**
     * Vydan� z�lohov� faktury.
     * 
     */
    @XmlEnumValue("issuedAdvanceInvoice")
    ISSUED_ADVANCE_INVOICE("issuedAdvanceInvoice"),

    /**
     * Ostatn� pohled�vky.
     * 
     */
    @XmlEnumValue("claim")
    CLAIM("claim"),

    /**
     * P\u0159ijat� faktury.
     * 
     */
    @XmlEnumValue("receivedInvoice")
    RECEIVED_INVOICE("receivedInvoice"),

    /**
     * P\u0159ijat� z�lohov� faktury.
     * 
     */
    @XmlEnumValue("receivedAdvanceInvoice")
    RECEIVED_ADVANCE_INVOICE("receivedAdvanceInvoice"),

    /**
     * Ostatn� z�vazky.
     * 
     */
    @XmlEnumValue("commitment")
    COMMITMENT("commitment");
    private final String value;

    AgendaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgendaType fromValue(String v) {
        for (AgendaType c: AgendaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}