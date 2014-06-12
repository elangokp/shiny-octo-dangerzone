
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimsresponsibility_v1_0;

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
 *         &lt;element name="Get_ClaimsResponsibilityResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerContractAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="finalClaimDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Federal" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="State" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="interestCalculationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="paneltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="interestRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimsResponsibilityResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "Get_ClaimsResponsibilityResponse", required = true)
    protected EBSResponse.GetClaimsResponsibilityResponse getClaimsResponsibilityResponse;

    /**
     * Gets the value of the getClaimsResponsibilityResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsResponsibilityResponse }
     *     
     */
    public EBSResponse.GetClaimsResponsibilityResponse getGetClaimsResponsibilityResponse() {
        return getClaimsResponsibilityResponse;
    }

    /**
     * Sets the value of the getClaimsResponsibilityResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsResponsibilityResponse }
     *     
     */
    public void setGetClaimsResponsibilityResponse(EBSResponse.GetClaimsResponsibilityResponse value) {
        this.getClaimsResponsibilityResponse = value;
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
     *                 &lt;sequence>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerContractAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="finalClaimDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Federal" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="State" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="interestCalculationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="paneltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="interestRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetClaimsResponsibilityResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimsResponsibilityResponse.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimsResponsibilityResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsResponsibilityResponse.StaticData value) {
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
         *       &lt;sequence>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerContractAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="finalClaimDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Federal" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="State" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="interestCalculationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="paneltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="interestRatePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimResponsibilityPopUpLinkIndicator",
            "memberLiabilityAmount",
            "providerDiscountAmount",
            "providerContractAmount",
            "finalClaimDate",
            "federal",
            "state",
            "interestDaysQuantity",
            "interestRatePercentage"
        })
        public static class StaticData {

            protected String claimNumber;
            protected String claimResponsibilityPopUpLinkIndicator;
            protected String memberLiabilityAmount;
            protected String providerDiscountAmount;
            protected String providerContractAmount;
            protected String finalClaimDate;
            @XmlElement(name = "Federal")
            protected EBSResponse.GetClaimsResponsibilityResponse.StaticData.Federal federal;
            @XmlElement(name = "State")
            protected EBSResponse.GetClaimsResponsibilityResponse.StaticData.State state;
            protected String interestDaysQuantity;
            protected String interestRatePercentage;

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
             * Gets the value of the claimResponsibilityPopUpLinkIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimResponsibilityPopUpLinkIndicator() {
                return claimResponsibilityPopUpLinkIndicator;
            }

            /**
             * Sets the value of the claimResponsibilityPopUpLinkIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimResponsibilityPopUpLinkIndicator(String value) {
                this.claimResponsibilityPopUpLinkIndicator = value;
            }

            /**
             * Gets the value of the memberLiabilityAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLiabilityAmount() {
                return memberLiabilityAmount;
            }

            /**
             * Sets the value of the memberLiabilityAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLiabilityAmount(String value) {
                this.memberLiabilityAmount = value;
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
             * Gets the value of the providerContractAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderContractAmount() {
                return providerContractAmount;
            }

            /**
             * Sets the value of the providerContractAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderContractAmount(String value) {
                this.providerContractAmount = value;
            }

            /**
             * Gets the value of the finalClaimDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinalClaimDate() {
                return finalClaimDate;
            }

            /**
             * Sets the value of the finalClaimDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinalClaimDate(String value) {
                this.finalClaimDate = value;
            }

            /**
             * Gets the value of the federal property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData.Federal }
             *     
             */
            public EBSResponse.GetClaimsResponsibilityResponse.StaticData.Federal getFederal() {
                return federal;
            }

            /**
             * Sets the value of the federal property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData.Federal }
             *     
             */
            public void setFederal(EBSResponse.GetClaimsResponsibilityResponse.StaticData.Federal value) {
                this.federal = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData.State }
             *     
             */
            public EBSResponse.GetClaimsResponsibilityResponse.StaticData.State getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsResponsibilityResponse.StaticData.State }
             *     
             */
            public void setState(EBSResponse.GetClaimsResponsibilityResponse.StaticData.State value) {
                this.state = value;
            }

            /**
             * Gets the value of the interestDaysQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestDaysQuantity() {
                return interestDaysQuantity;
            }

            /**
             * Sets the value of the interestDaysQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestDaysQuantity(String value) {
                this.interestDaysQuantity = value;
            }

            /**
             * Gets the value of the interestRatePercentage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestRatePercentage() {
                return interestRatePercentage;
            }

            /**
             * Sets the value of the interestRatePercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestRatePercentage(String value) {
                this.interestRatePercentage = value;
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
             *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "interestAmount"
            })
            public static class Federal {

                protected String interestAmount;

                /**
                 * Gets the value of the interestAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterestAmount() {
                    return interestAmount;
                }

                /**
                 * Sets the value of the interestAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterestAmount(String value) {
                    this.interestAmount = value;
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
             *         &lt;element name="interestCalculationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="paneltyAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "interestCalculationCode",
                "interestAmount",
                "paneltyAmount"
            })
            public static class State {

                protected String interestCalculationCode;
                protected String interestAmount;
                protected String paneltyAmount;

                /**
                 * Gets the value of the interestCalculationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterestCalculationCode() {
                    return interestCalculationCode;
                }

                /**
                 * Sets the value of the interestCalculationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterestCalculationCode(String value) {
                    this.interestCalculationCode = value;
                }

                /**
                 * Gets the value of the interestAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInterestAmount() {
                    return interestAmount;
                }

                /**
                 * Sets the value of the interestAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInterestAmount(String value) {
                    this.interestAmount = value;
                }

                /**
                 * Gets the value of the paneltyAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaneltyAmount() {
                    return paneltyAmount;
                }

                /**
                 * Sets the value of the paneltyAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaneltyAmount(String value) {
                    this.paneltyAmount = value;
                }

            }

        }

    }

}
