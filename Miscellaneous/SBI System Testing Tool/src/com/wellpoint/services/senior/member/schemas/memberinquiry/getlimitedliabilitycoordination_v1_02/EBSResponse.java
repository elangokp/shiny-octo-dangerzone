
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02;

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
 *         &lt;element name="Search_LimLiabCoordResponse" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Mbr" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}MemberType">
 *                           &lt;sequence>
 *                             &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LimLiabList" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="insrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PlcyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TrmDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insrncOrdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LstVrfcDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Mdcr" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ElgRsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MdcrTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="strtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="prodFmlyCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lvlOfCrdOfBnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="crdOfBnftPrmRlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Carrier" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="CrrNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Address" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}AddressType" maxOccurs="4" minOccurs="0"/>
 *                                       &lt;element name="TelephoneNumber" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RspnsblPrty" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SysInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchLimLiabCoordResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "Search_LimLiabCoordResponse")
    protected List<EBSResponse.SearchLimLiabCoordResponse> searchLimLiabCoordResponse;

    /**
     * Gets the value of the searchLimLiabCoordResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchLimLiabCoordResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchLimLiabCoordResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSResponse.SearchLimLiabCoordResponse }
     * 
     * 
     */
    public List<EBSResponse.SearchLimLiabCoordResponse> getSearchLimLiabCoordResponse() {
        if (searchLimLiabCoordResponse == null) {
            searchLimLiabCoordResponse = new ArrayList<EBSResponse.SearchLimLiabCoordResponse>();
        }
        return this.searchLimLiabCoordResponse;
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
     *         &lt;element name="Mbr" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}MemberType">
     *                 &lt;sequence>
     *                   &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LimLiabList" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="insrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PlcyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TrmDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insrncOrdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LstVrfcDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Mdcr" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ElgRsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MdcrTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="strtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="prodFmlyCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lvlOfCrdOfBnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="crdOfBnftPrmRlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Carrier" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="CrrNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Address" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}AddressType" maxOccurs="4" minOccurs="0"/>
     *                             &lt;element name="TelephoneNumber" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RspnsblPrty" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SysInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "mbr",
        "limLiabList"
    })
    public static class SearchLimLiabCoordResponse {

        @XmlElement(name = "Mbr")
        protected EBSResponse.SearchLimLiabCoordResponse.Mbr mbr;
        @XmlElement(name = "LimLiabList")
        protected List<EBSResponse.SearchLimLiabCoordResponse.LimLiabList> limLiabList;

        /**
         * Gets the value of the mbr property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchLimLiabCoordResponse.Mbr }
         *     
         */
        public EBSResponse.SearchLimLiabCoordResponse.Mbr getMbr() {
            return mbr;
        }

        /**
         * Sets the value of the mbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchLimLiabCoordResponse.Mbr }
         *     
         */
        public void setMbr(EBSResponse.SearchLimLiabCoordResponse.Mbr value) {
            this.mbr = value;
        }

        /**
         * Gets the value of the limLiabList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the limLiabList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLimLiabList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList }
         * 
         * 
         */
        public List<EBSResponse.SearchLimLiabCoordResponse.LimLiabList> getLimLiabList() {
            if (limLiabList == null) {
                limLiabList = new ArrayList<EBSResponse.SearchLimLiabCoordResponse.LimLiabList>();
            }
            return this.limLiabList;
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
         *         &lt;element name="insrncTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PlcyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TrmDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insrncOrdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cvrgTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LstVrfcDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Mdcr" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ElgRsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MdcrTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="strtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="prodFmlyCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lvlOfCrdOfBnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="crdOfBnftPrmRlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Carrier" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="CrrNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Address" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}AddressType" maxOccurs="4" minOccurs="0"/>
         *                   &lt;element name="TelephoneNumber" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RspnsblPrty" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SysInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "insrncTypCd",
            "plcyId",
            "efctvDt",
            "trmDt",
            "groupIdentifier",
            "insrncOrdCd",
            "cvrgTypCd",
            "lstVrfcDt",
            "mdcr",
            "prodFmlyCde",
            "lvlOfCrdOfBnftCd",
            "crdOfBnftPrmRlCd",
            "carrier",
            "rspnsblPrty",
            "sysInfo"
        })
        public static class LimLiabList {

            protected String insrncTypCd;
            @XmlElement(name = "PlcyId")
            protected String plcyId;
            protected String efctvDt;
            @XmlElement(name = "TrmDt")
            protected String trmDt;
            @XmlElement(name = "GroupIdentifier")
            protected String groupIdentifier;
            protected String insrncOrdCd;
            protected String cvrgTypCd;
            @XmlElement(name = "LstVrfcDt")
            protected String lstVrfcDt;
            @XmlElement(name = "Mdcr")
            protected EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Mdcr mdcr;
            protected String prodFmlyCde;
            protected String lvlOfCrdOfBnftCd;
            protected String crdOfBnftPrmRlCd;
            @XmlElement(name = "Carrier")
            protected EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Carrier carrier;
            @XmlElement(name = "RspnsblPrty")
            protected EBSResponse.SearchLimLiabCoordResponse.LimLiabList.RspnsblPrty rspnsblPrty;
            @XmlElement(name = "SysInfo")
            protected EBSResponse.SearchLimLiabCoordResponse.LimLiabList.SysInfo sysInfo;

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
             * Gets the value of the plcyId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlcyId() {
                return plcyId;
            }

            /**
             * Sets the value of the plcyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlcyId(String value) {
                this.plcyId = value;
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
             * Gets the value of the groupIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupIdentifier() {
                return groupIdentifier;
            }

            /**
             * Sets the value of the groupIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupIdentifier(String value) {
                this.groupIdentifier = value;
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
             * Gets the value of the lstVrfcDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLstVrfcDt() {
                return lstVrfcDt;
            }

            /**
             * Sets the value of the lstVrfcDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLstVrfcDt(String value) {
                this.lstVrfcDt = value;
            }

            /**
             * Gets the value of the mdcr property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Mdcr }
             *     
             */
            public EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Mdcr getMdcr() {
                return mdcr;
            }

            /**
             * Sets the value of the mdcr property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Mdcr }
             *     
             */
            public void setMdcr(EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Mdcr value) {
                this.mdcr = value;
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
             * Gets the value of the lvlOfCrdOfBnftCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLvlOfCrdOfBnftCd() {
                return lvlOfCrdOfBnftCd;
            }

            /**
             * Sets the value of the lvlOfCrdOfBnftCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLvlOfCrdOfBnftCd(String value) {
                this.lvlOfCrdOfBnftCd = value;
            }

            /**
             * Gets the value of the crdOfBnftPrmRlCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCrdOfBnftPrmRlCd() {
                return crdOfBnftPrmRlCd;
            }

            /**
             * Sets the value of the crdOfBnftPrmRlCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCrdOfBnftPrmRlCd(String value) {
                this.crdOfBnftPrmRlCd = value;
            }

            /**
             * Gets the value of the carrier property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Carrier }
             *     
             */
            public EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Carrier getCarrier() {
                return carrier;
            }

            /**
             * Sets the value of the carrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Carrier }
             *     
             */
            public void setCarrier(EBSResponse.SearchLimLiabCoordResponse.LimLiabList.Carrier value) {
                this.carrier = value;
            }

            /**
             * Gets the value of the rspnsblPrty property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.RspnsblPrty }
             *     
             */
            public EBSResponse.SearchLimLiabCoordResponse.LimLiabList.RspnsblPrty getRspnsblPrty() {
                return rspnsblPrty;
            }

            /**
             * Sets the value of the rspnsblPrty property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.RspnsblPrty }
             *     
             */
            public void setRspnsblPrty(EBSResponse.SearchLimLiabCoordResponse.LimLiabList.RspnsblPrty value) {
                this.rspnsblPrty = value;
            }

            /**
             * Gets the value of the sysInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.SysInfo }
             *     
             */
            public EBSResponse.SearchLimLiabCoordResponse.LimLiabList.SysInfo getSysInfo() {
                return sysInfo;
            }

            /**
             * Sets the value of the sysInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchLimLiabCoordResponse.LimLiabList.SysInfo }
             *     
             */
            public void setSysInfo(EBSResponse.SearchLimLiabCoordResponse.LimLiabList.SysInfo value) {
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="CrrNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Address" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}AddressType" maxOccurs="4" minOccurs="0"/>
             *         &lt;element name="TelephoneNumber" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
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
                "crrNmTxt",
                "address",
                "telephoneNumber"
            })
            public static class Carrier {

                @XmlElement(name = "CrrNmTxt")
                protected String crrNmTxt;
                @XmlElement(name = "Address")
                protected List<AddressType> address;
                @XmlElement(name = "TelephoneNumber")
                protected List<TelephoneNumberType> telephoneNumber;

                /**
                 * Gets the value of the crrNmTxt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCrrNmTxt() {
                    return crrNmTxt;
                }

                /**
                 * Sets the value of the crrNmTxt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCrrNmTxt(String value) {
                    this.crrNmTxt = value;
                }

                /**
                 * Gets the value of the address property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the address property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAddress().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AddressType }
                 * 
                 * 
                 */
                public List<AddressType> getAddress() {
                    if (address == null) {
                        address = new ArrayList<AddressType>();
                    }
                    return this.address;
                }

                /**
                 * Gets the value of the telephoneNumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTelephoneNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TelephoneNumberType }
                 * 
                 * 
                 */
                public List<TelephoneNumberType> getTelephoneNumber() {
                    if (telephoneNumber == null) {
                        telephoneNumber = new ArrayList<TelephoneNumberType>();
                    }
                    return this.telephoneNumber;
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
             *         &lt;element name="ElgRsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MdcrTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="strtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "elgRsnCd",
                "mdcrTypCd",
                "strtDt"
            })
            public static class Mdcr {

                @XmlElement(name = "ElgRsnCd")
                protected String elgRsnCd;
                @XmlElement(name = "MdcrTypCd")
                protected String mdcrTypCd;
                protected String strtDt;

                /**
                 * Gets the value of the elgRsnCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElgRsnCd() {
                    return elgRsnCd;
                }

                /**
                 * Sets the value of the elgRsnCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElgRsnCd(String value) {
                    this.elgRsnCd = value;
                }

                /**
                 * Gets the value of the mdcrTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMdcrTypCd() {
                    return mdcrTypCd;
                }

                /**
                 * Sets the value of the mdcrTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMdcrTypCd(String value) {
                    this.mdcrTypCd = value;
                }

                /**
                 * Gets the value of the strtDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStrtDt() {
                    return strtDt;
                }

                /**
                 * Sets the value of the strtDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStrtDt(String value) {
                    this.strtDt = value;
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
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "middleName",
                "lastName",
                "firstName"
            })
            public static class RspnsblPrty {

                protected String middleName;
                protected String lastName;
                protected String firstName;

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
             *         &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "mdfyDttm"
            })
            public static class SysInfo {

                protected String srcSytmId;
                protected String mdfyDttm;

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
                 * Gets the value of the mdfyDttm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMdfyDttm() {
                    return mdfyDttm;
                }

                /**
                 * Sets the value of the mdfyDttm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMdfyDttm(String value) {
                    this.mdfyDttm = value;
                }

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
         *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02}MemberType">
         *       &lt;sequence>
         *         &lt;element name="mbrLkupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "mbrLkupId",
            "groupId",
            "subgroupId",
            "prncSbscrbrId",
            "hcId"
        })
        public static class Mbr
            extends MemberType
        {

            protected String mbrLkupId;
            protected String groupId;
            protected String subgroupId;
            protected String prncSbscrbrId;
            @XmlElement(name = "hCId")
            protected String hcId;

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
             * Gets the value of the hcId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHCId() {
                return hcId;
            }

            /**
             * Sets the value of the hcId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHCId(String value) {
                this.hcId = value;
            }

        }

    }

}
