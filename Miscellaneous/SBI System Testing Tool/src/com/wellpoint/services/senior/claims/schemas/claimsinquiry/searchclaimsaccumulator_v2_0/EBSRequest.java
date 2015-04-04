
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimsaccumulator_v2_0;

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
 *         &lt;element name="SearchClaimsAccumulatorsRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchClaimsAccumulatorsRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchClaimsAccumulatorsRequest", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
    protected EBSRequest.SearchClaimsAccumulatorsRequest searchClaimsAccumulatorsRequest;

    /**
     * Gets the value of the searchClaimsAccumulatorsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchClaimsAccumulatorsRequest }
     *     
     */
    public EBSRequest.SearchClaimsAccumulatorsRequest getSearchClaimsAccumulatorsRequest() {
        return searchClaimsAccumulatorsRequest;
    }

    /**
     * Sets the value of the searchClaimsAccumulatorsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchClaimsAccumulatorsRequest }
     *     
     */
    public void setSearchClaimsAccumulatorsRequest(EBSRequest.SearchClaimsAccumulatorsRequest value) {
        this.searchClaimsAccumulatorsRequest = value;
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
     *         &lt;element name="StaticData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchClaimsAccumulatorsRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
        protected EBSRequest.SearchClaimsAccumulatorsRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchClaimsAccumulatorsRequest.StaticData }
         *     
         */
        public EBSRequest.SearchClaimsAccumulatorsRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchClaimsAccumulatorsRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.SearchClaimsAccumulatorsRequest.StaticData value) {
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
         *         &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "memberLookupId",
            "memberSequenceNumber",
            "searchStartDate",
            "classificationOfServiceSorCode",
            "classificationOfServiceWlpCode",
            "groupId",
            "nextPage",
            "entireFamilyIndicator"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String memberLookupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String memberSequenceNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String searchStartDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String classificationOfServiceSorCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String classificationOfServiceWlpCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String groupId;
            @XmlElement(name = "NextPage", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected EBSRequest.SearchClaimsAccumulatorsRequest.StaticData.NextPage nextPage;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
            protected String entireFamilyIndicator;

            /**
             * Gets the value of the memberLookupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLookupId() {
                return memberLookupId;
            }

            /**
             * Sets the value of the memberLookupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLookupId(String value) {
                this.memberLookupId = value;
            }

            /**
             * Gets the value of the memberSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberSequenceNumber() {
                return memberSequenceNumber;
            }

            /**
             * Sets the value of the memberSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberSequenceNumber(String value) {
                this.memberSequenceNumber = value;
            }

            /**
             * Gets the value of the searchStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchStartDate() {
                return searchStartDate;
            }

            /**
             * Sets the value of the searchStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchStartDate(String value) {
                this.searchStartDate = value;
            }

            /**
             * Gets the value of the classificationOfServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassificationOfServiceSorCode() {
                return classificationOfServiceSorCode;
            }

            /**
             * Sets the value of the classificationOfServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassificationOfServiceSorCode(String value) {
                this.classificationOfServiceSorCode = value;
            }

            /**
             * Gets the value of the classificationOfServiceWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassificationOfServiceWlpCode() {
                return classificationOfServiceWlpCode;
            }

            /**
             * Sets the value of the classificationOfServiceWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassificationOfServiceWlpCode(String value) {
                this.classificationOfServiceWlpCode = value;
            }

            /**
             * Gets the value of the groupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupId() {
                return groupId;
            }

            /**
             * Sets the value of the groupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupId(String value) {
                this.groupId = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.SearchClaimsAccumulatorsRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.SearchClaimsAccumulatorsRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchClaimsAccumulatorsRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.SearchClaimsAccumulatorsRequest.StaticData.NextPage value) {
                this.nextPage = value;
            }

            /**
             * Gets the value of the entireFamilyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntireFamilyIndicator() {
                return entireFamilyIndicator;
            }

            /**
             * Sets the value of the entireFamilyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntireFamilyIndicator(String value) {
                this.entireFamilyIndicator = value;
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
             *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimId",
                "benefitPeriodStartDate",
                "benefitPeriodEndDate"
            })
            public static class NextPage {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
                protected String claimId;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
                protected String benefitPeriodStartDate;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/searchClaimsAccumulator-v2_0")
                protected String benefitPeriodEndDate;

                /**
                 * Gets the value of the claimId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimId() {
                    return claimId;
                }

                /**
                 * Sets the value of the claimId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimId(String value) {
                    this.claimId = value;
                }

                /**
                 * Gets the value of the benefitPeriodStartDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitPeriodStartDate() {
                    return benefitPeriodStartDate;
                }

                /**
                 * Sets the value of the benefitPeriodStartDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitPeriodStartDate(String value) {
                    this.benefitPeriodStartDate = value;
                }

                /**
                 * Gets the value of the benefitPeriodEndDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitPeriodEndDate() {
                    return benefitPeriodEndDate;
                }

                /**
                 * Sets the value of the benefitPeriodEndDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitPeriodEndDate(String value) {
                    this.benefitPeriodEndDate = value;
                }

            }

        }

    }

}
