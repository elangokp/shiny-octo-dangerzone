
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimsadjudicationdetail_v2_02;

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
 *         &lt;element name="GetClmsAdjdctnDtlResp" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="ClmSmry" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="ClmInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ntwkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="drgTrnsfrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Edit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="sftwrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pricing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="DRG" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="drgWt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Submitted" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Derived" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="baseVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Outlier" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="dschrgFrctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="surchrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="avgSemiPrvtRoomRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="AdminInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fnclCmpnyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ovrdCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="clmPrcsStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="clmPrcsEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Errors" maxOccurs="5" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="errCd" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value=""/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="errTypCd" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value=""/>
 *                                                       &lt;enumeration value=""/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="clmPrcsFuncCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="clmPrcsMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="COB" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="cobCarrrNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobCarrPlcyNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobCarrEOBDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobCarrNonCvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cobOrdrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="ClmDtl" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Edit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="clmAdjstmntCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Ref" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TX" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Pricing" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="grprAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="COB" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="nstCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nstCdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="parInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClmsAdjdctnDtlResp"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClmsAdjdctnDtlResp")
    protected EBSResponse.GetClmsAdjdctnDtlResp getClmsAdjdctnDtlResp;

    /**
     * Gets the value of the getClmsAdjdctnDtlResp property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClmsAdjdctnDtlResp }
     *     
     */
    public EBSResponse.GetClmsAdjdctnDtlResp getGetClmsAdjdctnDtlResp() {
        return getClmsAdjdctnDtlResp;
    }

    /**
     * Sets the value of the getClmsAdjdctnDtlResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClmsAdjdctnDtlResp }
     *     
     */
    public void setGetClmsAdjdctnDtlResp(EBSResponse.GetClmsAdjdctnDtlResp value) {
        this.getClmsAdjdctnDtlResp = value;
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
     *         &lt;element name="ClmSmry" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="ClmInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ntwkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="drgTrnsfrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Edit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="sftwrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Pricing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DRG" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="drgWt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Submitted" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Derived" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="baseVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Outlier" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="dschrgFrctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="surchrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="avgSemiPrvtRoomRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="AdminInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fnclCmpnyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ovrdCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="clmPrcsStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="clmPrcsEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Errors" maxOccurs="5" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="errCd" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value=""/>
     *                                             &lt;enumeration value=""/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="errTypCd" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value=""/>
     *                                             &lt;enumeration value=""/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="clmPrcsFuncCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="clmPrcsMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="COB" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="cobCarrrNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobCarrPlcyNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobCarrEOBDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobCarrNonCvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cobOrdrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="ClmDtl" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Edit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="clmAdjstmntCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Ref" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TX" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *                   &lt;element name="Pricing" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="grprAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="COB" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="nstCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nstCdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="parInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "clmSmry",
        "clmDtl"
    })
    public static class GetClmsAdjdctnDtlResp {

        @XmlElement(name = "ClmSmry")
        protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry clmSmry;
        @XmlElement(name = "ClmDtl")
        protected List<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl> clmDtl;

        /**
         * Gets the value of the clmSmry property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry }
         *     
         */
        public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry getClmSmry() {
            return clmSmry;
        }

        /**
         * Sets the value of the clmSmry property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry }
         *     
         */
        public void setClmSmry(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry value) {
            this.clmSmry = value;
        }

        /**
         * Gets the value of the clmDtl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clmDtl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClmDtl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl }
         * 
         * 
         */
        public List<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl> getClmDtl() {
            if (clmDtl == null) {
                clmDtl = new ArrayList<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl>();
            }
            return this.clmDtl;
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
         *         &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Edit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="clmAdjstmntCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Ref" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TX" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="Pricing" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="grprAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="COB" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="nstCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nstCdDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="parInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "edit",
            "pricing",
            "cob",
            "nstCd",
            "nstCdDesc",
            "parInd",
            "bnftCd"
        })
        public static class ClmDtl {

            protected String clmLnNbr;
            @XmlElement(name = "Edit")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit edit;
            @XmlElement(name = "Pricing")
            protected List<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Pricing> pricing;
            @XmlElement(name = "COB")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.COB cob;
            protected String nstCd;
            protected String nstCdDesc;
            protected String parInd;
            protected String bnftCd;

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
             * Gets the value of the edit property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit getEdit() {
                return edit;
            }

            /**
             * Sets the value of the edit property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit }
             *     
             */
            public void setEdit(EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit value) {
                this.edit = value;
            }

            /**
             * Gets the value of the pricing property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricing property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricing().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Pricing }
             * 
             * 
             */
            public List<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Pricing> getPricing() {
                if (pricing == null) {
                    pricing = new ArrayList<EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Pricing>();
                }
                return this.pricing;
            }

            /**
             * Gets the value of the cob property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.COB }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.COB getCOB() {
                return cob;
            }

            /**
             * Sets the value of the cob property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.COB }
             *     
             */
            public void setCOB(EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.COB value) {
                this.cob = value;
            }

            /**
             * Gets the value of the nstCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNstCd() {
                return nstCd;
            }

            /**
             * Sets the value of the nstCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNstCd(String value) {
                this.nstCd = value;
            }

            /**
             * Gets the value of the nstCdDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNstCdDesc() {
                return nstCdDesc;
            }

            /**
             * Sets the value of the nstCdDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNstCdDesc(String value) {
                this.nstCdDesc = value;
            }

            /**
             * Gets the value of the parInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParInd() {
                return parInd;
            }

            /**
             * Sets the value of the parInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParInd(String value) {
                this.parInd = value;
            }

            /**
             * Gets the value of the bnftCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBnftCd() {
                return bnftCd;
            }

            /**
             * Sets the value of the bnftCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBnftCd(String value) {
                this.bnftCd = value;
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
             *         &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "cobPdAmt"
            })
            public static class COB {

                protected String cobPdAmt;

                /**
                 * Gets the value of the cobPdAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobPdAmt() {
                    return cobPdAmt;
                }

                /**
                 * Sets the value of the cobPdAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobPdAmt(String value) {
                    this.cobPdAmt = value;
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
             *         &lt;element name="clmAdjstmntCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Ref" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TX" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "clmAdjstmntCd",
                "ref"
            })
            public static class Edit {

                protected String clmAdjstmntCd;
                @XmlElement(name = "Ref")
                protected EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref ref;

                /**
                 * Gets the value of the clmAdjstmntCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClmAdjstmntCd() {
                    return clmAdjstmntCd;
                }

                /**
                 * Sets the value of the clmAdjstmntCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClmAdjstmntCd(String value) {
                    this.clmAdjstmntCd = value;
                }

                /**
                 * Gets the value of the ref property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref }
                 *     
                 */
                public EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref getRef() {
                    return ref;
                }

                /**
                 * Sets the value of the ref property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref }
                 *     
                 */
                public void setRef(EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref value) {
                    this.ref = value;
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
                 *         &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TX" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "clmLnNbr",
                    "tx"
                })
                public static class Ref {

                    protected String clmNbr;
                    protected String clmLnNbr;
                    @XmlElement(name = "TX")
                    protected EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref.TX tx;

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
                     * Gets the value of the tx property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref.TX }
                     *     
                     */
                    public EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref.TX getTX() {
                        return tx;
                    }

                    /**
                     * Sets the value of the tx property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref.TX }
                     *     
                     */
                    public void setTX(EBSResponse.GetClmsAdjdctnDtlResp.ClmDtl.Edit.Ref.TX value) {
                        this.tx = value;
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
                     *         &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "hlthSrvcCd",
                        "hlthSrvcCdTypCd"
                    })
                    public static class TX {

                        protected String hlthSrvcCd;
                        protected String hlthSrvcCdTypCd;

                        /**
                         * Gets the value of the hlthSrvcCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getHlthSrvcCd() {
                            return hlthSrvcCd;
                        }

                        /**
                         * Sets the value of the hlthSrvcCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setHlthSrvcCd(String value) {
                            this.hlthSrvcCd = value;
                        }

                        /**
                         * Gets the value of the hlthSrvcCdTypCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getHlthSrvcCdTypCd() {
                            return hlthSrvcCdTypCd;
                        }

                        /**
                         * Sets the value of the hlthSrvcCdTypCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setHlthSrvcCdTypCd(String value) {
                            this.hlthSrvcCdTypCd = value;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="grprAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "prcMthdCd",
                "drgCd",
                "grprAmt",
                "totlBnftRdctn",
                "pdRt",
                "totlPaidAmt"
            })
            public static class Pricing {

                protected String prcMthdCd;
                protected String drgCd;
                protected String grprAmt;
                protected String totlBnftRdctn;
                protected String pdRt;
                protected String totlPaidAmt;

                /**
                 * Gets the value of the prcMthdCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrcMthdCd() {
                    return prcMthdCd;
                }

                /**
                 * Sets the value of the prcMthdCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrcMthdCd(String value) {
                    this.prcMthdCd = value;
                }

                /**
                 * Gets the value of the drgCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrgCd() {
                    return drgCd;
                }

                /**
                 * Sets the value of the drgCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrgCd(String value) {
                    this.drgCd = value;
                }

                /**
                 * Gets the value of the grprAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrprAmt() {
                    return grprAmt;
                }

                /**
                 * Sets the value of the grprAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrprAmt(String value) {
                    this.grprAmt = value;
                }

                /**
                 * Gets the value of the totlBnftRdctn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotlBnftRdctn() {
                    return totlBnftRdctn;
                }

                /**
                 * Sets the value of the totlBnftRdctn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotlBnftRdctn(String value) {
                    this.totlBnftRdctn = value;
                }

                /**
                 * Gets the value of the pdRt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPdRt() {
                    return pdRt;
                }

                /**
                 * Sets the value of the pdRt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPdRt(String value) {
                    this.pdRt = value;
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
         *         &lt;element name="ClmInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ntwkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="drgTrnsfrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Edit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="sftwrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Pricing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DRG" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="drgWt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Submitted" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Derived" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="baseVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Outlier" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="dschrgFrctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="surchrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="avgSemiPrvtRoomRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="AdminInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fnclCmpnyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ovrdCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="clmPrcsStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="clmPrcsEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Errors" maxOccurs="5" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="errCd" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value=""/>
         *                                   &lt;enumeration value=""/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="errTypCd" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value=""/>
         *                                   &lt;enumeration value=""/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="clmPrcsFuncCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="clmPrcsMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="COB" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="cobCarrrNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobCarrPlcyNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobCarrEOBDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobCarrNonCvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cobOrdrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "clmInfo",
            "edit",
            "pricing",
            "adminInfo",
            "cob"
        })
        public static class ClmSmry {

            @XmlElement(name = "ClmInfo")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.ClmInfo clmInfo;
            @XmlElement(name = "Edit")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Edit edit;
            @XmlElement(name = "Pricing")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing pricing;
            @XmlElement(name = "AdminInfo")
            protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo adminInfo;
            @XmlElement(name = "COB")
            protected List<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.COB> cob;

            /**
             * Gets the value of the clmInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.ClmInfo }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.ClmInfo getClmInfo() {
                return clmInfo;
            }

            /**
             * Sets the value of the clmInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.ClmInfo }
             *     
             */
            public void setClmInfo(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.ClmInfo value) {
                this.clmInfo = value;
            }

            /**
             * Gets the value of the edit property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Edit }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Edit getEdit() {
                return edit;
            }

            /**
             * Sets the value of the edit property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Edit }
             *     
             */
            public void setEdit(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Edit value) {
                this.edit = value;
            }

            /**
             * Gets the value of the pricing property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing getPricing() {
                return pricing;
            }

            /**
             * Sets the value of the pricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing }
             *     
             */
            public void setPricing(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing value) {
                this.pricing = value;
            }

            /**
             * Gets the value of the adminInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo }
             *     
             */
            public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo getAdminInfo() {
                return adminInfo;
            }

            /**
             * Sets the value of the adminInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo }
             *     
             */
            public void setAdminInfo(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo value) {
                this.adminInfo = value;
            }

            /**
             * Gets the value of the cob property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cob property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCOB().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.COB }
             * 
             * 
             */
            public List<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.COB> getCOB() {
                if (cob == null) {
                    cob = new ArrayList<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.COB>();
                }
                return this.cob;
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
             *         &lt;element name="fnclCmpnyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ovrdCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="clmPrcsStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="clmPrcsEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Errors" maxOccurs="5" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="errCd" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value=""/>
             *                         &lt;enumeration value=""/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="errTypCd" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value=""/>
             *                         &lt;enumeration value=""/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="clmPrcsFuncCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="clmPrcsMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "fnclCmpnyCd",
                "ovrdCd",
                "clmPrcsStrtDt",
                "clmPrcsEndDt",
                "errors",
                "clmPrcsFuncCd",
                "clmPrcsMthdCd"
            })
            public static class AdminInfo {

                protected String fnclCmpnyCd;
                protected List<String> ovrdCd;
                protected String clmPrcsStrtDt;
                protected String clmPrcsEndDt;
                @XmlElement(name = "Errors")
                protected List<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo.Errors> errors;
                protected String clmPrcsFuncCd;
                protected String clmPrcsMthdCd;

                /**
                 * Gets the value of the fnclCmpnyCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFnclCmpnyCd() {
                    return fnclCmpnyCd;
                }

                /**
                 * Sets the value of the fnclCmpnyCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFnclCmpnyCd(String value) {
                    this.fnclCmpnyCd = value;
                }

                /**
                 * Gets the value of the ovrdCd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ovrdCd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOvrdCd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getOvrdCd() {
                    if (ovrdCd == null) {
                        ovrdCd = new ArrayList<String>();
                    }
                    return this.ovrdCd;
                }

                /**
                 * Gets the value of the clmPrcsStrtDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClmPrcsStrtDt() {
                    return clmPrcsStrtDt;
                }

                /**
                 * Sets the value of the clmPrcsStrtDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClmPrcsStrtDt(String value) {
                    this.clmPrcsStrtDt = value;
                }

                /**
                 * Gets the value of the clmPrcsEndDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClmPrcsEndDt() {
                    return clmPrcsEndDt;
                }

                /**
                 * Sets the value of the clmPrcsEndDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClmPrcsEndDt(String value) {
                    this.clmPrcsEndDt = value;
                }

                /**
                 * Gets the value of the errors property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the errors property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getErrors().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo.Errors }
                 * 
                 * 
                 */
                public List<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo.Errors> getErrors() {
                    if (errors == null) {
                        errors = new ArrayList<EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.AdminInfo.Errors>();
                    }
                    return this.errors;
                }

                /**
                 * Gets the value of the clmPrcsFuncCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClmPrcsFuncCd() {
                    return clmPrcsFuncCd;
                }

                /**
                 * Sets the value of the clmPrcsFuncCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClmPrcsFuncCd(String value) {
                    this.clmPrcsFuncCd = value;
                }

                /**
                 * Gets the value of the clmPrcsMthdCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClmPrcsMthdCd() {
                    return clmPrcsMthdCd;
                }

                /**
                 * Sets the value of the clmPrcsMthdCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClmPrcsMthdCd(String value) {
                    this.clmPrcsMthdCd = value;
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
                 *         &lt;element name="errCd" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value=""/>
                 *               &lt;enumeration value=""/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="errTypCd" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value=""/>
                 *               &lt;enumeration value=""/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
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
                    "errCd",
                    "errTypCd"
                })
                public static class Errors {

                    protected String errCd;
                    protected String errTypCd;

                    /**
                     * Gets the value of the errCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getErrCd() {
                        return errCd;
                    }

                    /**
                     * Sets the value of the errCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setErrCd(String value) {
                        this.errCd = value;
                    }

                    /**
                     * Gets the value of the errTypCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getErrTypCd() {
                        return errTypCd;
                    }

                    /**
                     * Sets the value of the errTypCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setErrTypCd(String value) {
                        this.errTypCd = value;
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
             *         &lt;element name="cobCarrrNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobCarrPlcyNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobCarrEOBDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobCarrNonCvrdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobPdAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cobOrdrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "cobCarrrNm",
                "cobCarrPlcyNbr",
                "cobCarrEOBDt",
                "cobCarrNonCvrdAmt",
                "cobPdAmt",
                "cobSttsCd",
                "cobOrdrCd"
            })
            public static class COB {

                protected String cobCarrrNm;
                protected String cobCarrPlcyNbr;
                protected String cobCarrEOBDt;
                protected String cobCarrNonCvrdAmt;
                protected String cobPdAmt;
                protected String cobSttsCd;
                protected String cobOrdrCd;

                /**
                 * Gets the value of the cobCarrrNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobCarrrNm() {
                    return cobCarrrNm;
                }

                /**
                 * Sets the value of the cobCarrrNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobCarrrNm(String value) {
                    this.cobCarrrNm = value;
                }

                /**
                 * Gets the value of the cobCarrPlcyNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobCarrPlcyNbr() {
                    return cobCarrPlcyNbr;
                }

                /**
                 * Sets the value of the cobCarrPlcyNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobCarrPlcyNbr(String value) {
                    this.cobCarrPlcyNbr = value;
                }

                /**
                 * Gets the value of the cobCarrEOBDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobCarrEOBDt() {
                    return cobCarrEOBDt;
                }

                /**
                 * Sets the value of the cobCarrEOBDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobCarrEOBDt(String value) {
                    this.cobCarrEOBDt = value;
                }

                /**
                 * Gets the value of the cobCarrNonCvrdAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobCarrNonCvrdAmt() {
                    return cobCarrNonCvrdAmt;
                }

                /**
                 * Sets the value of the cobCarrNonCvrdAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobCarrNonCvrdAmt(String value) {
                    this.cobCarrNonCvrdAmt = value;
                }

                /**
                 * Gets the value of the cobPdAmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobPdAmt() {
                    return cobPdAmt;
                }

                /**
                 * Sets the value of the cobPdAmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobPdAmt(String value) {
                    this.cobPdAmt = value;
                }

                /**
                 * Gets the value of the cobSttsCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobSttsCd() {
                    return cobSttsCd;
                }

                /**
                 * Sets the value of the cobSttsCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobSttsCd(String value) {
                    this.cobSttsCd = value;
                }

                /**
                 * Gets the value of the cobOrdrCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCobOrdrCd() {
                    return cobOrdrCd;
                }

                /**
                 * Sets the value of the cobOrdrCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCobOrdrCd(String value) {
                    this.cobOrdrCd = value;
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
             *         &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ntwkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="drgTrnsfrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="bnftCd" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/>
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
                "ntwkInd",
                "drgCd",
                "drgTrnsfrFlag",
                "bnftCd"
            })
            public static class ClmInfo {

                protected String clmNbr;
                protected String clmRvsnNbr;
                protected String ntwkInd;
                protected String drgCd;
                protected String drgTrnsfrFlag;
                protected List<String> bnftCd;

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
                 * Gets the value of the ntwkInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNtwkInd() {
                    return ntwkInd;
                }

                /**
                 * Sets the value of the ntwkInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNtwkInd(String value) {
                    this.ntwkInd = value;
                }

                /**
                 * Gets the value of the drgCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrgCd() {
                    return drgCd;
                }

                /**
                 * Sets the value of the drgCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrgCd(String value) {
                    this.drgCd = value;
                }

                /**
                 * Gets the value of the drgTrnsfrFlag property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDrgTrnsfrFlag() {
                    return drgTrnsfrFlag;
                }

                /**
                 * Sets the value of the drgTrnsfrFlag property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDrgTrnsfrFlag(String value) {
                    this.drgTrnsfrFlag = value;
                }

                /**
                 * Gets the value of the bnftCd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bnftCd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBnftCd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getBnftCd() {
                    if (bnftCd == null) {
                        bnftCd = new ArrayList<String>();
                    }
                    return this.bnftCd;
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
             *         &lt;element name="sftwrCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "sftwrCd"
            })
            public static class Edit {

                protected String sftwrCd;

                /**
                 * Gets the value of the sftwrCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSftwrCd() {
                    return sftwrCd;
                }

                /**
                 * Sets the value of the sftwrCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSftwrCd(String value) {
                    this.sftwrCd = value;
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
             *         &lt;element name="prcMthdCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DRG" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="drgWt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Submitted" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Derived" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="baseVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Outlier" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="dschrgFrctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="surchrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="totlBnftRdctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="pdRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="avgSemiPrvtRoomRt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "prcMthdCd",
                "drg",
                "surchrg",
                "totlBnftRdctn",
                "pdRt",
                "avgSemiPrvtRoomRt"
            })
            public static class Pricing {

                protected String prcMthdCd;
                @XmlElement(name = "DRG")
                protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG drg;
                protected String surchrg;
                protected String totlBnftRdctn;
                protected String pdRt;
                protected String avgSemiPrvtRoomRt;

                /**
                 * Gets the value of the prcMthdCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrcMthdCd() {
                    return prcMthdCd;
                }

                /**
                 * Sets the value of the prcMthdCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrcMthdCd(String value) {
                    this.prcMthdCd = value;
                }

                /**
                 * Gets the value of the drg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG }
                 *     
                 */
                public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG getDRG() {
                    return drg;
                }

                /**
                 * Sets the value of the drg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG }
                 *     
                 */
                public void setDRG(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG value) {
                    this.drg = value;
                }

                /**
                 * Gets the value of the surchrg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSurchrg() {
                    return surchrg;
                }

                /**
                 * Sets the value of the surchrg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSurchrg(String value) {
                    this.surchrg = value;
                }

                /**
                 * Gets the value of the totlBnftRdctn property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotlBnftRdctn() {
                    return totlBnftRdctn;
                }

                /**
                 * Sets the value of the totlBnftRdctn property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotlBnftRdctn(String value) {
                    this.totlBnftRdctn = value;
                }

                /**
                 * Gets the value of the pdRt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPdRt() {
                    return pdRt;
                }

                /**
                 * Sets the value of the pdRt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPdRt(String value) {
                    this.pdRt = value;
                }

                /**
                 * Gets the value of the avgSemiPrvtRoomRt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAvgSemiPrvtRoomRt() {
                    return avgSemiPrvtRoomRt;
                }

                /**
                 * Sets the value of the avgSemiPrvtRoomRt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAvgSemiPrvtRoomRt(String value) {
                    this.avgSemiPrvtRoomRt = value;
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
                 *         &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="drgWt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Submitted" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Derived" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="baseVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Outlier" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="totlPaidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="dschrgFrctn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "drgCd",
                    "drgWt",
                    "submitted",
                    "derived",
                    "baseVal",
                    "outlier",
                    "totlPaidAmt",
                    "dschrgFrctn"
                })
                public static class DRG {

                    protected String drgCd;
                    protected String drgWt;
                    @XmlElement(name = "Submitted")
                    protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Submitted submitted;
                    @XmlElement(name = "Derived")
                    protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Derived derived;
                    protected String baseVal;
                    @XmlElement(name = "Outlier")
                    protected EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Outlier outlier;
                    protected String totlPaidAmt;
                    protected String dschrgFrctn;

                    /**
                     * Gets the value of the drgCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDrgCd() {
                        return drgCd;
                    }

                    /**
                     * Sets the value of the drgCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDrgCd(String value) {
                        this.drgCd = value;
                    }

                    /**
                     * Gets the value of the drgWt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDrgWt() {
                        return drgWt;
                    }

                    /**
                     * Sets the value of the drgWt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDrgWt(String value) {
                        this.drgWt = value;
                    }

                    /**
                     * Gets the value of the submitted property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Submitted }
                     *     
                     */
                    public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Submitted getSubmitted() {
                        return submitted;
                    }

                    /**
                     * Sets the value of the submitted property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Submitted }
                     *     
                     */
                    public void setSubmitted(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Submitted value) {
                        this.submitted = value;
                    }

                    /**
                     * Gets the value of the derived property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Derived }
                     *     
                     */
                    public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Derived getDerived() {
                        return derived;
                    }

                    /**
                     * Sets the value of the derived property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Derived }
                     *     
                     */
                    public void setDerived(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Derived value) {
                        this.derived = value;
                    }

                    /**
                     * Gets the value of the baseVal property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBaseVal() {
                        return baseVal;
                    }

                    /**
                     * Sets the value of the baseVal property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBaseVal(String value) {
                        this.baseVal = value;
                    }

                    /**
                     * Gets the value of the outlier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Outlier }
                     *     
                     */
                    public EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Outlier getOutlier() {
                        return outlier;
                    }

                    /**
                     * Sets the value of the outlier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Outlier }
                     *     
                     */
                    public void setOutlier(EBSResponse.GetClmsAdjdctnDtlResp.ClmSmry.Pricing.DRG.Outlier value) {
                        this.outlier = value;
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
                     * Gets the value of the dschrgFrctn property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDschrgFrctn() {
                        return dschrgFrctn;
                    }

                    /**
                     * Sets the value of the dschrgFrctn property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDschrgFrctn(String value) {
                        this.dschrgFrctn = value;
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
                     *         &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "drgCd"
                    })
                    public static class Derived {

                        protected String drgCd;

                        /**
                         * Gets the value of the drgCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDrgCd() {
                            return drgCd;
                        }

                        /**
                         * Sets the value of the drgCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDrgCd(String value) {
                            this.drgCd = value;
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
                     *         &lt;element name="paidAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="rsnCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "paidAmt",
                        "rsnCd"
                    })
                    public static class Outlier {

                        protected String paidAmt;
                        protected String rsnCd;

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
                         * Gets the value of the rsnCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRsnCd() {
                            return rsnCd;
                        }

                        /**
                         * Sets the value of the rsnCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRsnCd(String value) {
                            this.rsnCd = value;
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
                     *         &lt;element name="drgCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "drgCd"
                    })
                    public static class Submitted {

                        protected String drgCd;

                        /**
                         * Gets the value of the drgCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDrgCd() {
                            return drgCd;
                        }

                        /**
                         * Sets the value of the drgCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDrgCd(String value) {
                            this.drgCd = value;
                        }

                    }

                }

            }

        }

    }

}
