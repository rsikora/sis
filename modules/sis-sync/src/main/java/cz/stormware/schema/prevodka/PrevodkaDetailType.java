//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.prevodka;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prevodkaDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prevodkaDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="prevodkaItem" type="{http://www.stormware.cz/schema/prevodka.xsd}prevodkaItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prevodkaDetailType", propOrder = {
    "prevodkaItem"
})
public class PrevodkaDetailType {

    @XmlElement(required = true)
    protected List<PrevodkaItemType> prevodkaItem;

    /**
     * Gets the value of the prevodkaItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prevodkaItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrevodkaItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrevodkaItemType }
     * 
     * 
     */
    public List<PrevodkaItemType> getPrevodkaItem() {
        if (prevodkaItem == null) {
            prevodkaItem = new ArrayList<PrevodkaItemType>();
        }
        return this.prevodkaItem;
    }

}
