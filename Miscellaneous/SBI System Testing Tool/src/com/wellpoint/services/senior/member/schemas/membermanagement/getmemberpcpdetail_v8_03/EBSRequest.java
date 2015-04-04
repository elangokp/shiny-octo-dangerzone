
package com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03;

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
 *         &lt;element name="GetMemberPCPDetailRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="srchSrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="srchEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="npiNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMemberPCPDetailRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetMemberPCPDetailRequest", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
    protected EBSRequest.GetMemberPCPDetailRequest getMemberPCPDetailRequest;

    /**
     * Gets the value of the getMemberPCPDetailRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetMemberPCPDetailRequest }
     *     
     */
    public EBSRequest.GetMemberPCPDetailRequest getGetMemberPCPDetailRequest() {
        return getMemberPCPDetailRequest;
    }

    /**
     * Sets the value of the getMemberPCPDetailRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetMemberPCPDetailRequest }
     *     
     */
    public void setGetMemberPCPDetailRequest(EBSRequest.GetMemberPCPDetailRequest value) {
        this.getMemberPCPDetailRequest = value;
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
     *                   &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="srchSrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="srchEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="npiNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData"
    })
    public static class GetMemberPCPDetailRequest {

        @XmlElement(name = "StaticData", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
        protected EBSRequest.GetMemberPCPDetailRequest.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetMemberPCPDetailRequest.StaticData }
         *     
         */
        public EBSRequest.GetMemberPCPDetailRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetMemberPCPDetailRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.GetMemberPCPDetailRequest.StaticData value) {
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
         *         &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pCpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="srchSrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="srchEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="npiNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "mbrSeqNum",
            "groupId",
            "subgrpId",
            "pCpId",
            "srchSrtDt",
            "cvrgTypCd",
            "srchEndDt",
            "npiNbr",
            "subscriberId",
            "prncSbscrbrId",
            "lastName",
            "firstName",
            "middleName",
            "birthDate",
            "sysInfo"
        })
        public static class StaticData {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String mbrLkupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String mbrSeqNum;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String groupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String subgrpId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String pCpId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String srchSrtDt;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String cvrgTypCd;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String srchEndDt;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String npiNbr;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String subscriberId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String prncSbscrbrId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String lastName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String firstName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String middleName;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected String birthDate;
            @XmlElement(name = "SysInfo", namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
            protected EBSRequest.GetMemberPCPDetailRequest.StaticData.SysInfo sysInfo;

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
             * Gets the value of the subgrpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubgrpId() {
                return subgrpId;
            }

            /**
             * Sets the value of the subgrpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubgrpId(String value) {
                this.subgrpId = value;
            }

            /**
             * Gets the value of the pCpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPCpId() {
                return pCpId;
            }

            /**
             * Sets the value of the pCpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPCpId(String value) {
                this.pCpId = value;
            }

            /**
             * Gets the value of the srchSrtDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrchSrtDt() {
                return srchSrtDt;
            }

            /**
             * Sets the value of the srchSrtDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrchSrtDt(String value) {
                this.srchSrtDt = value;
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
             * Gets the value of the srchEndDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrchEndDt() {
                return srchEndDt;
            }

            /**
             * Sets the value of the srchEndDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrchEndDt(String value) {
                this.srchEndDt = value;
            }

            /**
             * Gets the value of the npiNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNpiNbr() {
                return npiNbr;
            }

            /**
             * Sets the value of the npiNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNpiNbr(String value) {
                this.npiNbr = value;
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
             * Gets the value of the sysInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.GetMemberPCPDetailRequest.StaticData.SysInfo }
             *     
             */
            public EBSRequest.GetMemberPCPDetailRequest.StaticData.SysInfo getSysInfo() {
                return sysInfo;
            }

            /**
             * Sets the value of the sysInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.GetMemberPCPDetailRequest.StaticData.SysInfo }
             *     
             */
            public void setSysInfo(EBSRequest.GetMemberPCPDetailRequest.StaticData.SysInfo value) {
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

                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
                protected String srcSytmId;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03")
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
