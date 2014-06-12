
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimseobdetaillegacy_v1_0;

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
 *         &lt;element name="GetClaimsEOBDetailExRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
    "getClaimsEOBDetailExRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetClaimsEOBDetailExRequest")
    protected EBSRequest.GetClaimsEOBDetailExRequest getClaimsEOBDetailExRequest;

    /**
     * Gets the value of the getClaimsEOBDetailExRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetClaimsEOBDetailExRequest }
     *     
     */
    public EBSRequest.GetClaimsEOBDetailExRequest getGetClaimsEOBDetailExRequest() {
        return getClaimsEOBDetailExRequest;
    }

    /**
     * Sets the value of the getClaimsEOBDetailExRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetClaimsEOBDetailExRequest }
     *     
     */
    public void setGetClaimsEOBDetailExRequest(EBSRequest.GetClaimsEOBDetailExRequest value) {
        this.getClaimsEOBDetailExRequest = value;
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
     *         &lt;element name="StaticData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData"
    })
    public static class GetClaimsEOBDetailExRequest {

        @XmlElement(name = "StaticData")
        protected EBSRequest.GetClaimsEOBDetailExRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetClaimsEOBDetailExRequest.StaticData }
         *     
         */
        public EBSRequest.GetClaimsEOBDetailExRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetClaimsEOBDetailExRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.GetClaimsEOBDetailExRequest.StaticData value) {
            this.staticData = value;
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
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimNumber",
            "claimLineNumber",
            "claimRevisionNumber",
            "claimTypeCode",
            "nextPage"
        })
        public static class StaticData {

            protected String claimNumber;
            protected String claimLineNumber;
            protected String claimRevisionNumber;
            protected String claimTypeCode;
            @XmlElement(name = "NextPage")
            protected EBSRequest.GetClaimsEOBDetailExRequest.StaticData.NextPage nextPage;

            /**
             * Gets the value of the claimNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimNumber() {
                return claimNumber;
            }

            /**
             * Sets the value of the claimNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimNumber(String value) {
                this.claimNumber = value;
            }

            /**
             * Gets the value of the claimLineNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineNumber() {
                return claimLineNumber;
            }

            /**
             * Sets the value of the claimLineNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineNumber(String value) {
                this.claimLineNumber = value;
            }

            /**
             * Gets the value of the claimRevisionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRevisionNumber() {
                return claimRevisionNumber;
            }

            /**
             * Sets the value of the claimRevisionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRevisionNumber(String value) {
                this.claimRevisionNumber = value;
            }

            /**
             * Gets the value of the claimTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeCode() {
                return claimTypeCode;
            }

            /**
             * Sets the value of the claimTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeCode(String value) {
                this.claimTypeCode = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.GetClaimsEOBDetailExRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.GetClaimsEOBDetailExRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.GetClaimsEOBDetailExRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.GetClaimsEOBDetailExRequest.StaticData.NextPage value) {
                this.nextPage = value;
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
             *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimNumber",
                "claimLineNumber",
                "claimRevisionNumber",
                "claimTypeCode",
                "serviceStartDate",
                "claimTypeofServiceSorCodeDescriptionText"
            })
            public static class NextPage {

                protected String claimNumber;
                protected String claimLineNumber;
                protected String claimRevisionNumber;
                protected String claimTypeCode;
                protected String serviceStartDate;
                protected String claimTypeofServiceSorCodeDescriptionText;

                /**
                 * Gets the value of the claimNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimNumber() {
                    return claimNumber;
                }

                /**
                 * Sets the value of the claimNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimNumber(String value) {
                    this.claimNumber = value;
                }

                /**
                 * Gets the value of the claimLineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineNumber() {
                    return claimLineNumber;
                }

                /**
                 * Sets the value of the claimLineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineNumber(String value) {
                    this.claimLineNumber = value;
                }

                /**
                 * Gets the value of the claimRevisionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimRevisionNumber() {
                    return claimRevisionNumber;
                }

                /**
                 * Sets the value of the claimRevisionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimRevisionNumber(String value) {
                    this.claimRevisionNumber = value;
                }

                /**
                 * Gets the value of the claimTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimTypeCode() {
                    return claimTypeCode;
                }

                /**
                 * Sets the value of the claimTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimTypeCode(String value) {
                    this.claimTypeCode = value;
                }

                /**
                 * Gets the value of the serviceStartDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceStartDate() {
                    return serviceStartDate;
                }

                /**
                 * Sets the value of the serviceStartDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceStartDate(String value) {
                    this.serviceStartDate = value;
                }

                /**
                 * Gets the value of the claimTypeofServiceSorCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimTypeofServiceSorCodeDescriptionText() {
                    return claimTypeofServiceSorCodeDescriptionText;
                }

                /**
                 * Sets the value of the claimTypeofServiceSorCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimTypeofServiceSorCodeDescriptionText(String value) {
                    this.claimTypeofServiceSorCodeDescriptionText = value;
                }

            }

        }

    }

}
