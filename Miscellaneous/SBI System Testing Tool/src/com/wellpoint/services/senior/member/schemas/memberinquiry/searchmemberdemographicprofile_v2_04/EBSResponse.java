
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04;

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
 *         &lt;element name="Search_MbrDmoPrfl_Response" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MemberList" maxOccurs="35" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mbr" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}MemberType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stdntTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hndcpMbrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fdrlTxExmptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="EmployInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Hrswrk" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="emplyClscdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="emplyClscdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="ocptn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="emplyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Salary" maxOccurs="3" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="hrDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="emplyStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="emplyStsCdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="mbrrcdtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Adrs" maxOccurs="3" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}AddressType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TlphnNbr" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
 *                                       &lt;element name="Written" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Spoken" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ethntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Email" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}EmailType" minOccurs="0"/>
 *                                       &lt;element name="AssocSbscrbr" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="ModHstry" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="crteUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="mdfyUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *                             &lt;element name="convDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clRteTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMbrDmoPrflResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "Search_MbrDmoPrfl_Response")
    protected List<EBSResponse.SearchMbrDmoPrflResponse> searchMbrDmoPrflResponse;

    /**
     * Gets the value of the searchMbrDmoPrflResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchMbrDmoPrflResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchMbrDmoPrflResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSResponse.SearchMbrDmoPrflResponse }
     * 
     * 
     */
    public List<EBSResponse.SearchMbrDmoPrflResponse> getSearchMbrDmoPrflResponse() {
        if (searchMbrDmoPrflResponse == null) {
            searchMbrDmoPrflResponse = new ArrayList<EBSResponse.SearchMbrDmoPrflResponse>();
        }
        return this.searchMbrDmoPrflResponse;
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
     *         &lt;element name="MemberList" maxOccurs="35" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mbr" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}MemberType">
     *                           &lt;sequence>
     *                             &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stdntTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hndcpMbrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fdrlTxExmptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EmployInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Hrswrk" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="emplyClscdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="emplyClscdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="ocptn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="emplyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Salary" maxOccurs="3" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="hrDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="emplyStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="emplyStsCdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="mbrrcdtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Adrs" maxOccurs="3" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}AddressType">
     *                                     &lt;sequence>
     *                                       &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TlphnNbr" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
     *                             &lt;element name="Written" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Spoken" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ethntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Email" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}EmailType" minOccurs="0"/>
     *                             &lt;element name="AssocSbscrbr" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="ModHstry" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="crteUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="mdfyUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
     *                   &lt;element name="convDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clRteTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "memberList",
        "sysInfo"
    })
    public static class SearchMbrDmoPrflResponse {

        @XmlElement(name = "MemberList")
        protected List<EBSResponse.SearchMbrDmoPrflResponse.MemberList> memberList;
        @XmlElement(name = "SysInfo")
        protected EBSResponse.SearchMbrDmoPrflResponse.SysInfo sysInfo;

        /**
         * Gets the value of the memberList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the memberList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMemberList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList }
         * 
         * 
         */
        public List<EBSResponse.SearchMbrDmoPrflResponse.MemberList> getMemberList() {
            if (memberList == null) {
                memberList = new ArrayList<EBSResponse.SearchMbrDmoPrflResponse.MemberList>();
            }
            return this.memberList;
        }

        /**
         * Gets the value of the sysInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchMbrDmoPrflResponse.SysInfo }
         *     
         */
        public EBSResponse.SearchMbrDmoPrflResponse.SysInfo getSysInfo() {
            return sysInfo;
        }

        /**
         * Sets the value of the sysInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchMbrDmoPrflResponse.SysInfo }
         *     
         */
        public void setSysInfo(EBSResponse.SearchMbrDmoPrflResponse.SysInfo value) {
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
         *         &lt;element name="Mbr" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}MemberType">
         *                 &lt;sequence>
         *                   &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stdntTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hndcpMbrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fdrlTxExmptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EmployInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Hrswrk" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="emplyClscdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="emplyClscdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="ocptn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="emplyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Salary" maxOccurs="3" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="hrDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="emplyStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="emplyStsCdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="mbrrcdtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Adrs" maxOccurs="3" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}AddressType">
         *                           &lt;sequence>
         *                             &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TlphnNbr" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
         *                   &lt;element name="Written" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Spoken" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ethntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Email" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}EmailType" minOccurs="0"/>
         *                   &lt;element name="AssocSbscrbr" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="ModHstry" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="crteUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="mdfyUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
            "mbr"
        })
        public static class MemberList {

            @XmlElement(name = "Mbr")
            protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr mbr;

            /**
             * Gets the value of the mbr property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr }
             *     
             */
            public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr getMbr() {
                return mbr;
            }

            /**
             * Sets the value of the mbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr }
             *     
             */
            public void setMbr(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr value) {
                this.mbr = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}MemberType">
             *       &lt;sequence>
             *         &lt;element name="hCId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="prncSbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stdntTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hndcpMbrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fdrlTxExmptInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EmployInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Hrswrk" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="emplyClscdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="emplyClscdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="ocptn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="emplyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Salary" maxOccurs="3" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="hrDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="emplyStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="emplyStsCdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="mbrrcdtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Adrs" maxOccurs="3" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}AddressType">
             *                 &lt;sequence>
             *                   &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TlphnNbr" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}TelephoneNumberType" maxOccurs="4" minOccurs="0"/>
             *         &lt;element name="Written" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Spoken" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ethntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Email" type="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}EmailType" minOccurs="0"/>
             *         &lt;element name="AssocSbscrbr" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="ModHstry" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="crteUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="mdfyUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="mdfyDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "hcId",
                "prncSbscrbrId",
                "groupId",
                "subgroupId",
                "stdntTypCd",
                "hndcpMbrInd",
                "fdrlTxExmptInd",
                "employInfo",
                "adrs",
                "tlphnNbr",
                "written",
                "spoken",
                "ethntyCd",
                "rcCd",
                "email",
                "assocSbscrbr",
                "modHstry"
            })
            public static class Mbr
                extends MemberType
            {

                @XmlElement(name = "hCId")
                protected String hcId;
                protected String prncSbscrbrId;
                protected String groupId;
                protected String subgroupId;
                protected String stdntTypCd;
                protected String hndcpMbrInd;
                protected String fdrlTxExmptInd;
                @XmlElement(name = "EmployInfo")
                protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo employInfo;
                @XmlElement(name = "Adrs")
                protected List<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Adrs> adrs;
                @XmlElement(name = "TlphnNbr")
                protected List<TelephoneNumberType> tlphnNbr;
                @XmlElement(name = "Written")
                protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Written written;
                @XmlElement(name = "Spoken")
                protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Spoken spoken;
                protected String ethntyCd;
                protected String rcCd;
                @XmlElement(name = "Email")
                protected EmailType email;
                @XmlElement(name = "AssocSbscrbr")
                protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.AssocSbscrbr assocSbscrbr;
                @XmlElement(name = "ModHstry")
                protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.ModHstry modHstry;

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
                 * Gets the value of the stdntTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStdntTypCd() {
                    return stdntTypCd;
                }

                /**
                 * Sets the value of the stdntTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStdntTypCd(String value) {
                    this.stdntTypCd = value;
                }

                /**
                 * Gets the value of the hndcpMbrInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHndcpMbrInd() {
                    return hndcpMbrInd;
                }

                /**
                 * Sets the value of the hndcpMbrInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHndcpMbrInd(String value) {
                    this.hndcpMbrInd = value;
                }

                /**
                 * Gets the value of the fdrlTxExmptInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFdrlTxExmptInd() {
                    return fdrlTxExmptInd;
                }

                /**
                 * Sets the value of the fdrlTxExmptInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFdrlTxExmptInd(String value) {
                    this.fdrlTxExmptInd = value;
                }

                /**
                 * Gets the value of the employInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo }
                 *     
                 */
                public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo getEmployInfo() {
                    return employInfo;
                }

                /**
                 * Sets the value of the employInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo }
                 *     
                 */
                public void setEmployInfo(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo value) {
                    this.employInfo = value;
                }

                /**
                 * Gets the value of the adrs property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the adrs property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAdrs().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Adrs }
                 * 
                 * 
                 */
                public List<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Adrs> getAdrs() {
                    if (adrs == null) {
                        adrs = new ArrayList<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Adrs>();
                    }
                    return this.adrs;
                }

                /**
                 * Gets the value of the tlphnNbr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tlphnNbr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTlphnNbr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TelephoneNumberType }
                 * 
                 * 
                 */
                public List<TelephoneNumberType> getTlphnNbr() {
                    if (tlphnNbr == null) {
                        tlphnNbr = new ArrayList<TelephoneNumberType>();
                    }
                    return this.tlphnNbr;
                }

                /**
                 * Gets the value of the written property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Written }
                 *     
                 */
                public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Written getWritten() {
                    return written;
                }

                /**
                 * Sets the value of the written property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Written }
                 *     
                 */
                public void setWritten(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Written value) {
                    this.written = value;
                }

                /**
                 * Gets the value of the spoken property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Spoken }
                 *     
                 */
                public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Spoken getSpoken() {
                    return spoken;
                }

                /**
                 * Sets the value of the spoken property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Spoken }
                 *     
                 */
                public void setSpoken(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.Spoken value) {
                    this.spoken = value;
                }

                /**
                 * Gets the value of the ethntyCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEthntyCd() {
                    return ethntyCd;
                }

                /**
                 * Sets the value of the ethntyCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEthntyCd(String value) {
                    this.ethntyCd = value;
                }

                /**
                 * Gets the value of the rcCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRcCd() {
                    return rcCd;
                }

                /**
                 * Sets the value of the rcCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRcCd(String value) {
                    this.rcCd = value;
                }

                /**
                 * Gets the value of the email property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EmailType }
                 *     
                 */
                public EmailType getEmail() {
                    return email;
                }

                /**
                 * Sets the value of the email property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EmailType }
                 *     
                 */
                public void setEmail(EmailType value) {
                    this.email = value;
                }

                /**
                 * Gets the value of the assocSbscrbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.AssocSbscrbr }
                 *     
                 */
                public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.AssocSbscrbr getAssocSbscrbr() {
                    return assocSbscrbr;
                }

                /**
                 * Sets the value of the assocSbscrbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.AssocSbscrbr }
                 *     
                 */
                public void setAssocSbscrbr(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.AssocSbscrbr value) {
                    this.assocSbscrbr = value;
                }

                /**
                 * Gets the value of the modHstry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.ModHstry }
                 *     
                 */
                public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.ModHstry getModHstry() {
                    return modHstry;
                }

                /**
                 * Sets the value of the modHstry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.ModHstry }
                 *     
                 */
                public void setModHstry(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.ModHstry value) {
                    this.modHstry = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04}AddressType">
                 *       &lt;sequence>
                 *         &lt;element name="mncpltyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "mncpltyNm"
                })
                public static class Adrs
                    extends AddressType
                {

                    protected String mncpltyNm;

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
                 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "firstName",
                    "lastName",
                    "ssn"
                })
                public static class AssocSbscrbr {

                    protected String subscriberId;
                    protected String firstName;
                    protected String lastName;
                    @XmlElement(name = "sSN")
                    protected String ssn;

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
                     * Gets the value of the ssn property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSSN() {
                        return ssn;
                    }

                    /**
                     * Sets the value of the ssn property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSSN(String value) {
                        this.ssn = value;
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
                 *         &lt;element name="Hrswrk" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="emplyClscdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="emplyClscdTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="ocptn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="emplyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Salary" maxOccurs="3" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="hrDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="emplyStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="emplyStsCdTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="mbrrcdtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "hrswrk",
                    "emplyClscdTxt",
                    "emplyClscdTyp",
                    "ocptn",
                    "emplyNm",
                    "salary",
                    "hrDt",
                    "emplyStsCd",
                    "emplyStsCdTxt",
                    "mbrrcdtypcd"
                })
                public static class EmployInfo {

                    @XmlElement(name = "Hrswrk")
                    protected EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Hrswrk hrswrk;
                    protected String emplyClscdTxt;
                    protected String emplyClscdTyp;
                    protected String ocptn;
                    protected String emplyNm;
                    @XmlElement(name = "Salary")
                    protected List<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Salary> salary;
                    protected String hrDt;
                    protected String emplyStsCd;
                    protected String emplyStsCdTxt;
                    protected String mbrrcdtypcd;

                    /**
                     * Gets the value of the hrswrk property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Hrswrk }
                     *     
                     */
                    public EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Hrswrk getHrswrk() {
                        return hrswrk;
                    }

                    /**
                     * Sets the value of the hrswrk property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Hrswrk }
                     *     
                     */
                    public void setHrswrk(EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Hrswrk value) {
                        this.hrswrk = value;
                    }

                    /**
                     * Gets the value of the emplyClscdTxt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmplyClscdTxt() {
                        return emplyClscdTxt;
                    }

                    /**
                     * Sets the value of the emplyClscdTxt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmplyClscdTxt(String value) {
                        this.emplyClscdTxt = value;
                    }

                    /**
                     * Gets the value of the emplyClscdTyp property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmplyClscdTyp() {
                        return emplyClscdTyp;
                    }

                    /**
                     * Sets the value of the emplyClscdTyp property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmplyClscdTyp(String value) {
                        this.emplyClscdTyp = value;
                    }

                    /**
                     * Gets the value of the ocptn property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOcptn() {
                        return ocptn;
                    }

                    /**
                     * Sets the value of the ocptn property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOcptn(String value) {
                        this.ocptn = value;
                    }

                    /**
                     * Gets the value of the emplyNm property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmplyNm() {
                        return emplyNm;
                    }

                    /**
                     * Sets the value of the emplyNm property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmplyNm(String value) {
                        this.emplyNm = value;
                    }

                    /**
                     * Gets the value of the salary property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the salary property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSalary().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Salary }
                     * 
                     * 
                     */
                    public List<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Salary> getSalary() {
                        if (salary == null) {
                            salary = new ArrayList<EBSResponse.SearchMbrDmoPrflResponse.MemberList.Mbr.EmployInfo.Salary>();
                        }
                        return this.salary;
                    }

                    /**
                     * Gets the value of the hrDt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHrDt() {
                        return hrDt;
                    }

                    /**
                     * Sets the value of the hrDt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHrDt(String value) {
                        this.hrDt = value;
                    }

                    /**
                     * Gets the value of the emplyStsCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmplyStsCd() {
                        return emplyStsCd;
                    }

                    /**
                     * Sets the value of the emplyStsCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmplyStsCd(String value) {
                        this.emplyStsCd = value;
                    }

                    /**
                     * Gets the value of the emplyStsCdTxt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEmplyStsCdTxt() {
                        return emplyStsCdTxt;
                    }

                    /**
                     * Sets the value of the emplyStsCdTxt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEmplyStsCdTxt(String value) {
                        this.emplyStsCdTxt = value;
                    }

                    /**
                     * Gets the value of the mbrrcdtypcd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMbrrcdtypcd() {
                        return mbrrcdtypcd;
                    }

                    /**
                     * Sets the value of the mbrrcdtypcd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMbrrcdtypcd(String value) {
                        this.mbrrcdtypcd = value;
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
                     *         &lt;element name="wrkHrsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "wrkHrsNbr",
                        "clndrtypcd"
                    })
                    public static class Hrswrk {

                        protected String wrkHrsNbr;
                        protected String clndrtypcd;

                        /**
                         * Gets the value of the wrkHrsNbr property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getWrkHrsNbr() {
                            return wrkHrsNbr;
                        }

                        /**
                         * Sets the value of the wrkHrsNbr property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setWrkHrsNbr(String value) {
                            this.wrkHrsNbr = value;
                        }

                        /**
                         * Gets the value of the clndrtypcd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getClndrtypcd() {
                            return clndrtypcd;
                        }

                        /**
                         * Sets the value of the clndrtypcd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setClndrtypcd(String value) {
                            this.clndrtypcd = value;
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
                     *         &lt;element name="incmAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="clndrtypcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="efctvDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "incmAmt",
                        "clndrtypcd",
                        "efctvDt"
                    })
                    public static class Salary {

                        protected String incmAmt;
                        protected String clndrtypcd;
                        protected String efctvDt;

                        /**
                         * Gets the value of the incmAmt property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getIncmAmt() {
                            return incmAmt;
                        }

                        /**
                         * Sets the value of the incmAmt property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setIncmAmt(String value) {
                            this.incmAmt = value;
                        }

                        /**
                         * Gets the value of the clndrtypcd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getClndrtypcd() {
                            return clndrtypcd;
                        }

                        /**
                         * Sets the value of the clndrtypcd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setClndrtypcd(String value) {
                            this.clndrtypcd = value;
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
                 *         &lt;element name="crteUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="crteDttm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="mdfyUsrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "crteUsrId",
                    "crteDttm",
                    "mdfyUsrId",
                    "mdfyDttm"
                })
                public static class ModHstry {

                    protected String crteUsrId;
                    protected String crteDttm;
                    protected String mdfyUsrId;
                    protected String mdfyDttm;

                    /**
                     * Gets the value of the crteUsrId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCrteUsrId() {
                        return crteUsrId;
                    }

                    /**
                     * Sets the value of the crteUsrId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCrteUsrId(String value) {
                        this.crteUsrId = value;
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
                     * Gets the value of the mdfyUsrId property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMdfyUsrId() {
                        return mdfyUsrId;
                    }

                    /**
                     * Sets the value of the mdfyUsrId property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMdfyUsrId(String value) {
                        this.mdfyUsrId = value;
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
                 *         &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "lngCd"
                })
                public static class Spoken {

                    protected String lngCd;

                    /**
                     * Gets the value of the lngCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLngCd() {
                        return lngCd;
                    }

                    /**
                     * Sets the value of the lngCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLngCd(String value) {
                        this.lngCd = value;
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
                 *         &lt;element name="lngCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "lngCd"
                })
                public static class Written {

                    protected String lngCd;

                    /**
                     * Gets the value of the lngCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLngCd() {
                        return lngCd;
                    }

                    /**
                     * Sets the value of the lngCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLngCd(String value) {
                        this.lngCd = value;
                    }

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="convDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clRteTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "convDt",
            "clRteTypCd"
        })
        public static class SysInfo {

            protected String srcSytmId;
            protected String convDt;
            protected String clRteTypCd;

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
             * Gets the value of the convDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConvDt() {
                return convDt;
            }

            /**
             * Sets the value of the convDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConvDt(String value) {
                this.convDt = value;
            }

            /**
             * Gets the value of the clRteTypCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClRteTypCd() {
                return clRteTypCd;
            }

            /**
             * Sets the value of the clRteTypCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClRteTypCd(String value) {
                this.clRteTypCd = value;
            }

        }

    }

}
