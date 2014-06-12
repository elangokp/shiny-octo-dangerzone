
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimseobdetaillegacy_v1_0;

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
 *         &lt;element name="GetClaimsEOBDetailExResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
 *                             &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Patient" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Subscriber" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FacilityPayee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="MemberPayee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ProfessionalPayee" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="remittanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Facility" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Professional" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
 *                                       &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totalBilledChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
 *                             &lt;element name="totalCopaymentAndCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DynamicData" maxOccurs="40" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}billedChargeAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerDiscountAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}deductibleAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAndCoinsuranceAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}paidAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
 *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
 *                             &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="StaticData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
     *                   &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Patient" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Subscriber" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FacilityPayee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="MemberPayee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ProfessionalPayee" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="remittanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Facility" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Professional" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
     *                             &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totalBilledChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
     *                   &lt;element name="totalCopaymentAndCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DynamicData" maxOccurs="40" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}billedChargeAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerDiscountAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}deductibleAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAndCoinsuranceAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}paidAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
     *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
     *                   &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData",
        "dynamicData"
    })
    public static class GetClaimsEOBDetailExResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.GetClaimsEOBDetailExResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimsEOBDetailExResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsEOBDetailExResponse.StaticData value) {
            this.staticData = value;
        }

        /**
         * Gets the value of the dynamicData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDynamicData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetClaimsEOBDetailExResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetClaimsEOBDetailExResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetClaimsEOBDetailExResponse.DynamicData>();
            }
            return this.dynamicData;
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
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}billedChargeAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerDiscountAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}deductibleAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAndCoinsuranceAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}paidAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
         *         &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "placeOfServiceCode",
            "serviceStartDate",
            "serviceEndDate",
            "billedChargeAmount",
            "providerDiscountAmount",
            "deductibleAmount",
            "copaymentAmount",
            "coinsuranceAmount",
            "copaymentAndCoinsuranceAmount",
            "paidAmount",
            "claimTypeOfServiceSorCode",
            "claimTypeOfServiceSorCodeDescriptionText",
            "memberUtilizationReviewPenaltyAmount",
            "claimLinePenaltyErrorSorCode",
            "reasonSorCode",
            "rejectReasonSorCode",
            "rejectReasonSorCodeNameText",
            "rejectReasonWlpCode",
            "rejectReasonWlpCodeNameText",
            "nonCoveredAmount"
        })
        public static class DynamicData {

            protected String placeOfServiceCode;
            protected String serviceStartDate;
            protected String serviceEndDate;
            protected String billedChargeAmount;
            protected String providerDiscountAmount;
            protected String deductibleAmount;
            protected String copaymentAmount;
            protected String coinsuranceAmount;
            protected String copaymentAndCoinsuranceAmount;
            protected String paidAmount;
            protected String claimTypeOfServiceSorCode;
            protected String claimTypeOfServiceSorCodeDescriptionText;
            protected String memberUtilizationReviewPenaltyAmount;
            protected String claimLinePenaltyErrorSorCode;
            protected String reasonSorCode;
            protected String rejectReasonSorCode;
            protected String rejectReasonSorCodeNameText;
            protected String rejectReasonWlpCode;
            protected String rejectReasonWlpCodeNameText;
            protected String nonCoveredAmount;

            /**
             * Gets the value of the placeOfServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceCode() {
                return placeOfServiceCode;
            }

            /**
             * Sets the value of the placeOfServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceCode(String value) {
                this.placeOfServiceCode = value;
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
             * Gets the value of the copaymentAndCoinsuranceAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCopaymentAndCoinsuranceAmount() {
                return copaymentAndCoinsuranceAmount;
            }

            /**
             * Sets the value of the copaymentAndCoinsuranceAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCopaymentAndCoinsuranceAmount(String value) {
                this.copaymentAndCoinsuranceAmount = value;
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
             * Gets the value of the claimTypeOfServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceSorCode() {
                return claimTypeOfServiceSorCode;
            }

            /**
             * Sets the value of the claimTypeOfServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceSorCode(String value) {
                this.claimTypeOfServiceSorCode = value;
            }

            /**
             * Gets the value of the claimTypeOfServiceSorCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceSorCodeDescriptionText() {
                return claimTypeOfServiceSorCodeDescriptionText;
            }

            /**
             * Sets the value of the claimTypeOfServiceSorCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceSorCodeDescriptionText(String value) {
                this.claimTypeOfServiceSorCodeDescriptionText = value;
            }

            /**
             * Gets the value of the memberUtilizationReviewPenaltyAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberUtilizationReviewPenaltyAmount() {
                return memberUtilizationReviewPenaltyAmount;
            }

            /**
             * Sets the value of the memberUtilizationReviewPenaltyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberUtilizationReviewPenaltyAmount(String value) {
                this.memberUtilizationReviewPenaltyAmount = value;
            }

            /**
             * Gets the value of the claimLinePenaltyErrorSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLinePenaltyErrorSorCode() {
                return claimLinePenaltyErrorSorCode;
            }

            /**
             * Sets the value of the claimLinePenaltyErrorSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLinePenaltyErrorSorCode(String value) {
                this.claimLinePenaltyErrorSorCode = value;
            }

            /**
             * Gets the value of the reasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonSorCode() {
                return reasonSorCode;
            }

            /**
             * Sets the value of the reasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonSorCode(String value) {
                this.reasonSorCode = value;
            }

            /**
             * Gets the value of the rejectReasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCode() {
                return rejectReasonSorCode;
            }

            /**
             * Sets the value of the rejectReasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCode(String value) {
                this.rejectReasonSorCode = value;
            }

            /**
             * Gets the value of the rejectReasonSorCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCodeNameText() {
                return rejectReasonSorCodeNameText;
            }

            /**
             * Sets the value of the rejectReasonSorCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCodeNameText(String value) {
                this.rejectReasonSorCodeNameText = value;
            }

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
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}placeOfServiceCode" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceEndDate" minOccurs="0"/>
         *         &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Patient" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Subscriber" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FacilityPayee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="MemberPayee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ProfessionalPayee" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="remittanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Facility" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Professional" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
         *                   &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totalBilledChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}copaymentAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}coinsuranceAmount" minOccurs="0"/>
         *         &lt;element name="totalCopaymentAndCoinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}memberUtilizationReviewPenaltyAmount" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLinePenaltyErrorSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}reasonSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonSorCodeNameText" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCode" minOccurs="0"/>
         *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}rejectReasonWlpCodeNameText" minOccurs="0"/>
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
            "claimLineNumber",
            "claimRevisionNumber",
            "claimTypeCode",
            "placeOfServiceCode",
            "nextPage",
            "adjudicationProcessDate",
            "claimReceiptDate",
            "serviceStartDate",
            "serviceEndDate",
            "financialCompanyCode",
            "groupId",
            "subgroupId",
            "subgroupNameText",
            "productId",
            "productDescriptionText",
            "subscriberId",
            "healthCardId",
            "memberSequenceNumber",
            "memberLiabilityTotalAmount",
            "patient",
            "subscriber",
            "patientAccountNumber",
            "facilityPayee",
            "memberPayee",
            "professionalPayee",
            "remittanceId",
            "facility",
            "professional",
            "totalBilledChargeAmount",
            "providerDiscountTotalAmount",
            "deductibleTotalAmount",
            "copaymentAmount",
            "coinsuranceAmount",
            "totalCopaymentAndCoinsuranceAmount",
            "totalPaidAmount",
            "claimTypeOfServiceSorCode",
            "claimTypeOfServiceSorCodeDescriptionText",
            "memberUtilizationReviewPenaltyAmount",
            "claimLinePenaltyErrorSorCode",
            "reasonSorCode",
            "rejectReasonSorCode",
            "rejectReasonSorCodeNameText",
            "rejectReasonWlpCode",
            "rejectReasonWlpCodeNameText"
        })
        public static class StaticData {

            protected String claimNumber;
            protected String claimLineNumber;
            protected String claimRevisionNumber;
            protected String claimTypeCode;
            protected String placeOfServiceCode;
            @XmlElement(name = "NextPage")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.NextPage nextPage;
            protected String adjudicationProcessDate;
            protected String claimReceiptDate;
            protected String serviceStartDate;
            protected String serviceEndDate;
            protected String financialCompanyCode;
            protected String groupId;
            protected String subgroupId;
            protected String subgroupNameText;
            protected String productId;
            protected String productDescriptionText;
            protected String subscriberId;
            protected String healthCardId;
            protected String memberSequenceNumber;
            protected String memberLiabilityTotalAmount;
            @XmlElement(name = "Patient")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Patient patient;
            @XmlElement(name = "Subscriber")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Subscriber subscriber;
            protected String patientAccountNumber;
            @XmlElement(name = "FacilityPayee")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.FacilityPayee facilityPayee;
            @XmlElement(name = "MemberPayee")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.MemberPayee memberPayee;
            @XmlElement(name = "ProfessionalPayee")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.ProfessionalPayee professionalPayee;
            protected String remittanceId;
            @XmlElement(name = "Facility")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Facility facility;
            @XmlElement(name = "Professional")
            protected EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Professional professional;
            protected String totalBilledChargeAmount;
            protected String providerDiscountTotalAmount;
            protected String deductibleTotalAmount;
            protected String copaymentAmount;
            protected String coinsuranceAmount;
            protected String totalCopaymentAndCoinsuranceAmount;
            protected String totalPaidAmount;
            protected String claimTypeOfServiceSorCode;
            protected String claimTypeOfServiceSorCodeDescriptionText;
            protected String memberUtilizationReviewPenaltyAmount;
            protected String claimLinePenaltyErrorSorCode;
            protected String reasonSorCode;
            protected String rejectReasonSorCode;
            protected String rejectReasonSorCodeNameText;
            protected String rejectReasonWlpCode;
            protected String rejectReasonWlpCodeNameText;

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

            /**
             * Gets the value of the claimRevisionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRevisionNumber() {
                return claimRevisionNumber;
            }

            /**
             * Sets the value of the claimRevisionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRevisionNumber(String value) {
                this.claimRevisionNumber = value;
            }

            /**
             * Gets the value of the claimTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeCode() {
                return claimTypeCode;
            }

            /**
             * Sets the value of the claimTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeCode(String value) {
                this.claimTypeCode = value;
            }

            /**
             * Gets the value of the placeOfServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceCode() {
                return placeOfServiceCode;
            }

            /**
             * Sets the value of the placeOfServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceCode(String value) {
                this.placeOfServiceCode = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.NextPage value) {
                this.nextPage = value;
            }

            /**
             * Gets the value of the adjudicationProcessDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdjudicationProcessDate() {
                return adjudicationProcessDate;
            }

            /**
             * Sets the value of the adjudicationProcessDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdjudicationProcessDate(String value) {
                this.adjudicationProcessDate = value;
            }

            /**
             * Gets the value of the claimReceiptDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimReceiptDate() {
                return claimReceiptDate;
            }

            /**
             * Sets the value of the claimReceiptDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimReceiptDate(String value) {
                this.claimReceiptDate = value;
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
             * Gets the value of the financialCompanyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinancialCompanyCode() {
                return financialCompanyCode;
            }

            /**
             * Sets the value of the financialCompanyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinancialCompanyCode(String value) {
                this.financialCompanyCode = value;
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
             * Gets the value of the subgroupNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubgroupNameText() {
                return subgroupNameText;
            }

            /**
             * Sets the value of the subgroupNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubgroupNameText(String value) {
                this.subgroupNameText = value;
            }

            /**
             * Gets the value of the productId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductId() {
                return productId;
            }

            /**
             * Sets the value of the productId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductId(String value) {
                this.productId = value;
            }

            /**
             * Gets the value of the productDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductDescriptionText() {
                return productDescriptionText;
            }

            /**
             * Sets the value of the productDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductDescriptionText(String value) {
                this.productDescriptionText = value;
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
             * Gets the value of the healthCardId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHealthCardId() {
                return healthCardId;
            }

            /**
             * Sets the value of the healthCardId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHealthCardId(String value) {
                this.healthCardId = value;
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
             * Gets the value of the memberLiabilityTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLiabilityTotalAmount() {
                return memberLiabilityTotalAmount;
            }

            /**
             * Sets the value of the memberLiabilityTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLiabilityTotalAmount(String value) {
                this.memberLiabilityTotalAmount = value;
            }

            /**
             * Gets the value of the patient property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Patient }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Patient getPatient() {
                return patient;
            }

            /**
             * Sets the value of the patient property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Patient }
             *     
             */
            public void setPatient(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Patient value) {
                this.patient = value;
            }

            /**
             * Gets the value of the subscriber property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Subscriber }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Subscriber getSubscriber() {
                return subscriber;
            }

            /**
             * Sets the value of the subscriber property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Subscriber }
             *     
             */
            public void setSubscriber(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Subscriber value) {
                this.subscriber = value;
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

            /**
             * Gets the value of the facilityPayee property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.FacilityPayee }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.FacilityPayee getFacilityPayee() {
                return facilityPayee;
            }

            /**
             * Sets the value of the facilityPayee property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.FacilityPayee }
             *     
             */
            public void setFacilityPayee(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.FacilityPayee value) {
                this.facilityPayee = value;
            }

            /**
             * Gets the value of the memberPayee property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.MemberPayee }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.MemberPayee getMemberPayee() {
                return memberPayee;
            }

            /**
             * Sets the value of the memberPayee property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.MemberPayee }
             *     
             */
            public void setMemberPayee(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.MemberPayee value) {
                this.memberPayee = value;
            }

            /**
             * Gets the value of the professionalPayee property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.ProfessionalPayee }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.ProfessionalPayee getProfessionalPayee() {
                return professionalPayee;
            }

            /**
             * Sets the value of the professionalPayee property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.ProfessionalPayee }
             *     
             */
            public void setProfessionalPayee(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.ProfessionalPayee value) {
                this.professionalPayee = value;
            }

            /**
             * Gets the value of the remittanceId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemittanceId() {
                return remittanceId;
            }

            /**
             * Sets the value of the remittanceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemittanceId(String value) {
                this.remittanceId = value;
            }

            /**
             * Gets the value of the facility property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Facility }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Facility getFacility() {
                return facility;
            }

            /**
             * Sets the value of the facility property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Facility }
             *     
             */
            public void setFacility(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Facility value) {
                this.facility = value;
            }

            /**
             * Gets the value of the professional property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Professional }
             *     
             */
            public EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Professional getProfessional() {
                return professional;
            }

            /**
             * Sets the value of the professional property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Professional }
             *     
             */
            public void setProfessional(EBSResponse.GetClaimsEOBDetailExResponse.StaticData.Professional value) {
                this.professional = value;
            }

            /**
             * Gets the value of the totalBilledChargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalBilledChargeAmount() {
                return totalBilledChargeAmount;
            }

            /**
             * Sets the value of the totalBilledChargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalBilledChargeAmount(String value) {
                this.totalBilledChargeAmount = value;
            }

            /**
             * Gets the value of the providerDiscountTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderDiscountTotalAmount() {
                return providerDiscountTotalAmount;
            }

            /**
             * Sets the value of the providerDiscountTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderDiscountTotalAmount(String value) {
                this.providerDiscountTotalAmount = value;
            }

            /**
             * Gets the value of the deductibleTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeductibleTotalAmount() {
                return deductibleTotalAmount;
            }

            /**
             * Sets the value of the deductibleTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeductibleTotalAmount(String value) {
                this.deductibleTotalAmount = value;
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
             * Gets the value of the totalCopaymentAndCoinsuranceAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalCopaymentAndCoinsuranceAmount() {
                return totalCopaymentAndCoinsuranceAmount;
            }

            /**
             * Sets the value of the totalCopaymentAndCoinsuranceAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalCopaymentAndCoinsuranceAmount(String value) {
                this.totalCopaymentAndCoinsuranceAmount = value;
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
             * Gets the value of the claimTypeOfServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceSorCode() {
                return claimTypeOfServiceSorCode;
            }

            /**
             * Sets the value of the claimTypeOfServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceSorCode(String value) {
                this.claimTypeOfServiceSorCode = value;
            }

            /**
             * Gets the value of the claimTypeOfServiceSorCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeOfServiceSorCodeDescriptionText() {
                return claimTypeOfServiceSorCodeDescriptionText;
            }

            /**
             * Sets the value of the claimTypeOfServiceSorCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeOfServiceSorCodeDescriptionText(String value) {
                this.claimTypeOfServiceSorCodeDescriptionText = value;
            }

            /**
             * Gets the value of the memberUtilizationReviewPenaltyAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberUtilizationReviewPenaltyAmount() {
                return memberUtilizationReviewPenaltyAmount;
            }

            /**
             * Sets the value of the memberUtilizationReviewPenaltyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberUtilizationReviewPenaltyAmount(String value) {
                this.memberUtilizationReviewPenaltyAmount = value;
            }

            /**
             * Gets the value of the claimLinePenaltyErrorSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLinePenaltyErrorSorCode() {
                return claimLinePenaltyErrorSorCode;
            }

            /**
             * Sets the value of the claimLinePenaltyErrorSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLinePenaltyErrorSorCode(String value) {
                this.claimLinePenaltyErrorSorCode = value;
            }

            /**
             * Gets the value of the reasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonSorCode() {
                return reasonSorCode;
            }

            /**
             * Sets the value of the reasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonSorCode(String value) {
                this.reasonSorCode = value;
            }

            /**
             * Gets the value of the rejectReasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCode() {
                return rejectReasonSorCode;
            }

            /**
             * Sets the value of the rejectReasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCode(String value) {
                this.rejectReasonSorCode = value;
            }

            /**
             * Gets the value of the rejectReasonSorCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCodeNameText() {
                return rejectReasonSorCodeNameText;
            }

            /**
             * Sets the value of the rejectReasonSorCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCodeNameText(String value) {
                this.rejectReasonSorCodeNameText = value;
            }

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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
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
                "providerOrganizationName"
            })
            public static class Facility {

                protected String providerOrganizationName;

                /**
                 * Gets the value of the providerOrganizationName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderOrganizationName() {
                    return providerOrganizationName;
                }

                /**
                 * Sets the value of the providerOrganizationName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderOrganizationName(String value) {
                    this.providerOrganizationName = value;
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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}providerOrganizationName" minOccurs="0"/>
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
                "providerOrganizationName"
            })
            public static class FacilityPayee {

                protected String providerOrganizationName;

                /**
                 * Gets the value of the providerOrganizationName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderOrganizationName() {
                    return providerOrganizationName;
                }

                /**
                 * Sets the value of the providerOrganizationName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderOrganizationName(String value) {
                    this.providerOrganizationName = value;
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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
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
                "middleName",
                "lastName"
            })
            public static class MemberPayee {

                protected String firstName;
                protected String middleName;
                protected String lastName;

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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimNumber" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimLineNumber" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimRevisionNumber" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeCode" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}serviceStartDate" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}claimTypeOfServiceSorCodeDescriptionText" minOccurs="0"/>
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
                "claimLineNumber",
                "claimRevisionNumber",
                "claimTypeCode",
                "serviceStartDate",
                "claimTypeOfServiceSorCodeDescriptionText"
            })
            public static class NextPage {

                protected String claimNumber;
                protected String claimLineNumber;
                protected String claimRevisionNumber;
                protected String claimTypeCode;
                protected String serviceStartDate;
                protected String claimTypeOfServiceSorCodeDescriptionText;

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

                /**
                 * Gets the value of the claimRevisionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimRevisionNumber() {
                    return claimRevisionNumber;
                }

                /**
                 * Sets the value of the claimRevisionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimRevisionNumber(String value) {
                    this.claimRevisionNumber = value;
                }

                /**
                 * Gets the value of the claimTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimTypeCode() {
                    return claimTypeCode;
                }

                /**
                 * Sets the value of the claimTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimTypeCode(String value) {
                    this.claimTypeCode = value;
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
                 * Gets the value of the claimTypeOfServiceSorCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimTypeOfServiceSorCodeDescriptionText() {
                    return claimTypeOfServiceSorCodeDescriptionText;
                }

                /**
                 * Sets the value of the claimTypeOfServiceSorCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimTypeOfServiceSorCodeDescriptionText(String value) {
                    this.claimTypeOfServiceSorCodeDescriptionText = value;
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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
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
                "middleName",
                "lastName"
            })
            public static class Patient {

                protected String firstName;
                protected String middleName;
                protected String lastName;

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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
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
                "middleName",
                "lastName"
            })
            public static class Professional {

                protected String firstName;
                protected String middleName;
                protected String lastName;

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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
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
                "middleName",
                "lastName"
            })
            public static class ProfessionalPayee {

                protected String firstName;
                protected String middleName;
                protected String lastName;

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
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}firstName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}middleName" minOccurs="0"/>
             *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/SearchClaimsEOBDetailLegacy-v1_0}lastName" minOccurs="0"/>
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
                "middleName",
                "lastName"
            })
            public static class Subscriber {

                protected String firstName;
                protected String middleName;
                protected String lastName;

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

            }

        }

    }

}
