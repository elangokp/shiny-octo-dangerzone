
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04;

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
 *         &lt;element name="SearchMemberRequest" minOccurs="0">
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
 *                             &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GrpLkup" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="grpLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="grpLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="searchEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMemberRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchMemberRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
    protected EBSRequest.SearchMemberRequest searchMemberRequest;

    /**
     * Gets the value of the searchMemberRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchMemberRequest }
     *     
     */
    public EBSRequest.SearchMemberRequest getSearchMemberRequest() {
        return searchMemberRequest;
    }

    /**
     * Sets the value of the searchMemberRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchMemberRequest }
     *     
     */
    public void setSearchMemberRequest(EBSRequest.SearchMemberRequest value) {
        this.searchMemberRequest = value;
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
     *                   &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GrpLkup" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="grpLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="grpLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="searchEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchMemberRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
        protected EBSRequest.SearchMemberRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchMemberRequest.StaticData }
         *     
         */
        public EBSRequest.SearchMemberRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchMemberRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.SearchMemberRequest.StaticData value) {
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
         *         &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GrpLkup" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="grpLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="grpLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="searchStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="searchEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "mbrSqncNum",
            "grpLkup",
            "birthDate",
            "activeInd",
            "productFamilyCode",
            "eligibilityTypeCode",
            "subscriberId",
            "lastName",
            "firstName",
            "serviceStartDate",
            "searchStartDate",
            "searchEndDate",
            "financialCompanyCode",
            "benefitPlanId",
            "sourceSystemIdentifier"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String memberLookupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String mbrSqncNum;
            @XmlElement(name = "GrpLkup", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected List<EBSRequest.SearchMemberRequest.StaticData.GrpLkup> grpLkup;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String birthDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String activeInd;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String productFamilyCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String eligibilityTypeCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String subscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String lastName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String firstName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String serviceStartDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String searchStartDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String searchEndDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String financialCompanyCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String benefitPlanId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
            protected String sourceSystemIdentifier;

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
             * Gets the value of the mbrSqncNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrSqncNum() {
                return mbrSqncNum;
            }

            /**
             * Sets the value of the mbrSqncNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrSqncNum(String value) {
                this.mbrSqncNum = value;
            }

            /**
             * Gets the value of the grpLkup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the grpLkup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGrpLkup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSRequest.SearchMemberRequest.StaticData.GrpLkup }
             * 
             * 
             */
            public List<EBSRequest.SearchMemberRequest.StaticData.GrpLkup> getGrpLkup() {
                if (grpLkup == null) {
                    grpLkup = new ArrayList<EBSRequest.SearchMemberRequest.StaticData.GrpLkup>();
                }
                return this.grpLkup;
            }

            /**
             * Gets the value of the birthDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthDate() {
                return birthDate;
            }

            /**
             * Sets the value of the birthDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthDate(String value) {
                this.birthDate = value;
            }

            /**
             * Gets the value of the activeInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActiveInd() {
                return activeInd;
            }

            /**
             * Sets the value of the activeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActiveInd(String value) {
                this.activeInd = value;
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
             * Gets the value of the eligibilityTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEligibilityTypeCode() {
                return eligibilityTypeCode;
            }

            /**
             * Sets the value of the eligibilityTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEligibilityTypeCode(String value) {
                this.eligibilityTypeCode = value;
            }

            /**
             * Gets the value of the subscriberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubscriberId() {
                return subscriberId;
            }

            /**
             * Sets the value of the subscriberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubscriberId(String value) {
                this.subscriberId = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
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
             * Gets the value of the searchEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSearchEndDate() {
                return searchEndDate;
            }

            /**
             * Sets the value of the searchEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSearchEndDate(String value) {
                this.searchEndDate = value;
            }

            /**
             * Gets the value of the financialCompanyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinancialCompanyCode() {
                return financialCompanyCode;
            }

            /**
             * Sets the value of the financialCompanyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinancialCompanyCode(String value) {
                this.financialCompanyCode = value;
            }

            /**
             * Gets the value of the benefitPlanId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenefitPlanId() {
                return benefitPlanId;
            }

            /**
             * Sets the value of the benefitPlanId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenefitPlanId(String value) {
                this.benefitPlanId = value;
            }

            /**
             * Gets the value of the sourceSystemIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceSystemIdentifier() {
                return sourceSystemIdentifier;
            }

            /**
             * Sets the value of the sourceSystemIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceSystemIdentifier(String value) {
                this.sourceSystemIdentifier = value;
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
             *         &lt;element name="grpLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="grpLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "grpLkupId",
                "grpLkupIdTypCd"
            })
            public static class GrpLkup {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
                protected String grpLkupId;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04")
                protected String grpLkupIdTypCd;

                /**
                 * Gets the value of the grpLkupId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrpLkupId() {
                    return grpLkupId;
                }

                /**
                 * Sets the value of the grpLkupId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrpLkupId(String value) {
                    this.grpLkupId = value;
                }

                /**
                 * Gets the value of the grpLkupIdTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrpLkupIdTypCd() {
                    return grpLkupIdTypCd;
                }

                /**
                 * Sets the value of the grpLkupIdTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrpLkupIdTypCd(String value) {
                    this.grpLkupIdTypCd = value;
                }

            }

        }

    }

}
