//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.list;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import cz.stormware.schema.vydejka.VydejkaType;


/**
 * <p>Java class for listVydejkaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listVydejkaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.stormware.cz/schema/list.xsd}listVersionType">
 *       &lt;choice>
 *         &lt;element name="vydejka" type="{http://www.stormware.cz/schema/vydejka.xsd}vydejkaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listVydejkaType", propOrder = {
    "vydejka"
})
public class ListVydejkaType
    extends ListVersionType
{

    protected List<VydejkaType> vydejka;

    /**
     * Gets the value of the vydejka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vydejka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVydejka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VydejkaType }
     * 
     * 
     */
    public List<VydejkaType> getVydejka() {
        if (vydejka == null) {
            vydejka = new ArrayList<VydejkaType>();
        }
        return this.vydejka;
    }

}
