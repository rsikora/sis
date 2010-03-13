//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.type;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ctrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ctrlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="text"/>
 *     &lt;enumeration value="push"/>
 *     &lt;enumeration value="link"/>
 *     &lt;enumeration value="group"/>
 *     &lt;enumeration value="rect"/>
 *     &lt;enumeration value="image"/>
 *     &lt;enumeration value="edit"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="pick"/>
 *     &lt;enumeration value="list"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ctrlType")
@XmlEnum
public enum CtrlType {


    /**
     * Popis.
     * 
     */
    @XmlEnumValue("text")
    TEXT("text"),

    /**
     * Tla\u010d�tko.
     * 
     */
    @XmlEnumValue("push")
    PUSH("push"),

    /**
     * Odkaz.
     * 
     */
    @XmlEnumValue("link")
    LINK("link"),

    /**
     * R�me\u010dek skupiny.
     * 
     */
    @XmlEnumValue("group")
    GROUP("group"),

    /**
     * R�me\u010dek.
     * 
     */
    @XmlEnumValue("rect")
    RECT("rect"),

    /**
     * Obr�zek.
     * 
     */
    @XmlEnumValue("image")
    IMAGE("image"),

    /**
     * Textov� pole.
     * 
     */
    @XmlEnumValue("edit")
    EDIT("edit"),

    /**
     * Za�krt�vac� pole.
     * 
     */
    @XmlEnumValue("check")
    CHECK("check"),

    /**
     * Datumov� pole.
     * 
     */
    @XmlEnumValue("pick")
    PICK("pick"),

    /**
     * Seznamov� pole.
     * 
     */
    @XmlEnumValue("list")
    LIST("list");
    private final String value;

    CtrlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CtrlType fromValue(String v) {
        for (CtrlType c: CtrlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
