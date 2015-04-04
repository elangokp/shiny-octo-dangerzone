
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02;

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
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="Search_GeographicLocationResponse" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="LocationList" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SysInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchGeographicLocationResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "Search_GeographicLocationResponse", namespace = "")
    protected List<EBSResponse.SearchGeographicLocationResponse> searchGeographicLocationResponse;

    /**
     * Gets the value of the searchGeographicLocationResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchGeographicLocationResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchGeographicLocationResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSResponse.SearchGeographicLocationResponse }
     * 
     * 
     */
    public List<EBSResponse.SearchGeographicLocationResponse> getSearchGeographicLocationResponse() {
        if (searchGeographicLocationResponse == null) {
            searchGeographicLocationResponse = new ArrayList<EBSResponse.SearchGeographicLocationResponse>();
        }
        return this.searchGeographicLocationResponse;
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
     *         &lt;element name="LocationList" maxOccurs="100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SysInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "locationList",
        "sysInfo"
    })
    public static class SearchGeographicLocationResponse {

        @XmlElement(name = "LocationList", namespace = "")
        protected List<EBSResponse.SearchGeographicLocationResponse.LocationList> locationList;
        @XmlElement(name = "SysInfo", namespace = "")
        protected EBSResponse.SearchGeographicLocationResponse.SysInfo sysInfo;

        /**
         * Gets the value of the locationList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.SearchGeographicLocationResponse.LocationList }
         * 
         * 
         */
        public List<EBSResponse.SearchGeographicLocationResponse.LocationList> getLocationList() {
            if (locationList == null) {
                locationList = new ArrayList<EBSResponse.SearchGeographicLocationResponse.LocationList>();
            }
            return this.locationList;
        }

        /**
         * Gets the value of the sysInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchGeographicLocationResponse.SysInfo }
         *     
         */
        public EBSResponse.SearchGeographicLocationResponse.SysInfo getSysInfo() {
            return sysInfo;
        }

        /**
         * Sets the value of the sysInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchGeographicLocationResponse.SysInfo }
         *     
         */
        public void setSysInfo(EBSResponse.SearchGeographicLocationResponse.SysInfo value) {
            this.sysInfo = value;
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
         *         &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ctyNm",
            "cntyCd",
            "stCd",
            "pstlCd"
        })
        public static class LocationList {

            @XmlElement(namespace = "")
            protected String ctyNm;
            @XmlElement(namespace = "")
            protected String cntyCd;
            @XmlElement(namespace = "")
            protected String stCd;
            @XmlElement(namespace = "")
            protected String pstlCd;

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
         *         &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "srcSytmId"
        })
        public static class SysInfo {

            @XmlElement(namespace = "")
            protected String srcSytmId;

            /**
             * Gets the value of the srcSytmId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcSytmId() {
                return srcSytmId;
            }

            /**
             * Sets the value of the srcSytmId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcSytmId(String value) {
                this.srcSytmId = value;
            }

        }

    }

}
