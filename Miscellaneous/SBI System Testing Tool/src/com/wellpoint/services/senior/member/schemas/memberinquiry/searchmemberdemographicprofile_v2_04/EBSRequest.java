
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04;

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
 *         &lt;element name="Search_MbrDmoPrfl_Request" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="activeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="spsDpdtCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMbrDmoPrflRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "Search_MbrDmoPrfl_Request", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
    protected EBSRequest.SearchMbrDmoPrflRequest searchMbrDmoPrflRequest;

    /**
     * Gets the value of the searchMbrDmoPrflRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchMbrDmoPrflRequest }
     *     
     */
    public EBSRequest.SearchMbrDmoPrflRequest getSearchMbrDmoPrflRequest() {
        return searchMbrDmoPrflRequest;
    }

    /**
     * Sets the value of the searchMbrDmoPrflRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchMbrDmoPrflRequest }
     *     
     */
    public void setSearchMbrDmoPrflRequest(EBSRequest.SearchMbrDmoPrflRequest value) {
        this.searchMbrDmoPrflRequest = value;
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
     *         &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="activeInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="spsDpdtCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrLkupId",
        "subscriberId",
        "groupId",
        "subgroupId",
        "lastName",
        "middleName",
        "firstName",
        "birthDate",
        "activeInd",
        "stCd",
        "pstlCd",
        "efctvDt",
        "spsDpdtCd",
        "sysInfo"
    })
    public static class SearchMbrDmoPrflRequest {

        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String mbrLkupId;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String subscriberId;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String groupId;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String subgroupId;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String lastName;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String middleName;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String firstName;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String birthDate;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String activeInd;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String stCd;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String pstlCd;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String efctvDt;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected String spsDpdtCd;
        @XmlElement(name = "SysInfo", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
        protected EBSRequest.SearchMbrDmoPrflRequest.SysInfo sysInfo;

        /**
         * Gets the value of the mbrLkupId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMbrLkupId() {
            return mbrLkupId;
        }

        /**
         * Sets the value of the mbrLkupId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMbrLkupId(String value) {
            this.mbrLkupId = value;
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
         * Gets the value of the stCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStCd() {
            return stCd;
        }

        /**
         * Sets the value of the stCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStCd(String value) {
            this.stCd = value;
        }

        /**
         * Gets the value of the pstlCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPstlCd() {
            return pstlCd;
        }

        /**
         * Sets the value of the pstlCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPstlCd(String value) {
            this.pstlCd = value;
        }

        /**
         * Gets the value of the efctvDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEfctvDt() {
            return efctvDt;
        }

        /**
         * Sets the value of the efctvDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEfctvDt(String value) {
            this.efctvDt = value;
        }

        /**
         * Gets the value of the spsDpdtCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpsDpdtCd() {
            return spsDpdtCd;
        }

        /**
         * Sets the value of the spsDpdtCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpsDpdtCd(String value) {
            this.spsDpdtCd = value;
        }

        /**
         * Gets the value of the sysInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchMbrDmoPrflRequest.SysInfo }
         *     
         */
        public EBSRequest.SearchMbrDmoPrflRequest.SysInfo getSysInfo() {
            return sysInfo;
        }

        /**
         * Sets the value of the sysInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchMbrDmoPrflRequest.SysInfo }
         *     
         */
        public void setSysInfo(EBSRequest.SearchMbrDmoPrflRequest.SysInfo value) {
            this.sysInfo = value;
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

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
            protected String srcSytmId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04")
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
