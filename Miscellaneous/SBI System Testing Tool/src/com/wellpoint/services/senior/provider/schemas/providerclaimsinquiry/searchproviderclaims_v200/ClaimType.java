
package com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Original" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Duplicate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clmSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicareCrossovrInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalRecordsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalRecordsNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Utilization" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="referralNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="preauthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="preAuthorizationWLPTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clmSubTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dx" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ICD" maxOccurs="4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Payee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disallowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="withholdAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interestAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethodCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claimStatusWLPCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hipaaClaimStatusCodes" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itsSfProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itsDfProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itsNfProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Split" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bcbsaHostPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Product" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CDHP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="Provider" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="npiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Facility">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="facilityNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="facilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="facilityTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Professional">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="providerSpecialtyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
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
 *         &lt;element name="localPlanControlNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processingSiteControlNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patAccNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimType", propOrder = {
    "claimNumber",
    "original",
    "duplicate",
    "clmSequenceNbr",
    "itsClaimSerialNumber",
    "medicareCrossovrInd",
    "medicalRecordsInd",
    "medicalRecordsNbr",
    "utilization",
    "claimReceiptDate",
    "adjudicationProcessDate",
    "claimTypeCode",
    "clmSubTypCd",
    "ub92BillTypeCode",
    "lastActivityDate",
    "documentControlNumber",
    "payerResponsibilitySequenceNumberCode",
    "serviceStartDate",
    "serviceEndDate",
    "occurrenceFromDate",
    "networkIdentifier",
    "otherInsuranceTypeWlpCode",
    "dx",
    "payee",
    "billedChargeAmount",
    "coinsuranceAmount",
    "copaymentAmount",
    "deductibleAmount",
    "providerDiscountAmount",
    "allowedTotalAmount",
    "disallowedTotalAmount",
    "withholdAmount",
    "totalPaidAmount",
    "memberLiabilityAmount",
    "interestAmount",
    "checkNumber",
    "checkDate",
    "paymentMethodCd",
    "claimStatusWlpCode",
    "claimStatusWLPCodeNameText",
    "servicePaymentTypeWlpCode",
    "hipaaClaimStatusCodes",
    "itsSfProgramCode",
    "itsDfProgramCode",
    "itsNfProgramCode",
    "split",
    "assignmentOfBenefitsInd",
    "bcbsaHostPlanId",
    "product",
    "provider",
    "localPlanControlNbr",
    "processingSiteControlNbr",
    "patAccNbr"
})
@XmlSeeAlso({
    com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp.ClaimList.Claim.class
})
public class ClaimType {

