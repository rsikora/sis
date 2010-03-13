//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataPackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataPackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transformation" type="{http://www.stormware.cz/schema/data.xsd}transformationType" minOccurs="0"/>
 *         &lt;element name="dataPackItem" type="{http://www.stormware.cz/schema/data.xsd}dataPackItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.stormware.cz/schema/data.xsd}dataPackVersionType" />
 *       &lt;attribute name="id" use="required" type="{http://www.stormware.cz/schema/type.xsd}string64" />
 *       &lt;attribute name="ico" use="required" type="{http://www.stormware.cz/schema/type.xsd}icoType" />
 *       &lt;attribute name="application" use="required" type="{http://www.stormware.cz/schema/type.xsd}string100" />
 *       &lt;attribute name="note" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataPackType", propOrder = {
    "transformation",
    "dataPackItem"
})
public class DataPackType {

    protected TransformationType transformation;
    @XmlElement(required = true)
    protected List<DataPackItemType> dataPackItem;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String ico;
    @XmlAttribute(required = true)
    protected String application;
    @XmlAttribute(required = true)
    protected String note;

    /**
     * Gets the value of the transformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransformationType }
     *     
     */
    public TransformationType getTransformation() {
        return transformation;
    }

    /**
     * Sets the value of the transformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformationType }
     *     
     */
    public void setTransformation(TransformationType value) {
        this.transformation = value;
    }

    /**
     * Gets the value of the dataPackItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataPackItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPackItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPackItemType }
     * 
     * 
     */
    public List<DataPackItemType> getDataPackItem() {
        if (dataPackItem == null) {
            dataPackItem = new ArrayList<DataPackItemType>();
        }
        return this.dataPackItem;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIco(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}