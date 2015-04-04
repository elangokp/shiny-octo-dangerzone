
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getcoordofbenefitsdata_v1_0;

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
 *         &lt;element name="GetCoordOfBenefitsDataRequest">
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
 *                             &lt;element name="claimDetailLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCoordOfBenefitsDataRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetCoordOfBenefitsDataRequest", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
    protected EBSRequest.GetCoordOfBenefitsDataRequest getCoordOfBenefitsDataRequest;

    /**
     * Gets the value of the getCoordOfBenefitsDataRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetCoordOfBenefitsDataRequest }
     *     
     */
    public EBSRequest.GetCoordOfBenefitsDataRequest getGetCoordOfBenefitsDataRequest() {
        return getCoordOfBenefitsDataRequest;
    }

    /**
     * Sets the value of the getCoordOfBenefitsDataRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetCoordOfBenefitsDataRequest }
     *     
     */
    public void setGetCoordOfBenefitsDataRequest(EBSRequest.GetCoordOfBenefitsDataRequest value) {
        this.getCoordOfBenefitsDataRequest = value;
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
     *                   &lt;element name="claimDetailLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetCoordOfBenefitsDataRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
        protected EBSRequest.GetCoordOfBenefitsDataRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetCoordOfBenefitsDataRequest.StaticData }
         *     
         */
        public EBSRequest.GetCoordOfBenefitsDataRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetCoordOfBenefitsDataRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.GetCoordOfBenefitsDataRequest.StaticData value) {
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
         *         &lt;element name="claimDetailLevelIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimDetailLevelIndicator"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
            protected String claimNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
            protected String claimLineNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
            protected String claimRevisionNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getCoordOfBenefitsData-v1_0")
            protected String claimDetailLevelIndicator;

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
             * Gets the value of the claimDetailLevelIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimDetailLevelIndicator() {
                return claimDetailLevelIndicator;
            }

            /**
             * Sets the value of the claimDetailLevelIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimDetailLevelIndicator(String value) {
                this.claimDetailLevelIndicator = value;
            }

        }

    }

}
