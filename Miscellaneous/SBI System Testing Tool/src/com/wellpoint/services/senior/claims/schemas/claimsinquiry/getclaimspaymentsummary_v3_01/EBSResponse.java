
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimspaymentsummary_v3_01;

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
 *         &lt;element name="GetClaimsPaymentSummaryExResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Patient" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="typeofSubmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FacilityAdmitDiagnosis" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FacilityAncillary" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="copaymentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCoveredTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UB92OccurrenceArray" maxOccurs="8" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ub92OccurenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ub92OccurenceCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Provider" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FacilityService" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsuranceTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FacilityDuplicateClaim" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimAuditLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTextPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsHomeDisplayLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="medicareLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lineOfExpInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="viewCheckLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="duplicateClaimLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hipaaClaimPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="overpaymentDetailInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimErrorsLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsAccessFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsAdminFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="injuryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="illnessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Facility" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="12" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="prsntOnAdmsnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="prsntOnAdmsnIndDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="billingFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ub92BillTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="diagnosisRelatedGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="approvedLengthOfStayQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ClaimErrorCodeArray" maxOccurs="15" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="claimErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pricingNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="medicalReviewInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="surgicalProcedureLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="surchargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimsPaymentSummaryExResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimsPaymentSummaryExResponse")
    protected EBSResponse.GetClaimsPaymentSummaryExResponse getClaimsPaymentSummaryExResponse;

    /**
     * Gets the value of the getClaimsPaymentSummaryExResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse }
     *     
     */
    public EBSResponse.GetClaimsPaymentSummaryExResponse getGetClaimsPaymentSummaryExResponse() {
        return getClaimsPaymentSummaryExResponse;
    }

    /**
     * Sets the value of the getClaimsPaymentSummaryExResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse }
     *     
     */
    public void setGetClaimsPaymentSummaryExResponse(EBSResponse.GetClaimsPaymentSummaryExResponse value) {
        this.getClaimsPaymentSummaryExResponse = value;
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
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Patient" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="typeofSubmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FacilityAdmitDiagnosis" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FacilityAncillary" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="copaymentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCoveredTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UB92OccurrenceArray" maxOccurs="8" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ub92OccurenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ub92OccurenceCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Provider" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FacilityService" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsuranceTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FacilityDuplicateClaim" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimAuditLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTextPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsHomeDisplayLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="medicareLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lineOfExpInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="viewCheckLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="duplicateClaimLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hipaaClaimPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="overpaymentDetailInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimErrorsLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsAccessFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsAdminFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="injuryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="illnessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Facility" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="12" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="prsntOnAdmsnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="prsntOnAdmsnIndDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="billingFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ub92BillTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="diagnosisRelatedGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="approvedLengthOfStayQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ClaimErrorCodeArray" maxOccurs="15" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="claimErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pricingNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="medicalReviewInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="surgicalProcedureLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="surchargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetClaimsPaymentSummaryExResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData value) {
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
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Patient" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="typeofSubmission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FacilityAdmitDiagnosis" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FacilityAncillary" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="facilityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="deductibleTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="copaymentTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCoveredTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UB92OccurrenceArray" maxOccurs="8" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ub92OccurenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ub92OccurenceCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Provider" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FacilityService" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsuranceTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FacilityDuplicateClaim" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimAuditLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTextPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsHomeDisplayLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="medicareLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lineOfExpInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="viewCheckLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="duplicateClaimLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hipaaClaimPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="overpaymentDetailInquiryLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimErrorsLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsAccessFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsAdminFeeTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="injuryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="illnessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Facility" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="12" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="prsntOnAdmsnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="prsntOnAdmsnIndDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="billingFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ub92BillTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="diagnosisRelatedGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="approvedLengthOfStayQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ClaimErrorCodeArray" maxOccurs="15" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="claimErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pricingNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="medicalReviewInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="surgicalProcedureLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimResponsibilityPopUpLinkIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="surchargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "healthCardId",
            "memberSequenceNumber",
            "patient",
            "claimNumber",
            "claimRevisionNumber",
            "typeofSubmission",
            "payeeTypeCode",
            "primaryCareProviderId",
            "preauthorizationRuleSorCode",
            "preauthorizationRuleWlpCode",
            "claimTypeCode",
            "productId",
            "authorizationNumber",
            "assignmentOfBenefitsInd",
            "erisaInd",
            "hipaaInd",
            "facilityAdmitDiagnosis",
            "facilityAncillary",
            "facilityId",
            "allowedTotalAmount",
            "hraDeductibleAmount",
            "deductibleTotalAmount",
            "copaymentTotalAmount",
            "groupId",
            "subgroupId",
            "nonCoveredTotalAmount",
            "providerDiscountTotalAmount",
            "networkId",
            "patientAccountNumber",
            "totalPaidAmount",
            "billedChargeAmount",
            "ub92OccurrenceArray",
            "interestAmount",
            "interestDaysQuantity",
            "provider",
            "professional",
            "coinsurancePercentage",
            "serviceStartDate",
            "serviceEndDate",
            "placeOfServiceSorCode",
            "placeOfServiceSorCodeDescriptionText",
            "placeOfServiceWlpCode",
            "placeOfServiceWlpCodeDescriptionText",
            "memberLiabilityAmount",
            "facilityService",
            "claimTypeOfServiceSorCode",
            "claimTypeOfServiceSorCodeDescriptionText",
            "claimTypeOfServiceWlpCode",
            "claimTypeOfServiceWlpCodeDescriptionText",
            "serviceClassificationCode",
            "coinsuranceTotalAmount",
            "facilityDuplicateClaim",
            "claimAuditLinkInd",
            "claimTextPopUpLinkInd",
            "itsHomeDisplayLinkInd",
            "medicareLinkInd",
            "lineOfExpInquiryLinkInd",
            "viewCheckLinkInd",
            "duplicateClaimLinkInd",
            "hipaaClaimPopUpLinkInd",
            "overpaymentDetailInquiryLinkInd",
            "claimErrorsLinkInd",
            "itsClaimSerialNumber",
            "itsAccessFeeTotalAmount",
            "itsAdminFeeTotalAmount",
            "providerAgreementMethodSorCode",
            "providerAgreementMethodWlpCode",
            "injuryDate",
            "illnessDate",
            "documentControlNumber",
            "providerOrganizationTaxId",
            "providerOrganizationTaxIdSuffix",
            "facility",
            "coordinationOfBenefitsPopUpLinkInd",
            "medicalReviewInd",
            "surgicalProcedureLinkInd",
            "claimPayeeId",
            "claimResponsibilityPopUpLinkIndicator",
            "surchargeAmount"
        })
        public static class StaticData {

            protected String subscriberId;
            protected String healthCardId;
            protected String memberSequenceNumber;
            @XmlElement(name = "Patient")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Patient patient;
            protected String claimNumber;
            protected String claimRevisionNumber;
            protected String typeofSubmission;
            protected String payeeTypeCode;
            protected String primaryCareProviderId;
            protected String preauthorizationRuleSorCode;
            protected String preauthorizationRuleWlpCode;
            protected String claimTypeCode;
            protected String productId;
            protected String authorizationNumber;
            protected String assignmentOfBenefitsInd;
            protected String erisaInd;
            protected String hipaaInd;
            @XmlElement(name = "FacilityAdmitDiagnosis")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAdmitDiagnosis facilityAdmitDiagnosis;
            @XmlElement(name = "FacilityAncillary")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAncillary facilityAncillary;
            protected String facilityId;
            protected String allowedTotalAmount;
            protected String hraDeductibleAmount;
            protected String deductibleTotalAmount;
            protected String copaymentTotalAmount;
            protected String groupId;
            protected String subgroupId;
            protected String nonCoveredTotalAmount;
            protected String providerDiscountTotalAmount;
            protected String networkId;
            protected String patientAccountNumber;
            protected String totalPaidAmount;
            protected String billedChargeAmount;
            @XmlElement(name = "UB92OccurrenceArray")
            protected List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.UB92OccurrenceArray> ub92OccurrenceArray;
            protected String interestAmount;
            protected String interestDaysQuantity;
            @XmlElement(name = "Provider")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Provider provider;
            @XmlElement(name = "Professional")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Professional professional;
            protected String coinsurancePercentage;
            protected String serviceStartDate;
            protected String serviceEndDate;
            protected String placeOfServiceSorCode;
            protected String placeOfServiceSorCodeDescriptionText;
            protected String placeOfServiceWlpCode;
            protected String placeOfServiceWlpCodeDescriptionText;
            protected String memberLiabilityAmount;
            @XmlElement(name = "FacilityService")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityService facilityService;
            protected String claimTypeOfServiceSorCode;
            protected String claimTypeOfServiceSorCodeDescriptionText;
            protected String claimTypeOfServiceWlpCode;
            protected String claimTypeOfServiceWlpCodeDescriptionText;
            protected String serviceClassificationCode;
            protected String coinsuranceTotalAmount;
            @XmlElement(name = "FacilityDuplicateClaim")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityDuplicateClaim facilityDuplicateClaim;
            protected String claimAuditLinkInd;
            protected String claimTextPopUpLinkInd;
            protected String itsHomeDisplayLinkInd;
            protected String medicareLinkInd;
            protected String lineOfExpInquiryLinkInd;
            protected String viewCheckLinkInd;
            protected String duplicateClaimLinkInd;
            protected String hipaaClaimPopUpLinkInd;
            protected String overpaymentDetailInquiryLinkInd;
            protected String claimErrorsLinkInd;
            protected String itsClaimSerialNumber;
            protected String itsAccessFeeTotalAmount;
            protected String itsAdminFeeTotalAmount;
            protected String providerAgreementMethodSorCode;
            protected String providerAgreementMethodWlpCode;
            protected String injuryDate;
            protected String illnessDate;
            protected String documentControlNumber;
            protected String providerOrganizationTaxId;
            protected String providerOrganizationTaxIdSuffix;
            @XmlElement(name = "Facility")
            protected EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility facility;
            protected String coordinationOfBenefitsPopUpLinkInd;
            protected String medicalReviewInd;
            protected String surgicalProcedureLinkInd;
            protected String claimPayeeId;
            protected String claimResponsibilityPopUpLinkIndicator;
            protected String surchargeAmount;

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
             * Gets the value of the patient property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Patient }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Patient getPatient() {
                return patient;
            }

            /**
             * Sets the value of the patient property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Patient }
             *     
             */
            public void setPatient(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Patient value) {
                this.patient = value;
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
             * Gets the value of the typeofSubmission property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeofSubmission() {
                return typeofSubmission;
            }

            /**
             * Sets the value of the typeofSubmission property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeofSubmission(String value) {
                this.typeofSubmission = value;
            }

            /**
             * Gets the value of the payeeTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPayeeTypeCode() {
                return payeeTypeCode;
            }

            /**
             * Sets the value of the payeeTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPayeeTypeCode(String value) {
                this.payeeTypeCode = value;
            }

            /**
             * Gets the value of the primaryCareProviderId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryCareProviderId() {
                return primaryCareProviderId;
            }

            /**
             * Sets the value of the primaryCareProviderId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryCareProviderId(String value) {
                this.primaryCareProviderId = value;
            }

            /**
             * Gets the value of the preauthorizationRuleSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreauthorizationRuleSorCode() {
                return preauthorizationRuleSorCode;
            }

            /**
             * Sets the value of the preauthorizationRuleSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreauthorizationRuleSorCode(String value) {
                this.preauthorizationRuleSorCode = value;
            }

            /**
             * Gets the value of the preauthorizationRuleWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreauthorizationRuleWlpCode() {
                return preauthorizationRuleWlpCode;
            }

            /**
             * Sets the value of the preauthorizationRuleWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreauthorizationRuleWlpCode(String value) {
                this.preauthorizationRuleWlpCode = value;
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
             * Gets the value of the authorizationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorizationNumber() {
                return authorizationNumber;
            }

            /**
             * Sets the value of the authorizationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorizationNumber(String value) {
                this.authorizationNumber = value;
            }

            /**
             * Gets the value of the assignmentOfBenefitsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssignmentOfBenefitsInd() {
                return assignmentOfBenefitsInd;
            }

            /**
             * Sets the value of the assignmentOfBenefitsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssignmentOfBenefitsInd(String value) {
                this.assignmentOfBenefitsInd = value;
            }

            /**
             * Gets the value of the erisaInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErisaInd() {
                return erisaInd;
            }

            /**
             * Sets the value of the erisaInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErisaInd(String value) {
                this.erisaInd = value;
            }

            /**
             * Gets the value of the hipaaInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHipaaInd() {
                return hipaaInd;
            }

            /**
             * Sets the value of the hipaaInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHipaaInd(String value) {
                this.hipaaInd = value;
            }

            /**
             * Gets the value of the facilityAdmitDiagnosis property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAdmitDiagnosis }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAdmitDiagnosis getFacilityAdmitDiagnosis() {
                return facilityAdmitDiagnosis;
            }

            /**
             * Sets the value of the facilityAdmitDiagnosis property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAdmitDiagnosis }
             *     
             */
            public void setFacilityAdmitDiagnosis(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAdmitDiagnosis value) {
                this.facilityAdmitDiagnosis = value;
            }

            /**
             * Gets the value of the facilityAncillary property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAncillary }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAncillary getFacilityAncillary() {
                return facilityAncillary;
            }

            /**
             * Sets the value of the facilityAncillary property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAncillary }
             *     
             */
            public void setFacilityAncillary(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityAncillary value) {
                this.facilityAncillary = value;
            }

            /**
             * Gets the value of the facilityId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityId() {
                return facilityId;
            }

            /**
             * Sets the value of the facilityId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityId(String value) {
                this.facilityId = value;
            }

            /**
             * Gets the value of the allowedTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAllowedTotalAmount() {
                return allowedTotalAmount;
            }

            /**
             * Sets the value of the allowedTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAllowedTotalAmount(String value) {
                this.allowedTotalAmount = value;
            }

            /**
             * Gets the value of the hraDeductibleAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHraDeductibleAmount() {
                return hraDeductibleAmount;
            }

            /**
             * Sets the value of the hraDeductibleAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHraDeductibleAmount(String value) {
                this.hraDeductibleAmount = value;
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
             * Gets the value of the copaymentTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCopaymentTotalAmount() {
                return copaymentTotalAmount;
            }

            /**
             * Sets the value of the copaymentTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCopaymentTotalAmount(String value) {
                this.copaymentTotalAmount = value;
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
             * Gets the value of the nonCoveredTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonCoveredTotalAmount() {
                return nonCoveredTotalAmount;
            }

            /**
             * Sets the value of the nonCoveredTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonCoveredTotalAmount(String value) {
                this.nonCoveredTotalAmount = value;
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
             * Gets the value of the networkId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNetworkId() {
                return networkId;
            }

            /**
             * Sets the value of the networkId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNetworkId(String value) {
                this.networkId = value;
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
             * Gets the value of the ub92OccurrenceArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ub92OccurrenceArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUB92OccurrenceArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.UB92OccurrenceArray }
             * 
             * 
             */
            public List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.UB92OccurrenceArray> getUB92OccurrenceArray() {
                if (ub92OccurrenceArray == null) {
                    ub92OccurrenceArray = new ArrayList<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.UB92OccurrenceArray>();
                }
                return this.ub92OccurrenceArray;
            }

            /**
             * Gets the value of the interestAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestAmount() {
                return interestAmount;
            }

            /**
             * Sets the value of the interestAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestAmount(String value) {
                this.interestAmount = value;
            }

            /**
             * Gets the value of the interestDaysQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInterestDaysQuantity() {
                return interestDaysQuantity;
            }

            /**
             * Sets the value of the interestDaysQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInterestDaysQuantity(String value) {
                this.interestDaysQuantity = value;
            }

            /**
             * Gets the value of the provider property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Provider }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Provider getProvider() {
                return provider;
            }

            /**
             * Sets the value of the provider property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Provider }
             *     
             */
            public void setProvider(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Provider value) {
                this.provider = value;
            }

            /**
             * Gets the value of the professional property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Professional }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Professional getProfessional() {
                return professional;
            }

            /**
             * Sets the value of the professional property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Professional }
             *     
             */
            public void setProfessional(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Professional value) {
                this.professional = value;
            }

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
             * Gets the value of the placeOfServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceSorCode() {
                return placeOfServiceSorCode;
            }

            /**
             * Sets the value of the placeOfServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceSorCode(String value) {
                this.placeOfServiceSorCode = value;
            }

            /**
             * Gets the value of the placeOfServiceSorCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceOfServiceSorCodeDescriptionText() {
                return placeOfServiceSorCodeDescriptionText;
            }

            /**
             * Sets the value of the placeOfServiceSorCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceOfServiceSorCodeDescriptionText(String value) {
                this.placeOfServiceSorCodeDescriptionText = value;
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
             * Gets the value of the facilityService property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityService }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityService getFacilityService() {
                return facilityService;
            }

            /**
             * Sets the value of the facilityService property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityService }
             *     
             */
            public void setFacilityService(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityService value) {
                this.facilityService = value;
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
             * Gets the value of the serviceClassificationCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceClassificationCode() {
                return serviceClassificationCode;
            }

            /**
             * Sets the value of the serviceClassificationCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceClassificationCode(String value) {
                this.serviceClassificationCode = value;
            }

            /**
             * Gets the value of the coinsuranceTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoinsuranceTotalAmount() {
                return coinsuranceTotalAmount;
            }

            /**
             * Sets the value of the coinsuranceTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoinsuranceTotalAmount(String value) {
                this.coinsuranceTotalAmount = value;
            }

            /**
             * Gets the value of the facilityDuplicateClaim property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityDuplicateClaim }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityDuplicateClaim getFacilityDuplicateClaim() {
                return facilityDuplicateClaim;
            }

            /**
             * Sets the value of the facilityDuplicateClaim property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityDuplicateClaim }
             *     
             */
            public void setFacilityDuplicateClaim(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.FacilityDuplicateClaim value) {
                this.facilityDuplicateClaim = value;
            }

            /**
             * Gets the value of the claimAuditLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimAuditLinkInd() {
                return claimAuditLinkInd;
            }

            /**
             * Sets the value of the claimAuditLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimAuditLinkInd(String value) {
                this.claimAuditLinkInd = value;
            }

            /**
             * Gets the value of the claimTextPopUpLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTextPopUpLinkInd() {
                return claimTextPopUpLinkInd;
            }

            /**
             * Sets the value of the claimTextPopUpLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTextPopUpLinkInd(String value) {
                this.claimTextPopUpLinkInd = value;
            }

            /**
             * Gets the value of the itsHomeDisplayLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsHomeDisplayLinkInd() {
                return itsHomeDisplayLinkInd;
            }

            /**
             * Sets the value of the itsHomeDisplayLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsHomeDisplayLinkInd(String value) {
                this.itsHomeDisplayLinkInd = value;
            }

            /**
             * Gets the value of the medicareLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicareLinkInd() {
                return medicareLinkInd;
            }

            /**
             * Sets the value of the medicareLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicareLinkInd(String value) {
                this.medicareLinkInd = value;
            }

            /**
             * Gets the value of the lineOfExpInquiryLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineOfExpInquiryLinkInd() {
                return lineOfExpInquiryLinkInd;
            }

            /**
             * Sets the value of the lineOfExpInquiryLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineOfExpInquiryLinkInd(String value) {
                this.lineOfExpInquiryLinkInd = value;
            }

            /**
             * Gets the value of the viewCheckLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewCheckLinkInd() {
                return viewCheckLinkInd;
            }

            /**
             * Sets the value of the viewCheckLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewCheckLinkInd(String value) {
                this.viewCheckLinkInd = value;
            }

            /**
             * Gets the value of the duplicateClaimLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuplicateClaimLinkInd() {
                return duplicateClaimLinkInd;
            }

            /**
             * Sets the value of the duplicateClaimLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuplicateClaimLinkInd(String value) {
                this.duplicateClaimLinkInd = value;
            }

            /**
             * Gets the value of the hipaaClaimPopUpLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHipaaClaimPopUpLinkInd() {
                return hipaaClaimPopUpLinkInd;
            }

            /**
             * Sets the value of the hipaaClaimPopUpLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHipaaClaimPopUpLinkInd(String value) {
                this.hipaaClaimPopUpLinkInd = value;
            }

            /**
             * Gets the value of the overpaymentDetailInquiryLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOverpaymentDetailInquiryLinkInd() {
                return overpaymentDetailInquiryLinkInd;
            }

            /**
             * Sets the value of the overpaymentDetailInquiryLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOverpaymentDetailInquiryLinkInd(String value) {
                this.overpaymentDetailInquiryLinkInd = value;
            }

            /**
             * Gets the value of the claimErrorsLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimErrorsLinkInd() {
                return claimErrorsLinkInd;
            }

            /**
             * Sets the value of the claimErrorsLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimErrorsLinkInd(String value) {
                this.claimErrorsLinkInd = value;
            }

            /**
             * Gets the value of the itsClaimSerialNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsClaimSerialNumber() {
                return itsClaimSerialNumber;
            }

            /**
             * Sets the value of the itsClaimSerialNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsClaimSerialNumber(String value) {
                this.itsClaimSerialNumber = value;
            }

            /**
             * Gets the value of the itsAccessFeeTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsAccessFeeTotalAmount() {
                return itsAccessFeeTotalAmount;
            }

            /**
             * Sets the value of the itsAccessFeeTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsAccessFeeTotalAmount(String value) {
                this.itsAccessFeeTotalAmount = value;
            }

            /**
             * Gets the value of the itsAdminFeeTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItsAdminFeeTotalAmount() {
                return itsAdminFeeTotalAmount;
            }

            /**
             * Sets the value of the itsAdminFeeTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItsAdminFeeTotalAmount(String value) {
                this.itsAdminFeeTotalAmount = value;
            }

            /**
             * Gets the value of the providerAgreementMethodSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderAgreementMethodSorCode() {
                return providerAgreementMethodSorCode;
            }

            /**
             * Sets the value of the providerAgreementMethodSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderAgreementMethodSorCode(String value) {
                this.providerAgreementMethodSorCode = value;
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
             * Gets the value of the injuryDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInjuryDate() {
                return injuryDate;
            }

            /**
             * Sets the value of the injuryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInjuryDate(String value) {
                this.injuryDate = value;
            }

            /**
             * Gets the value of the illnessDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIllnessDate() {
                return illnessDate;
            }

            /**
             * Sets the value of the illnessDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIllnessDate(String value) {
                this.illnessDate = value;
            }

            /**
             * Gets the value of the documentControlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocumentControlNumber() {
                return documentControlNumber;
            }

            /**
             * Sets the value of the documentControlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocumentControlNumber(String value) {
                this.documentControlNumber = value;
            }

            /**
             * Gets the value of the providerOrganizationTaxId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderOrganizationTaxId() {
                return providerOrganizationTaxId;
            }

            /**
             * Sets the value of the providerOrganizationTaxId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderOrganizationTaxId(String value) {
                this.providerOrganizationTaxId = value;
            }

            /**
             * Gets the value of the providerOrganizationTaxIdSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderOrganizationTaxIdSuffix() {
                return providerOrganizationTaxIdSuffix;
            }

            /**
             * Sets the value of the providerOrganizationTaxIdSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderOrganizationTaxIdSuffix(String value) {
                this.providerOrganizationTaxIdSuffix = value;
            }

            /**
             * Gets the value of the facility property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility }
             *     
             */
            public EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility getFacility() {
                return facility;
            }

            /**
             * Sets the value of the facility property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility }
             *     
             */
            public void setFacility(EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility value) {
                this.facility = value;
            }

            /**
             * Gets the value of the coordinationOfBenefitsPopUpLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsPopUpLinkInd() {
                return coordinationOfBenefitsPopUpLinkInd;
            }

            /**
             * Sets the value of the coordinationOfBenefitsPopUpLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsPopUpLinkInd(String value) {
                this.coordinationOfBenefitsPopUpLinkInd = value;
            }

            /**
             * Gets the value of the medicalReviewInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicalReviewInd() {
                return medicalReviewInd;
            }

            /**
             * Sets the value of the medicalReviewInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicalReviewInd(String value) {
                this.medicalReviewInd = value;
            }

            /**
             * Gets the value of the surgicalProcedureLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurgicalProcedureLinkInd() {
                return surgicalProcedureLinkInd;
            }

            /**
             * Sets the value of the surgicalProcedureLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurgicalProcedureLinkInd(String value) {
                this.surgicalProcedureLinkInd = value;
            }

            /**
             * Gets the value of the claimPayeeId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimPayeeId() {
                return claimPayeeId;
            }

            /**
             * Sets the value of the claimPayeeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimPayeeId(String value) {
                this.claimPayeeId = value;
            }

            /**
             * Gets the value of the claimResponsibilityPopUpLinkIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimResponsibilityPopUpLinkIndicator() {
                return claimResponsibilityPopUpLinkIndicator;
            }

            /**
             * Sets the value of the claimResponsibilityPopUpLinkIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimResponsibilityPopUpLinkIndicator(String value) {
                this.claimResponsibilityPopUpLinkIndicator = value;
            }

            /**
             * Gets the value of the surchargeAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurchargeAmount() {
                return surchargeAmount;
            }

            /**
             * Sets the value of the surchargeAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurchargeAmount(String value) {
                this.surchargeAmount = value;
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
             *         &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="12" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="prsntOnAdmsnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="prsntOnAdmsnIndDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="billingFrequencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ub92BillTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="diagnosisRelatedGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="admitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="dischargeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="approvedLengthOfStayQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ClaimErrorCodeArray" maxOccurs="15" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="claimErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="pricingNetworkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "icd9DiagnosisCodeArray",
                "billingFrequencyCode",
                "ub92BillTypeCode",
                "ub92BillTypeCodeDescriptionText",
                "claimStatusSorCode",
                "claimStatusSorCodeNameText",
                "claimStatusWlpCode",
                "claimStatusWlpCodeNameText",
                "diagnosisRelatedGroupCode",
                "admitDate",
                "dischargeDate",
                "approvedLengthOfStayQuantity",
                "claimErrorCodeArray",
                "medicareEobReceivedInd",
                "otherInsuranceTypeSorCode",
                "otherInsuranceTypeWlpCode",
                "pricingNetworkId",
                "rejectReasonSorCode",
                "rejectReasonSorCodeNameText",
                "rejectReasonWlpCode",
                "rejectReasonWlpCodeNameText",
                "providerOrganizationName"
            })
            public static class Facility {

                @XmlElement(name = "ICD9DiagnosisCodeArray")
                protected List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ICD9DiagnosisCodeArray> icd9DiagnosisCodeArray;
                protected String billingFrequencyCode;
                protected String ub92BillTypeCode;
                protected String ub92BillTypeCodeDescriptionText;
                protected String claimStatusSorCode;
                protected String claimStatusSorCodeNameText;
                protected String claimStatusWlpCode;
                protected String claimStatusWlpCodeNameText;
                protected String diagnosisRelatedGroupCode;
                protected String admitDate;
                protected String dischargeDate;
                protected String approvedLengthOfStayQuantity;
                @XmlElement(name = "ClaimErrorCodeArray")
                protected List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ClaimErrorCodeArray> claimErrorCodeArray;
                protected String medicareEobReceivedInd;
                protected String otherInsuranceTypeSorCode;
                protected String otherInsuranceTypeWlpCode;
                protected String pricingNetworkId;
                protected String rejectReasonSorCode;
                protected String rejectReasonSorCodeNameText;
                protected String rejectReasonWlpCode;
                protected String rejectReasonWlpCodeNameText;
                protected String providerOrganizationName;

                /**
                 * Gets the value of the icd9DiagnosisCodeArray property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the icd9DiagnosisCodeArray property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getICD9DiagnosisCodeArray().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ICD9DiagnosisCodeArray }
                 * 
                 * 
                 */
                public List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ICD9DiagnosisCodeArray> getICD9DiagnosisCodeArray() {
                    if (icd9DiagnosisCodeArray == null) {
                        icd9DiagnosisCodeArray = new ArrayList<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ICD9DiagnosisCodeArray>();
                    }
                    return this.icd9DiagnosisCodeArray;
                }

                /**
                 * Gets the value of the billingFrequencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBillingFrequencyCode() {
                    return billingFrequencyCode;
                }

                /**
                 * Sets the value of the billingFrequencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBillingFrequencyCode(String value) {
                    this.billingFrequencyCode = value;
                }

                /**
                 * Gets the value of the ub92BillTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92BillTypeCode() {
                    return ub92BillTypeCode;
                }

                /**
                 * Sets the value of the ub92BillTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92BillTypeCode(String value) {
                    this.ub92BillTypeCode = value;
                }

                /**
                 * Gets the value of the ub92BillTypeCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92BillTypeCodeDescriptionText() {
                    return ub92BillTypeCodeDescriptionText;
                }

                /**
                 * Sets the value of the ub92BillTypeCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92BillTypeCodeDescriptionText(String value) {
                    this.ub92BillTypeCodeDescriptionText = value;
                }

                /**
                 * Gets the value of the claimStatusSorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimStatusSorCode() {
                    return claimStatusSorCode;
                }

                /**
                 * Sets the value of the claimStatusSorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimStatusSorCode(String value) {
                    this.claimStatusSorCode = value;
                }

                /**
                 * Gets the value of the claimStatusSorCodeNameText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimStatusSorCodeNameText() {
                    return claimStatusSorCodeNameText;
                }

                /**
                 * Sets the value of the claimStatusSorCodeNameText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimStatusSorCodeNameText(String value) {
                    this.claimStatusSorCodeNameText = value;
                }

                /**
                 * Gets the value of the claimStatusWlpCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimStatusWlpCode() {
                    return claimStatusWlpCode;
                }

                /**
                 * Sets the value of the claimStatusWlpCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimStatusWlpCode(String value) {
                    this.claimStatusWlpCode = value;
                }

                /**
                 * Gets the value of the claimStatusWlpCodeNameText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimStatusWlpCodeNameText() {
                    return claimStatusWlpCodeNameText;
                }

                /**
                 * Sets the value of the claimStatusWlpCodeNameText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimStatusWlpCodeNameText(String value) {
                    this.claimStatusWlpCodeNameText = value;
                }

                /**
                 * Gets the value of the diagnosisRelatedGroupCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiagnosisRelatedGroupCode() {
                    return diagnosisRelatedGroupCode;
                }

                /**
                 * Sets the value of the diagnosisRelatedGroupCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiagnosisRelatedGroupCode(String value) {
                    this.diagnosisRelatedGroupCode = value;
                }

                /**
                 * Gets the value of the admitDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdmitDate() {
                    return admitDate;
                }

                /**
                 * Sets the value of the admitDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdmitDate(String value) {
                    this.admitDate = value;
                }

                /**
                 * Gets the value of the dischargeDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDischargeDate() {
                    return dischargeDate;
                }

                /**
                 * Sets the value of the dischargeDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDischargeDate(String value) {
                    this.dischargeDate = value;
                }

                /**
                 * Gets the value of the approvedLengthOfStayQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApprovedLengthOfStayQuantity() {
                    return approvedLengthOfStayQuantity;
                }

                /**
                 * Sets the value of the approvedLengthOfStayQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApprovedLengthOfStayQuantity(String value) {
                    this.approvedLengthOfStayQuantity = value;
                }

                /**
                 * Gets the value of the claimErrorCodeArray property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the claimErrorCodeArray property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getClaimErrorCodeArray().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ClaimErrorCodeArray }
                 * 
                 * 
                 */
                public List<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ClaimErrorCodeArray> getClaimErrorCodeArray() {
                    if (claimErrorCodeArray == null) {
                        claimErrorCodeArray = new ArrayList<EBSResponse.GetClaimsPaymentSummaryExResponse.StaticData.Facility.ClaimErrorCodeArray>();
                    }
                    return this.claimErrorCodeArray;
                }

                /**
                 * Gets the value of the medicareEobReceivedInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedicareEobReceivedInd() {
                    return medicareEobReceivedInd;
                }

                /**
                 * Sets the value of the medicareEobReceivedInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedicareEobReceivedInd(String value) {
                    this.medicareEobReceivedInd = value;
                }

                /**
                 * Gets the value of the otherInsuranceTypeSorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherInsuranceTypeSorCode() {
                    return otherInsuranceTypeSorCode;
                }

                /**
                 * Sets the value of the otherInsuranceTypeSorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherInsuranceTypeSorCode(String value) {
                    this.otherInsuranceTypeSorCode = value;
                }

                /**
                 * Gets the value of the otherInsuranceTypeWlpCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherInsuranceTypeWlpCode() {
                    return otherInsuranceTypeWlpCode;
                }

                /**
                 * Sets the value of the otherInsuranceTypeWlpCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherInsuranceTypeWlpCode(String value) {
                    this.otherInsuranceTypeWlpCode = value;
                }

                /**
                 * Gets the value of the pricingNetworkId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPricingNetworkId() {
                    return pricingNetworkId;
                }

                /**
                 * Sets the value of the pricingNetworkId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPricingNetworkId(String value) {
                    this.pricingNetworkId = value;
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
                 *         &lt;element name="claimErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "claimErrorSorCode",
                    "claimErrorSorCodeNameText",
                    "claimErrorWlpCode",
                    "claimErrorWlpCodeNameText"
                })
                public static class ClaimErrorCodeArray {

                    protected String claimErrorSorCode;
                    protected String claimErrorSorCodeNameText;
                    protected String claimErrorWlpCode;
                    protected String claimErrorWlpCodeNameText;

                    /**
                     * Gets the value of the claimErrorSorCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimErrorSorCode() {
                        return claimErrorSorCode;
                    }

                    /**
                     * Sets the value of the claimErrorSorCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimErrorSorCode(String value) {
                        this.claimErrorSorCode = value;
                    }

                    /**
                     * Gets the value of the claimErrorSorCodeNameText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimErrorSorCodeNameText() {
                        return claimErrorSorCodeNameText;
                    }

                    /**
                     * Sets the value of the claimErrorSorCodeNameText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimErrorSorCodeNameText(String value) {
                        this.claimErrorSorCodeNameText = value;
                    }

                    /**
                     * Gets the value of the claimErrorWlpCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimErrorWlpCode() {
                        return claimErrorWlpCode;
                    }

                    /**
                     * Sets the value of the claimErrorWlpCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimErrorWlpCode(String value) {
                        this.claimErrorWlpCode = value;
                    }

                    /**
                     * Gets the value of the claimErrorWlpCodeNameText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimErrorWlpCodeNameText() {
                        return claimErrorWlpCodeNameText;
                    }

                    /**
                     * Sets the value of the claimErrorWlpCodeNameText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimErrorWlpCodeNameText(String value) {
                        this.claimErrorWlpCodeNameText = value;
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
                 *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="prsntOnAdmsnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="prsntOnAdmsnIndDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "icd9DiagnosisCode",
                    "prsntOnAdmsnInd",
                    "prsntOnAdmsnIndDescTxt"
                })
                public static class ICD9DiagnosisCodeArray {

                    protected String icd9DiagnosisCode;
                    protected String prsntOnAdmsnInd;
                    protected String prsntOnAdmsnIndDescTxt;

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
                     * Gets the value of the prsntOnAdmsnInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrsntOnAdmsnInd() {
                        return prsntOnAdmsnInd;
                    }

                    /**
                     * Sets the value of the prsntOnAdmsnInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrsntOnAdmsnInd(String value) {
                        this.prsntOnAdmsnInd = value;
                    }

                    /**
                     * Gets the value of the prsntOnAdmsnIndDescTxt property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPrsntOnAdmsnIndDescTxt() {
                        return prsntOnAdmsnIndDescTxt;
                    }

                    /**
                     * Sets the value of the prsntOnAdmsnIndDescTxt property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPrsntOnAdmsnIndDescTxt(String value) {
                        this.prsntOnAdmsnIndDescTxt = value;
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
             *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "icd9DiagnosisCode"
            })
            public static class FacilityAdmitDiagnosis {

                protected String icd9DiagnosisCode;

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
             *         &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "providerAgreementId",
                "providerAgreementTypeCode"
            })
            public static class FacilityAncillary {

                protected String providerAgreementId;
                protected String providerAgreementTypeCode;

                /**
                 * Gets the value of the providerAgreementId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderAgreementId() {
                    return providerAgreementId;
                }

                /**
                 * Sets the value of the providerAgreementId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderAgreementId(String value) {
                    this.providerAgreementId = value;
                }

                /**
                 * Gets the value of the providerAgreementTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderAgreementTypeCode() {
                    return providerAgreementTypeCode;
                }

                /**
                 * Sets the value of the providerAgreementTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderAgreementTypeCode(String value) {
                    this.providerAgreementTypeCode = value;
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
             *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimRevisionNumber"
            })
            public static class FacilityDuplicateClaim {

                protected String claimNumber;
                protected String claimRevisionNumber;

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
             *         &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "providerAgreementId"
            })
            public static class FacilityService {

                protected String providerAgreementId;

                /**
                 * Gets the value of the providerAgreementId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderAgreementId() {
                    return providerAgreementId;
                }

                /**
                 * Sets the value of the providerAgreementId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderAgreementId(String value) {
                    this.providerAgreementId = value;
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
                "firstName",
                "middleName",
                "lastName",
                "birthDate"
            })
            public static class Patient {

                protected String firstName;
                protected String middleName;
                protected String lastName;
                protected String birthDate;

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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *         &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "providerOrganizationId",
                "providerOrganizationName",
                "firstName",
                "middleName",
                "lastName"
            })
            public static class Provider {

                protected String providerOrganizationId;
                protected String providerOrganizationName;
                protected String firstName;
                protected String middleName;
                protected String lastName;

                /**
                 * Gets the value of the providerOrganizationId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderOrganizationId() {
                    return providerOrganizationId;
                }

                /**
                 * Sets the value of the providerOrganizationId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderOrganizationId(String value) {
                    this.providerOrganizationId = value;
                }

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
             *         &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ub92OccurenceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ub92OccurenceCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "occurrenceFromDate",
                "ub92OccurenceCode",
                "ub92OccurenceCodeDescriptionText"
            })
            public static class UB92OccurrenceArray {

                protected String occurrenceFromDate;
                protected String ub92OccurenceCode;
                protected String ub92OccurenceCodeDescriptionText;

                /**
                 * Gets the value of the occurrenceFromDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOccurrenceFromDate() {
                    return occurrenceFromDate;
                }

                /**
                 * Sets the value of the occurrenceFromDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOccurrenceFromDate(String value) {
                    this.occurrenceFromDate = value;
                }

                /**
                 * Gets the value of the ub92OccurenceCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92OccurenceCode() {
                    return ub92OccurenceCode;
                }

                /**
                 * Sets the value of the ub92OccurenceCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92OccurenceCode(String value) {
                    this.ub92OccurenceCode = value;
                }

                /**
                 * Gets the value of the ub92OccurenceCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUb92OccurenceCodeDescriptionText() {
                    return ub92OccurenceCodeDescriptionText;
                }

                /**
                 * Sets the value of the ub92OccurenceCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUb92OccurenceCodeDescriptionText(String value) {
                    this.ub92OccurenceCodeDescriptionText = value;
                }

            }

        }

    }

}
