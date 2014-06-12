
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimsex_v11_01;

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
 *         &lt;element name="SearchClaimsExResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="DynamicData" maxOccurs="136" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="NeeStaticData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Member" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="totalPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NextPage" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfessionalProvider" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeofServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="disallowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Original" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitServiceCategoryEocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusSORCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusWLPCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Split" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Physician" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dispensedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pharmacyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="drugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dispensedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="daysSupplyQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientSavingsTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RejectCode1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RejectCode2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RejectCode3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RejectCode4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RejectCode5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="RejectCode6" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pharmacyTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="remainingOpAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="catastrophicCoverageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Member" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Patient" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionNumberQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientPaidDifferentialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="miscellaneousMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CDHP" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Beginning" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="End" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="maximumBenefitExceededAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pharmacy" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="medicarePartDExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="receivedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="logMessagePriorityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="messageSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dawCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Recalc" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="drugCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bankInformationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Dispensing" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="processorControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="deductibleRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maximumBenefitAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maximumOpAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="maximumBenefitRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cMSContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="licsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adjudicatedMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="contractCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="checkAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cMSPlanBenefitPackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="checkDispositionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rateCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Submitted" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ingredientCostAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="compoundPrescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="compoundPrescriptionCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchClaimsExResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchClaimsExResponse")
    protected EBSResponse.SearchClaimsExResponse searchClaimsExResponse;

    /**
     * Gets the value of the searchClaimsExResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.SearchClaimsExResponse }
     *     
     */
    public EBSResponse.SearchClaimsExResponse getSearchClaimsExResponse() {
        return searchClaimsExResponse;
    }

    /**
     * Sets the value of the searchClaimsExResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.SearchClaimsExResponse }
     *     
     */
    public void setSearchClaimsExResponse(EBSResponse.SearchClaimsExResponse value) {
        this.searchClaimsExResponse = value;
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
     *         &lt;element name="DynamicData" maxOccurs="136" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="NeeStaticData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Member" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="totalPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NextPage" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfessionalProvider" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeofServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="disallowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Original" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitServiceCategoryEocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusSORCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusWLPCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Split" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Physician" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dispensedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pharmacyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="drugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dispensedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="daysSupplyQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientSavingsTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RejectCode1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RejectCode2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RejectCode3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RejectCode4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RejectCode5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="RejectCode6" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pharmacyTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="remainingOpAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="catastrophicCoverageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Member" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionNumberQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientPaidDifferentialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="miscellaneousMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CDHP" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Beginning" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="End" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="maximumBenefitExceededAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pharmacy" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="medicarePartDExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="receivedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="logMessagePriorityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="messageSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dawCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Recalc" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="drugCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bankInformationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Dispensing" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="processorControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="deductibleRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maximumBenefitAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maximumOpAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="maximumBenefitRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cMSContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="licsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adjudicatedMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="contractCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="checkAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cMSPlanBenefitPackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="checkDispositionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rateCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Submitted" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ingredientCostAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="compoundPrescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="compoundPrescriptionCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dynamicData"
    })
    public static class SearchClaimsExResponse {

        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.SearchClaimsExResponse.DynamicData> dynamicData;

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
         * {@link EBSResponse.SearchClaimsExResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.SearchClaimsExResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.SearchClaimsExResponse.DynamicData>();
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
         *         &lt;element name="NeeStaticData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Member" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="totalPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NextPage" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adjudicationProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationTaxIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfessionalProvider" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="providerOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeofServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="disallowedTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Original" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitServiceCategoryEocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payeeTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastActivityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusSORCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusWLPCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Split" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Physician" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dispensedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pharmacyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="drugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dispensedQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="daysSupplyQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientSavingsTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RejectCode1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RejectCode2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RejectCode3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RejectCode4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RejectCode5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="RejectCode6" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="claimPayeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pharmacyTransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="remainingOpAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="catastrophicCoverageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeofServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Member" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionNumberQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientPaidDifferentialAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="miscellaneousMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CDHP" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Beginning" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="End" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="maximumBenefitExceededAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pharmacy" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="medicarePartDExistsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="receivedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="logMessagePriorityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="messageSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dawCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Recalc" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="drugCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bankInformationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Dispensing" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="processorControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="deductibleRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maximumBenefitAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maximumOpAppliedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="maximumBenefitRemainingAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cMSContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="licsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adjudicatedMethodCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="contractCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="checkAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cMSPlanBenefitPackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="checkDispositionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rateCoverageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Submitted" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ingredientCostAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="compoundPrescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="compoundPrescriptionCodeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "neeStaticData",
            "spouseDependentCode",
            "birthDate",
            "billedChargeAmount",
            "serviceStartDate",
            "claimStatusSorCode",
            "claimStatusWlpCode",
            "claimTypeCode",
            "coinsuranceAmount",
            "copaymentAmount",
            "hraDeductibleAmount",
            "deductibleAmount",
            "claimNumber",
            "adjudicationProcessDate",
            "providerOrganizationId",
            "providerOrganizationIdSuffix",
            "providerOrganizationTaxId",
            "providerOrganizationTaxIdSuffix",
            "professionalProvider",
            "providerOrganizationName",
            "providerDiscountAmount",
            "claimReceiptDate",
            "claimTypeofServiceSorCode",
            "totalPaidAmount",
            "icd9DiagnosisCode",
            "productIdentifier",
            "erisaInd",
            "disallowedTotalAmount",
            "original",
            "serviceEndDate",
            "checkNumber",
            "checkDate",
            "benefitServiceCategoryEocCode",
            "memberLiabilityAmount",
            "payeeTypeCode",
            "servicePaymentTypeSorCode",
            "servicePaymentTypeWlpCode",
            "lastActivityDate",
            "claimStatusSORCodeNameText",
            "claimStatusWLPCodeNameText",
            "healthcareArrangementCode",
            "split",
            "itsClaimSerialNumber",
            "physician",
            "prescriptionNumber",
            "dispensedDate",
            "pharmacyNabpIdentifier",
            "pharmacyName",
            "prescriptionTypeCode",
            "nationalDrugCode",
            "drugName",
            "dispensedQuantity",
            "daysSupplyQuantity",
            "prescriptionRefillNumber",
            "patientSavingsTotalAmount",
            "rejectCode1",
            "rejectCode2",
            "rejectCode3",
            "rejectCode4",
            "rejectCode5",
            "rejectCode6",
            "claimPayeeId",
            "documentControlNumber",
            "pharmacyTransactionCode",
            "payerResponsibilitySequenceNumberCode",
            "remainingOpAmount",
            "catastrophicCoverageIndicator",
            "claimTypeofServiceSorCodeDescriptionText",
            "claimReferenceNumber",
            "benefitPlanId",
            "financialCompanyCode",
            "memberRelationshipCode",
            "payeeName",
            "sourceSystemIdentifier",
            "member",
            "patient",
            "memberSequenceNumber",
            "nationalProviderIdNumber",
            "prescriptionNumberQualifierCode",
            "patientPaidDifferentialAmount",
            "healthCardID",
            "groupId",
            "miscellaneousMemberIdentifier",
            "cdhp",
            "maximumBenefitExceededAmount",
            "pharmacy",
            "medicarePartDExistsIndicator",
            "receivedTimestamp",
            "logMessagePriorityNumber",
            "messageSequenceNumber",
            "dawCode",
            "recalc",
            "drugCoverageTypeCode",
            "genericProductId",
            "bankInformationNumber",
            "dispensing",
            "processorControlNumber",
            "patientAccountNumber",
            "prescriptionDate",
            "deductibleRemainingAmount",
            "maximumBenefitAppliedAmount",
            "maximumOpAppliedAmount",
            "maximumBenefitRemainingAmount",
            "cmsContractNumber",
            "clientNumber",
            "licsInd",
            "adjudicatedMethodCode",
            "contractCd",
            "checkAmount",
            "cmsPlanBenefitPackageId",
            "checkDispositionDate",
            "rateCoverageTypeCode",
            "prescriberIdentifier",
            "submitted",
            "compoundPrescriptionCode",
            "compoundPrescriptionCodeDesc"
        })
        public static class DynamicData {

            @XmlElement(name = "NeeStaticData")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData neeStaticData;
            protected String spouseDependentCode;
            protected String birthDate;
            protected String billedChargeAmount;
            protected String serviceStartDate;
            protected String claimStatusSorCode;
            protected String claimStatusWlpCode;
            protected String claimTypeCode;
            protected String coinsuranceAmount;
            protected String copaymentAmount;
            protected Object hraDeductibleAmount;
            protected String deductibleAmount;
            protected String claimNumber;
            protected String adjudicationProcessDate;
            protected String providerOrganizationId;
            protected String providerOrganizationIdSuffix;
            protected String providerOrganizationTaxId;
            protected String providerOrganizationTaxIdSuffix;
            @XmlElement(name = "ProfessionalProvider")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.ProfessionalProvider professionalProvider;
            protected String providerOrganizationName;
            protected String providerDiscountAmount;
            protected String claimReceiptDate;
            protected String claimTypeofServiceSorCode;
            protected String totalPaidAmount;
            protected String icd9DiagnosisCode;
            protected String productIdentifier;
            protected String erisaInd;
            protected String disallowedTotalAmount;
            @XmlElement(name = "Original")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Original original;
            protected String serviceEndDate;
            protected String checkNumber;
            protected String checkDate;
            protected String benefitServiceCategoryEocCode;
            protected String memberLiabilityAmount;
            protected String payeeTypeCode;
            protected String servicePaymentTypeSorCode;
            protected String servicePaymentTypeWlpCode;
            protected String lastActivityDate;
            protected String claimStatusSORCodeNameText;
            protected String claimStatusWLPCodeNameText;
            protected String healthcareArrangementCode;
            @XmlElement(name = "Split")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Split split;
            protected String itsClaimSerialNumber;
            @XmlElement(name = "Physician")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Physician physician;
            protected String prescriptionNumber;
            protected String dispensedDate;
            protected String pharmacyNabpIdentifier;
            protected String pharmacyName;
            protected String prescriptionTypeCode;
            protected String nationalDrugCode;
            protected String drugName;
            protected String dispensedQuantity;
            protected String daysSupplyQuantity;
            protected String prescriptionRefillNumber;
            protected String patientSavingsTotalAmount;
            @XmlElement(name = "RejectCode1")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode1 rejectCode1;
            @XmlElement(name = "RejectCode2")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode2 rejectCode2;
            @XmlElement(name = "RejectCode3")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode3 rejectCode3;
            @XmlElement(name = "RejectCode4")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode4 rejectCode4;
            @XmlElement(name = "RejectCode5")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode5 rejectCode5;
            @XmlElement(name = "RejectCode6")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode6 rejectCode6;
            protected String claimPayeeId;
            protected String documentControlNumber;
            protected String pharmacyTransactionCode;
            protected String payerResponsibilitySequenceNumberCode;
            protected String remainingOpAmount;
            protected String catastrophicCoverageIndicator;
            protected String claimTypeofServiceSorCodeDescriptionText;
            protected String claimReferenceNumber;
            protected String benefitPlanId;
            protected String financialCompanyCode;
            protected String memberRelationshipCode;
            protected String payeeName;
            protected String sourceSystemIdentifier;
            @XmlElement(name = "Member")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Member member;
            @XmlElement(name = "Patient")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Patient patient;
            protected String memberSequenceNumber;
            protected String nationalProviderIdNumber;
            protected String prescriptionNumberQualifierCode;
            protected String patientPaidDifferentialAmount;
            protected String healthCardID;
            protected String groupId;
            protected String miscellaneousMemberIdentifier;
            @XmlElement(name = "CDHP")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.CDHP cdhp;
            protected String maximumBenefitExceededAmount;
            @XmlElement(name = "Pharmacy")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Pharmacy pharmacy;
            protected String medicarePartDExistsIndicator;
            protected String receivedTimestamp;
            protected String logMessagePriorityNumber;
            protected String messageSequenceNumber;
            protected String dawCode;
            @XmlElement(name = "Recalc")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Recalc recalc;
            protected String drugCoverageTypeCode;
            protected String genericProductId;
            protected String bankInformationNumber;
            @XmlElement(name = "Dispensing")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Dispensing dispensing;
            protected String processorControlNumber;
            protected String patientAccountNumber;
            protected String prescriptionDate;
            protected String deductibleRemainingAmount;
            protected String maximumBenefitAppliedAmount;
            protected String maximumOpAppliedAmount;
            protected String maximumBenefitRemainingAmount;
            @XmlElement(name = "cMSContractNumber")
            protected String cmsContractNumber;
            protected String clientNumber;
            protected String licsInd;
            protected String adjudicatedMethodCode;
            protected String contractCd;
            protected String checkAmount;
            @XmlElement(name = "cMSPlanBenefitPackageId")
            protected String cmsPlanBenefitPackageId;
            protected String checkDispositionDate;
            protected String rateCoverageTypeCode;
            protected String prescriberIdentifier;
            @XmlElement(name = "Submitted")
            protected EBSResponse.SearchClaimsExResponse.DynamicData.Submitted submitted;
            protected String compoundPrescriptionCode;
            protected String compoundPrescriptionCodeDesc;

            /**
             * Gets the value of the neeStaticData property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData getNeeStaticData() {
                return neeStaticData;
            }

            /**
             * Sets the value of the neeStaticData property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData }
             *     
             */
            public void setNeeStaticData(EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData value) {
                this.neeStaticData = value;
            }

            /**
             * Gets the value of the spouseDependentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpouseDependentCode() {
                return spouseDependentCode;
            }

            /**
             * Sets the value of the spouseDependentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpouseDependentCode(String value) {
                this.spouseDependentCode = value;
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
             * Gets the value of the hraDeductibleAmount property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getHraDeductibleAmount() {
                return hraDeductibleAmount;
            }

            /**
             * Sets the value of the hraDeductibleAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setHraDeductibleAmount(Object value) {
                this.hraDeductibleAmount = value;
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
             * Gets the value of the providerOrganizationIdSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProviderOrganizationIdSuffix() {
                return providerOrganizationIdSuffix;
            }

            /**
             * Sets the value of the providerOrganizationIdSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProviderOrganizationIdSuffix(String value) {
                this.providerOrganizationIdSuffix = value;
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
             * Gets the value of the professionalProvider property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.ProfessionalProvider }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.ProfessionalProvider getProfessionalProvider() {
                return professionalProvider;
            }

            /**
             * Sets the value of the professionalProvider property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.ProfessionalProvider }
             *     
             */
            public void setProfessionalProvider(EBSResponse.SearchClaimsExResponse.DynamicData.ProfessionalProvider value) {
                this.professionalProvider = value;
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
             * Gets the value of the claimTypeofServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeofServiceSorCode() {
                return claimTypeofServiceSorCode;
            }

            /**
             * Sets the value of the claimTypeofServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeofServiceSorCode(String value) {
                this.claimTypeofServiceSorCode = value;
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
             * Gets the value of the original property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Original }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Original getOriginal() {
                return original;
            }

            /**
             * Sets the value of the original property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Original }
             *     
             */
            public void setOriginal(EBSResponse.SearchClaimsExResponse.DynamicData.Original value) {
                this.original = value;
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
             * Gets the value of the benefitServiceCategoryEocCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenefitServiceCategoryEocCode() {
                return benefitServiceCategoryEocCode;
            }

            /**
             * Sets the value of the benefitServiceCategoryEocCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenefitServiceCategoryEocCode(String value) {
                this.benefitServiceCategoryEocCode = value;
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
             * Gets the value of the servicePaymentTypeSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePaymentTypeSorCode() {
                return servicePaymentTypeSorCode;
            }

            /**
             * Sets the value of the servicePaymentTypeSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePaymentTypeSorCode(String value) {
                this.servicePaymentTypeSorCode = value;
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
             * Gets the value of the claimStatusSORCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimStatusSORCodeNameText() {
                return claimStatusSORCodeNameText;
            }

            /**
             * Sets the value of the claimStatusSORCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimStatusSORCodeNameText(String value) {
                this.claimStatusSORCodeNameText = value;
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
             * Gets the value of the split property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Split }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Split getSplit() {
                return split;
            }

            /**
             * Sets the value of the split property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Split }
             *     
             */
            public void setSplit(EBSResponse.SearchClaimsExResponse.DynamicData.Split value) {
                this.split = value;
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
             * Gets the value of the physician property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Physician }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Physician getPhysician() {
                return physician;
            }

            /**
             * Sets the value of the physician property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Physician }
             *     
             */
            public void setPhysician(EBSResponse.SearchClaimsExResponse.DynamicData.Physician value) {
                this.physician = value;
            }

            /**
             * Gets the value of the prescriptionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionNumber() {
                return prescriptionNumber;
            }

            /**
             * Sets the value of the prescriptionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionNumber(String value) {
                this.prescriptionNumber = value;
            }

            /**
             * Gets the value of the dispensedDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDispensedDate() {
                return dispensedDate;
            }

            /**
             * Sets the value of the dispensedDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDispensedDate(String value) {
                this.dispensedDate = value;
            }

            /**
             * Gets the value of the pharmacyNabpIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPharmacyNabpIdentifier() {
                return pharmacyNabpIdentifier;
            }

            /**
             * Sets the value of the pharmacyNabpIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPharmacyNabpIdentifier(String value) {
                this.pharmacyNabpIdentifier = value;
            }

            /**
             * Gets the value of the pharmacyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPharmacyName() {
                return pharmacyName;
            }

            /**
             * Sets the value of the pharmacyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPharmacyName(String value) {
                this.pharmacyName = value;
            }

            /**
             * Gets the value of the prescriptionTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionTypeCode() {
                return prescriptionTypeCode;
            }

            /**
             * Sets the value of the prescriptionTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionTypeCode(String value) {
                this.prescriptionTypeCode = value;
            }

            /**
             * Gets the value of the nationalDrugCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalDrugCode() {
                return nationalDrugCode;
            }

            /**
             * Sets the value of the nationalDrugCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalDrugCode(String value) {
                this.nationalDrugCode = value;
            }

            /**
             * Gets the value of the drugName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugName() {
                return drugName;
            }

            /**
             * Sets the value of the drugName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugName(String value) {
                this.drugName = value;
            }

            /**
             * Gets the value of the dispensedQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDispensedQuantity() {
                return dispensedQuantity;
            }

            /**
             * Sets the value of the dispensedQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDispensedQuantity(String value) {
                this.dispensedQuantity = value;
            }

            /**
             * Gets the value of the daysSupplyQuantity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDaysSupplyQuantity() {
                return daysSupplyQuantity;
            }

            /**
             * Sets the value of the daysSupplyQuantity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDaysSupplyQuantity(String value) {
                this.daysSupplyQuantity = value;
            }

            /**
             * Gets the value of the prescriptionRefillNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionRefillNumber() {
                return prescriptionRefillNumber;
            }

            /**
             * Sets the value of the prescriptionRefillNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionRefillNumber(String value) {
                this.prescriptionRefillNumber = value;
            }

            /**
             * Gets the value of the patientSavingsTotalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatientSavingsTotalAmount() {
                return patientSavingsTotalAmount;
            }

            /**
             * Sets the value of the patientSavingsTotalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatientSavingsTotalAmount(String value) {
                this.patientSavingsTotalAmount = value;
            }

            /**
             * Gets the value of the rejectCode1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode1 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode1 getRejectCode1() {
                return rejectCode1;
            }

            /**
             * Sets the value of the rejectCode1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode1 }
             *     
             */
            public void setRejectCode1(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode1 value) {
                this.rejectCode1 = value;
            }

            /**
             * Gets the value of the rejectCode2 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode2 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode2 getRejectCode2() {
                return rejectCode2;
            }

            /**
             * Sets the value of the rejectCode2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode2 }
             *     
             */
            public void setRejectCode2(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode2 value) {
                this.rejectCode2 = value;
            }

            /**
             * Gets the value of the rejectCode3 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode3 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode3 getRejectCode3() {
                return rejectCode3;
            }

            /**
             * Sets the value of the rejectCode3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode3 }
             *     
             */
            public void setRejectCode3(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode3 value) {
                this.rejectCode3 = value;
            }

            /**
             * Gets the value of the rejectCode4 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode4 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode4 getRejectCode4() {
                return rejectCode4;
            }

            /**
             * Sets the value of the rejectCode4 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode4 }
             *     
             */
            public void setRejectCode4(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode4 value) {
                this.rejectCode4 = value;
            }

            /**
             * Gets the value of the rejectCode5 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode5 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode5 getRejectCode5() {
                return rejectCode5;
            }

            /**
             * Sets the value of the rejectCode5 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode5 }
             *     
             */
            public void setRejectCode5(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode5 value) {
                this.rejectCode5 = value;
            }

            /**
             * Gets the value of the rejectCode6 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode6 }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode6 getRejectCode6() {
                return rejectCode6;
            }

            /**
             * Sets the value of the rejectCode6 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode6 }
             *     
             */
            public void setRejectCode6(EBSResponse.SearchClaimsExResponse.DynamicData.RejectCode6 value) {
                this.rejectCode6 = value;
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
             * Gets the value of the pharmacyTransactionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPharmacyTransactionCode() {
                return pharmacyTransactionCode;
            }

            /**
             * Sets the value of the pharmacyTransactionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPharmacyTransactionCode(String value) {
                this.pharmacyTransactionCode = value;
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
             * Gets the value of the remainingOpAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemainingOpAmount() {
                return remainingOpAmount;
            }

            /**
             * Sets the value of the remainingOpAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemainingOpAmount(String value) {
                this.remainingOpAmount = value;
            }

            /**
             * Gets the value of the catastrophicCoverageIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCatastrophicCoverageIndicator() {
                return catastrophicCoverageIndicator;
            }

            /**
             * Sets the value of the catastrophicCoverageIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCatastrophicCoverageIndicator(String value) {
                this.catastrophicCoverageIndicator = value;
            }

            /**
             * Gets the value of the claimTypeofServiceSorCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeofServiceSorCodeDescriptionText() {
                return claimTypeofServiceSorCodeDescriptionText;
            }

            /**
             * Sets the value of the claimTypeofServiceSorCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeofServiceSorCodeDescriptionText(String value) {
                this.claimTypeofServiceSorCodeDescriptionText = value;
            }

            /**
             * Gets the value of the claimReferenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimReferenceNumber() {
                return claimReferenceNumber;
            }

            /**
             * Sets the value of the claimReferenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimReferenceNumber(String value) {
                this.claimReferenceNumber = value;
            }

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
             * Gets the value of the memberRelationshipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberRelationshipCode() {
                return memberRelationshipCode;
            }

            /**
             * Sets the value of the memberRelationshipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberRelationshipCode(String value) {
                this.memberRelationshipCode = value;
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

            /**
             * Gets the value of the sourceSystemIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceSystemIdentifier() {
                return sourceSystemIdentifier;
            }

            /**
             * Sets the value of the sourceSystemIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceSystemIdentifier(String value) {
                this.sourceSystemIdentifier = value;
            }

            /**
             * Gets the value of the member property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Member }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Member getMember() {
                return member;
            }

            /**
             * Sets the value of the member property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Member }
             *     
             */
            public void setMember(EBSResponse.SearchClaimsExResponse.DynamicData.Member value) {
                this.member = value;
            }

            /**
             * Gets the value of the patient property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Patient }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Patient getPatient() {
                return patient;
            }

            /**
             * Sets the value of the patient property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Patient }
             *     
             */
            public void setPatient(EBSResponse.SearchClaimsExResponse.DynamicData.Patient value) {
                this.patient = value;
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
             * Gets the value of the nationalProviderIdNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNationalProviderIdNumber() {
                return nationalProviderIdNumber;
            }

            /**
             * Sets the value of the nationalProviderIdNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNationalProviderIdNumber(String value) {
                this.nationalProviderIdNumber = value;
            }

            /**
             * Gets the value of the prescriptionNumberQualifierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionNumberQualifierCode() {
                return prescriptionNumberQualifierCode;
            }

            /**
             * Sets the value of the prescriptionNumberQualifierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionNumberQualifierCode(String value) {
                this.prescriptionNumberQualifierCode = value;
            }

            /**
             * Gets the value of the patientPaidDifferentialAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPatientPaidDifferentialAmount() {
                return patientPaidDifferentialAmount;
            }

            /**
             * Sets the value of the patientPaidDifferentialAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPatientPaidDifferentialAmount(String value) {
                this.patientPaidDifferentialAmount = value;
            }

            /**
             * Gets the value of the healthCardID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHealthCardID() {
                return healthCardID;
            }

            /**
             * Sets the value of the healthCardID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHealthCardID(String value) {
                this.healthCardID = value;
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
             * Gets the value of the miscellaneousMemberIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiscellaneousMemberIdentifier() {
                return miscellaneousMemberIdentifier;
            }

            /**
             * Sets the value of the miscellaneousMemberIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiscellaneousMemberIdentifier(String value) {
                this.miscellaneousMemberIdentifier = value;
            }

            /**
             * Gets the value of the cdhp property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.CDHP getCDHP() {
                return cdhp;
            }

            /**
             * Sets the value of the cdhp property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP }
             *     
             */
            public void setCDHP(EBSResponse.SearchClaimsExResponse.DynamicData.CDHP value) {
                this.cdhp = value;
            }

            /**
             * Gets the value of the maximumBenefitExceededAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumBenefitExceededAmount() {
                return maximumBenefitExceededAmount;
            }

            /**
             * Sets the value of the maximumBenefitExceededAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumBenefitExceededAmount(String value) {
                this.maximumBenefitExceededAmount = value;
            }

            /**
             * Gets the value of the pharmacy property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Pharmacy }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Pharmacy getPharmacy() {
                return pharmacy;
            }

            /**
             * Sets the value of the pharmacy property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Pharmacy }
             *     
             */
            public void setPharmacy(EBSResponse.SearchClaimsExResponse.DynamicData.Pharmacy value) {
                this.pharmacy = value;
            }

            /**
             * Gets the value of the medicarePartDExistsIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicarePartDExistsIndicator() {
                return medicarePartDExistsIndicator;
            }

            /**
             * Sets the value of the medicarePartDExistsIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicarePartDExistsIndicator(String value) {
                this.medicarePartDExistsIndicator = value;
            }

            /**
             * Gets the value of the receivedTimestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReceivedTimestamp() {
                return receivedTimestamp;
            }

            /**
             * Sets the value of the receivedTimestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReceivedTimestamp(String value) {
                this.receivedTimestamp = value;
            }

            /**
             * Gets the value of the logMessagePriorityNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLogMessagePriorityNumber() {
                return logMessagePriorityNumber;
            }

            /**
             * Sets the value of the logMessagePriorityNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLogMessagePriorityNumber(String value) {
                this.logMessagePriorityNumber = value;
            }

            /**
             * Gets the value of the messageSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessageSequenceNumber() {
                return messageSequenceNumber;
            }

            /**
             * Sets the value of the messageSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessageSequenceNumber(String value) {
                this.messageSequenceNumber = value;
            }

            /**
             * Gets the value of the dawCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDawCode() {
                return dawCode;
            }

            /**
             * Sets the value of the dawCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDawCode(String value) {
                this.dawCode = value;
            }

            /**
             * Gets the value of the recalc property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Recalc }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Recalc getRecalc() {
                return recalc;
            }

            /**
             * Sets the value of the recalc property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Recalc }
             *     
             */
            public void setRecalc(EBSResponse.SearchClaimsExResponse.DynamicData.Recalc value) {
                this.recalc = value;
            }

            /**
             * Gets the value of the drugCoverageTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrugCoverageTypeCode() {
                return drugCoverageTypeCode;
            }

            /**
             * Sets the value of the drugCoverageTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrugCoverageTypeCode(String value) {
                this.drugCoverageTypeCode = value;
            }

            /**
             * Gets the value of the genericProductId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenericProductId() {
                return genericProductId;
            }

            /**
             * Sets the value of the genericProductId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenericProductId(String value) {
                this.genericProductId = value;
            }

            /**
             * Gets the value of the bankInformationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBankInformationNumber() {
                return bankInformationNumber;
            }

            /**
             * Sets the value of the bankInformationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBankInformationNumber(String value) {
                this.bankInformationNumber = value;
            }

            /**
             * Gets the value of the dispensing property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Dispensing }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Dispensing getDispensing() {
                return dispensing;
            }

            /**
             * Sets the value of the dispensing property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Dispensing }
             *     
             */
            public void setDispensing(EBSResponse.SearchClaimsExResponse.DynamicData.Dispensing value) {
                this.dispensing = value;
            }

            /**
             * Gets the value of the processorControlNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessorControlNumber() {
                return processorControlNumber;
            }

            /**
             * Sets the value of the processorControlNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessorControlNumber(String value) {
                this.processorControlNumber = value;
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
             * Gets the value of the prescriptionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriptionDate() {
                return prescriptionDate;
            }

            /**
             * Sets the value of the prescriptionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriptionDate(String value) {
                this.prescriptionDate = value;
            }

            /**
             * Gets the value of the deductibleRemainingAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeductibleRemainingAmount() {
                return deductibleRemainingAmount;
            }

            /**
             * Sets the value of the deductibleRemainingAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeductibleRemainingAmount(String value) {
                this.deductibleRemainingAmount = value;
            }

            /**
             * Gets the value of the maximumBenefitAppliedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumBenefitAppliedAmount() {
                return maximumBenefitAppliedAmount;
            }

            /**
             * Sets the value of the maximumBenefitAppliedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumBenefitAppliedAmount(String value) {
                this.maximumBenefitAppliedAmount = value;
            }

            /**
             * Gets the value of the maximumOpAppliedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumOpAppliedAmount() {
                return maximumOpAppliedAmount;
            }

            /**
             * Sets the value of the maximumOpAppliedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumOpAppliedAmount(String value) {
                this.maximumOpAppliedAmount = value;
            }

            /**
             * Gets the value of the maximumBenefitRemainingAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximumBenefitRemainingAmount() {
                return maximumBenefitRemainingAmount;
            }

            /**
             * Sets the value of the maximumBenefitRemainingAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximumBenefitRemainingAmount(String value) {
                this.maximumBenefitRemainingAmount = value;
            }

            /**
             * Gets the value of the cmsContractNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMSContractNumber() {
                return cmsContractNumber;
            }

            /**
             * Sets the value of the cmsContractNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMSContractNumber(String value) {
                this.cmsContractNumber = value;
            }

            /**
             * Gets the value of the clientNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientNumber() {
                return clientNumber;
            }

            /**
             * Sets the value of the clientNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientNumber(String value) {
                this.clientNumber = value;
            }

            /**
             * Gets the value of the licsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicsInd() {
                return licsInd;
            }

            /**
             * Sets the value of the licsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicsInd(String value) {
                this.licsInd = value;
            }

            /**
             * Gets the value of the adjudicatedMethodCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdjudicatedMethodCode() {
                return adjudicatedMethodCode;
            }

            /**
             * Sets the value of the adjudicatedMethodCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdjudicatedMethodCode(String value) {
                this.adjudicatedMethodCode = value;
            }

            /**
             * Gets the value of the contractCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContractCd() {
                return contractCd;
            }

            /**
             * Sets the value of the contractCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContractCd(String value) {
                this.contractCd = value;
            }

            /**
             * Gets the value of the checkAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckAmount() {
                return checkAmount;
            }

            /**
             * Sets the value of the checkAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckAmount(String value) {
                this.checkAmount = value;
            }

            /**
             * Gets the value of the cmsPlanBenefitPackageId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMSPlanBenefitPackageId() {
                return cmsPlanBenefitPackageId;
            }

            /**
             * Sets the value of the cmsPlanBenefitPackageId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMSPlanBenefitPackageId(String value) {
                this.cmsPlanBenefitPackageId = value;
            }

            /**
             * Gets the value of the checkDispositionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckDispositionDate() {
                return checkDispositionDate;
            }

            /**
             * Sets the value of the checkDispositionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckDispositionDate(String value) {
                this.checkDispositionDate = value;
            }

            /**
             * Gets the value of the rateCoverageTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateCoverageTypeCode() {
                return rateCoverageTypeCode;
            }

            /**
             * Sets the value of the rateCoverageTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateCoverageTypeCode(String value) {
                this.rateCoverageTypeCode = value;
            }

            /**
             * Gets the value of the prescriberIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrescriberIdentifier() {
                return prescriberIdentifier;
            }

            /**
             * Sets the value of the prescriberIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrescriberIdentifier(String value) {
                this.prescriberIdentifier = value;
            }

            /**
             * Gets the value of the submitted property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Submitted }
             *     
             */
            public EBSResponse.SearchClaimsExResponse.DynamicData.Submitted getSubmitted() {
                return submitted;
            }

            /**
             * Sets the value of the submitted property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.Submitted }
             *     
             */
            public void setSubmitted(EBSResponse.SearchClaimsExResponse.DynamicData.Submitted value) {
                this.submitted = value;
            }

            /**
             * Gets the value of the compoundPrescriptionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompoundPrescriptionCode() {
                return compoundPrescriptionCode;
            }

            /**
             * Sets the value of the compoundPrescriptionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompoundPrescriptionCode(String value) {
                this.compoundPrescriptionCode = value;
            }

            /**
             * Gets the value of the compoundPrescriptionCodeDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompoundPrescriptionCodeDesc() {
                return compoundPrescriptionCodeDesc;
            }

            /**
             * Sets the value of the compoundPrescriptionCodeDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompoundPrescriptionCodeDesc(String value) {
                this.compoundPrescriptionCodeDesc = value;
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
             *         &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Beginning" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="End" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
                "productIndicator",
                "beginning",
                "end",
                "totalPaidAmount"
            })
            public static class CDHP {

                protected String productIndicator;
                @XmlElement(name = "Beginning")
                protected EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.Beginning beginning;
                @XmlElement(name = "End")
                protected EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.End end;
                protected String totalPaidAmount;

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

                /**
                 * Gets the value of the beginning property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.Beginning }
                 *     
                 */
                public EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.Beginning getBeginning() {
                    return beginning;
                }

                /**
                 * Sets the value of the beginning property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.Beginning }
                 *     
                 */
                public void setBeginning(EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.Beginning value) {
                    this.beginning = value;
                }

                /**
                 * Gets the value of the end property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.End }
                 *     
                 */
                public EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.End getEnd() {
                    return end;
                }

                /**
                 * Sets the value of the end property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.End }
                 *     
                 */
                public void setEnd(EBSResponse.SearchClaimsExResponse.DynamicData.CDHP.End value) {
                    this.end = value;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "balanceAmount"
                })
                public static class Beginning {

                    protected String balanceAmount;

                    /**
                     * Gets the value of the balanceAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBalanceAmount() {
                        return balanceAmount;
                    }

                    /**
                     * Sets the value of the balanceAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBalanceAmount(String value) {
                        this.balanceAmount = value;
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
                 *         &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "balanceAmount"
                })
                public static class End {

                    protected String balanceAmount;

                    /**
                     * Gets the value of the balanceAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBalanceAmount() {
                        return balanceAmount;
                    }

                    /**
                     * Sets the value of the balanceAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBalanceAmount(String value) {
                        this.balanceAmount = value;
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
             *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "statusCode"
            })
            public static class Dispensing {

                protected String statusCode;

                /**
                 * Gets the value of the statusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusCode() {
                    return statusCode;
                }

                /**
                 * Sets the value of the statusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusCode(String value) {
                    this.statusCode = value;
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
                "lastName"
            })
            public static class Member {

                protected String firstName;
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
             *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Member" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="totalPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NextPage" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "subscriberId",
                "healthCardId",
                "memberSequenceNumber",
                "member",
                "documentControlNumber",
                "groupId",
                "totalPageNumber",
                "nextPage"
            })
            public static class NeeStaticData {

                protected String subscriberId;
                protected String healthCardId;
                protected String memberSequenceNumber;
                @XmlElement(name = "Member")
                protected EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.Member member;
                protected String documentControlNumber;
                protected String groupId;
                protected String totalPageNumber;
                @XmlElement(name = "NextPage")
                protected EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.NextPage nextPage;

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
                 * Gets the value of the member property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.Member }
                 *     
                 */
                public EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.Member getMember() {
                    return member;
                }

                /**
                 * Sets the value of the member property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.Member }
                 *     
                 */
                public void setMember(EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.Member value) {
                    this.member = value;
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
                 * Gets the value of the totalPageNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTotalPageNumber() {
                    return totalPageNumber;
                }

                /**
                 * Sets the value of the totalPageNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTotalPageNumber(String value) {
                    this.totalPageNumber = value;
                }

                /**
                 * Gets the value of the nextPage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.NextPage }
                 *     
                 */
                public EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.NextPage getNextPage() {
                    return nextPage;
                }

                /**
                 * Sets the value of the nextPage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.NextPage }
                 *     
                 */
                public void setNextPage(EBSResponse.SearchClaimsExResponse.DynamicData.NeeStaticData.NextPage value) {
                    this.nextPage = value;
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
                 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "lastName",
                    "middleName"
                })
                public static class Member {

                    protected String firstName;
                    protected String lastName;
                    protected String middleName;

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
                 *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "subscriberId",
                    "memberSequenceNumber",
                    "providerOrganizationId",
                    "providerOrganizationIdSuffix",
                    "serviceStartDate",
                    "serviceEndDate",
                    "claimNumber"
                })
                public static class NextPage {

                    protected String subscriberId;
                    protected String memberSequenceNumber;
                    protected String providerOrganizationId;
                    protected String providerOrganizationIdSuffix;
                    protected String serviceStartDate;
                    protected String serviceEndDate;
                    protected String claimNumber;

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
                     * Gets the value of the providerOrganizationIdSuffix property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProviderOrganizationIdSuffix() {
                        return providerOrganizationIdSuffix;
                    }

                    /**
                     * Sets the value of the providerOrganizationIdSuffix property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProviderOrganizationIdSuffix(String value) {
                        this.providerOrganizationIdSuffix = value;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "lastName",
                "middleName"
            })
            public static class Patient {

                protected String firstName;
                protected String lastName;
                protected String middleName;

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
             *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "cityName",
                "benefitPlanId"
            })
            public static class Pharmacy {

                protected String cityName;
                protected String benefitPlanId;

                /**
                 * Gets the value of the cityName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityName() {
                    return cityName;
                }

                /**
                 * Sets the value of the cityName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityName(String value) {
                    this.cityName = value;
                }

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
             *         &lt;element name="prescriberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "prescriberIdentifier",
                "firstName",
                "lastName"
            })
            public static class Physician {

                protected String prescriberIdentifier;
                protected String firstName;
                protected String lastName;

                /**
                 * Gets the value of the prescriberIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrescriberIdentifier() {
                    return prescriberIdentifier;
                }

                /**
                 * Sets the value of the prescriberIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrescriberIdentifier(String value) {
                    this.prescriberIdentifier = value;
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
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "lastName",
                "middleName"
            })
            public static class ProfessionalProvider {

                protected String firstName;
                protected String lastName;
                protected String middleName;

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
             *         &lt;element name="balanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "balanceAmount"
            })
            public static class Recalc {

                protected String balanceAmount;

                /**
                 * Gets the value of the balanceAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBalanceAmount() {
                    return balanceAmount;
                }

                /**
                 * Sets the value of the balanceAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBalanceAmount(String value) {
                    this.balanceAmount = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode1 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode2 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode3 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode4 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode5 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *         &lt;element name="ncpdpRejectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ncpdpRejectionCode"
            })
            public static class RejectCode6 {

                protected String ncpdpRejectionCode;

                /**
                 * Gets the value of the ncpdpRejectionCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNcpdpRejectionCode() {
                    return ncpdpRejectionCode;
                }

                /**
                 * Sets the value of the ncpdpRejectionCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNcpdpRejectionCode(String value) {
                    this.ncpdpRejectionCode = value;
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="ingredientCostAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ingredientCostAmount"
            })
            public static class Submitted {

                protected String ingredientCostAmount;

                /**
                 * Gets the value of the ingredientCostAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIngredientCostAmount() {
                    return ingredientCostAmount;
                }

                /**
                 * Sets the value of the ingredientCostAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIngredientCostAmount(String value) {
                    this.ingredientCostAmount = value;
                }

            }

        }

    }

}
