
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02;

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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Search_GeographicLocationRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Lctn" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "searchGeographicLocationRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "Search_GeographicLocationRequest")
    protected EBSRequest.SearchGeographicLocationRequest searchGeographicLocationRequest;

    /**
     * Gets the value of the searchGeographicLocationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchGeographicLocationRequest }
     *     
     */
    public EBSRequest.SearchGeographicLocationRequest getSearchGeographicLocationRequest() {
        return searchGeographicLocationRequest;
    }

    /**
     * Sets the value of the searchGeographicLocationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchGeographicLocationRequest }
     *     
     */
    public void setSearchGeographicLocationRequest(EBSRequest.SearchGeographicLocationRequest value) {
        this.searchGeographicLocationRequest = value;
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
     *         &lt;element name="Lctn" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "lctn"
    })
    public static class SearchGeographicLocationRequest {

        @XmlElement(name = "Lctn")
        protected EBSRequest.SearchGeographicLocationRequest.Lctn lctn;

        /**
         * Gets the value of the lctn property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchGeographicLocationRequest.Lctn }
         *     
         */
        public EBSRequest.SearchGeographicLocationRequest.Lctn getLctn() {
            return lctn;
        }

        /**
         * Sets the value of the lctn property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchGeographicLocationRequest.Lctn }
         *     
         */
        public void setLctn(EBSRequest.SearchGeographicLocationRequest.Lctn value) {
            this.lctn = value;
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
         *         &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "pstlCd",
            "ctyNm",
            "cntyCd",
            "stCd"
        })
        public static class Lctn {

            protected String pstlCd;
            protected String ctyNm;
            protected String cntyCd;
            protected String stCd;

            /**
             * Gets the value of the pstlCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPstlCd() {
                return pstlCd;
            }

            /**
             * Sets the value of the pstlCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPstlCd(String value) {
                this.pstlCd = value;
            }

            /**
             * Gets the value of the ctyNm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCtyNm() {
                return ctyNm;
            }

            /**
             * Sets the value of the ctyNm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCtyNm(String value) {
                this.ctyNm = value;
            }

            /**
             * Gets the value of the cntyCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCntyCd() {
                return cntyCd;
            }

            /**
             * Sets the value of the cntyCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCntyCd(String value) {
                this.cntyCd = value;
            }

            /**
             * Gets the value of the stCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStCd() {
                return stCd;
            }

            /**
             * Sets the value of the stCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStCd(String value) {
                this.stCd = value;
            }

        }

    }

}
