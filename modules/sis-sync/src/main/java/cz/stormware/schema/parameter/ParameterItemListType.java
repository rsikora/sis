//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.parameter;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Seznam definic voliteln�ch parametr\u016f. U b\u011b�n�ch agend je po\u010det programov\u011b omezen na 64, u�ivatelsk� agendy maj� maxim�ln\u011b 128 pol�.
 * 
 * <p>Java class for parameterItemListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parameterItemListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parameterDef" type="{http://www.stormware.cz/schema/parameter.xsd}parameterDefType" maxOccurs="128" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterItemListType", propOrder = {
    "parameterDef"
})
public class ParameterItemListType {

    protected List<ParameterDefType> parameterDef;

    /**
     * Gets the value of the parameterDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterDefType }
     * 
     * 
     */
    public List<ParameterDefType> getParameterDef() {
        if (parameterDef == null) {
            parameterDef = new ArrayList<ParameterDefType>();
        }
        return this.parameterDef;
    }

}