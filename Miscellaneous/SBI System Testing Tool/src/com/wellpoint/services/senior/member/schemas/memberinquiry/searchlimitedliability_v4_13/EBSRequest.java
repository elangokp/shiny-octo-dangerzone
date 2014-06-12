
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13;

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
 *         &lt;element name="SearchLimLiabRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchLimLiabRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchLimLiabRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
    protected EBSRequest.SearchLimLiabRequest searchLimLiabRequest;

    /**
     * Gets the value of the searchLimLiabRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchLimLiabRequest }
     *     
     */
    public EBSRequest.SearchLimLiabRequest getSearchLimLiabRequest() {
        return searchLimLiabRequest;
    }

    /**
     * Sets the value of the searchLimLiabRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchLimLiabRequest }
     *     
     */
    public void setSearchLimLiabRequest(EBSRequest.SearchLimLiabRequest value) {
        this.searchLimLiabRequest = value;
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
     *                   &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchLimLiabRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
        protected EBSRequest.SearchLimLiabRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchLimLiabRequest.StaticData }
         *     
         */
        public EBSRequest.SearchLimLiabRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchLimLiabRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.SearchLimLiabRequest.StaticData value) {
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
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "memberLookupId",
            "memberSequenceNumber",
            "groupId",
            "nextPage"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
            protected String memberLookupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
            protected String memberSequenceNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
            protected String groupId;
            @XmlElement(name = "NextPage", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
            protected EBSRequest.SearchLimLiabRequest.StaticData.NextPage nextPage;

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
             *     {@link EBSRequest.SearchLimLiabRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.SearchLimLiabRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchLimLiabRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.SearchLimLiabRequest.StaticData.NextPage value) {
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
             *         &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "insuranceTypeCode",
                "productFamilyCode",
                "limitedLiabilityEffectiveDate",
                "icd9DiagnosisCode"
            })
            public static class NextPage {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
                protected String insuranceTypeCode;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
                protected String productFamilyCode;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
                protected String limitedLiabilityEffectiveDate;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13")
                protected String icd9DiagnosisCode;

                /**
                 * Gets the value of the insuranceTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsuranceTypeCode() {
                    return insuranceTypeCode;
                }

                /**
                 * Sets the value of the insuranceTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsuranceTypeCode(String value) {
                    this.insuranceTypeCode = value;
                }

                /**
                 * Gets the value of the productFamilyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductFamilyCode() {
                    return productFamilyCode;
                }

                /**
                 * Sets the value of the productFamilyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductFamilyCode(String value) {
                    this.productFamilyCode = value;
                }

                /**
                 * Gets the value of the limitedLiabilityEffectiveDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLimitedLiabilityEffectiveDate() {
                    return limitedLiabilityEffectiveDate;
                }

                /**
                 * Sets the value of the limitedLiabilityEffectiveDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLimitedLiabilityEffectiveDate(String value) {
                    this.limitedLiabilityEffectiveDate = value;
                }

                /**
                 * Gets the value of the icd9DiagnosisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIcd9DiagnosisCode() {
                    return icd9DiagnosisCode;
                }

                /**
                 * Sets the value of the icd9DiagnosisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIcd9DiagnosisCode(String value) {
                    this.icd9DiagnosisCode = value;
                }

            }

        }

    }

}
