
package com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="EBSException" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="exceptionUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exceptionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exceptionSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exceptionDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="logicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "ebsException"
})
@XmlRootElement(name = "EBSExceptions")
public class EBSExceptions {

    @XmlElement(name = "EBSException", namespace = "")
    protected List<EBSExceptions.EBSException> ebsException;

    /**
     * Gets the value of the ebsException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebsException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBSException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSExceptions.EBSException }
     * 
     * 
     */
    public List<EBSExceptions.EBSException> getEBSException() {
        if (ebsException == null) {
            ebsException = new ArrayList<EBSExceptions.EBSException>();
        }
        return this.ebsException;
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="exceptionUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exceptionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exceptionSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exceptionDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exceptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="logicalSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "exceptionUUID",
        "component",
        "technology",
        "exceptionTimestamp",
        "exceptionSeverity",
        "exceptionDetail",
        "exceptionCode",
        "logicalSystemName"
    })
    public static class EBSException {

        @XmlElement(namespace = "")
        protected String exceptionUUID;
        @XmlElement(namespace = "")
        protected String component;
        @XmlElement(namespace = "")
        protected String technology;
        @XmlElement(namespace = "")
        protected String exceptionTimestamp;
        @XmlElement(namespace = "")
        protected String exceptionSeverity;
        @XmlElement(namespace = "")
        protected String exceptionDetail;
        @XmlElement(namespace = "")
        protected String exceptionCode;
        @XmlElement(namespace = "")
        protected String logicalSystemName;

        /**
         * Gets the value of the exceptionUUID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionUUID() {
            return exceptionUUID;
        }

        /**
         * Sets the value of the exceptionUUID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionUUID(String value) {
            this.exceptionUUID = value;
        }

        /**
         * Gets the value of the component property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComponent() {
            return component;
        }

        /**
         * Sets the value of the component property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComponent(String value) {
            this.component = value;
        }

        /**
         * Gets the value of the technology property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnology() {
            return technology;
        }

        /**
         * Sets the value of the technology property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnology(String value) {
            this.technology = value;
        }

        /**
         * Gets the value of the exceptionTimestamp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionTimestamp() {
            return exceptionTimestamp;
        }

        /**
         * Sets the value of the exceptionTimestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionTimestamp(String value) {
            this.exceptionTimestamp = value;
        }

        /**
         * Gets the value of the exceptionSeverity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionSeverity() {
            return exceptionSeverity;
        }

        /**
         * Sets the value of the exceptionSeverity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionSeverity(String value) {
            this.exceptionSeverity = value;
        }

        /**
         * Gets the value of the exceptionDetail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionDetail() {
            return exceptionDetail;
        }

        /**
         * Sets the value of the exceptionDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionDetail(String value) {
            this.exceptionDetail = value;
        }

        /**
         * Gets the value of the exceptionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExceptionCode() {
            return exceptionCode;
        }

        /**
         * Sets the value of the exceptionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExceptionCode(String value) {
            this.exceptionCode = value;
        }

        /**
         * Gets the value of the logicalSystemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLogicalSystemName() {
            return logicalSystemName;
        }

        /**
         * Sets the value of the logicalSystemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLogicalSystemName(String value) {
            this.logicalSystemName = value;
        }

    }

}
