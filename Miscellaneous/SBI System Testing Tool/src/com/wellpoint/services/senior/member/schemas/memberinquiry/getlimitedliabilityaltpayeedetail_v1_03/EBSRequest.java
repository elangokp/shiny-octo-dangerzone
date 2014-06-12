
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilityaltpayeedetail_v1_03;

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
 *         &lt;element name="GetLimLiabAltPayeeDetailRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="responsiblePersonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getLimLiabAltPayeeDetailRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetLimLiabAltPayeeDetailRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
    protected EBSRequest.GetLimLiabAltPayeeDetailRequest getLimLiabAltPayeeDetailRequest;

    /**
     * Gets the value of the getLimLiabAltPayeeDetailRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest }
     *     
     */
    public EBSRequest.GetLimLiabAltPayeeDetailRequest getGetLimLiabAltPayeeDetailRequest() {
        return getLimLiabAltPayeeDetailRequest;
    }

    /**
     * Sets the value of the getLimLiabAltPayeeDetailRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest }
     *     
     */
    public void setGetLimLiabAltPayeeDetailRequest(EBSRequest.GetLimLiabAltPayeeDetailRequest value) {
        this.getLimLiabAltPayeeDetailRequest = value;
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
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="responsiblePersonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetLimLiabAltPayeeDetailRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
        protected EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData }
         *     
         */
        public EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData value) {
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
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="responsiblePersonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "groupId",
            "subscriberId",
            "memberSequenceNumber",
            "nextPage"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
            protected String groupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
            protected String subscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
            protected String memberSequenceNumber;
            @XmlElement(name = "NextPage", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
            protected EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData.NextPage nextPage;

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
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.GetLimLiabAltPayeeDetailRequest.StaticData.NextPage value) {
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
             *         &lt;element name="responsiblePersonTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "responsiblePersonTypeCode",
                "limitedLiabilityEffectiveDate"
            })
            public static class NextPage {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
                protected String responsiblePersonTypeCode;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03")
                protected String limitedLiabilityEffectiveDate;

                /**
                 * Gets the value of the responsiblePersonTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResponsiblePersonTypeCode() {
                    return responsiblePersonTypeCode;
                }

                /**
                 * Sets the value of the responsiblePersonTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResponsiblePersonTypeCode(String value) {
                    this.responsiblePersonTypeCode = value;
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

            }

        }

    }

}
