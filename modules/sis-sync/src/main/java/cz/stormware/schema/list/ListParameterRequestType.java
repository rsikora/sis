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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listParameterRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listParameterRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="requestParameter" type="{http://www.stormware.cz/schema/list.xsd}requestParameterType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/list.xsd}listParameterRequestVerType" />
 *       &lt;attribute name="parameterVersion" use="required" type="{http://www.stormware.cz/schema/parameter.xsd}prmVersionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listParameterRequestType", propOrder = {
    "requestParameter"
})
public class ListParameterRequestType {

    protected List<RequestParameterType> requestParameter;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected String parameterVersion;

    /**
     * Gets the value of the requestParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestParameterType }
     * 
     * 
     */
    public List<RequestParameterType> getRequestParameter() {
        if (requestParameter == null) {
            requestParameter = new ArrayList<RequestParameterType>();
        }
        return this.requestParameter;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the parameterVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterVersion() {
        return parameterVersion;
    }

    /**
     * Sets the value of the parameterVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterVersion(String value) {
        this.parameterVersion = value;
    }

}
