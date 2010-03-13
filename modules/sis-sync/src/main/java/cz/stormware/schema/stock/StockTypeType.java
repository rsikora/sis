//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.stock;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stockTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stockTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="card"/>
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="service"/>
 *     &lt;enumeration value="package"/>
 *     &lt;enumeration value="set"/>
 *     &lt;enumeration value="product"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "stockTypeType")
@XmlEnum
public enum StockTypeType {


    /**
     * Karta.
     * 
     */
    @XmlEnumValue("card")
    CARD("card"),

    /**
     * Textov�.
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * Slu�ba.
     * 
     */
    @XmlEnumValue("service")
    SERVICE("service"),

    /**
     * Souprava.
     * 
     */
    @XmlEnumValue("package")
    PACKAGE("package"),

    /**
     * Komplet.
     * 
     */
    @XmlEnumValue("set")
    SET("set"),

    /**
     * V�robek.
     * 
     */
    @XmlEnumValue("product")
    PRODUCT("product");
    private final String value;

    StockTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockTypeType fromValue(String v) {
        for (StockTypeType c: StockTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
