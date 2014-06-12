
package com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00;

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
 *       &lt;sequence>
 *         &lt;element name="UpdateMbrCmmnctnPrfrncRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mbrInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChgRqst" maxOccurs="50" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Adrs" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}AddressType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="adrsLn3Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="cntryNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="adrseNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="nmPrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TlphnNbr" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}TelephoneNumberType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Email" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}EmailType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Lang" maxOccurs="3" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="langTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="cmmnctnPrfrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="mdfyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="mdfyDtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="trnstypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updateMbrCmmnctnPrfrncRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "UpdateMbrCmmnctnPrfrncRequest")
    protected EBSRequest.UpdateMbrCmmnctnPrfrncRequest updateMbrCmmnctnPrfrncRequest;

    /**
     * Gets the value of the updateMbrCmmnctnPrfrncRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest }
     *     
     */
    public EBSRequest.UpdateMbrCmmnctnPrfrncRequest getUpdateMbrCmmnctnPrfrncRequest() {
        return updateMbrCmmnctnPrfrncRequest;
    }

    /**
     * Sets the value of the updateMbrCmmnctnPrfrncRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest }
     *     
     */
    public void setUpdateMbrCmmnctnPrfrncRequest(EBSRequest.UpdateMbrCmmnctnPrfrncRequest value) {
        this.updateMbrCmmnctnPrfrncRequest = value;
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
     *         &lt;element name="mbrInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChgRqst" maxOccurs="50" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Adrs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}AddressType">
     *                                     &lt;sequence>
     *                                       &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="adrsLn3Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="cntryNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="adrseNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="nmPrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TlphnNbr" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}TelephoneNumberType">
     *                                     &lt;sequence>
     *                                       &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Email" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}EmailType">
     *                                     &lt;sequence>
     *                                       &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Lang" maxOccurs="3" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="langTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="cmmnctnPrfrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="mdfyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="mdfyDtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="trnstypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbrInfo"
    })
    public static class UpdateMbrCmmnctnPrfrncRequest {

        protected EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo mbrInfo;

        /**
         * Gets the value of the mbrInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo }
         *     
         */
        public EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo getMbrInfo() {
            return mbrInfo;
        }

        /**
         * Sets the value of the mbrInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo }
         *     
         */
        public void setMbrInfo(EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo value) {
            this.mbrInfo = value;
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
         *         &lt;element name="mbrLkupIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChgRqst" maxOccurs="50" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Adrs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}AddressType">
         *                           &lt;sequence>
         *                             &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="adrsLn3Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="cntryNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="adrseNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="nmPrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TlphnNbr" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}TelephoneNumberType">
         *                           &lt;sequence>
         *                             &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Email" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}EmailType">
         *                           &lt;sequence>
         *                             &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Lang" maxOccurs="3" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="langTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="cmmnctnPrfrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="mdfyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="mdfyDtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="trnstypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "mbrLkupIdTypCd",
            "sbscrbrId",
            "grpId",
            "subGrpId",
            "chgRqst",
            "srcSysId"
        })
        public static class MbrInfo {

            protected String mbrLkupId;
            protected String mbrLkupIdTypCd;
            protected String sbscrbrId;
            protected String grpId;
            protected String subGrpId;
            @XmlElement(name = "ChgRqst")
            protected List<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst> chgRqst;
            protected String srcSysId;

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
             * Gets the value of the mbrLkupIdTypCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrLkupIdTypCd() {
                return mbrLkupIdTypCd;
            }

            /**
             * Sets the value of the mbrLkupIdTypCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrLkupIdTypCd(String value) {
                this.mbrLkupIdTypCd = value;
            }

            /**
             * Gets the value of the sbscrbrId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSbscrbrId() {
                return sbscrbrId;
            }

            /**
             * Sets the value of the sbscrbrId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSbscrbrId(String value) {
                this.sbscrbrId = value;
            }

            /**
             * Gets the value of the grpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrpId() {
                return grpId;
            }

            /**
             * Sets the value of the grpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrpId(String value) {
                this.grpId = value;
            }

            /**
             * Gets the value of the subGrpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubGrpId() {
                return subGrpId;
            }

            /**
             * Sets the value of the subGrpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubGrpId(String value) {
                this.subGrpId = value;
            }

            /**
             * Gets the value of the chgRqst property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the chgRqst property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChgRqst().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst }
             * 
             * 
             */
            public List<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst> getChgRqst() {
                if (chgRqst == null) {
                    chgRqst = new ArrayList<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst>();
                }
                return this.chgRqst;
            }

            /**
             * Gets the value of the srcSysId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcSysId() {
                return srcSysId;
            }

            /**
             * Sets the value of the srcSysId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcSysId(String value) {
                this.srcSysId = value;
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
             *         &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Adrs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}AddressType">
             *                 &lt;sequence>
             *                   &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="adrsLn3Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="cntryNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="adrseNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="nmPrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TlphnNbr" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}TelephoneNumberType">
             *                 &lt;sequence>
             *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Email" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}EmailType">
             *                 &lt;sequence>
             *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Lang" maxOccurs="3" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="langTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="cmmnctnPrfrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="mdfyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="mdfyDtm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="trnstypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "entirFmlyInd",
                "mbrSqncNbr",
                "adrs",
                "tlphnNbr",
                "email",
                "lang",
                "cmmnctnPrfrncTypCd",
                "mdfyUserId",
                "mdfyDtm",
                "trnstypCd"
            })
            public static class ChgRqst {

                protected String entirFmlyInd;
                protected String mbrSqncNbr;
                @XmlElement(name = "Adrs")
                protected EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Adrs adrs;
                @XmlElement(name = "TlphnNbr")
                protected EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.TlphnNbr tlphnNbr;
                @XmlElement(name = "Email")
                protected EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Email email;
                @XmlElement(name = "Lang")
                protected List<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Lang> lang;
                protected String cmmnctnPrfrncTypCd;
                protected String mdfyUserId;
                protected String mdfyDtm;
                protected String trnstypCd;

                /**
                 * Gets the value of the entirFmlyInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntirFmlyInd() {
                    return entirFmlyInd;
                }

                /**
                 * Sets the value of the entirFmlyInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntirFmlyInd(String value) {
                    this.entirFmlyInd = value;
                }

                /**
                 * Gets the value of the mbrSqncNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMbrSqncNbr() {
                    return mbrSqncNbr;
                }

                /**
                 * Sets the value of the mbrSqncNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMbrSqncNbr(String value) {
                    this.mbrSqncNbr = value;
                }

                /**
                 * Gets the value of the adrs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Adrs }
                 *     
                 */
                public EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Adrs getAdrs() {
                    return adrs;
                }

                /**
                 * Sets the value of the adrs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Adrs }
                 *     
                 */
                public void setAdrs(EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Adrs value) {
                    this.adrs = value;
                }

                /**
                 * Gets the value of the tlphnNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.TlphnNbr }
                 *     
                 */
                public EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.TlphnNbr getTlphnNbr() {
                    return tlphnNbr;
                }

                /**
                 * Sets the value of the tlphnNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.TlphnNbr }
                 *     
                 */
                public void setTlphnNbr(EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.TlphnNbr value) {
                    this.tlphnNbr = value;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Email }
                 *     
                 */
                public EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Email getEmail() {
                    return email;
                }

                /**
                 * Sets the value of the email property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Email }
                 *     
                 */
                public void setEmail(EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Email value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the lang property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the lang property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLang().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Lang }
                 * 
                 * 
                 */
                public List<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Lang> getLang() {
                    if (lang == null) {
                        lang = new ArrayList<EBSRequest.UpdateMbrCmmnctnPrfrncRequest.MbrInfo.ChgRqst.Lang>();
                    }
                    return this.lang;
                }

                /**
                 * Gets the value of the cmmnctnPrfrncTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCmmnctnPrfrncTypCd() {
                    return cmmnctnPrfrncTypCd;
                }

                /**
                 * Sets the value of the cmmnctnPrfrncTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCmmnctnPrfrncTypCd(String value) {
                    this.cmmnctnPrfrncTypCd = value;
                }

                /**
                 * Gets the value of the mdfyUserId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMdfyUserId() {
                    return mdfyUserId;
                }

                /**
                 * Sets the value of the mdfyUserId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMdfyUserId(String value) {
                    this.mdfyUserId = value;
                }

                /**
                 * Gets the value of the mdfyDtm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMdfyDtm() {
                    return mdfyDtm;
                }

                /**
                 * Sets the value of the mdfyDtm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMdfyDtm(String value) {
                    this.mdfyDtm = value;
                }

                /**
                 * Gets the value of the trnstypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTrnstypCd() {
                    return trnstypCd;
                }

                /**
                 * Sets the value of the trnstypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTrnstypCd(String value) {
                    this.trnstypCd = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}AddressType">
                 *       &lt;sequence>
                 *         &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="adrsLn3Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="cntryNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="adrseNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="nmPrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "mncpltyNm",
                    "adrsLn3Txt",
                    "cntryNm",
                    "adrseNm",
                    "nmPrfx",
                    "efctvDt",
                    "trmntnDt"
                })
                public static class Adrs
                    extends AddressType
                {

                    protected String mncpltyNm;
                    protected String adrsLn3Txt;
                    protected String cntryNm;
                    protected String adrseNm;
                    protected String nmPrfx;
                    protected String efctvDt;
                    protected String trmntnDt;

                    /**
                     * Gets the value of the mncpltyNm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMncpltyNm() {
                        return mncpltyNm;
                    }

                    /**
                     * Sets the value of the mncpltyNm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMncpltyNm(String value) {
                        this.mncpltyNm = value;
                    }

                    /**
                     * Gets the value of the adrsLn3Txt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdrsLn3Txt() {
                        return adrsLn3Txt;
                    }

                    /**
                     * Sets the value of the adrsLn3Txt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdrsLn3Txt(String value) {
                        this.adrsLn3Txt = value;
                    }

                    /**
                     * Gets the value of the cntryNm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCntryNm() {
                        return cntryNm;
                    }

                    /**
                     * Sets the value of the cntryNm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCntryNm(String value) {
                        this.cntryNm = value;
                    }

                    /**
                     * Gets the value of the adrseNm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdrseNm() {
                        return adrseNm;
                    }

                    /**
                     * Sets the value of the adrseNm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdrseNm(String value) {
                        this.adrseNm = value;
                    }

                    /**
                     * Gets the value of the nmPrfx property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNmPrfx() {
                        return nmPrfx;
                    }

                    /**
                     * Sets the value of the nmPrfx property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNmPrfx(String value) {
                        this.nmPrfx = value;
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
                     * Gets the value of the trmntnDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrmntnDt() {
                        return trmntnDt;
                    }

                    /**
                     * Sets the value of the trmntnDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrmntnDt(String value) {
                        this.trmntnDt = value;
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
                 *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}EmailType">
                 *       &lt;sequence>
                 *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "efctvDt",
                    "trmntnDt"
                })
                public static class Email
                    extends EmailType
                {

                    protected String efctvDt;
                    protected String trmntnDt;

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
                     * Gets the value of the trmntnDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrmntnDt() {
                        return trmntnDt;
                    }

                    /**
                     * Sets the value of the trmntnDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrmntnDt(String value) {
                        this.trmntnDt = value;
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
                 *         &lt;element name="langTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "langTypCd",
                    "langCd"
                })
                public static class Lang {

                    protected String langTypCd;
                    protected String langCd;

                    /**
                     * Gets the value of the langTypCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLangTypCd() {
                        return langTypCd;
                    }

                    /**
                     * Sets the value of the langTypCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLangTypCd(String value) {
                        this.langTypCd = value;
                    }

                    /**
                     * Gets the value of the langCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLangCd() {
                        return langCd;
                    }

                    /**
                     * Sets the value of the langCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLangCd(String value) {
                        this.langCd = value;
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
                 *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00}TelephoneNumberType">
                 *       &lt;sequence>
                 *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="trmntnDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "efctvDt",
                    "trmntnDt"
                })
                public static class TlphnNbr
                    extends TelephoneNumberType
                {

                    protected String efctvDt;
                    protected String trmntnDt;

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
                     * Gets the value of the trmntnDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrmntnDt() {
                        return trmntnDt;
                    }

                    /**
                     * Sets the value of the trmntnDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrmntnDt(String value) {
                        this.trmntnDt = value;
                    }

                }

            }

        }

    }

}
