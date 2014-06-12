
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimseobdetailsex_v2_0;

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
 *         &lt;element name="GetClaimsEOBDetailExResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmSttsWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmSttsWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="chkNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="chkDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="placeOfSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adjdctnPrcsDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmRcptDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="srvcStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="srvcEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="grpNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subgrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="subgrpNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prodDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ntwkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Subscriber" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Patient" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="hcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrRltnspCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
 *                             &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patAcctNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Provider" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="IDS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="provId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="provIdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="provOrgNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
 *                             &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="provAgrmntParnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ntwkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Payee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="payeTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType" minOccurs="0"/>
 *                             &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rmtncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totlBilldChrgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="provDscntTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totlProvWoAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mbrLbltyTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alwdTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ddctblTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cpaymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="coinsrnAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="othrPayerTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="intrstTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmTypeOfSrvcWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmTypeOfSrvcWlpCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mbrUtilznRvwPnltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adjstmntRsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="adjstmntRsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LineInfo" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Tx" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="hcpcsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hcpcsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;sequence minOccurs="0">
 *                                         &lt;element name="hcpcsMdfrCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="srvcStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="srvcEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billdChrgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="provDscntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="provWoAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrLbltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="alwdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ddctblAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cpaymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsrnAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="othrPayerAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clmTypeSrvcWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clmTypeSrvcWlpCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrUtilznRvwPnltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ExplntnCodes" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="entTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rjctRsnWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rjctRsnWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ncvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SysInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
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
    "getClaimsEOBDetailExResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimsEOBDetailExResponse")
    protected EBSResponse.GetClaimsEOBDetailExResponse getClaimsEOBDetailExResponse;

    /**
     * Gets the value of the getClaimsEOBDetailExResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsEOBDetailExResponse }
     *     
     */
    public EBSResponse.GetClaimsEOBDetailExResponse getGetClaimsEOBDetailExResponse() {
        return getClaimsEOBDetailExResponse;
    }

    /**
     * Sets the value of the getClaimsEOBDetailExResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsEOBDetailExResponse }
     *     
     */
    public void setGetClaimsEOBDetailExResponse(EBSResponse.GetClaimsEOBDetailExResponse value) {
        this.getClaimsEOBDetailExResponse = value;
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
     *         &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmSttsWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmSttsWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="chkNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="chkDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="placeOfSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adjdctnPrcsDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmRcptDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="srvcStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="srvcEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="grpNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subgrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="subgrpNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prodDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ntwkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Subscriber" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Patient" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="hcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrRltnspCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
     *                   &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patAcctNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Provider" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="IDS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="provId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="provIdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="provOrgNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
     *                   &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="provAgrmntParnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ntwkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Payee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="payeTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType" minOccurs="0"/>
     *                   &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rmtncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totlBilldChrgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="provDscntTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totlProvWoAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mbrLbltyTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alwdTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ddctblTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cpaymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="coinsrnAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="othrPayerTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="intrstTotlAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmTypeOfSrvcWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmTypeOfSrvcWlpCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mbrUtilznRvwPnltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adjstmntRsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="adjstmntRsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LineInfo" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Tx" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="hcpcsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hcpcsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;sequence minOccurs="0">
     *                               &lt;element name="hcpcsMdfrCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="srvcStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="srvcEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billdChrgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="provDscntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="provWoAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrLbltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="alwdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ddctblAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cpaymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsrnAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="othrPayerAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clmTypeSrvcWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clmTypeSrvcWlpCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrUtilznRvwPnltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ExplntnCodes" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="entTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rjctRsnWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rjctRsnWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ncvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SysInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
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
        "clmNbr",
        "clmRvsnNbr",
        "clmTypeCd",
        "clmSttsWlpCd",
        "clmSttsWlpCdNmTxt",
        "chkNbr",
        "chkDt",
        "placeOfSrvcCd",
        "adjdctnPrcsDt",
        "clmRcptDt",
        "srvcStrtDt",
        "srvcEndDt",
        "grpId",
        "grpNmTxt",
        "subgrpId",
        "subgrpNmTxt",
        "prodId",
        "prodDescTxt",
        "ntwkId",
        "subscriber",
        "patient",
        "provider",
        "payee",
        "rmtncId",
        "totlBilldChrgAmt",
        "provDscntTotlAmt",
        "totlProvWoAmt",
        "mbrLbltyTotlAmt",
        "alwdTotlAmt",
        "ddctblTotlAmt",
        "cpaymntAmt",
        "coinsrnAmt",
        "othrPayerTotlAmt",
        "intrstTotlAmt",
        "totlPaidAmt",
        "clmTypeOfSrvcWlpCd",
        "clmTypeOfSrvcWlpCdDescTxt",
        "mbrUtilznRvwPnltyAmt",
        "adjstmntRsnSrcCd",
        "adjstmntRsnSrcCdDescTxt",
        "lineInfo",
        "sysInfo"
    })
    public static class GetClaimsEOBDetailExResponse {

        protected String clmNbr;
        protected String clmRvsnNbr;
        protected String clmTypeCd;
        protected String clmSttsWlpCd;
        protected String clmSttsWlpCdNmTxt;
        protected String chkNbr;
        protected String chkDt;
        protected String placeOfSrvcCd;
        protected String adjdctnPrcsDt;
        protected String clmRcptDt;
        protected String srvcStrtDt;
        protected String srvcEndDt;
        protected String grpId;
        protected String grpNmTxt;
        protected String subgrpId;
        protected String subgrpNmTxt;
        protected String prodId;
        protected String prodDescTxt;
        protected String ntwkId;
        @XmlElement(name = "Subscriber")
        protected EBSResponse.GetClaimsEOBDetailExResponse.Subscriber subscriber;
        @XmlElement(name = "Patient")
        protected EBSResponse.GetClaimsEOBDetailExResponse.Patient patient;
        @XmlElement(name = "Provider")
        protected EBSResponse.GetClaimsEOBDetailExResponse.Provider provider;
        @XmlElement(name = "Payee")
        protected EBSResponse.GetClaimsEOBDetailExResponse.Payee payee;
        protected String rmtncId;
        protected String totlBilldChrgAmt;
        protected String provDscntTotlAmt;
        protected String totlProvWoAmt;
        protected String mbrLbltyTotlAmt;
        protected String alwdTotlAmt;
        protected String ddctblTotlAmt;
        protected String cpaymntAmt;
        protected String coinsrnAmt;
        protected String othrPayerTotlAmt;
        protected String intrstTotlAmt;
        protected String totlPaidAmt;
        protected String clmTypeOfSrvcWlpCd;
        protected String clmTypeOfSrvcWlpCdDescTxt;
        protected String mbrUtilznRvwPnltyAmt;
        protected String adjstmntRsnSrcCd;
        protected String adjstmntRsnSrcCdDescTxt;
        @XmlElement(name = "LineInfo")
        protected List<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo> lineInfo;
        @XmlElement(name = "SysInfo")
        protected EBSResponse.GetClaimsEOBDetailExResponse.SysInfo sysInfo;

        /**
         * Gets the value of the clmNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmNbr() {
            return clmNbr;
        }

        /**
         * Sets the value of the clmNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmNbr(String value) {
            this.clmNbr = value;
        }

        /**
         * Gets the value of the clmRvsnNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmRvsnNbr() {
            return clmRvsnNbr;
        }

        /**
         * Sets the value of the clmRvsnNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmRvsnNbr(String value) {
            this.clmRvsnNbr = value;
        }

        /**
         * Gets the value of the clmTypeCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmTypeCd() {
            return clmTypeCd;
        }

        /**
         * Sets the value of the clmTypeCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmTypeCd(String value) {
            this.clmTypeCd = value;
        }

        /**
         * Gets the value of the clmSttsWlpCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmSttsWlpCd() {
            return clmSttsWlpCd;
        }

        /**
         * Sets the value of the clmSttsWlpCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmSttsWlpCd(String value) {
            this.clmSttsWlpCd = value;
        }

        /**
         * Gets the value of the clmSttsWlpCdNmTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmSttsWlpCdNmTxt() {
            return clmSttsWlpCdNmTxt;
        }

        /**
         * Sets the value of the clmSttsWlpCdNmTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmSttsWlpCdNmTxt(String value) {
            this.clmSttsWlpCdNmTxt = value;
        }

        /**
         * Gets the value of the chkNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChkNbr() {
            return chkNbr;
        }

        /**
         * Sets the value of the chkNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChkNbr(String value) {
            this.chkNbr = value;
        }

        /**
         * Gets the value of the chkDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChkDt() {
            return chkDt;
        }

        /**
         * Sets the value of the chkDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChkDt(String value) {
            this.chkDt = value;
        }

        /**
         * Gets the value of the placeOfSrvcCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceOfSrvcCd() {
            return placeOfSrvcCd;
        }

        /**
         * Sets the value of the placeOfSrvcCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceOfSrvcCd(String value) {
            this.placeOfSrvcCd = value;
        }

        /**
         * Gets the value of the adjdctnPrcsDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjdctnPrcsDt() {
            return adjdctnPrcsDt;
        }

        /**
         * Sets the value of the adjdctnPrcsDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjdctnPrcsDt(String value) {
            this.adjdctnPrcsDt = value;
        }

        /**
         * Gets the value of the clmRcptDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmRcptDt() {
            return clmRcptDt;
        }

        /**
         * Sets the value of the clmRcptDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmRcptDt(String value) {
            this.clmRcptDt = value;
        }

        /**
         * Gets the value of the srvcStrtDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrvcStrtDt() {
            return srvcStrtDt;
        }

        /**
         * Sets the value of the srvcStrtDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrvcStrtDt(String value) {
            this.srvcStrtDt = value;
        }

        /**
         * Gets the value of the srvcEndDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrvcEndDt() {
            return srvcEndDt;
        }

        /**
         * Sets the value of the srvcEndDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrvcEndDt(String value) {
            this.srvcEndDt = value;
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
         * Gets the value of the grpNmTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrpNmTxt() {
            return grpNmTxt;
        }

        /**
         * Sets the value of the grpNmTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrpNmTxt(String value) {
            this.grpNmTxt = value;
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
         * Gets the value of the subgrpNmTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubgrpNmTxt() {
            return subgrpNmTxt;
        }

        /**
         * Sets the value of the subgrpNmTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubgrpNmTxt(String value) {
            this.subgrpNmTxt = value;
        }

        /**
         * Gets the value of the prodId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProdId() {
            return prodId;
        }

        /**
         * Sets the value of the prodId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProdId(String value) {
            this.prodId = value;
        }

        /**
         * Gets the value of the prodDescTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProdDescTxt() {
            return prodDescTxt;
        }

        /**
         * Sets the value of the prodDescTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProdDescTxt(String value) {
            this.prodDescTxt = value;
        }

        /**
         * Gets the value of the ntwkId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNtwkId() {
            return ntwkId;
        }

        /**
         * Sets the value of the ntwkId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNtwkId(String value) {
            this.ntwkId = value;
        }

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Subscriber }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.Subscriber getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Subscriber }
         *     
         */
        public void setSubscriber(EBSResponse.GetClaimsEOBDetailExResponse.Subscriber value) {
            this.subscriber = value;
        }

        /**
         * Gets the value of the patient property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Patient }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.Patient getPatient() {
            return patient;
        }

        /**
         * Sets the value of the patient property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Patient }
         *     
         */
        public void setPatient(EBSResponse.GetClaimsEOBDetailExResponse.Patient value) {
            this.patient = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Provider }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.Provider getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Provider }
         *     
         */
        public void setProvider(EBSResponse.GetClaimsEOBDetailExResponse.Provider value) {
            this.provider = value;
        }

        /**
         * Gets the value of the payee property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Payee }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.Payee getPayee() {
            return payee;
        }

        /**
         * Sets the value of the payee property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Payee }
         *     
         */
        public void setPayee(EBSResponse.GetClaimsEOBDetailExResponse.Payee value) {
            this.payee = value;
        }

        /**
         * Gets the value of the rmtncId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRmtncId() {
            return rmtncId;
        }

        /**
         * Sets the value of the rmtncId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRmtncId(String value) {
            this.rmtncId = value;
        }

        /**
         * Gets the value of the totlBilldChrgAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotlBilldChrgAmt() {
            return totlBilldChrgAmt;
        }

        /**
         * Sets the value of the totlBilldChrgAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotlBilldChrgAmt(String value) {
            this.totlBilldChrgAmt = value;
        }

        /**
         * Gets the value of the provDscntTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProvDscntTotlAmt() {
            return provDscntTotlAmt;
        }

        /**
         * Sets the value of the provDscntTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProvDscntTotlAmt(String value) {
            this.provDscntTotlAmt = value;
        }

        /**
         * Gets the value of the totlProvWoAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotlProvWoAmt() {
            return totlProvWoAmt;
        }

        /**
         * Sets the value of the totlProvWoAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotlProvWoAmt(String value) {
            this.totlProvWoAmt = value;
        }

        /**
         * Gets the value of the mbrLbltyTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMbrLbltyTotlAmt() {
            return mbrLbltyTotlAmt;
        }

        /**
         * Sets the value of the mbrLbltyTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMbrLbltyTotlAmt(String value) {
            this.mbrLbltyTotlAmt = value;
        }

        /**
         * Gets the value of the alwdTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlwdTotlAmt() {
            return alwdTotlAmt;
        }

        /**
         * Sets the value of the alwdTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlwdTotlAmt(String value) {
            this.alwdTotlAmt = value;
        }

        /**
         * Gets the value of the ddctblTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDdctblTotlAmt() {
            return ddctblTotlAmt;
        }

        /**
         * Sets the value of the ddctblTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDdctblTotlAmt(String value) {
            this.ddctblTotlAmt = value;
        }

        /**
         * Gets the value of the cpaymntAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpaymntAmt() {
            return cpaymntAmt;
        }

        /**
         * Sets the value of the cpaymntAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpaymntAmt(String value) {
            this.cpaymntAmt = value;
        }

        /**
         * Gets the value of the coinsrnAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoinsrnAmt() {
            return coinsrnAmt;
        }

        /**
         * Sets the value of the coinsrnAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoinsrnAmt(String value) {
            this.coinsrnAmt = value;
        }

        /**
         * Gets the value of the othrPayerTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOthrPayerTotlAmt() {
            return othrPayerTotlAmt;
        }

        /**
         * Sets the value of the othrPayerTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOthrPayerTotlAmt(String value) {
            this.othrPayerTotlAmt = value;
        }

        /**
         * Gets the value of the intrstTotlAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntrstTotlAmt() {
            return intrstTotlAmt;
        }

        /**
         * Sets the value of the intrstTotlAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntrstTotlAmt(String value) {
            this.intrstTotlAmt = value;
        }

        /**
         * Gets the value of the totlPaidAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotlPaidAmt() {
            return totlPaidAmt;
        }

        /**
         * Sets the value of the totlPaidAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotlPaidAmt(String value) {
            this.totlPaidAmt = value;
        }

        /**
         * Gets the value of the clmTypeOfSrvcWlpCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmTypeOfSrvcWlpCd() {
            return clmTypeOfSrvcWlpCd;
        }

        /**
         * Sets the value of the clmTypeOfSrvcWlpCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmTypeOfSrvcWlpCd(String value) {
            this.clmTypeOfSrvcWlpCd = value;
        }

        /**
         * Gets the value of the clmTypeOfSrvcWlpCdDescTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmTypeOfSrvcWlpCdDescTxt() {
            return clmTypeOfSrvcWlpCdDescTxt;
        }

        /**
         * Sets the value of the clmTypeOfSrvcWlpCdDescTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmTypeOfSrvcWlpCdDescTxt(String value) {
            this.clmTypeOfSrvcWlpCdDescTxt = value;
        }

        /**
         * Gets the value of the mbrUtilznRvwPnltyAmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMbrUtilznRvwPnltyAmt() {
            return mbrUtilznRvwPnltyAmt;
        }

        /**
         * Sets the value of the mbrUtilznRvwPnltyAmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMbrUtilznRvwPnltyAmt(String value) {
            this.mbrUtilznRvwPnltyAmt = value;
        }

        /**
         * Gets the value of the adjstmntRsnSrcCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjstmntRsnSrcCd() {
            return adjstmntRsnSrcCd;
        }

        /**
         * Sets the value of the adjstmntRsnSrcCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjstmntRsnSrcCd(String value) {
            this.adjstmntRsnSrcCd = value;
        }

        /**
         * Gets the value of the adjstmntRsnSrcCdDescTxt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdjstmntRsnSrcCdDescTxt() {
            return adjstmntRsnSrcCdDescTxt;
        }

        /**
         * Sets the value of the adjstmntRsnSrcCdDescTxt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdjstmntRsnSrcCdDescTxt(String value) {
            this.adjstmntRsnSrcCdDescTxt = value;
        }

        /**
         * Gets the value of the lineInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetClaimsEOBDetailExResponse.LineInfo }
         * 
         * 
         */
        public List<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo> getLineInfo() {
            if (lineInfo == null) {
                lineInfo = new ArrayList<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo>();
            }
            return this.lineInfo;
        }

        /**
         * Gets the value of the sysInfo property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.SysInfo }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.SysInfo getSysInfo() {
            return sysInfo;
        }

        /**
         * Sets the value of the sysInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.SysInfo }
         *     
         */
        public void setSysInfo(EBSResponse.GetClaimsEOBDetailExResponse.SysInfo value) {
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
         *         &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Tx" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="hcpcsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hcpcsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;sequence minOccurs="0">
         *                     &lt;element name="hcpcsMdfrCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="srvcStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="srvcEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billdChrgAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="provDscntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="provWoAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrLbltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="alwdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ddctblAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cpaymntAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsrnAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="othrPayerAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clmTypeSrvcWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clmTypeSrvcWlpCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrUtilznRvwPnltyAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ExplntnCodes" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="entTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rjctRsnWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rjctRsnWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ncvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "clmLnNbr",
            "placeOfSrvcCd",
            "tx",
            "srvcStrtDt",
            "srvcEndDt",
            "billdChrgAmt",
            "provDscntAmt",
            "provWoAmt",
            "mbrLbltyAmt",
            "alwdAmt",
            "ddctblAmt",
            "cpaymntAmt",
            "coinsrnAmt",
            "othrPayerAmt",
            "paidAmt",
            "clmTypeSrvcWlpCd",
            "clmTypeSrvcWlpCdDescTxt",
            "mbrUtilznRvwPnltyAmt",
            "explntnCodes",
            "ncvrdAmt"
        })
        public static class LineInfo {

            protected String clmLnNbr;
            protected String placeOfSrvcCd;
            @XmlElement(name = "Tx")
            protected EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.Tx tx;
            protected String srvcStrtDt;
            protected String srvcEndDt;
            protected String billdChrgAmt;
            protected String provDscntAmt;
            protected String provWoAmt;
            protected String mbrLbltyAmt;
            protected String alwdAmt;
            protected String ddctblAmt;
            protected String cpaymntAmt;
            protected String coinsrnAmt;
            protected String othrPayerAmt;
            protected String paidAmt;
            protected String clmTypeSrvcWlpCd;
            protected String clmTypeSrvcWlpCdDescTxt;
            protected String mbrUtilznRvwPnltyAmt;
            @XmlElement(name = "ExplntnCodes")
            protected List<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.ExplntnCodes> explntnCodes;
            protected String ncvrdAmt;

            /**
             * Gets the value of the clmLnNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClmLnNbr() {
                return clmLnNbr;
            }

            /**
             * Sets the value of the clmLnNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClmLnNbr(String value) {
                this.clmLnNbr = value;
            }

            /**
             * Gets the value of the placeOfSrvcCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfSrvcCd() {
                return placeOfSrvcCd;
            }

            /**
             * Sets the value of the placeOfSrvcCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfSrvcCd(String value) {
                this.placeOfSrvcCd = value;
            }

            /**
             * Gets the value of the tx property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.Tx }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.Tx getTx() {
                return tx;
            }

            /**
             * Sets the value of the tx property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.Tx }
             *     
             */
            public void setTx(EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.Tx value) {
                this.tx = value;
            }

            /**
             * Gets the value of the srvcStrtDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrvcStrtDt() {
                return srvcStrtDt;
            }

            /**
             * Sets the value of the srvcStrtDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrvcStrtDt(String value) {
                this.srvcStrtDt = value;
            }

            /**
             * Gets the value of the srvcEndDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrvcEndDt() {
                return srvcEndDt;
            }

            /**
             * Sets the value of the srvcEndDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrvcEndDt(String value) {
                this.srvcEndDt = value;
            }

            /**
             * Gets the value of the billdChrgAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBilldChrgAmt() {
                return billdChrgAmt;
            }

            /**
             * Sets the value of the billdChrgAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBilldChrgAmt(String value) {
                this.billdChrgAmt = value;
            }

            /**
             * Gets the value of the provDscntAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvDscntAmt() {
                return provDscntAmt;
            }

            /**
             * Sets the value of the provDscntAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvDscntAmt(String value) {
                this.provDscntAmt = value;
            }

            /**
             * Gets the value of the provWoAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvWoAmt() {
                return provWoAmt;
            }

            /**
             * Sets the value of the provWoAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvWoAmt(String value) {
                this.provWoAmt = value;
            }

            /**
             * Gets the value of the mbrLbltyAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrLbltyAmt() {
                return mbrLbltyAmt;
            }

            /**
             * Sets the value of the mbrLbltyAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrLbltyAmt(String value) {
                this.mbrLbltyAmt = value;
            }

            /**
             * Gets the value of the alwdAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlwdAmt() {
                return alwdAmt;
            }

            /**
             * Sets the value of the alwdAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlwdAmt(String value) {
                this.alwdAmt = value;
            }

            /**
             * Gets the value of the ddctblAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDdctblAmt() {
                return ddctblAmt;
            }

            /**
             * Sets the value of the ddctblAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDdctblAmt(String value) {
                this.ddctblAmt = value;
            }

            /**
             * Gets the value of the cpaymntAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpaymntAmt() {
                return cpaymntAmt;
            }

            /**
             * Sets the value of the cpaymntAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpaymntAmt(String value) {
                this.cpaymntAmt = value;
            }

            /**
             * Gets the value of the coinsrnAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoinsrnAmt() {
                return coinsrnAmt;
            }

            /**
             * Sets the value of the coinsrnAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoinsrnAmt(String value) {
                this.coinsrnAmt = value;
            }

            /**
             * Gets the value of the othrPayerAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOthrPayerAmt() {
                return othrPayerAmt;
            }

            /**
             * Sets the value of the othrPayerAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOthrPayerAmt(String value) {
                this.othrPayerAmt = value;
            }

            /**
             * Gets the value of the paidAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaidAmt() {
                return paidAmt;
            }

            /**
             * Sets the value of the paidAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaidAmt(String value) {
                this.paidAmt = value;
            }

            /**
             * Gets the value of the clmTypeSrvcWlpCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClmTypeSrvcWlpCd() {
                return clmTypeSrvcWlpCd;
            }

            /**
             * Sets the value of the clmTypeSrvcWlpCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClmTypeSrvcWlpCd(String value) {
                this.clmTypeSrvcWlpCd = value;
            }

            /**
             * Gets the value of the clmTypeSrvcWlpCdDescTxt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClmTypeSrvcWlpCdDescTxt() {
                return clmTypeSrvcWlpCdDescTxt;
            }

            /**
             * Sets the value of the clmTypeSrvcWlpCdDescTxt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClmTypeSrvcWlpCdDescTxt(String value) {
                this.clmTypeSrvcWlpCdDescTxt = value;
            }

            /**
             * Gets the value of the mbrUtilznRvwPnltyAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrUtilznRvwPnltyAmt() {
                return mbrUtilznRvwPnltyAmt;
            }

            /**
             * Sets the value of the mbrUtilznRvwPnltyAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrUtilznRvwPnltyAmt(String value) {
                this.mbrUtilznRvwPnltyAmt = value;
            }

            /**
             * Gets the value of the explntnCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the explntnCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExplntnCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.ExplntnCodes }
             * 
             * 
             */
            public List<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.ExplntnCodes> getExplntnCodes() {
                if (explntnCodes == null) {
                    explntnCodes = new ArrayList<EBSResponse.GetClaimsEOBDetailExResponse.LineInfo.ExplntnCodes>();
                }
                return this.explntnCodes;
            }

            /**
             * Gets the value of the ncvrdAmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNcvrdAmt() {
                return ncvrdAmt;
            }

            /**
             * Sets the value of the ncvrdAmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNcvrdAmt(String value) {
                this.ncvrdAmt = value;
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
             *         &lt;element name="entTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rjctRsnWlpCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rjctRsnWlpCdNmTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rsnSrcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rsnSrcCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "entTypCd",
                "rjctRsnWlpCd",
                "rjctRsnWlpCdNmTxt",
                "rsnSrcCd",
                "rsnSrcCdDescTxt"
            })
            public static class ExplntnCodes {

                protected String entTypCd;
                protected String rjctRsnWlpCd;
                protected String rjctRsnWlpCdNmTxt;
                protected String rsnSrcCd;
                protected String rsnSrcCdDescTxt;

                /**
                 * Gets the value of the entTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEntTypCd() {
                    return entTypCd;
                }

                /**
                 * Sets the value of the entTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEntTypCd(String value) {
                    this.entTypCd = value;
                }

                /**
                 * Gets the value of the rjctRsnWlpCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRjctRsnWlpCd() {
                    return rjctRsnWlpCd;
                }

                /**
                 * Sets the value of the rjctRsnWlpCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRjctRsnWlpCd(String value) {
                    this.rjctRsnWlpCd = value;
                }

                /**
                 * Gets the value of the rjctRsnWlpCdNmTxt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRjctRsnWlpCdNmTxt() {
                    return rjctRsnWlpCdNmTxt;
                }

                /**
                 * Sets the value of the rjctRsnWlpCdNmTxt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRjctRsnWlpCdNmTxt(String value) {
                    this.rjctRsnWlpCdNmTxt = value;
                }

                /**
                 * Gets the value of the rsnSrcCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRsnSrcCd() {
                    return rsnSrcCd;
                }

                /**
                 * Sets the value of the rsnSrcCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRsnSrcCd(String value) {
                    this.rsnSrcCd = value;
                }

                /**
                 * Gets the value of the rsnSrcCdDescTxt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRsnSrcCdDescTxt() {
                    return rsnSrcCdDescTxt;
                }

                /**
                 * Sets the value of the rsnSrcCdDescTxt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRsnSrcCdDescTxt(String value) {
                    this.rsnSrcCdDescTxt = value;
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
             *         &lt;element name="hcpcsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hcpcsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;sequence minOccurs="0">
             *           &lt;element name="hcpcsMdfrCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="4" minOccurs="0"/>
             *         &lt;/sequence>
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
                "hcpcsCd",
                "hcpcsCdDescTxt",
                "hcpcsMdfrCd"
            })
            public static class Tx {

                protected String hcpcsCd;
                protected String hcpcsCdDescTxt;
                protected List<String> hcpcsMdfrCd;

                /**
                 * Gets the value of the hcpcsCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHcpcsCd() {
                    return hcpcsCd;
                }

                /**
                 * Sets the value of the hcpcsCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHcpcsCd(String value) {
                    this.hcpcsCd = value;
                }

                /**
                 * Gets the value of the hcpcsCdDescTxt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHcpcsCdDescTxt() {
                    return hcpcsCdDescTxt;
                }

                /**
                 * Sets the value of the hcpcsCdDescTxt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHcpcsCdDescTxt(String value) {
                    this.hcpcsCdDescTxt = value;
                }

                /**
                 * Gets the value of the hcpcsMdfrCd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hcpcsMdfrCd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHcpcsMdfrCd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getHcpcsMdfrCd() {
                    if (hcpcsMdfrCd == null) {
                        hcpcsMdfrCd = new ArrayList<String>();
                    }
                    return this.hcpcsMdfrCd;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="hcId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrRltnspCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
         *         &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patAcctNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hcId",
            "mbrSqncNbr",
            "mbrRltnspCd",
            "name",
            "nmSfx",
            "patAcctNbr"
        })
        public static class Patient {

            protected String hcId;
            protected String mbrSqncNbr;
            protected String mbrRltnspCd;
            @XmlElement(name = "Name")
            protected NameType name;
            protected String nmSfx;
            protected String patAcctNbr;

            /**
             * Gets the value of the hcId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHcId() {
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
            public void setHcId(String value) {
                this.hcId = value;
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
             * Gets the value of the mbrRltnspCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrRltnspCd() {
                return mbrRltnspCd;
            }

            /**
             * Sets the value of the mbrRltnspCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrRltnspCd(String value) {
                this.mbrRltnspCd = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the nmSfx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmSfx() {
                return nmSfx;
            }

            /**
             * Sets the value of the nmSfx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmSfx(String value) {
                this.nmSfx = value;
            }

            /**
             * Gets the value of the patAcctNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatAcctNbr() {
                return patAcctNbr;
            }

            /**
             * Sets the value of the patAcctNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatAcctNbr(String value) {
                this.patAcctNbr = value;
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
         *         &lt;element name="payeTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType" minOccurs="0"/>
         *         &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "payeTypeCd",
            "name",
            "fullNm"
        })
        public static class Payee {

            protected String payeTypeCd;
            @XmlElement(name = "Name")
            protected NameType name;
            protected String fullNm;

            /**
             * Gets the value of the payeTypeCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayeTypeCd() {
                return payeTypeCd;
            }

            /**
             * Sets the value of the payeTypeCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayeTypeCd(String value) {
                this.payeTypeCd = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the fullNm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullNm() {
                return fullNm;
            }

            /**
             * Sets the value of the fullNm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullNm(String value) {
                this.fullNm = value;
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
         *         &lt;element name="IDS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="provId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="provIdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="provOrgNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
         *         &lt;element name="fullNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nmSfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="provAgrmntParnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ntwkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "ids",
            "provOrgNm",
            "name",
            "fullNm",
            "nmSfx",
            "provAgrmntParnCd",
            "ntwkId"
        })
        public static class Provider {

            @XmlElement(name = "IDS")
            protected EBSResponse.GetClaimsEOBDetailExResponse.Provider.IDS ids;
            protected String provOrgNm;
            @XmlElement(name = "Name")
            protected NameType name;
            protected String fullNm;
            protected String nmSfx;
            protected String provAgrmntParnCd;
            protected String ntwkId;

            /**
             * Gets the value of the ids property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Provider.IDS }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.Provider.IDS getIDS() {
                return ids;
            }

            /**
             * Sets the value of the ids property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.Provider.IDS }
             *     
             */
            public void setIDS(EBSResponse.GetClaimsEOBDetailExResponse.Provider.IDS value) {
                this.ids = value;
            }

            /**
             * Gets the value of the provOrgNm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvOrgNm() {
                return provOrgNm;
            }

            /**
             * Sets the value of the provOrgNm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvOrgNm(String value) {
                this.provOrgNm = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
            }

            /**
             * Gets the value of the fullNm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullNm() {
                return fullNm;
            }

            /**
             * Sets the value of the fullNm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullNm(String value) {
                this.fullNm = value;
            }

            /**
             * Gets the value of the nmSfx property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmSfx() {
                return nmSfx;
            }

            /**
             * Sets the value of the nmSfx property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmSfx(String value) {
                this.nmSfx = value;
            }

            /**
             * Gets the value of the provAgrmntParnCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProvAgrmntParnCd() {
                return provAgrmntParnCd;
            }

            /**
             * Sets the value of the provAgrmntParnCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProvAgrmntParnCd(String value) {
                this.provAgrmntParnCd = value;
            }

            /**
             * Gets the value of the ntwkId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNtwkId() {
                return ntwkId;
            }

            /**
             * Sets the value of the ntwkId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNtwkId(String value) {
                this.ntwkId = value;
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
             *         &lt;element name="provId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="provIdTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "provId",
                "provIdTypeCd"
            })
            public static class IDS {

                protected String provId;
                protected String provIdTypeCd;

                /**
                 * Gets the value of the provId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProvId() {
                    return provId;
                }

                /**
                 * Sets the value of the provId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProvId(String value) {
                    this.provId = value;
                }

                /**
                 * Gets the value of the provIdTypeCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProvIdTypeCd() {
                    return provIdTypeCd;
                }

                /**
                 * Sets the value of the provIdTypeCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProvIdTypeCd(String value) {
                    this.provIdTypeCd = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0}NameType"/>
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
            "sbscrbrId",
            "name"
        })
        public static class Subscriber {

            protected String sbscrbrId;
            @XmlElement(name = "Name")
            protected NameType name;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link NameType }
             *     
             */
            public NameType getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link NameType }
             *     
             */
            public void setName(NameType value) {
                this.name = value;
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
            "srcSysId"
        })
        public static class SysInfo {

            protected String srcSysId;

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

        }

    }

}
