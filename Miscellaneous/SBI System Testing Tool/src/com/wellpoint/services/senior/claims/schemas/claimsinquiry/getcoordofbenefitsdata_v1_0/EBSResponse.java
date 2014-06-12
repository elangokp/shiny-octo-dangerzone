
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getcoordofbenefitsdata_v1_0;

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
 *         &lt;element name="GetCoordOfBenefitsDataResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DynamicData" maxOccurs="168" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsAllowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maximumOutOfPocketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsSavingsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierSubscriberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierMedicareLimitingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsOtherCarrierNonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsPrimacyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getCoordOfBenefitsDataResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetCoordOfBenefitsDataResponse")
    protected EBSResponse.GetCoordOfBenefitsDataResponse getCoordOfBenefitsDataResponse;

    /**
     * Gets the value of the getCoordOfBenefitsDataResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetCoordOfBenefitsDataResponse }
     *     
     */
    public EBSResponse.GetCoordOfBenefitsDataResponse getGetCoordOfBenefitsDataResponse() {
        return getCoordOfBenefitsDataResponse;
    }

    /**
     * Sets the value of the getCoordOfBenefitsDataResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetCoordOfBenefitsDataResponse }
     *     
     */
    public void setGetCoordOfBenefitsDataResponse(EBSResponse.GetCoordOfBenefitsDataResponse value) {
        this.getCoordOfBenefitsDataResponse = value;
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
     *         &lt;element name="DynamicData" maxOccurs="168" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsAllowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maximumOutOfPocketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsSavingsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierSubscriberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierMedicareLimitingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsOtherCarrierNonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsPrimacyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dynamicData"
    })
    public static class GetCoordOfBenefitsDataResponse {

        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.GetCoordOfBenefitsDataResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the dynamicData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDynamicData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetCoordOfBenefitsDataResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetCoordOfBenefitsDataResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetCoordOfBenefitsDataResponse.DynamicData>();
            }
            return this.dynamicData;
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
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsAllowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsAdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maximumOutOfPocketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsSavingsAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierSubscriberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierMedicareLimitingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierEmployerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsOtherCarrierNonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsPrimacyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimTypeCode",
            "coordinationOfBenefitsAllowedAmount",
            "coordinationOfBenefitsPaidAmount",
            "coordinationOfBenefitsAdjustmentAmount",
            "maximumOutOfPocketAmount",
            "coordinationOfBenefitsSavingsAmount",
            "coordinationOfBenefitsAppliedAmount",
            "itsOtherCarrierCoinsuranceAmount",
            "itsOtherCarrierSubscriberLiabilityAmount",
            "itsOtherCarrierMedicareLimitingAmount",
            "itsOtherCarrierDeductibleAmount",
            "providerDiscountAmount",
            "itsOtherCarrierEmployerName",
            "itsOtherCarrierNonCoveredAmount",
            "itsPrimacyIndicator"
        })
        public static class DynamicData {

            protected String claimNumber;
            protected String claimLineNumber;
            protected String claimTypeCode;
            protected String coordinationOfBenefitsAllowedAmount;
            protected String coordinationOfBenefitsPaidAmount;
            protected String coordinationOfBenefitsAdjustmentAmount;
            protected String maximumOutOfPocketAmount;
            protected String coordinationOfBenefitsSavingsAmount;
            protected String coordinationOfBenefitsAppliedAmount;
            protected String itsOtherCarrierCoinsuranceAmount;
            protected String itsOtherCarrierSubscriberLiabilityAmount;
            protected String itsOtherCarrierMedicareLimitingAmount;
            protected String itsOtherCarrierDeductibleAmount;
            protected String providerDiscountAmount;
            protected String itsOtherCarrierEmployerName;
            protected String itsOtherCarrierNonCoveredAmount;
            protected String itsPrimacyIndicator;

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
             * Gets the value of the coordinationOfBenefitsAllowedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsAllowedAmount() {
                return coordinationOfBenefitsAllowedAmount;
            }

            /**
             * Sets the value of the coordinationOfBenefitsAllowedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsAllowedAmount(String value) {
                this.coordinationOfBenefitsAllowedAmount = value;
            }

            /**
             * Gets the value of the coordinationOfBenefitsPaidAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsPaidAmount() {
                return coordinationOfBenefitsPaidAmount;
            }

            /**
             * Sets the value of the coordinationOfBenefitsPaidAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsPaidAmount(String value) {
                this.coordinationOfBenefitsPaidAmount = value;
            }

            /**
             * Gets the value of the coordinationOfBenefitsAdjustmentAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsAdjustmentAmount() {
                return coordinationOfBenefitsAdjustmentAmount;
            }

            /**
             * Sets the value of the coordinationOfBenefitsAdjustmentAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsAdjustmentAmount(String value) {
                this.coordinationOfBenefitsAdjustmentAmount = value;
            }

            /**
             * Gets the value of the maximumOutOfPocketAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumOutOfPocketAmount() {
                return maximumOutOfPocketAmount;
            }

            /**
             * Sets the value of the maximumOutOfPocketAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumOutOfPocketAmount(String value) {
                this.maximumOutOfPocketAmount = value;
            }

            /**
             * Gets the value of the coordinationOfBenefitsSavingsAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsSavingsAmount() {
                return coordinationOfBenefitsSavingsAmount;
            }

            /**
             * Sets the value of the coordinationOfBenefitsSavingsAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsSavingsAmount(String value) {
                this.coordinationOfBenefitsSavingsAmount = value;
            }

            /**
             * Gets the value of the coordinationOfBenefitsAppliedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsAppliedAmount() {
                return coordinationOfBenefitsAppliedAmount;
            }

            /**
             * Sets the value of the coordinationOfBenefitsAppliedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsAppliedAmount(String value) {
                this.coordinationOfBenefitsAppliedAmount = value;
            }

            /**
             * Gets the value of the itsOtherCarrierCoinsuranceAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierCoinsuranceAmount() {
                return itsOtherCarrierCoinsuranceAmount;
            }

            /**
             * Sets the value of the itsOtherCarrierCoinsuranceAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierCoinsuranceAmount(String value) {
                this.itsOtherCarrierCoinsuranceAmount = value;
            }

            /**
             * Gets the value of the itsOtherCarrierSubscriberLiabilityAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierSubscriberLiabilityAmount() {
                return itsOtherCarrierSubscriberLiabilityAmount;
            }

            /**
             * Sets the value of the itsOtherCarrierSubscriberLiabilityAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierSubscriberLiabilityAmount(String value) {
                this.itsOtherCarrierSubscriberLiabilityAmount = value;
            }

            /**
             * Gets the value of the itsOtherCarrierMedicareLimitingAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierMedicareLimitingAmount() {
                return itsOtherCarrierMedicareLimitingAmount;
            }

            /**
             * Sets the value of the itsOtherCarrierMedicareLimitingAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierMedicareLimitingAmount(String value) {
                this.itsOtherCarrierMedicareLimitingAmount = value;
            }

            /**
             * Gets the value of the itsOtherCarrierDeductibleAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierDeductibleAmount() {
                return itsOtherCarrierDeductibleAmount;
            }

            /**
             * Sets the value of the itsOtherCarrierDeductibleAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierDeductibleAmount(String value) {
                this.itsOtherCarrierDeductibleAmount = value;
            }

            /**
             * Gets the value of the providerDiscountAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderDiscountAmount() {
                return providerDiscountAmount;
            }

            /**
             * Sets the value of the providerDiscountAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderDiscountAmount(String value) {
                this.providerDiscountAmount = value;
            }

            /**
             * Gets the value of the itsOtherCarrierEmployerName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierEmployerName() {
                return itsOtherCarrierEmployerName;
            }

            /**
             * Sets the value of the itsOtherCarrierEmployerName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierEmployerName(String value) {
                this.itsOtherCarrierEmployerName = value;
            }

            /**
             * Gets the value of the itsOtherCarrierNonCoveredAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsOtherCarrierNonCoveredAmount() {
                return itsOtherCarrierNonCoveredAmount;
            }

            /**
             * Sets the value of the itsOtherCarrierNonCoveredAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsOtherCarrierNonCoveredAmount(String value) {
                this.itsOtherCarrierNonCoveredAmount = value;
            }

            /**
             * Gets the value of the itsPrimacyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsPrimacyIndicator() {
                return itsPrimacyIndicator;
            }

            /**
             * Sets the value of the itsPrimacyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsPrimacyIndicator(String value) {
                this.itsPrimacyIndicator = value;
            }

        }

    }

}
