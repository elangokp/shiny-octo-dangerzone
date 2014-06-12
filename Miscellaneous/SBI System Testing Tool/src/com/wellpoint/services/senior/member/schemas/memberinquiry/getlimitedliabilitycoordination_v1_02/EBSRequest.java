
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02;

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
 *         &lt;element name="Search_LimLiabCoordRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MbrInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bcbsaCntrlPlnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="prodFmlyCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="insrncOrdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TrmDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="insrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SysInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entrFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchLimLiabCoordRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "Search_LimLiabCoordRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
    protected EBSRequest.SearchLimLiabCoordRequest searchLimLiabCoordRequest;

    /**
     * Gets the value of the searchLimLiabCoordRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchLimLiabCoordRequest }
     *     
     */
    public EBSRequest.SearchLimLiabCoordRequest getSearchLimLiabCoordRequest() {
        return searchLimLiabCoordRequest;
    }

    /**
     * Sets the value of the searchLimLiabCoordRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchLimLiabCoordRequest }
     *     
     */
    public void setSearchLimLiabCoordRequest(EBSRequest.SearchLimLiabCoordRequest value) {
        this.searchLimLiabCoordRequest = value;
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
     *         &lt;element name="MbrInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bcbsaCntrlPlnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="prodFmlyCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="insrncOrdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TrmDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="insrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SysInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entrFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrInfo",
        "prodFmlyCde",
        "insrncOrdCd",
        "efctvDt",
        "trmDt",
        "crteDttm",
        "insrncTypCd",
        "cvrgTypCd",
        "sysInfo"
    })
    public static class SearchLimLiabCoordRequest {

        @XmlElement(name = "MbrInfo", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected EBSRequest.SearchLimLiabCoordRequest.MbrInfo mbrInfo;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String prodFmlyCde;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String insrncOrdCd;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String efctvDt;
        @XmlElement(name = "TrmDt", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String trmDt;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String crteDttm;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String insrncTypCd;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected String cvrgTypCd;
        @XmlElement(name = "SysInfo", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
        protected EBSRequest.SearchLimLiabCoordRequest.SysInfo sysInfo;

        /**
         * Gets the value of the mbrInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchLimLiabCoordRequest.MbrInfo }
         *     
         */
        public EBSRequest.SearchLimLiabCoordRequest.MbrInfo getMbrInfo() {
            return mbrInfo;
        }

        /**
         * Sets the value of the mbrInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchLimLiabCoordRequest.MbrInfo }
         *     
         */
        public void setMbrInfo(EBSRequest.SearchLimLiabCoordRequest.MbrInfo value) {
            this.mbrInfo = value;
        }

        /**
         * Gets the value of the prodFmlyCde property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProdFmlyCde() {
            return prodFmlyCde;
        }

        /**
         * Sets the value of the prodFmlyCde property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProdFmlyCde(String value) {
            this.prodFmlyCde = value;
        }

        /**
         * Gets the value of the insrncOrdCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsrncOrdCd() {
            return insrncOrdCd;
        }

        /**
         * Sets the value of the insrncOrdCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsrncOrdCd(String value) {
            this.insrncOrdCd = value;
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
         * Gets the value of the trmDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrmDt() {
            return trmDt;
        }

        /**
         * Sets the value of the trmDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrmDt(String value) {
            this.trmDt = value;
        }

        /**
         * Gets the value of the crteDttm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrteDttm() {
            return crteDttm;
        }

        /**
         * Sets the value of the crteDttm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrteDttm(String value) {
            this.crteDttm = value;
        }

        /**
         * Gets the value of the insrncTypCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsrncTypCd() {
            return insrncTypCd;
        }

        /**
         * Sets the value of the insrncTypCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsrncTypCd(String value) {
            this.insrncTypCd = value;
        }

        /**
         * Gets the value of the cvrgTypCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCvrgTypCd() {
            return cvrgTypCd;
        }

        /**
         * Sets the value of the cvrgTypCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCvrgTypCd(String value) {
            this.cvrgTypCd = value;
        }

        /**
         * Gets the value of the sysInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchLimLiabCoordRequest.SysInfo }
         *     
         */
        public EBSRequest.SearchLimLiabCoordRequest.SysInfo getSysInfo() {
            return sysInfo;
        }

        /**
         * Sets the value of the sysInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchLimLiabCoordRequest.SysInfo }
         *     
         */
        public void setSysInfo(EBSRequest.SearchLimLiabCoordRequest.SysInfo value) {
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
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bcbsaCntrlPlnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "subscriberId",
            "mbrSeqNum",
            "mbrLkupId",
            "groupId",
            "subgroupId",
            "prncSbscrbrId",
            "bcbsaCntrlPlnId",
            "firstName",
            "middleName",
            "lastName",
            "birthDate"
        })
        public static class MbrInfo {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String subscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String mbrSeqNum;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String mbrLkupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String groupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String subgroupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String prncSbscrbrId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String bcbsaCntrlPlnId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String firstName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String middleName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String lastName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String birthDate;

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
             * Gets the value of the mbrSeqNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrSeqNum() {
                return mbrSeqNum;
            }

            /**
             * Sets the value of the mbrSeqNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrSeqNum(String value) {
                this.mbrSeqNum = value;
            }

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
             * Gets the value of the prncSbscrbrId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrncSbscrbrId() {
                return prncSbscrbrId;
            }

            /**
             * Sets the value of the prncSbscrbrId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrncSbscrbrId(String value) {
                this.prncSbscrbrId = value;
            }

            /**
             * Gets the value of the bcbsaCntrlPlnId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBcbsaCntrlPlnId() {
                return bcbsaCntrlPlnId;
            }

            /**
             * Sets the value of the bcbsaCntrlPlnId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBcbsaCntrlPlnId(String value) {
                this.bcbsaCntrlPlnId = value;
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
         *         &lt;element name="entrFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "entrFmlyInd",
            "stgcndInd"
        })
        public static class SysInfo {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String srcSytmId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
            protected String entrFmlyInd;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02")
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
             * Gets the value of the entrFmlyInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntrFmlyInd() {
                return entrFmlyInd;
            }

            /**
             * Sets the value of the entrFmlyInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntrFmlyInd(String value) {
                this.entrFmlyInd = value;
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
