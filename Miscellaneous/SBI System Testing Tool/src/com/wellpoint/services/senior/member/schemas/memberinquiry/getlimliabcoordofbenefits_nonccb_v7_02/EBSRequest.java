
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02;

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
 *         &lt;element name="GetLimLiabCoordOfBenefitsRequest" minOccurs="0">
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
 *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bCBSAControlPlnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getLimLiabCoordOfBenefitsRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetLimLiabCoordOfBenefitsRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
    protected EBSRequest.GetLimLiabCoordOfBenefitsRequest getLimLiabCoordOfBenefitsRequest;

    /**
     * Gets the value of the getLimLiabCoordOfBenefitsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetLimLiabCoordOfBenefitsRequest }
     *     
     */
    public EBSRequest.GetLimLiabCoordOfBenefitsRequest getGetLimLiabCoordOfBenefitsRequest() {
        return getLimLiabCoordOfBenefitsRequest;
    }

    /**
     * Sets the value of the getLimLiabCoordOfBenefitsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetLimLiabCoordOfBenefitsRequest }
     *     
     */
    public void setGetLimLiabCoordOfBenefitsRequest(EBSRequest.GetLimLiabCoordOfBenefitsRequest value) {
        this.getLimLiabCoordOfBenefitsRequest = value;
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
     *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bCBSAControlPlnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetLimLiabCoordOfBenefitsRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
        protected EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData }
         *     
         */
        public EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData value) {
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
         *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dateofBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bCBSAControlPlnID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productFamilyCode",
            "limitedLiabilityEffectiveDate",
            "groupId",
            "subgroupId",
            "insuranceOrderCode",
            "createDatetime",
            "limitedLiabilityTerminationDate",
            "actualInsuranceTypeCode",
            "principleSubscriberId",
            "subscriberId",
            "firstName",
            "middleName",
            "lastName",
            "dateofBirth",
            "bcbsaControlPlnID"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String memberLookupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String memberSequenceNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String productFamilyCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String limitedLiabilityEffectiveDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String groupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String subgroupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String insuranceOrderCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String createDatetime;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String limitedLiabilityTerminationDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String actualInsuranceTypeCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String principleSubscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String subscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String firstName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String middleName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String lastName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String dateofBirth;
            @XmlElement(name = "bCBSAControlPlnID", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02")
            protected String bcbsaControlPlnID;

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
             * Gets the value of the subgroupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubgroupId() {
                return subgroupId;
            }

            /**
             * Sets the value of the subgroupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubgroupId(String value) {
                this.subgroupId = value;
            }

            /**
             * Gets the value of the insuranceOrderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceOrderCode() {
                return insuranceOrderCode;
            }

            /**
             * Sets the value of the insuranceOrderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuranceOrderCode(String value) {
                this.insuranceOrderCode = value;
            }

            /**
             * Gets the value of the createDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateDatetime() {
                return createDatetime;
            }

            /**
             * Sets the value of the createDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateDatetime(String value) {
                this.createDatetime = value;
            }

            /**
             * Gets the value of the limitedLiabilityTerminationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitedLiabilityTerminationDate() {
                return limitedLiabilityTerminationDate;
            }

            /**
             * Sets the value of the limitedLiabilityTerminationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitedLiabilityTerminationDate(String value) {
                this.limitedLiabilityTerminationDate = value;
            }

            /**
             * Gets the value of the actualInsuranceTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualInsuranceTypeCode() {
                return actualInsuranceTypeCode;
            }

            /**
             * Sets the value of the actualInsuranceTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualInsuranceTypeCode(String value) {
                this.actualInsuranceTypeCode = value;
            }

            /**
             * Gets the value of the principleSubscriberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrincipleSubscriberId() {
                return principleSubscriberId;
            }

            /**
             * Sets the value of the principleSubscriberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrincipleSubscriberId(String value) {
                this.principleSubscriberId = value;
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
             * Gets the value of the middleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiddleName() {
                return middleName;
            }

            /**
             * Sets the value of the middleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiddleName(String value) {
                this.middleName = value;
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
             * Gets the value of the dateofBirth property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateofBirth() {
                return dateofBirth;
            }

            /**
             * Sets the value of the dateofBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateofBirth(String value) {
                this.dateofBirth = value;
            }

            /**
             * Gets the value of the bcbsaControlPlnID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBCBSAControlPlnID() {
                return bcbsaControlPlnID;
            }

            /**
             * Sets the value of the bcbsaControlPlnID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBCBSAControlPlnID(String value) {
                this.bcbsaControlPlnID = value;
            }

        }

    }

}
