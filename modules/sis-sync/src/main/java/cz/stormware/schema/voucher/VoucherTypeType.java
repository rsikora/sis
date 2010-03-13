//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.voucher;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for voucherTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="voucherTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="receipt"/>
 *     &lt;enumeration value="expense"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "voucherTypeType")
@XmlEnum
public enum VoucherTypeType {


    /**
     * P\u0159�jmov� doklad.
     * 
     */
    @XmlEnumValue("receipt")
    RECEIPT("receipt"),

    /**
     * V�dajov� doklad.
     * 
     */
    @XmlEnumValue("expense")
    EXPENSE("expense");
    private final String value;

    VoucherTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoucherTypeType fromValue(String v) {
        for (VoucherTypeType c: VoucherTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