    protected String claimNumber;
    @XmlElement(name = "Original")
    protected ClaimType.Original original;
    @XmlElement(name = "Duplicate")
    protected ClaimType.Duplicate duplicate;
    protected String clmSequenceNbr;
    protected String itsClaimSerialNumber;
    protected String medicareCrossovrInd;
    protected String medicalRecordsInd;
    protected String medicalRecordsNbr;
    @XmlElement(name = "Utilization")
    protected ClaimType.Utilization utilization;
    protected String claimReceiptDate;
    protected String adjudicationProcessDate;
    protected String claimTypeCode;
    protected String clmSubTypCd;
    protected String ub92BillTypeCode;
    protected String lastActivityDate;
    protected String documentControlNumber;
    protected String payerResponsibilitySequenceNumberCode;
    protected String serviceStartDate;
    protected String serviceEndDate;
    protected String occurrenceFromDate;
    protected String networkIdentifier;
    protected String otherInsuranceTypeWlpCode;
    @XmlElement(name = "Dx")
    protected ClaimType.Dx dx;
    @XmlElement(name = "Payee")
    protected ClaimType.Payee payee;
    protected String billedChargeAmount;
    protected String coinsuranceAmount;
    protected String copaymentAmount;
    protected String deductibleAmount;
    protected String providerDiscountAmount;
    protected String allowedTotalAmount;
    protected String disallowedTotalAmount;
    protected String withholdAmount;
    protected String totalPaidAmount;
    protected String memberLiabilityAmount;
    protected String interestAmount;
    protected String checkNumber;
    protected String checkDate;
    protected String paymentMethodCd;
    protected String claimStatusWlpCode;
    protected String claimStatusWLPCodeNameText;
    protected String servicePaymentTypeWlpCode;
    protected List<ClaimType.HipaaClaimStatusCodes> hipaaClaimStatusCodes;
    protected String itsSfProgramCode;
    protected String itsDfProgramCode;
    protected String itsNfProgramCode;
    @XmlElement(name = "Split")
    protected ClaimType.Split split;
    protected String assignmentOfBenefitsInd;
    protected String bcbsaHostPlanId;
    @XmlElement(name = "Product")
    protected ClaimType.Product product;
    @XmlElement(name = "Provider")
    protected ClaimType.Provider provider;
    protected String localPlanControlNbr;
    protected String processingSiteControlNbr;
    protected String patAccNbr;

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
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Original }
     *     
     */
    public ClaimType.Original getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Original }
     *     
     */
    public void setOriginal(ClaimType.Original value) {
        this.original = value;
    }

    /**
     * Gets the value of the duplicate property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Duplicate }
     *     
     */
    public ClaimType.Duplicate getDuplicate() {
        return duplicate;
    }

    /**
     * Sets the value of the duplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Duplicate }
     *     
     */
    public void setDuplicate(ClaimType.Duplicate value) {
        this.duplicate = value;
    }

    /**
     * Gets the value of the clmSequenceNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmSequenceNbr() {
        return clmSequenceNbr;
    }

    /**
     * Sets the value of the clmSequenceNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClmSequenceNbr(String value) {
        this.clmSequenceNbr = value;
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
     * Gets the value of the medicareCrossovrInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicareCrossovrInd() {
        return medicareCrossovrInd;
    }

    /**
     * Sets the value of the medicareCrossovrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicareCrossovrInd(String value) {
        this.medicareCrossovrInd = value;
    }

    /**
     * Gets the value of the medicalRecordsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalRecordsInd() {
        return medicalRecordsInd;
    }

    /**
     * Sets the value of the medicalRecordsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalRecordsInd(String value) {
        this.medicalRecordsInd = value;
    }

    /**
     * Gets the value of the medicalRecordsNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalRecordsNbr() {
        return medicalRecordsNbr;
    }

    /**
     * Sets the value of the medicalRecordsNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalRecordsNbr(String value) {
        this.medicalRecordsNbr = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Utilization }
     *     
     */
    public ClaimType.Utilization getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Utilization }
     *     
     */
    public void setUtilization(ClaimType.Utilization value) {
        this.utilization = value;
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
     * Gets the value of the clmSubTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmSubTypCd() {
        return clmSubTypCd;
    }

    /**
     * Sets the value of the clmSubTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClmSubTypCd(String value) {
        this.clmSubTypCd = value;
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
     * Gets the value of the lastActivityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastActivityDate() {
        return lastActivityDate;
    }

    /**
     * Sets the value of the lastActivityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastActivityDate(String value) {
        this.lastActivityDate = value;
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
     * Gets the value of the payerResponsibilitySequenceNumberCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerResponsibilitySequenceNumberCode() {
        return payerResponsibilitySequenceNumberCode;
    }

    /**
     * Sets the value of the payerResponsibilitySequenceNumberCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerResponsibilitySequenceNumberCode(String value) {
        this.payerResponsibilitySequenceNumberCode = value;
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
     * Gets the value of the networkIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkIdentifier() {
        return networkIdentifier;
    }

    /**
     * Sets the value of the networkIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkIdentifier(String value) {
        this.networkIdentifier = value;
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
     * Gets the value of the dx property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Dx }
     *     
     */
    public ClaimType.Dx getDx() {
        return dx;
    }

    /**
     * Sets the value of the dx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Dx }
     *     
     */
    public void setDx(ClaimType.Dx value) {
        this.dx = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Payee }
     *     
     */
    public ClaimType.Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Payee }
     *     
     */
    public void setPayee(ClaimType.Payee value) {
        this.payee = value;
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
     * Gets the value of the disallowedTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisallowedTotalAmount() {
        return disallowedTotalAmount;
    }

    /**
     * Sets the value of the disallowedTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisallowedTotalAmount(String value) {
        this.disallowedTotalAmount = value;
    }

    /**
     * Gets the value of the withholdAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdAmount() {
        return withholdAmount;
    }

    /**
     * Sets the value of the withholdAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdAmount(String value) {
        this.withholdAmount = value;
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
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the checkDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * Sets the value of the checkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDate(String value) {
        this.checkDate = value;
    }

    /**
     * Gets the value of the paymentMethodCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethodCd() {
        return paymentMethodCd;
    }

    /**
     * Sets the value of the paymentMethodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethodCd(String value) {
        this.paymentMethodCd = value;
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
     * Gets the value of the claimStatusWLPCodeNameText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusWLPCodeNameText() {
        return claimStatusWLPCodeNameText;
    }

    /**
     * Sets the value of the claimStatusWLPCodeNameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusWLPCodeNameText(String value) {
        this.claimStatusWLPCodeNameText = value;
    }

    /**
     * Gets the value of the servicePaymentTypeWlpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePaymentTypeWlpCode() {
        return servicePaymentTypeWlpCode;
    }

    /**
     * Sets the value of the servicePaymentTypeWlpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePaymentTypeWlpCode(String value) {
        this.servicePaymentTypeWlpCode = value;
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
     * {@link ClaimType.HipaaClaimStatusCodes }
     * 
     * 
     */
    public List<ClaimType.HipaaClaimStatusCodes> getHipaaClaimStatusCodes() {
        if (hipaaClaimStatusCodes == null) {
            hipaaClaimStatusCodes = new ArrayList<ClaimType.HipaaClaimStatusCodes>();
        }
        return this.hipaaClaimStatusCodes;
    }

    /**
     * Gets the value of the itsSfProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItsSfProgramCode() {
        return itsSfProgramCode;
    }

    /**
     * Sets the value of the itsSfProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItsSfProgramCode(String value) {
        this.itsSfProgramCode = value;
    }

    /**
     * Gets the value of the itsDfProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItsDfProgramCode() {
        return itsDfProgramCode;
    }

    /**
     * Sets the value of the itsDfProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItsDfProgramCode(String value) {
        this.itsDfProgramCode = value;
    }

    /**
     * Gets the value of the itsNfProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItsNfProgramCode() {
        return itsNfProgramCode;
    }

    /**
     * Sets the value of the itsNfProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItsNfProgramCode(String value) {
        this.itsNfProgramCode = value;
    }

    /**
     * Gets the value of the split property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Split }
     *     
     */
    public ClaimType.Split getSplit() {
        return split;
    }

    /**
     * Sets the value of the split property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Split }
     *     
     */
    public void setSplit(ClaimType.Split value) {
        this.split = value;
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
     * Gets the value of the bcbsaHostPlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBcbsaHostPlanId() {
        return bcbsaHostPlanId;
    }

    /**
     * Sets the value of the bcbsaHostPlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBcbsaHostPlanId(String value) {
        this.bcbsaHostPlanId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Product }
     *     
     */
    public ClaimType.Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Product }
     *     
     */
    public void setProduct(ClaimType.Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType.Provider }
     *     
     */
    public ClaimType.Provider getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType.Provider }
     *     
     */
    public void setProvider(ClaimType.Provider value) {
        this.provider = value;
    }

    /**
     * Gets the value of the localPlanControlNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPlanControlNbr() {
        return localPlanControlNbr;
    }

    /**
     * Sets the value of the localPlanControlNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPlanControlNbr(String value) {
        this.localPlanControlNbr = value;
    }

    /**
     * Gets the value of the processingSiteControlNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingSiteControlNbr() {
        return processingSiteControlNbr;
    }

    /**
     * Sets the value of the processingSiteControlNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingSiteControlNbr(String value) {
        this.processingSiteControlNbr = value;
    }

    /**
     * Gets the value of the patAccNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatAccNbr() {
        return patAccNbr;
    }

    /**
     * Sets the value of the patAccNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatAccNbr(String value) {
        this.patAccNbr = value;
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
     *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "claimNumber"
    })
    public static class Duplicate {

        protected String claimNumber;

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
     *         &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ICD" maxOccurs="4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icd9DiagnosisCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "autoAccidentConditionInd",
        "otherConditionInd",
        "icd9SuspectedWorkersCompensationInd",
        "icd"
    })
    public static class Dx {

        protected String autoAccidentConditionInd;
        protected String otherConditionInd;
        protected String icd9SuspectedWorkersCompensationInd;
        @XmlElement(name = "ICD")
        protected List<ClaimType.Dx.ICD> icd;

        /**
         * Gets the value of the autoAccidentConditionInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutoAccidentConditionInd() {
            return autoAccidentConditionInd;
        }

        /**
         * Sets the value of the autoAccidentConditionInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutoAccidentConditionInd(String value) {
            this.autoAccidentConditionInd = value;
        }

        /**
         * Gets the value of the otherConditionInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherConditionInd() {
            return otherConditionInd;
        }

        /**
         * Sets the value of the otherConditionInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherConditionInd(String value) {
            this.otherConditionInd = value;
        }

        /**
         * Gets the value of the icd9SuspectedWorkersCompensationInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIcd9SuspectedWorkersCompensationInd() {
            return icd9SuspectedWorkersCompensationInd;
        }

        /**
         * Sets the value of the icd9SuspectedWorkersCompensationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIcd9SuspectedWorkersCompensationInd(String value) {
            this.icd9SuspectedWorkersCompensationInd = value;
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
         * {@link ClaimType.Dx.ICD }
         * 
         * 
         */
        public List<ClaimType.Dx.ICD> getICD() {
            if (icd == null) {
                icd = new ArrayList<ClaimType.Dx.ICD>();
            }
            return this.icd;
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
         *         &lt;element name="orderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            protected String orderCode;
            protected String icd9DiagnosisCode;
            protected String icd9DiagnosisCodeDescriptionText;

            /**
             * Gets the value of the orderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderCode() {
                return orderCode;
            }

            /**
             * Sets the value of the orderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderCode(String value) {
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
     *         &lt;element name="hipaaStsCatCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hipaaStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hipaaStsEntityCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

        protected String hipaaStsCatCd;
        protected String hipaaStsCd;
        protected String hipaaStsEntityCd;

        /**
         * Gets the value of the hipaaStsCatCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHipaaStsCatCd() {
            return hipaaStsCatCd;
        }

        /**
         * Sets the value of the hipaaStsCatCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHipaaStsCatCd(String value) {
            this.hipaaStsCatCd = value;
        }

        /**
         * Gets the value of the hipaaStsCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHipaaStsCd() {
            return hipaaStsCd;
        }

        /**
         * Sets the value of the hipaaStsCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHipaaStsCd(String value) {
            this.hipaaStsCd = value;
        }

        /**
         * Gets the value of the hipaaStsEntityCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHipaaStsEntityCd() {
            return hipaaStsEntityCd;
        }

        /**
         * Sets the value of the hipaaStsEntityCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHipaaStsEntityCd(String value) {
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
     *       &lt;sequence>
     *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "claimNumber"
    })
    public static class Original {

        protected String claimNumber;

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
     *         &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "claimPayeeId",
        "payeeTypeCode",
        "payeeName"
    })
    public static class Payee {

        protected String claimPayeeId;
        protected String payeeTypeCode;
        protected String payeeName;

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
         * Gets the value of the payeeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPayeeName() {
            return payeeName;
        }

        /**
         * Sets the value of the payeeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPayeeName(String value) {
            this.payeeName = value;
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
     *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CDHP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "benefitPlanId",
        "productIdentifier",
        "productDescriptionText",
        "healthcareArrangementCode",
        "cdhp"
    })
    public static class Product {

        protected String benefitPlanId;
        protected String productIdentifier;
        protected String productDescriptionText;
        protected String healthcareArrangementCode;
        @XmlElement(name = "CDHP", required = true)
        protected ClaimType.Product.CDHP cdhp;

        /**
         * Gets the value of the benefitPlanId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBenefitPlanId() {
            return benefitPlanId;
        }

        /**
         * Sets the value of the benefitPlanId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBenefitPlanId(String value) {
            this.benefitPlanId = value;
        }

        /**
         * Gets the value of the productIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductIdentifier() {
            return productIdentifier;
        }

        /**
         * Sets the value of the productIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductIdentifier(String value) {
            this.productIdentifier = value;
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
         * Gets the value of the healthcareArrangementCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHealthcareArrangementCode() {
            return healthcareArrangementCode;
        }

        /**
         * Sets the value of the healthcareArrangementCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHealthcareArrangementCode(String value) {
            this.healthcareArrangementCode = value;
        }

        /**
         * Gets the value of the cdhp property.
         * 
         * @return
         *     possible object is
         *     {@link ClaimType.Product.CDHP }
         *     
         */
        public ClaimType.Product.CDHP getCDHP() {
            return cdhp;
        }

        /**
         * Sets the value of the cdhp property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClaimType.Product.CDHP }
         *     
         */
        public void setCDHP(ClaimType.Product.CDHP value) {
            this.cdhp = value;
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
         *         &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productIndicator"
        })
        public static class CDHP {

            protected String productIndicator;

            /**
             * Gets the value of the productIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductIndicator() {
                return productIndicator;
            }

            /**
             * Sets the value of the productIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductIndicator(String value) {
                this.productIndicator = value;
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
     *         &lt;element name="npiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Facility">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="facilityNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="facilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="facilityTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Professional">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="providerSpecialtyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
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
        "npiNumber",
        "taxId",
        "providerOrganizationId",
        "providerAgreementId",
        "providerAgreementMethodWlpCode",
        "facility",
        "professional"
    })
    public static class Provider {

        protected String npiNumber;
        protected String taxId;
        protected String providerOrganizationId;
        protected String providerAgreementId;
        protected String providerAgreementMethodWlpCode;
        @XmlElement(name = "Facility", required = true)
        protected ClaimType.Provider.Facility facility;
        @XmlElement(name = "Professional", required = true)
        protected ClaimType.Provider.Professional professional;

        /**
         * Gets the value of the npiNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNpiNumber() {
            return npiNumber;
        }

        /**
         * Sets the value of the npiNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNpiNumber(String value) {
            this.npiNumber = value;
        }

        /**
         * Gets the value of the taxId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTaxId() {
            return taxId;
        }

        /**
         * Sets the value of the taxId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTaxId(String value) {
            this.taxId = value;
        }

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
         * Gets the value of the facility property.
         * 
         * @return
         *     possible object is
         *     {@link ClaimType.Provider.Facility }
         *     
         */
        public ClaimType.Provider.Facility getFacility() {
            return facility;
        }

        /**
         * Sets the value of the facility property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClaimType.Provider.Facility }
         *     
         */
        public void setFacility(ClaimType.Provider.Facility value) {
            this.facility = value;
        }

        /**
         * Gets the value of the professional property.
         * 
         * @return
         *     possible object is
         *     {@link ClaimType.Provider.Professional }
         *     
         */
        public ClaimType.Provider.Professional getProfessional() {
            return professional;
        }

        /**
         * Sets the value of the professional property.
         * 
         * @param value
         *     allowed object is
         *     {@link ClaimType.Provider.Professional }
         *     
         */
        public void setProfessional(ClaimType.Provider.Professional value) {
            this.professional = value;
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
         *         &lt;element name="facilityNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="facilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="facilityTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "facilityNameText",
            "facilityTypeCode",
            "facilityTypeCodeDescriptionText"
        })
        public static class Facility {

            protected String facilityNameText;
            protected String facilityTypeCode;
            protected String facilityTypeCodeDescriptionText;

            /**
             * Gets the value of the facilityNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityNameText() {
                return facilityNameText;
            }

            /**
             * Sets the value of the facilityNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityNameText(String value) {
                this.facilityNameText = value;
            }

            /**
             * Gets the value of the facilityTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityTypeCode() {
                return facilityTypeCode;
            }

            /**
             * Sets the value of the facilityTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityTypeCode(String value) {
                this.facilityTypeCode = value;
            }

            /**
             * Gets the value of the facilityTypeCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFacilityTypeCodeDescriptionText() {
                return facilityTypeCodeDescriptionText;
            }

            /**
             * Sets the value of the facilityTypeCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFacilityTypeCodeDescriptionText(String value) {
                this.facilityTypeCodeDescriptionText = value;
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
         *         &lt;element name="providerSpecialtyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
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
            "providerSpecialtyCode",
            "providerOrganizationName",
            "name"
        })
        public static class Professional {

            protected String providerSpecialtyCode;
            protected String providerOrganizationName;
            @XmlElement(name = "Name", required = true)
            protected NameType name;

            /**
             * Gets the value of the providerSpecialtyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderSpecialtyCode() {
                return providerSpecialtyCode;
            }

            /**
             * Sets the value of the providerSpecialtyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderSpecialtyCode(String value) {
                this.providerSpecialtyCode = value;
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
     *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "totalPaidAmount"
    })
    public static class Split {

        protected String totalPaidAmount;

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
     *         &lt;element name="referralNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="preauthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="preAuthorizationWLPTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "referralNbr",
        "referralIndicatorCode",
        "preauthorizationNumber",
        "preauthorizationRuleWlpCode",
        "preAuthorizationWLPTypeCode"
    })
    public static class Utilization {

        protected String referralNbr;
        protected String referralIndicatorCode;
        protected String preauthorizationNumber;
        protected String preauthorizationRuleWlpCode;
        protected String preAuthorizationWLPTypeCode;

        /**
         * Gets the value of the referralNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralNbr() {
            return referralNbr;
        }

        /**
         * Sets the value of the referralNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralNbr(String value) {
            this.referralNbr = value;
        }

        /**
         * Gets the value of the referralIndicatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralIndicatorCode() {
            return referralIndicatorCode;
        }

        /**
         * Sets the value of the referralIndicatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralIndicatorCode(String value) {
            this.referralIndicatorCode = value;
        }

        /**
         * Gets the value of the preauthorizationNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreauthorizationNumber() {
            return preauthorizationNumber;
        }

        /**
         * Sets the value of the preauthorizationNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreauthorizationNumber(String value) {
            this.preauthorizationNumber = value;
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
         * Gets the value of the preAuthorizationWLPTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreAuthorizationWLPTypeCode() {
            return preAuthorizationWLPTypeCode;
        }

        /**
         * Sets the value of the preAuthorizationWLPTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreAuthorizationWLPTypeCode(String value) {
            this.preAuthorizationWLPTypeCode = value;
        }

    }

}
