
package com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05;

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
 *         &lt;element name="UpdateLimLiabCoordOfBenefitsRequest">
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
 *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="otherInsuranceGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="otherInsurancePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Member" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Subscriber" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updateLimLiabCoordOfBenefitsRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "UpdateLimLiabCoordOfBenefitsRequest", required = true)
    protected EBSRequest.UpdateLimLiabCoordOfBenefitsRequest updateLimLiabCoordOfBenefitsRequest;

    /**
     * Gets the value of the updateLimLiabCoordOfBenefitsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest }
     *     
     */
    public EBSRequest.UpdateLimLiabCoordOfBenefitsRequest getUpdateLimLiabCoordOfBenefitsRequest() {
        return updateLimLiabCoordOfBenefitsRequest;
    }

    /**
     * Sets the value of the updateLimLiabCoordOfBenefitsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest }
     *     
     */
    public void setUpdateLimLiabCoordOfBenefitsRequest(EBSRequest.UpdateLimLiabCoordOfBenefitsRequest value) {
        this.updateLimLiabCoordOfBenefitsRequest = value;
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
     *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="otherInsuranceGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="otherInsurancePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Member" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Subscriber" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class UpdateLimLiabCoordOfBenefitsRequest {

        @XmlElement(name = "StaticData")
        protected EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData }
         *     
         */
        public EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData value) {
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
         *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="otherInsuranceGroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="otherInsurancePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Member" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Subscriber" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "limitedLiabilityEffectiveDate",
            "otherInsuranceGroupIdentifier",
            "otherInsurancePolicyIdentifier",
            "insuranceTypeCode",
            "insuranceTypeCodeDescriptionText",
            "insuranceOrderCode",
            "limitedLiabilityTerminationDate",
            "groupId",
            "member",
            "subscriber",
            "entireFamilyIndicator"
        })
        public static class StaticData {

            protected String memberLookupId;
            protected String memberSequenceNumber;
            protected String limitedLiabilityEffectiveDate;
            protected String otherInsuranceGroupIdentifier;
            protected String otherInsurancePolicyIdentifier;
            protected String insuranceTypeCode;
            protected String insuranceTypeCodeDescriptionText;
            protected String insuranceOrderCode;
            protected String limitedLiabilityTerminationDate;
            protected String groupId;
            @XmlElement(name = "Member")
            protected EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Member member;
            @XmlElement(name = "Subscriber")
            protected EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Subscriber subscriber;
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
             * Gets the value of the otherInsuranceGroupIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInsuranceGroupIdentifier() {
                return otherInsuranceGroupIdentifier;
            }

            /**
             * Sets the value of the otherInsuranceGroupIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInsuranceGroupIdentifier(String value) {
                this.otherInsuranceGroupIdentifier = value;
            }

            /**
             * Gets the value of the otherInsurancePolicyIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherInsurancePolicyIdentifier() {
                return otherInsurancePolicyIdentifier;
            }

            /**
             * Sets the value of the otherInsurancePolicyIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherInsurancePolicyIdentifier(String value) {
                this.otherInsurancePolicyIdentifier = value;
            }

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
             * Gets the value of the insuranceTypeCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceTypeCodeDescriptionText() {
                return insuranceTypeCodeDescriptionText;
            }

            /**
             * Sets the value of the insuranceTypeCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuranceTypeCodeDescriptionText(String value) {
                this.insuranceTypeCodeDescriptionText = value;
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
             * Gets the value of the member property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Member }
             *     
             */
            public EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Member getMember() {
                return member;
            }

            /**
             * Sets the value of the member property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Member }
             *     
             */
            public void setMember(EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Member value) {
                this.member = value;
            }

            /**
             * Gets the value of the subscriber property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Subscriber }
             *     
             */
            public EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Subscriber getSubscriber() {
                return subscriber;
            }

            /**
             * Sets the value of the subscriber property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Subscriber }
             *     
             */
            public void setSubscriber(EBSRequest.UpdateLimLiabCoordOfBenefitsRequest.StaticData.Subscriber value) {
                this.subscriber = value;
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
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "firstName",
                "middleName",
                "lastName",
                "birthDate"
            })
            public static class Member {

                protected String firstName;
                protected String middleName;
                protected String lastName;
                protected String birthDate;

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
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "firstName",
                "middleName",
                "lastName",
                "birthDate"
            })
            public static class Subscriber {

                protected String firstName;
                protected String middleName;
                protected String lastName;
                protected String birthDate;

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

            }

        }

    }

}
