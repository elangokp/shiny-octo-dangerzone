
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmembercontracts_v1_01;

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
 *         &lt;element name="SearchMemberContractsResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="140" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMemberContractsResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchMemberContractsResponse")
    protected EBSResponse.SearchMemberContractsResponse searchMemberContractsResponse;

    /**
     * Gets the value of the searchMemberContractsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.SearchMemberContractsResponse }
     *     
     */
    public EBSResponse.SearchMemberContractsResponse getSearchMemberContractsResponse() {
        return searchMemberContractsResponse;
    }

    /**
     * Sets the value of the searchMemberContractsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.SearchMemberContractsResponse }
     *     
     */
    public void setSearchMemberContractsResponse(EBSResponse.SearchMemberContractsResponse value) {
        this.searchMemberContractsResponse = value;
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
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="140" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData",
        "dynamicData"
    })
    public static class SearchMemberContractsResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.SearchMemberContractsResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.SearchMemberContractsResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchMemberContractsResponse.StaticData }
         *     
         */
        public EBSResponse.SearchMemberContractsResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchMemberContractsResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.SearchMemberContractsResponse.StaticData value) {
            this.staticData = value;
        }

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
         * {@link EBSResponse.SearchMemberContractsResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.SearchMemberContractsResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.SearchMemberContractsResponse.DynamicData>();
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
         *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productIdentifier",
            "enrollmentTypeCode",
            "enrollmentTypeCodeDescriptionText",
            "memberProductEligibilityEffectiveDate",
            "memberProductEligibilityTerminationDate",
            "reasonSorCode",
            "reasonSorCodeDescriptionText",
            "reasonWlpCode",
            "reasonWlpCodeDescriptionText"
        })
        public static class DynamicData {

            protected String productIdentifier;
            protected String enrollmentTypeCode;
            protected String enrollmentTypeCodeDescriptionText;
            protected String memberProductEligibilityEffectiveDate;
            protected String memberProductEligibilityTerminationDate;
            protected String reasonSorCode;
            protected String reasonSorCodeDescriptionText;
            protected String reasonWlpCode;
            protected String reasonWlpCodeDescriptionText;

            /**
             * Gets the value of the productIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductIdentifier() {
                return productIdentifier;
            }

            /**
             * Sets the value of the productIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductIdentifier(String value) {
                this.productIdentifier = value;
            }

            /**
             * Gets the value of the enrollmentTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentTypeCode() {
                return enrollmentTypeCode;
            }

            /**
             * Sets the value of the enrollmentTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentTypeCode(String value) {
                this.enrollmentTypeCode = value;
            }

            /**
             * Gets the value of the enrollmentTypeCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentTypeCodeDescriptionText() {
                return enrollmentTypeCodeDescriptionText;
            }

            /**
             * Sets the value of the enrollmentTypeCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentTypeCodeDescriptionText(String value) {
                this.enrollmentTypeCodeDescriptionText = value;
            }

            /**
             * Gets the value of the memberProductEligibilityEffectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberProductEligibilityEffectiveDate() {
                return memberProductEligibilityEffectiveDate;
            }

            /**
             * Sets the value of the memberProductEligibilityEffectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberProductEligibilityEffectiveDate(String value) {
                this.memberProductEligibilityEffectiveDate = value;
            }

            /**
             * Gets the value of the memberProductEligibilityTerminationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberProductEligibilityTerminationDate() {
                return memberProductEligibilityTerminationDate;
            }

            /**
             * Sets the value of the memberProductEligibilityTerminationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberProductEligibilityTerminationDate(String value) {
                this.memberProductEligibilityTerminationDate = value;
            }

            /**
             * Gets the value of the reasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonSorCode() {
                return reasonSorCode;
            }

            /**
             * Sets the value of the reasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonSorCode(String value) {
                this.reasonSorCode = value;
            }

            /**
             * Gets the value of the reasonSorCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonSorCodeDescriptionText() {
                return reasonSorCodeDescriptionText;
            }

            /**
             * Sets the value of the reasonSorCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonSorCodeDescriptionText(String value) {
                this.reasonSorCodeDescriptionText = value;
            }

            /**
             * Gets the value of the reasonWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonWlpCode() {
                return reasonWlpCode;
            }

            /**
             * Sets the value of the reasonWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonWlpCode(String value) {
                this.reasonWlpCode = value;
            }

            /**
             * Gets the value of the reasonWlpCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonWlpCodeDescriptionText() {
                return reasonWlpCodeDescriptionText;
            }

            /**
             * Sets the value of the reasonWlpCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonWlpCodeDescriptionText(String value) {
                this.reasonWlpCodeDescriptionText = value;
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
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "subscriberId",
            "memberSequenceNumber",
            "groupId",
            "nextPage"
        })
        public static class StaticData {

            protected String subscriberId;
            protected String memberSequenceNumber;
            protected String groupId;
            @XmlElement(name = "NextPage")
            protected EBSResponse.SearchMemberContractsResponse.StaticData.NextPage nextPage;

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
             *     {@link EBSResponse.SearchMemberContractsResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.SearchMemberContractsResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberContractsResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.SearchMemberContractsResponse.StaticData.NextPage value) {
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
             *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "productIdentifier",
                "memberProductEligibilityEffectiveDate",
                "memberProductEligibilityTerminationDate"
            })
            public static class NextPage {

                protected String productIdentifier;
                protected String memberProductEligibilityEffectiveDate;
                protected String memberProductEligibilityTerminationDate;

                /**
                 * Gets the value of the productIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductIdentifier() {
                    return productIdentifier;
                }

                /**
                 * Sets the value of the productIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductIdentifier(String value) {
                    this.productIdentifier = value;
                }

                /**
                 * Gets the value of the memberProductEligibilityEffectiveDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberProductEligibilityEffectiveDate() {
                    return memberProductEligibilityEffectiveDate;
                }

                /**
                 * Sets the value of the memberProductEligibilityEffectiveDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberProductEligibilityEffectiveDate(String value) {
                    this.memberProductEligibilityEffectiveDate = value;
                }

                /**
                 * Gets the value of the memberProductEligibilityTerminationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberProductEligibilityTerminationDate() {
                    return memberProductEligibilityTerminationDate;
                }

                /**
                 * Sets the value of the memberProductEligibilityTerminationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberProductEligibilityTerminationDate(String value) {
                    this.memberProductEligibilityTerminationDate = value;
                }

            }

        }

    }

}
