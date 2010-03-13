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
import cz.stormware.schema.category.CategoryDetailType;


/**
 * <p>Java class for listCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listCategoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.stormware.cz/schema/list.xsd}listVersionType">
 *       &lt;choice>
 *         &lt;element name="categoryDetail" type="{http://www.stormware.cz/schema/category.xsd}categoryDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCategoryType", propOrder = {
    "categoryDetail"
})
public class ListCategoryType
    extends ListVersionType
{

    protected List<CategoryDetailType> categoryDetail;

    /**
     * Gets the value of the categoryDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryDetailType }
     * 
     * 
     */
    public List<CategoryDetailType> getCategoryDetail() {
        if (categoryDetail == null) {
            categoryDetail = new ArrayList<CategoryDetailType>();
        }
        return this.categoryDetail;
    }

}