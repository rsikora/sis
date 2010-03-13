//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.13 at 11:47:26 PM CET 
//


package cz.stormware.schema.productupdate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="Product">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="versionbuild" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="versionrevision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="versionletter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="versiondate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ids" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "product"
})
@XmlRootElement(name = "Products")
public class Products {

    @XmlElement(name = "Product", required = true)
    protected List<Products.Product> product;

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Products.Product }
     * 
     * 
     */
    public List<Products.Product> getProduct() {
        if (product == null) {
            product = new ArrayList<Products.Product>();
        }
        return this.product;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="versionbuild" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="versionrevision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="versionletter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="versiondate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ids" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "url",
        "version",
        "versionbuild",
        "versionrevision",
        "versionletter",
        "versiondate",
        "hash",
        "activated"
    })
    public static class Product {

        @XmlElement(required = true)
        protected String url;
        @XmlElement(required = true)
        protected String version;
        @XmlElement(required = true)
        protected String versionbuild;
        @XmlElement(required = true)
        protected String versionrevision;
        protected String versionletter;
        @XmlElement(required = true)
        protected String versiondate;
        @XmlElement(required = true)
        protected String hash;
        protected long activated;
        @XmlAttribute(required = true)
        protected String ids;

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
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
         * Gets the value of the versionbuild property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersionbuild() {
            return versionbuild;
        }

        /**
         * Sets the value of the versionbuild property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersionbuild(String value) {
            this.versionbuild = value;
        }

        /**
         * Gets the value of the versionrevision property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersionrevision() {
            return versionrevision;
        }

        /**
         * Sets the value of the versionrevision property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersionrevision(String value) {
            this.versionrevision = value;
        }

        /**
         * Gets the value of the versionletter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersionletter() {
            return versionletter;
        }

        /**
         * Sets the value of the versionletter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersionletter(String value) {
            this.versionletter = value;
        }

        /**
         * Gets the value of the versiondate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersiondate() {
            return versiondate;
        }

        /**
         * Sets the value of the versiondate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersiondate(String value) {
            this.versiondate = value;
        }

        /**
         * Gets the value of the hash property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHash() {
            return hash;
        }

        /**
         * Sets the value of the hash property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHash(String value) {
            this.hash = value;
        }

        /**
         * Gets the value of the activated property.
         * 
         */
        public long getActivated() {
            return activated;
        }

        /**
         * Sets the value of the activated property.
         * 
         */
        public void setActivated(long value) {
            this.activated = value;
        }

        /**
         * Gets the value of the ids property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIds() {
            return ids;
        }

        /**
         * Sets the value of the ids property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIds(String value) {
            this.ids = value;
        }

    }

}