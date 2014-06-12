
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03;

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
 *         &lt;element name="GetMemberClaimsDetailResp" maxOccurs="7" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Counters" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="lineDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noteDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disambgtnKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="claimSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Patient" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03}NameType" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimLine" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Medicare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="medicareAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="medicareDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="medicarePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="medicarePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="HCPCS" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hcpcsCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ICD" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="illnsDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Units" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="unitMeasureCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Rejected" maxOccurs="13" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Disallowed" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DuplicateClaim" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RevenueCode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ub92RevenueCodeDescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CDHP" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Disallowed" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="ClaimLineErrorCodeList" maxOccurs="15" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ClaimLineErrorWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HipaaClaimStatusCodes" maxOccurs="3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                       &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                       &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HealthServiceCode" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                       &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                                       &lt;element name="hlthSrvcCdModCd" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
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
 *                   &lt;element name="ClaimNotes" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ListLengths" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="ClaimLine" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ClaimNote" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getMemberClaimsDetailResp"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetMemberClaimsDetailResp")
    protected List<EBSResponse.GetMemberClaimsDetailResp> getMemberClaimsDetailResp;

    /**
     * Gets the value of the getMemberClaimsDetailResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMemberClaimsDetailResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetMemberClaimsDetailResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSResponse.GetMemberClaimsDetailResp }
     * 
     * 
     */
    public List<EBSResponse.GetMemberClaimsDetailResp> getGetMemberClaimsDetailResp() {
        if (getMemberClaimsDetailResp == null) {
            getMemberClaimsDetailResp = new ArrayList<EBSResponse.GetMemberClaimsDetailResp>();
        }
        return this.getMemberClaimsDetailResp;
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
     *         &lt;element name="Counters" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="lineDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noteDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disambgtnKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="claimSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Patient" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03}NameType" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClaimLine" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Medicare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="medicareAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="medicareDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="medicarePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="medicarePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="HCPCS" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hcpcsCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ICD" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="illnsDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Units" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="unitMeasureCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Rejected" maxOccurs="13" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Disallowed" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DuplicateClaim" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RevenueCode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ub92RevenueCodeDescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CDHP" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Disallowed" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="ClaimLineErrorCodeList" maxOccurs="15" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ClaimLineErrorWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HipaaClaimStatusCodes" maxOccurs="3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                             &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                             &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HealthServiceCode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                             &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                             &lt;element name="hlthSrvcCdModCd" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
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
     *         &lt;element name="ClaimNotes" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ListLengths" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="ClaimLine" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ClaimNote" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "counters",
        "claimNumber",
        "disambgtnKey",
        "claimSequenceNbr",
        "patient",
        "claimLine",
        "claimNotes",
        "listLengths"
    })
    public static class GetMemberClaimsDetailResp {

        @XmlElement(name = "Counters")
        protected EBSResponse.GetMemberClaimsDetailResp.Counters counters;
        protected String claimNumber;
        protected String disambgtnKey;
        protected String claimSequenceNbr;
        @XmlElement(name = "Patient")
        protected EBSResponse.GetMemberClaimsDetailResp.Patient patient;
        @XmlElement(name = "ClaimLine")
        protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine> claimLine;
        @XmlElement(name = "ClaimNotes")
        protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimNotes> claimNotes;
        @XmlElement(name = "ListLengths")
        protected EBSResponse.GetMemberClaimsDetailResp.ListLengths listLengths;

        /**
         * Gets the value of the counters property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.Counters }
         *     
         */
        public EBSResponse.GetMemberClaimsDetailResp.Counters getCounters() {
            return counters;
        }

        /**
         * Sets the value of the counters property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.Counters }
         *     
         */
        public void setCounters(EBSResponse.GetMemberClaimsDetailResp.Counters value) {
            this.counters = value;
        }

        /**
         * Gets the value of the claimNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaimNumber() {
            return claimNumber;
        }

        /**
         * Sets the value of the claimNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaimNumber(String value) {
            this.claimNumber = value;
        }

        /**
         * Gets the value of the disambgtnKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisambgtnKey() {
            return disambgtnKey;
        }

        /**
         * Sets the value of the disambgtnKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisambgtnKey(String value) {
            this.disambgtnKey = value;
        }

        /**
         * Gets the value of the claimSequenceNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClaimSequenceNbr() {
            return claimSequenceNbr;
        }

        /**
         * Sets the value of the claimSequenceNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClaimSequenceNbr(String value) {
            this.claimSequenceNbr = value;
        }

        /**
         * Gets the value of the patient property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.Patient }
         *     
         */
        public EBSResponse.GetMemberClaimsDetailResp.Patient getPatient() {
            return patient;
        }

        /**
         * Sets the value of the patient property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.Patient }
         *     
         */
        public void setPatient(EBSResponse.GetMemberClaimsDetailResp.Patient value) {
            this.patient = value;
        }

        /**
         * Gets the value of the claimLine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claimLine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaimLine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine }
         * 
         * 
         */
        public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine> getClaimLine() {
            if (claimLine == null) {
                claimLine = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine>();
            }
            return this.claimLine;
        }

        /**
         * Gets the value of the claimNotes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claimNotes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaimNotes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimNotes }
         * 
         * 
         */
        public List<EBSResponse.GetMemberClaimsDetailResp.ClaimNotes> getClaimNotes() {
            if (claimNotes == null) {
                claimNotes = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimNotes>();
            }
            return this.claimNotes;
        }

        /**
         * Gets the value of the listLengths property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths }
         *     
         */
        public EBSResponse.GetMemberClaimsDetailResp.ListLengths getListLengths() {
            return listLengths;
        }

        /**
         * Sets the value of the listLengths property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths }
         *     
         */
        public void setListLengths(EBSResponse.GetMemberClaimsDetailResp.ListLengths value) {
            this.listLengths = value;
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
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineOriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Medicare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="medicareAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="medicareDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="medicarePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="medicarePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="HCPCS" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hcpcsCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ICD" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="illnsDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Units" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="unitMeasureCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Rejected" maxOccurs="13" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Disallowed" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DuplicateClaim" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RevenueCode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ub92RevenueCodeDescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CDHP" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Disallowed" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="ClaimLineErrorCodeList" maxOccurs="15" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ClaimLineErrorWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HipaaClaimStatusCodes" maxOccurs="3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                   &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                   &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HealthServiceCode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                   &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *                   &lt;element name="hlthSrvcCdModCd" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
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
            "claimLineNumber",
            "claimLineOriginCode",
            "providerAgreementMethodWlpCode",
            "serviceStartDate",
            "serviceEndDate",
            "billedChargeAmount",
            "deductibleAmount",
            "copaymentAmount",
            "coinsuranceAmount",
            "allowedAmount",
            "paidAmount",
            "memberLiabilityAmount",
            "nonCoveredAmount",
            "providerDiscountAmount",
            "medicare",
            "placeOfServiceWlpCode",
            "placeOfServiceWlpCodeDescriptionText",
            "hcpcs",
            "icd",
            "illnsDt",
            "ndc",
            "claimTypeOfServiceWlpCode",
            "claimTypeOfServiceWlpCodeDescriptionText",
            "units",
            "rejected",
            "disallowed",
            "duplicateClaim",
            "revenueCode",
            "claimLineStatusWlpCode",
            "claimLineStatusWlpCodeNameText",
            "cdhp",
            "claimLineErrorCodeList",
            "hipaaClaimStatusCodes",
            "healthServiceCode"
        })
        public static class ClaimLine {

            protected String claimLineNumber;
            protected String claimLineOriginCode;
            protected String providerAgreementMethodWlpCode;
            protected String serviceStartDate;
            protected String serviceEndDate;
            protected String billedChargeAmount;
            protected String deductibleAmount;
            protected String copaymentAmount;
            protected String coinsuranceAmount;
            protected String allowedAmount;
            protected String paidAmount;
            protected String memberLiabilityAmount;
            protected String nonCoveredAmount;
            protected String providerDiscountAmount;
            @XmlElement(name = "Medicare")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Medicare medicare;
            protected String placeOfServiceWlpCode;
            protected String placeOfServiceWlpCodeDescriptionText;
            @XmlElement(name = "HCPCS")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HCPCS hcpcs;
            @XmlElement(name = "ICD")
            protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ICD> icd;
            protected String illnsDt;
            @XmlElement(name = "nDC")
            protected String ndc;
            protected String claimTypeOfServiceWlpCode;
            protected String claimTypeOfServiceWlpCodeDescriptionText;
            @XmlElement(name = "Units")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Units units;
            @XmlElement(name = "Rejected")
            protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Rejected> rejected;
            @XmlElement(name = "Disallowed")
            protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Disallowed> disallowed;
            @XmlElement(name = "DuplicateClaim")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.DuplicateClaim duplicateClaim;
            @XmlElement(name = "RevenueCode")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.RevenueCode revenueCode;
            protected String claimLineStatusWlpCode;
            protected String claimLineStatusWlpCodeNameText;
            @XmlElement(name = "CDHP")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP cdhp;
            @XmlElement(name = "ClaimLineErrorCodeList")
            protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ClaimLineErrorCodeList> claimLineErrorCodeList;
            @XmlElement(name = "HipaaClaimStatusCodes")
            protected List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HipaaClaimStatusCodes> hipaaClaimStatusCodes;
            @XmlElement(name = "HealthServiceCode")
            protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HealthServiceCode healthServiceCode;

            /**
             * Gets the value of the claimLineNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineNumber() {
                return claimLineNumber;
            }

            /**
             * Sets the value of the claimLineNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineNumber(String value) {
                this.claimLineNumber = value;
            }

            /**
             * Gets the value of the claimLineOriginCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineOriginCode() {
                return claimLineOriginCode;
            }

            /**
             * Sets the value of the claimLineOriginCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineOriginCode(String value) {
                this.claimLineOriginCode = value;
            }

            /**
             * Gets the value of the providerAgreementMethodWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderAgreementMethodWlpCode() {
                return providerAgreementMethodWlpCode;
            }

            /**
             * Sets the value of the providerAgreementMethodWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderAgreementMethodWlpCode(String value) {
                this.providerAgreementMethodWlpCode = value;
            }

            /**
             * Gets the value of the serviceStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceStartDate() {
                return serviceStartDate;
            }

            /**
             * Sets the value of the serviceStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceStartDate(String value) {
                this.serviceStartDate = value;
            }

            /**
             * Gets the value of the serviceEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceEndDate() {
                return serviceEndDate;
            }

            /**
             * Sets the value of the serviceEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceEndDate(String value) {
                this.serviceEndDate = value;
            }

            /**
             * Gets the value of the billedChargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBilledChargeAmount() {
                return billedChargeAmount;
            }

            /**
             * Sets the value of the billedChargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBilledChargeAmount(String value) {
                this.billedChargeAmount = value;
            }

            /**
             * Gets the value of the deductibleAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeductibleAmount() {
                return deductibleAmount;
            }

            /**
             * Sets the value of the deductibleAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeductibleAmount(String value) {
                this.deductibleAmount = value;
            }

            /**
             * Gets the value of the copaymentAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCopaymentAmount() {
                return copaymentAmount;
            }

            /**
             * Sets the value of the copaymentAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCopaymentAmount(String value) {
                this.copaymentAmount = value;
            }

            /**
             * Gets the value of the coinsuranceAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoinsuranceAmount() {
                return coinsuranceAmount;
            }

            /**
             * Sets the value of the coinsuranceAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoinsuranceAmount(String value) {
                this.coinsuranceAmount = value;
            }

            /**
             * Gets the value of the allowedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllowedAmount() {
                return allowedAmount;
            }

            /**
             * Sets the value of the allowedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllowedAmount(String value) {
                this.allowedAmount = value;
            }

            /**
             * Gets the value of the paidAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaidAmount() {
                return paidAmount;
            }

            /**
             * Sets the value of the paidAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaidAmount(String value) {
                this.paidAmount = value;
            }

            /**
             * Gets the value of the memberLiabilityAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLiabilityAmount() {
                return memberLiabilityAmount;
            }

            /**
             * Sets the value of the memberLiabilityAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLiabilityAmount(String value) {
                this.memberLiabilityAmount = value;
            }

            /**
             * Gets the value of the nonCoveredAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonCoveredAmount() {
                return nonCoveredAmount;
            }

            /**
             * Sets the value of the nonCoveredAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonCoveredAmount(String value) {
                this.nonCoveredAmount = value;
            }

            /**
             * Gets the value of the providerDiscountAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderDiscountAmount() {
                return providerDiscountAmount;
            }

            /**
             * Sets the value of the providerDiscountAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderDiscountAmount(String value) {
                this.providerDiscountAmount = value;
            }

            /**
             * Gets the value of the medicare property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Medicare }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Medicare getMedicare() {
                return medicare;
            }

            /**
             * Sets the value of the medicare property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Medicare }
             *     
             */
            public void setMedicare(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Medicare value) {
                this.medicare = value;
            }

            /**
             * Gets the value of the placeOfServiceWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceWlpCode() {
                return placeOfServiceWlpCode;
            }

            /**
             * Sets the value of the placeOfServiceWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceWlpCode(String value) {
                this.placeOfServiceWlpCode = value;
            }

            /**
             * Gets the value of the placeOfServiceWlpCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceWlpCodeDescriptionText() {
                return placeOfServiceWlpCodeDescriptionText;
            }

            /**
             * Sets the value of the placeOfServiceWlpCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceWlpCodeDescriptionText(String value) {
                this.placeOfServiceWlpCodeDescriptionText = value;
            }

            /**
             * Gets the value of the hcpcs property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HCPCS }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HCPCS getHCPCS() {
                return hcpcs;
            }

            /**
             * Sets the value of the hcpcs property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HCPCS }
             *     
             */
            public void setHCPCS(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HCPCS value) {
                this.hcpcs = value;
            }

            /**
             * Gets the value of the icd property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the icd property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getICD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ICD }
             * 
             * 
             */
            public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ICD> getICD() {
                if (icd == null) {
                    icd = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ICD>();
                }
                return this.icd;
            }

            /**
             * Gets the value of the illnsDt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIllnsDt() {
                return illnsDt;
            }

            /**
             * Sets the value of the illnsDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIllnsDt(String value) {
                this.illnsDt = value;
            }

            /**
             * Gets the value of the ndc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNDC() {
                return ndc;
            }

            /**
             * Sets the value of the ndc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNDC(String value) {
                this.ndc = value;
            }

            /**
             * Gets the value of the claimTypeOfServiceWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceWlpCode() {
                return claimTypeOfServiceWlpCode;
            }

            /**
             * Sets the value of the claimTypeOfServiceWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceWlpCode(String value) {
                this.claimTypeOfServiceWlpCode = value;
            }

            /**
             * Gets the value of the claimTypeOfServiceWlpCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceWlpCodeDescriptionText() {
                return claimTypeOfServiceWlpCodeDescriptionText;
            }

            /**
             * Sets the value of the claimTypeOfServiceWlpCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceWlpCodeDescriptionText(String value) {
                this.claimTypeOfServiceWlpCodeDescriptionText = value;
            }

            /**
             * Gets the value of the units property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Units }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Units getUnits() {
                return units;
            }

            /**
             * Sets the value of the units property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Units }
             *     
             */
            public void setUnits(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Units value) {
                this.units = value;
            }

            /**
             * Gets the value of the rejected property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rejected property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRejected().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Rejected }
             * 
             * 
             */
            public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Rejected> getRejected() {
                if (rejected == null) {
                    rejected = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Rejected>();
                }
                return this.rejected;
            }

            /**
             * Gets the value of the disallowed property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the disallowed property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDisallowed().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Disallowed }
             * 
             * 
             */
            public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Disallowed> getDisallowed() {
                if (disallowed == null) {
                    disallowed = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.Disallowed>();
                }
                return this.disallowed;
            }

            /**
             * Gets the value of the duplicateClaim property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.DuplicateClaim }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.DuplicateClaim getDuplicateClaim() {
                return duplicateClaim;
            }

            /**
             * Sets the value of the duplicateClaim property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.DuplicateClaim }
             *     
             */
            public void setDuplicateClaim(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.DuplicateClaim value) {
                this.duplicateClaim = value;
            }

            /**
             * Gets the value of the revenueCode property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.RevenueCode }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.RevenueCode getRevenueCode() {
                return revenueCode;
            }

            /**
             * Sets the value of the revenueCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.RevenueCode }
             *     
             */
            public void setRevenueCode(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.RevenueCode value) {
                this.revenueCode = value;
            }

            /**
             * Gets the value of the claimLineStatusWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineStatusWlpCode() {
                return claimLineStatusWlpCode;
            }

            /**
             * Sets the value of the claimLineStatusWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineStatusWlpCode(String value) {
                this.claimLineStatusWlpCode = value;
            }

            /**
             * Gets the value of the claimLineStatusWlpCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineStatusWlpCodeNameText() {
                return claimLineStatusWlpCodeNameText;
            }

            /**
             * Sets the value of the claimLineStatusWlpCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineStatusWlpCodeNameText(String value) {
                this.claimLineStatusWlpCodeNameText = value;
            }

            /**
             * Gets the value of the cdhp property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP getCDHP() {
                return cdhp;
            }

            /**
             * Sets the value of the cdhp property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP }
             *     
             */
            public void setCDHP(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP value) {
                this.cdhp = value;
            }

            /**
             * Gets the value of the claimLineErrorCodeList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the claimLineErrorCodeList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClaimLineErrorCodeList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ClaimLineErrorCodeList }
             * 
             * 
             */
            public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ClaimLineErrorCodeList> getClaimLineErrorCodeList() {
                if (claimLineErrorCodeList == null) {
                    claimLineErrorCodeList = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.ClaimLineErrorCodeList>();
                }
                return this.claimLineErrorCodeList;
            }

            /**
             * Gets the value of the hipaaClaimStatusCodes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hipaaClaimStatusCodes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHipaaClaimStatusCodes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HipaaClaimStatusCodes }
             * 
             * 
             */
            public List<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HipaaClaimStatusCodes> getHipaaClaimStatusCodes() {
                if (hipaaClaimStatusCodes == null) {
                    hipaaClaimStatusCodes = new ArrayList<EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HipaaClaimStatusCodes>();
                }
                return this.hipaaClaimStatusCodes;
            }

            /**
             * Gets the value of the healthServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HealthServiceCode }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HealthServiceCode getHealthServiceCode() {
                return healthServiceCode;
            }

            /**
             * Sets the value of the healthServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HealthServiceCode }
             *     
             */
            public void setHealthServiceCode(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.HealthServiceCode value) {
                this.healthServiceCode = value;
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
             *         &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Disallowed" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "coinsurancePercentage",
                "totalPaidAmount",
                "disallowed"
            })
            public static class CDHP {

                protected String coinsurancePercentage;
                protected String totalPaidAmount;
                @XmlElement(name = "Disallowed")
                protected EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP.Disallowed disallowed;

                /**
                 * Gets the value of the coinsurancePercentage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCoinsurancePercentage() {
                    return coinsurancePercentage;
                }

                /**
                 * Sets the value of the coinsurancePercentage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCoinsurancePercentage(String value) {
                    this.coinsurancePercentage = value;
                }

                /**
                 * Gets the value of the totalPaidAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalPaidAmount() {
                    return totalPaidAmount;
                }

                /**
                 * Sets the value of the totalPaidAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalPaidAmount(String value) {
                    this.totalPaidAmount = value;
                }

                /**
                 * Gets the value of the disallowed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP.Disallowed }
                 *     
                 */
                public EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP.Disallowed getDisallowed() {
                    return disallowed;
                }

                /**
                 * Sets the value of the disallowed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP.Disallowed }
                 *     
                 */
                public void setDisallowed(EBSResponse.GetMemberClaimsDetailResp.ClaimLine.CDHP.Disallowed value) {
                    this.disallowed = value;
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
                 *         &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "nonCoveredAmount",
                    "codeValue"
                })
                public static class Disallowed {

                    protected String nonCoveredAmount;
                    protected String codeValue;

                    /**
                     * Gets the value of the nonCoveredAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNonCoveredAmount() {
                        return nonCoveredAmount;
                    }

                    /**
                     * Sets the value of the nonCoveredAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNonCoveredAmount(String value) {
                        this.nonCoveredAmount = value;
                    }

                    /**
                     * Gets the value of the codeValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeValue() {
                        return codeValue;
                    }

                    /**
                     * Sets the value of the codeValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeValue(String value) {
                        this.codeValue = value;
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
             *         &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ClaimLineErrorWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                "claimLineErrorWlpCode",
                "claimLineErrorWlpCodeNameText",
                "claimLineErrorWlpTypeCode"
            })
            public static class ClaimLineErrorCodeList {

                protected String claimLineErrorWlpCode;
                protected String claimLineErrorWlpCodeNameText;
                @XmlElement(name = "ClaimLineErrorWlpTypeCode")
                protected Object claimLineErrorWlpTypeCode;

                /**
                 * Gets the value of the claimLineErrorWlpCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineErrorWlpCode() {
                    return claimLineErrorWlpCode;
                }

                /**
                 * Sets the value of the claimLineErrorWlpCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineErrorWlpCode(String value) {
                    this.claimLineErrorWlpCode = value;
                }

                /**
                 * Gets the value of the claimLineErrorWlpCodeNameText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineErrorWlpCodeNameText() {
                    return claimLineErrorWlpCodeNameText;
                }

                /**
                 * Sets the value of the claimLineErrorWlpCodeNameText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineErrorWlpCodeNameText(String value) {
                    this.claimLineErrorWlpCodeNameText = value;
                }

                /**
                 * Gets the value of the claimLineErrorWlpTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getClaimLineErrorWlpTypeCode() {
                    return claimLineErrorWlpTypeCode;
                }

                /**
                 * Sets the value of the claimLineErrorWlpTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setClaimLineErrorWlpTypeCode(Object value) {
                    this.claimLineErrorWlpTypeCode = value;
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
                "reasonWlpCode",
                "reasonWlpCodeDescriptionText"
            })
            public static class Disallowed {

                protected String reasonWlpCode;
                protected String reasonWlpCodeDescriptionText;

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
             *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimNumber",
                "claimLineNumber"
            })
            public static class DuplicateClaim {

                protected String claimNumber;
                protected String claimLineNumber;

                /**
                 * Gets the value of the claimNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimNumber() {
                    return claimNumber;
                }

                /**
                 * Sets the value of the claimNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimNumber(String value) {
                    this.claimNumber = value;
                }

                /**
                 * Gets the value of the claimLineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineNumber() {
                    return claimLineNumber;
                }

                /**
                 * Sets the value of the claimLineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineNumber(String value) {
                    this.claimLineNumber = value;
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
             *         &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hcpcsCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
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
                "hcpcsCode",
                "hcpcsCodeDescriptionText",
                "hcpcsModifierCode"
            })
            public static class HCPCS {

                protected String hcpcsCode;
                protected String hcpcsCodeDescriptionText;
                protected List<Object> hcpcsModifierCode;

                /**
                 * Gets the value of the hcpcsCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHcpcsCode() {
                    return hcpcsCode;
                }

                /**
                 * Sets the value of the hcpcsCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHcpcsCode(String value) {
                    this.hcpcsCode = value;
                }

                /**
                 * Gets the value of the hcpcsCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHcpcsCodeDescriptionText() {
                    return hcpcsCodeDescriptionText;
                }

                /**
                 * Sets the value of the hcpcsCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHcpcsCodeDescriptionText(String value) {
                    this.hcpcsCodeDescriptionText = value;
                }

                /**
                 * Gets the value of the hcpcsModifierCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hcpcsModifierCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHcpcsModifierCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getHcpcsModifierCode() {
                    if (hcpcsModifierCode == null) {
                        hcpcsModifierCode = new ArrayList<Object>();
                    }
                    return this.hcpcsModifierCode;
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
             *         &lt;element name="hlthSrvcCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *         &lt;element name="hlthSrvcCdTypCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *         &lt;element name="hlthSrvcCdModCd" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="4" minOccurs="0"/>
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
                "hlthSrvcCdTypCd",
                "hlthSrvcCdModCd"
            })
            public static class HealthServiceCode {

                protected Object hlthSrvcCd;
                protected Object hlthSrvcCdTypCd;
                protected List<Object> hlthSrvcCdModCd;

                /**
                 * Gets the value of the hlthSrvcCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHlthSrvcCd() {
                    return hlthSrvcCd;
                }

                /**
                 * Sets the value of the hlthSrvcCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHlthSrvcCd(Object value) {
                    this.hlthSrvcCd = value;
                }

                /**
                 * Gets the value of the hlthSrvcCdTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHlthSrvcCdTypCd() {
                    return hlthSrvcCdTypCd;
                }

                /**
                 * Sets the value of the hlthSrvcCdTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHlthSrvcCdTypCd(Object value) {
                    this.hlthSrvcCdTypCd = value;
                }

                /**
                 * Gets the value of the hlthSrvcCdModCd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hlthSrvcCdModCd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHlthSrvcCdModCd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getHlthSrvcCdModCd() {
                    if (hlthSrvcCdModCd == null) {
                        hlthSrvcCdModCd = new ArrayList<Object>();
                    }
                    return this.hlthSrvcCdModCd;
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
             *         &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *         &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *         &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
                "hipaaStsCatCd",
                "hipaaStsCd",
                "hipaaStsEntityCd"
            })
            public static class HipaaClaimStatusCodes {

                protected Object hipaaStsCatCd;
                protected Object hipaaStsCd;
                protected Object hipaaStsEntityCd;

                /**
                 * Gets the value of the hipaaStsCatCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHipaaStsCatCd() {
                    return hipaaStsCatCd;
                }

                /**
                 * Sets the value of the hipaaStsCatCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHipaaStsCatCd(Object value) {
                    this.hipaaStsCatCd = value;
                }

                /**
                 * Gets the value of the hipaaStsCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHipaaStsCd() {
                    return hipaaStsCd;
                }

                /**
                 * Sets the value of the hipaaStsCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHipaaStsCd(Object value) {
                    this.hipaaStsCd = value;
                }

                /**
                 * Gets the value of the hipaaStsEntityCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getHipaaStsEntityCd() {
                    return hipaaStsEntityCd;
                }

                /**
                 * Sets the value of the hipaaStsEntityCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setHipaaStsEntityCd(Object value) {
                    this.hipaaStsEntityCd = value;
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
             *         &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
             *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "orderCode",
                "icd9DiagnosisCode",
                "icd9DiagnosisCodeDescriptionText"
            })
            public static class ICD {

                protected Object orderCode;
                protected String icd9DiagnosisCode;
                protected String icd9DiagnosisCodeDescriptionText;

                /**
                 * Gets the value of the orderCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getOrderCode() {
                    return orderCode;
                }

                /**
                 * Sets the value of the orderCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setOrderCode(Object value) {
                    this.orderCode = value;
                }

                /**
                 * Gets the value of the icd9DiagnosisCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIcd9DiagnosisCode() {
                    return icd9DiagnosisCode;
                }

                /**
                 * Sets the value of the icd9DiagnosisCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIcd9DiagnosisCode(String value) {
                    this.icd9DiagnosisCode = value;
                }

                /**
                 * Gets the value of the icd9DiagnosisCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIcd9DiagnosisCodeDescriptionText() {
                    return icd9DiagnosisCodeDescriptionText;
                }

                /**
                 * Sets the value of the icd9DiagnosisCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIcd9DiagnosisCodeDescriptionText(String value) {
                    this.icd9DiagnosisCodeDescriptionText = value;
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
             *         &lt;element name="medicareAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="medicareDeductible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="medicarePayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="medicarePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "medicareAllowed",
                "medicareDeductible",
                "medicarePayment",
                "medicarePercent"
            })
            public static class Medicare {

                protected String medicareAllowed;
                protected String medicareDeductible;
                protected String medicarePayment;
                protected String medicarePercent;

                /**
                 * Gets the value of the medicareAllowed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedicareAllowed() {
                    return medicareAllowed;
                }

                /**
                 * Sets the value of the medicareAllowed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedicareAllowed(String value) {
                    this.medicareAllowed = value;
                }

                /**
                 * Gets the value of the medicareDeductible property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedicareDeductible() {
                    return medicareDeductible;
                }

                /**
                 * Sets the value of the medicareDeductible property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedicareDeductible(String value) {
                    this.medicareDeductible = value;
                }

                /**
                 * Gets the value of the medicarePayment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedicarePayment() {
                    return medicarePayment;
                }

                /**
                 * Sets the value of the medicarePayment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedicarePayment(String value) {
                    this.medicarePayment = value;
                }

                /**
                 * Gets the value of the medicarePercent property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedicarePercent() {
                    return medicarePercent;
                }

                /**
                 * Sets the value of the medicarePercent property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedicarePercent(String value) {
                    this.medicarePercent = value;
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
             *         &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonWlpTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "rejectReasonWlpCode",
                "rejectReasonWlpCodeNameText",
                "rejectReasonWlpTypeCode"
            })
            public static class Rejected {

                protected String rejectReasonWlpCode;
                protected String rejectReasonWlpCodeNameText;
                protected String rejectReasonWlpTypeCode;

                /**
                 * Gets the value of the rejectReasonWlpCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRejectReasonWlpCode() {
                    return rejectReasonWlpCode;
                }

                /**
                 * Sets the value of the rejectReasonWlpCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRejectReasonWlpCode(String value) {
                    this.rejectReasonWlpCode = value;
                }

                /**
                 * Gets the value of the rejectReasonWlpCodeNameText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRejectReasonWlpCodeNameText() {
                    return rejectReasonWlpCodeNameText;
                }

                /**
                 * Sets the value of the rejectReasonWlpCodeNameText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRejectReasonWlpCodeNameText(String value) {
                    this.rejectReasonWlpCodeNameText = value;
                }

                /**
                 * Gets the value of the rejectReasonWlpTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRejectReasonWlpTypeCode() {
                    return rejectReasonWlpTypeCode;
                }

                /**
                 * Sets the value of the rejectReasonWlpTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRejectReasonWlpTypeCode(String value) {
                    this.rejectReasonWlpTypeCode = value;
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
             *         &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ub92RevenueCodeDescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ub92RevenueCode",
                "ub92RevenueCodeDescriptionCode",
                "revenueCodeServiceStartDate"
            })
            public static class RevenueCode {

                protected String ub92RevenueCode;
                protected String ub92RevenueCodeDescriptionCode;
                protected String revenueCodeServiceStartDate;

                /**
                 * Gets the value of the ub92RevenueCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92RevenueCode() {
                    return ub92RevenueCode;
                }

                /**
                 * Sets the value of the ub92RevenueCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92RevenueCode(String value) {
                    this.ub92RevenueCode = value;
                }

                /**
                 * Gets the value of the ub92RevenueCodeDescriptionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92RevenueCodeDescriptionCode() {
                    return ub92RevenueCodeDescriptionCode;
                }

                /**
                 * Sets the value of the ub92RevenueCodeDescriptionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92RevenueCodeDescriptionCode(String value) {
                    this.ub92RevenueCodeDescriptionCode = value;
                }

                /**
                 * Gets the value of the revenueCodeServiceStartDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRevenueCodeServiceStartDate() {
                    return revenueCodeServiceStartDate;
                }

                /**
                 * Sets the value of the revenueCodeServiceStartDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRevenueCodeServiceStartDate(String value) {
                    this.revenueCodeServiceStartDate = value;
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
             *         &lt;element name="unitMeasureCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "unitMeasureCd",
                "unitsAllowedValue",
                "unitsOfOccurrenceQuantity"
            })
            public static class Units {

                protected String unitMeasureCd;
                protected String unitsAllowedValue;
                protected String unitsOfOccurrenceQuantity;

                /**
                 * Gets the value of the unitMeasureCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitMeasureCd() {
                    return unitMeasureCd;
                }

                /**
                 * Sets the value of the unitMeasureCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitMeasureCd(String value) {
                    this.unitMeasureCd = value;
                }

                /**
                 * Gets the value of the unitsAllowedValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitsAllowedValue() {
                    return unitsAllowedValue;
                }

                /**
                 * Sets the value of the unitsAllowedValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitsAllowedValue(String value) {
                    this.unitsAllowedValue = value;
                }

                /**
                 * Gets the value of the unitsOfOccurrenceQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUnitsOfOccurrenceQuantity() {
                    return unitsOfOccurrenceQuantity;
                }

                /**
                 * Sets the value of the unitsOfOccurrenceQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUnitsOfOccurrenceQuantity(String value) {
                    this.unitsOfOccurrenceQuantity = value;
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
         *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "createUserId",
            "createDatetime",
            "noteText",
            "noteSummaryText"
        })
        public static class ClaimNotes {

            protected String createUserId;
            protected String createDatetime;
            protected String noteText;
            protected String noteSummaryText;

            /**
             * Gets the value of the createUserId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateUserId() {
                return createUserId;
            }

            /**
             * Sets the value of the createUserId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateUserId(String value) {
                this.createUserId = value;
            }

            /**
             * Gets the value of the createDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateDatetime() {
                return createDatetime;
            }

            /**
             * Sets the value of the createDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateDatetime(String value) {
                this.createDatetime = value;
            }

            /**
             * Gets the value of the noteText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteText() {
                return noteText;
            }

            /**
             * Sets the value of the noteText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteText(String value) {
                this.noteText = value;
            }

            /**
             * Gets the value of the noteSummaryText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteSummaryText() {
                return noteSummaryText;
            }

            /**
             * Sets the value of the noteSummaryText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteSummaryText(String value) {
                this.noteSummaryText = value;
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
         *         &lt;element name="lineDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noteDataCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "lineDataCtr",
            "noteDataCtr"
        })
        public static class Counters {

            protected String lineDataCtr;
            protected String noteDataCtr;

            /**
             * Gets the value of the lineDataCtr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineDataCtr() {
                return lineDataCtr;
            }

            /**
             * Sets the value of the lineDataCtr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineDataCtr(String value) {
                this.lineDataCtr = value;
            }

            /**
             * Gets the value of the noteDataCtr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteDataCtr() {
                return noteDataCtr;
            }

            /**
             * Sets the value of the noteDataCtr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteDataCtr(String value) {
                this.noteDataCtr = value;
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
         *         &lt;element name="ClaimLine" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ClaimNote" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimLine",
            "claimNote"
        })
        public static class ListLengths {

            @XmlElement(name = "ClaimLine")
            protected EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimLine claimLine;
            @XmlElement(name = "ClaimNote")
            protected EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimNote claimNote;

            /**
             * Gets the value of the claimLine property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimLine }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimLine getClaimLine() {
                return claimLine;
            }

            /**
             * Sets the value of the claimLine property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimLine }
             *     
             */
            public void setClaimLine(EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimLine value) {
                this.claimLine = value;
            }

            /**
             * Gets the value of the claimNote property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimNote }
             *     
             */
            public EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimNote getClaimNote() {
                return claimNote;
            }

            /**
             * Sets the value of the claimNote property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimNote }
             *     
             */
            public void setClaimNote(EBSResponse.GetMemberClaimsDetailResp.ListLengths.ClaimNote value) {
                this.claimNote = value;
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
             *         &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "listLength"
            })
            public static class ClaimLine {

                protected String listLength;

                /**
                 * Gets the value of the listLength property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getListLength() {
                    return listLength;
                }

                /**
                 * Sets the value of the listLength property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setListLength(String value) {
                    this.listLength = value;
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
             *         &lt;element name="listLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "listLength"
            })
            public static class ClaimNote {

                protected String listLength;

                /**
                 * Gets the value of the listLength property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getListLength() {
                    return listLength;
                }

                /**
                 * Sets the value of the listLength property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setListLength(String value) {
                    this.listLength = value;
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
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03}NameType" minOccurs="0"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "name",
            "birthDate",
            "patientAccountNumber"
        })
        public static class Patient {

            @XmlElement(name = "Name")
            protected NameType name;
            protected String birthDate;
            protected String patientAccountNumber;

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
             * Gets the value of the patientAccountNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatientAccountNumber() {
                return patientAccountNumber;
            }

            /**
             * Sets the value of the patientAccountNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatientAccountNumber(String value) {
                this.patientAccountNumber = value;
            }

        }

    }

}
