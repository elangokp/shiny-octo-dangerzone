
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdetails_v3_02;

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
 *         &lt;element name="SearchMemberDetailsRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSorRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberWlpRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SysInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stgcndInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMemberDetailsRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchMemberDetailsRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
    protected EBSRequest.SearchMemberDetailsRequest searchMemberDetailsRequest;

    /**
     * Gets the value of the searchMemberDetailsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchMemberDetailsRequest }
     *     
     */
    public EBSRequest.SearchMemberDetailsRequest getSearchMemberDetailsRequest() {
        return searchMemberDetailsRequest;
    }

    /**
     * Sets the value of the searchMemberDetailsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchMemberDetailsRequest }
     *     
     */
    public void setSearchMemberDetailsRequest(EBSRequest.SearchMemberDetailsRequest value) {
        this.searchMemberDetailsRequest = value;
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
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSorRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberWlpRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SysInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stgcndInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchMemberDetailsRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
        protected EBSRequest.SearchMemberDetailsRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData }
         *     
         */
        public EBSRequest.SearchMemberDetailsRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.SearchMemberDetailsRequest.StaticData value) {
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
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSorRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberWlpRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SysInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stgcndInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "firstName",
            "lastName",
            "middleName",
            "spouseDependentCode",
            "statusCode",
            "birthDate",
            "memberSorRelationshipCode",
            "memberWlpRelationshipCode",
            "groupId",
            "sysInfo",
            "nextPage"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String firstName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String lastName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String middleName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String spouseDependentCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String statusCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String birthDate;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String memberSorRelationshipCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String memberWlpRelationshipCode;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected String groupId;
            @XmlElement(name = "SysInfo", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected EBSRequest.SearchMemberDetailsRequest.StaticData.SysInfo sysInfo;
            @XmlElement(name = "NextPage", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
            protected EBSRequest.SearchMemberDetailsRequest.StaticData.NextPage nextPage;

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
             * Gets the value of the spouseDependentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpouseDependentCode() {
                return spouseDependentCode;
            }

            /**
             * Sets the value of the spouseDependentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpouseDependentCode(String value) {
                this.spouseDependentCode = value;
            }

            /**
             * Gets the value of the statusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCode() {
                return statusCode;
            }

            /**
             * Sets the value of the statusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCode(String value) {
                this.statusCode = value;
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
             * Gets the value of the memberSorRelationshipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberSorRelationshipCode() {
                return memberSorRelationshipCode;
            }

            /**
             * Sets the value of the memberSorRelationshipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberSorRelationshipCode(String value) {
                this.memberSorRelationshipCode = value;
            }

            /**
             * Gets the value of the memberWlpRelationshipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberWlpRelationshipCode() {
                return memberWlpRelationshipCode;
            }

            /**
             * Sets the value of the memberWlpRelationshipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberWlpRelationshipCode(String value) {
                this.memberWlpRelationshipCode = value;
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
             * Gets the value of the sysInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData.SysInfo }
             *     
             */
            public EBSRequest.SearchMemberDetailsRequest.StaticData.SysInfo getSysInfo() {
                return sysInfo;
            }

            /**
             * Sets the value of the sysInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData.SysInfo }
             *     
             */
            public void setSysInfo(EBSRequest.SearchMemberDetailsRequest.StaticData.SysInfo value) {
                this.sysInfo = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.SearchMemberDetailsRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchMemberDetailsRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.SearchMemberDetailsRequest.StaticData.NextPage value) {
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
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "lastName",
                "firstName",
                "middleName",
                "subscriberId",
                "memberSequenceNumber",
                "birthDate"
            })
            public static class NextPage {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String lastName;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String firstName;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String middleName;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String subscriberId;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String memberSequenceNumber;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String birthDate;

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
             *       &lt;sequence>
             *         &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stgcndInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "srcSytmId",
                "stgcndInd"
            })
            public static class SysInfo {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String srcSytmId;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02")
                protected String stgcndInd;

                /**
                 * Gets the value of the srcSytmId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSrcSytmId() {
                    return srcSytmId;
                }

                /**
                 * Sets the value of the srcSytmId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSrcSytmId(String value) {
                    this.srcSytmId = value;
                }

                /**
                 * Gets the value of the stgcndInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStgcndInd() {
                    return stgcndInd;
                }

                /**
                 * Sets the value of the stgcndInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStgcndInd(String value) {
                    this.stgcndInd = value;
                }

            }

        }

    }

}
