//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.contract;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contractStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contractStateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="planned"/>
 *     &lt;enumeration value="opened"/>
 *     &lt;enumeration value="delivered"/>
 *     &lt;enumeration value="closed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contractStateType")
@XmlEnum
public enum ContractStateType {


    /**
     * Pl�novan� zak�zka.
     * 
     */
    @XmlEnumValue("planned")
    PLANNED("planned"),

    /**
     * Zah�jen� zak�zka.
     * 
     */
    @XmlEnumValue("opened")
    OPENED("opened"),

    /**
     * P\u0159edan� zak�zka.
     * 
     */
    @XmlEnumValue("delivered")
    DELIVERED("delivered"),

    /**
     * Uzav\u0159en� zak�zka.
     * 
     */
    @XmlEnumValue("closed")
    CLOSED("closed");
    private final String value;

    ContractStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContractStateType fromValue(String v) {
        for (ContractStateType c: ContractStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
