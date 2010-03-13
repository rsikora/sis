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
 * <p>Java class for discountValidityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="discountValidityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pernament"/>
 *     &lt;enumeration value="temporary"/>
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "discountValidityType")
@XmlEnum
public enum DiscountValidityType {


    /**
     * Trval�.
     * 
     */
    @XmlEnumValue("pernament")
    PERNAMENT("pernament"),

    /**
     * \u010casov\u011b omezen�.
     * 
     */
    @XmlEnumValue("temporary")
    TEMPORARY("temporary"),

    /**
     * Pozastaven�.
     * 
     */
    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    DiscountValidityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscountValidityType fromValue(String v) {
        for (DiscountValidityType c: DiscountValidityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}