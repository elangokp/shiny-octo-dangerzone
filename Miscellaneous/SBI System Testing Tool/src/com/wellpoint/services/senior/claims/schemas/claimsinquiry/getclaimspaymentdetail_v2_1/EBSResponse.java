
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimspaymentdetail_v2_1;

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
 *         &lt;element name="GetClaimsPaymentDetailExResponse_V1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PrimaryCarePhysician" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PrimaryProfessional" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SecondaryProfessional" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfessionalCapitated" minOccurs="0">
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
 *                             &lt;element name="ProfessionalAncillary" minOccurs="0">
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
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ProfessionalBilled" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="HCPCSModifierCodeArray" maxOccurs="4" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DuplicateClaim" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="Medicare" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Disallowed" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Agreement" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="External" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Profile" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Service" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Final" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Consolidated" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="referralIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preAuthorizationWLPTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="preAuthorizationSORTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Professional" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimLineStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ClaimLineErrorCodeArray" maxOccurs="15" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="claimLineErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimLineErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="anesthesiaMinutesQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Facility" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reimbursementPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lineItemOverrideLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CDHP" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="BenefitLevel" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Paid" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="totalPaidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Disallowed" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Explanations" maxOccurs="3" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimsPaymentDetailExResponseV1"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimsPaymentDetailExResponse_V1")
    protected EBSResponse.GetClaimsPaymentDetailExResponseV1 getClaimsPaymentDetailExResponseV1;

    /**
     * Gets the value of the getClaimsPaymentDetailExResponseV1 property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 }
     *     
     */
    public EBSResponse.GetClaimsPaymentDetailExResponseV1 getGetClaimsPaymentDetailExResponseV1() {
        return getClaimsPaymentDetailExResponseV1;
    }

    /**
     * Sets the value of the getClaimsPaymentDetailExResponseV1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 }
     *     
     */
    public void setGetClaimsPaymentDetailExResponseV1(EBSResponse.GetClaimsPaymentDetailExResponseV1 value) {
        this.getClaimsPaymentDetailExResponseV1 = value;
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
     *         &lt;element name="StaticData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PrimaryCarePhysician" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PrimaryProfessional" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SecondaryProfessional" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfessionalCapitated" minOccurs="0">
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
     *                   &lt;element name="ProfessionalAncillary" minOccurs="0">
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
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ProfessionalBilled" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="HCPCSModifierCodeArray" maxOccurs="4" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DuplicateClaim" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="Medicare" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Disallowed" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Agreement" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="External" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Profile" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Service" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Final" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Consolidated" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="referralIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preAuthorizationWLPTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="preAuthorizationSORTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Professional" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimLineStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ClaimLineErrorCodeArray" maxOccurs="15" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="claimLineErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimLineErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="anesthesiaMinutesQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Facility" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reimbursementPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lineItemOverrideLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CDHP" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="BenefitLevel" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Paid" minOccurs="0">
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
     *                             &lt;element name="Disallowed" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Explanations" maxOccurs="3" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetClaimsPaymentDetailExResponseV1 {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData }
         *     
         */
        public EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData value) {
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
         * {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData>();
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
         *         &lt;element name="providerAgreementMethodSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerAgreementMethodWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preauthorizationRuleSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preauthorizationRuleWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PrimaryCarePhysician" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="authorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="assignmentOfBenefitsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PrimaryProfessional" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SecondaryProfessional" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="erisaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfessionalCapitated" minOccurs="0">
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
         *         &lt;element name="ProfessionalAncillary" minOccurs="0">
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
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="networkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="interestDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerDiscountAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="revenueCodeServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hraDeductibleAmount" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="copaymentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="placeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLiabilityAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ProfessionalBilled" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="HCPCSModifierCodeArray" maxOccurs="4" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="providerAgreementId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerAgreementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeOfServiceWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DuplicateClaim" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="Medicare" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Disallowed" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="reasonWlpCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Agreement" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="External" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Profile" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Service" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Final" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="unitsAllowedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Consolidated" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="referralIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preAuthorizationWLPTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="preAuthorizationSORTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Professional" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimLineStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ClaimLineErrorCodeArray" maxOccurs="15" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="claimLineErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimLineErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="anesthesiaMinutesQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="coordinationOfBenefitsPopUpLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Facility" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ub92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reimbursementPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lineItemOverrideLinkInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CDHP" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="BenefitLevel" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Paid" minOccurs="0">
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
         *                   &lt;element name="Disallowed" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Explanations" maxOccurs="3" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "providerAgreementMethodSorCode",
            "providerAgreementMethodWlpCode",
            "preauthorizationRuleSorCode",
            "preauthorizationRuleWlpCode",
            "primaryCarePhysician",
            "productId",
            "authorizationNumber",
            "assignmentOfBenefitsInd",
            "primaryProfessional",
            "secondaryProfessional",
            "erisaInd",
            "hipaaInd",
            "professionalCapitated",
            "professionalAncillary",
            "groupId",
            "subgroupId",
            "networkId",
            "interestDaysQuantity",
            "claimLineNumber",
            "providerDiscountAmount",
            "serviceStartDate",
            "revenueCodeServiceStartDate",
            "coinsurancePercentage",
            "hraDeductibleAmount",
            "deductibleAmount",
            "serviceEndDate",
            "billedChargeAmount",
            "copaymentAmount",
            "placeOfServiceSorCode",
            "placeOfServiceSorCodeDescriptionText",
            "placeOfServiceWlpCode",
            "placeOfServiceWlpCodeDescriptionText",
            "scheduledAmount",
            "memberLiabilityAmount",
            "hcpcsCode",
            "professionalBilled",
            "hcpcsModifierCodeArray",
            "providerAgreementId",
            "providerAgreementTypeCode",
            "rejectReasonSorCode",
            "rejectReasonSorCodeNameText",
            "rejectReasonWlpCode",
            "rejectReasonWlpCodeNameText",
            "claimTypeOfServiceSorCode",
            "claimTypeOfServiceSorCodeDescriptionText",
            "nonCoveredAmount",
            "claimTypeOfServiceWlpCode",
            "claimTypeOfServiceWlpCodeDescriptionText",
            "unitsOfOccurrenceQuantity",
            "serviceClassificationCode",
            "paidAmount",
            "coinsuranceAmount",
            "allowedAmount",
            "duplicateClaim",
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
            "medicare",
            "disallowed",
            "agreement",
            "external",
            "profile",
            "service",
            "_final",
            "unitsAllowedValue",
            "consolidated",
            "referralIndicatorCode",
            "preAuthorizationWLPTypeCode",
            "preAuthorizationSORTypeCode",
            "professional",
            "coordinationOfBenefitsPopUpLinkInd",
            "facility",
            "reimbursementPercentage",
            "lineItemOverrideLinkInd",
            "cdhp"
        })
        public static class DynamicData {

            protected String providerAgreementMethodSorCode;
            protected String providerAgreementMethodWlpCode;
            protected String preauthorizationRuleSorCode;
            protected String preauthorizationRuleWlpCode;
            @XmlElement(name = "PrimaryCarePhysician")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryCarePhysician primaryCarePhysician;
            protected String productId;
            protected String authorizationNumber;
            protected String assignmentOfBenefitsInd;
            @XmlElement(name = "PrimaryProfessional")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryProfessional primaryProfessional;
            @XmlElement(name = "SecondaryProfessional")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.SecondaryProfessional secondaryProfessional;
            protected String erisaInd;
            protected String hipaaInd;
            @XmlElement(name = "ProfessionalCapitated")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalCapitated professionalCapitated;
            @XmlElement(name = "ProfessionalAncillary")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalAncillary professionalAncillary;
            protected String groupId;
            protected String subgroupId;
            protected String networkId;
            protected String interestDaysQuantity;
            protected String claimLineNumber;
            protected String providerDiscountAmount;
            protected String serviceStartDate;
            protected String revenueCodeServiceStartDate;
            protected String coinsurancePercentage;
            protected Object hraDeductibleAmount;
            protected String deductibleAmount;
            protected String serviceEndDate;
            protected String billedChargeAmount;
            protected String copaymentAmount;
            protected String placeOfServiceSorCode;
            protected String placeOfServiceSorCodeDescriptionText;
            protected String placeOfServiceWlpCode;
            protected String placeOfServiceWlpCodeDescriptionText;
            protected String scheduledAmount;
            protected String memberLiabilityAmount;
            protected String hcpcsCode;
            @XmlElement(name = "ProfessionalBilled")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalBilled professionalBilled;
            @XmlElement(name = "HCPCSModifierCodeArray")
            protected List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.HCPCSModifierCodeArray> hcpcsModifierCodeArray;
            protected String providerAgreementId;
            protected String providerAgreementTypeCode;
            protected String rejectReasonSorCode;
            protected String rejectReasonSorCodeNameText;
            protected String rejectReasonWlpCode;
            protected String rejectReasonWlpCodeNameText;
            protected String claimTypeOfServiceSorCode;
            protected String claimTypeOfServiceSorCodeDescriptionText;
            protected String nonCoveredAmount;
            protected String claimTypeOfServiceWlpCode;
            protected String claimTypeOfServiceWlpCodeDescriptionText;
            protected String unitsOfOccurrenceQuantity;
            protected String serviceClassificationCode;
            protected String paidAmount;
            protected String coinsuranceAmount;
            protected String allowedAmount;
            @XmlElement(name = "DuplicateClaim")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.DuplicateClaim duplicateClaim;
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
            @XmlElement(name = "Medicare")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Medicare medicare;
            @XmlElement(name = "Disallowed")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Disallowed disallowed;
            @XmlElement(name = "Agreement")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Agreement agreement;
            @XmlElement(name = "External")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.External external;
            @XmlElement(name = "Profile")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Profile profile;
            @XmlElement(name = "Service")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Service service;
            @XmlElement(name = "Final")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Final _final;
            protected String unitsAllowedValue;
            @XmlElement(name = "Consolidated")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Consolidated consolidated;
            protected String referralIndicatorCode;
            protected String preAuthorizationWLPTypeCode;
            protected String preAuthorizationSORTypeCode;
            @XmlElement(name = "Professional")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional professional;
            protected String coordinationOfBenefitsPopUpLinkInd;
            @XmlElement(name = "Facility")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Facility facility;
            protected String reimbursementPercentage;
            protected String lineItemOverrideLinkInd;
            @XmlElement(name = "CDHP")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP cdhp;

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
             * Gets the value of the primaryCarePhysician property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryCarePhysician }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryCarePhysician getPrimaryCarePhysician() {
                return primaryCarePhysician;
            }

            /**
             * Sets the value of the primaryCarePhysician property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryCarePhysician }
             *     
             */
            public void setPrimaryCarePhysician(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryCarePhysician value) {
                this.primaryCarePhysician = value;
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
             * Gets the value of the primaryProfessional property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryProfessional }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryProfessional getPrimaryProfessional() {
                return primaryProfessional;
            }

            /**
             * Sets the value of the primaryProfessional property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryProfessional }
             *     
             */
            public void setPrimaryProfessional(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.PrimaryProfessional value) {
                this.primaryProfessional = value;
            }

            /**
             * Gets the value of the secondaryProfessional property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.SecondaryProfessional }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.SecondaryProfessional getSecondaryProfessional() {
                return secondaryProfessional;
            }

            /**
             * Sets the value of the secondaryProfessional property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.SecondaryProfessional }
             *     
             */
            public void setSecondaryProfessional(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.SecondaryProfessional value) {
                this.secondaryProfessional = value;
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
             * Gets the value of the professionalCapitated property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalCapitated }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalCapitated getProfessionalCapitated() {
                return professionalCapitated;
            }

            /**
             * Sets the value of the professionalCapitated property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalCapitated }
             *     
             */
            public void setProfessionalCapitated(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalCapitated value) {
                this.professionalCapitated = value;
            }

            /**
             * Gets the value of the professionalAncillary property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalAncillary }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalAncillary getProfessionalAncillary() {
                return professionalAncillary;
            }

            /**
             * Sets the value of the professionalAncillary property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalAncillary }
             *     
             */
            public void setProfessionalAncillary(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalAncillary value) {
                this.professionalAncillary = value;
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
             * Gets the value of the scheduledAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheduledAmount() {
                return scheduledAmount;
            }

            /**
             * Sets the value of the scheduledAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheduledAmount(String value) {
                this.scheduledAmount = value;
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
             * Gets the value of the professionalBilled property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalBilled }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalBilled getProfessionalBilled() {
                return professionalBilled;
            }

            /**
             * Sets the value of the professionalBilled property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalBilled }
             *     
             */
            public void setProfessionalBilled(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.ProfessionalBilled value) {
                this.professionalBilled = value;
            }

            /**
             * Gets the value of the hcpcsModifierCodeArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hcpcsModifierCodeArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHCPCSModifierCodeArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.HCPCSModifierCodeArray }
             * 
             * 
             */
            public List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.HCPCSModifierCodeArray> getHCPCSModifierCodeArray() {
                if (hcpcsModifierCodeArray == null) {
                    hcpcsModifierCodeArray = new ArrayList<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.HCPCSModifierCodeArray>();
                }
                return this.hcpcsModifierCodeArray;
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
             * Gets the value of the duplicateClaim property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.DuplicateClaim }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.DuplicateClaim getDuplicateClaim() {
                return duplicateClaim;
            }

            /**
             * Sets the value of the duplicateClaim property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.DuplicateClaim }
             *     
             */
            public void setDuplicateClaim(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.DuplicateClaim value) {
                this.duplicateClaim = value;
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
             * Gets the value of the medicare property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Medicare }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Medicare getMedicare() {
                return medicare;
            }

            /**
             * Sets the value of the medicare property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Medicare }
             *     
             */
            public void setMedicare(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Medicare value) {
                this.medicare = value;
            }

            /**
             * Gets the value of the disallowed property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Disallowed }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Disallowed getDisallowed() {
                return disallowed;
            }

            /**
             * Sets the value of the disallowed property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Disallowed }
             *     
             */
            public void setDisallowed(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Disallowed value) {
                this.disallowed = value;
            }

            /**
             * Gets the value of the agreement property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Agreement }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Agreement getAgreement() {
                return agreement;
            }

            /**
             * Sets the value of the agreement property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Agreement }
             *     
             */
            public void setAgreement(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Agreement value) {
                this.agreement = value;
            }

            /**
             * Gets the value of the external property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.External }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.External getExternal() {
                return external;
            }

            /**
             * Sets the value of the external property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.External }
             *     
             */
            public void setExternal(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.External value) {
                this.external = value;
            }

            /**
             * Gets the value of the profile property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Profile }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Profile getProfile() {
                return profile;
            }

            /**
             * Sets the value of the profile property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Profile }
             *     
             */
            public void setProfile(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Profile value) {
                this.profile = value;
            }

            /**
             * Gets the value of the service property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Service }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Service getService() {
                return service;
            }

            /**
             * Sets the value of the service property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Service }
             *     
             */
            public void setService(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Service value) {
                this.service = value;
            }

            /**
             * Gets the value of the final property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Final }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Final getFinal() {
                return _final;
            }

            /**
             * Sets the value of the final property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Final }
             *     
             */
            public void setFinal(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Final value) {
                this._final = value;
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
             * Gets the value of the consolidated property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Consolidated }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Consolidated getConsolidated() {
                return consolidated;
            }

            /**
             * Sets the value of the consolidated property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Consolidated }
             *     
             */
            public void setConsolidated(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Consolidated value) {
                this.consolidated = value;
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

            /**
             * Gets the value of the preAuthorizationSORTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreAuthorizationSORTypeCode() {
                return preAuthorizationSORTypeCode;
            }

            /**
             * Sets the value of the preAuthorizationSORTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreAuthorizationSORTypeCode(String value) {
                this.preAuthorizationSORTypeCode = value;
            }

            /**
             * Gets the value of the professional property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional getProfessional() {
                return professional;
            }

            /**
             * Sets the value of the professional property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional }
             *     
             */
            public void setProfessional(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional value) {
                this.professional = value;
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
             * Gets the value of the facility property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Facility }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Facility getFacility() {
                return facility;
            }

            /**
             * Sets the value of the facility property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Facility }
             *     
             */
            public void setFacility(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Facility value) {
                this.facility = value;
            }

            /**
             * Gets the value of the reimbursementPercentage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReimbursementPercentage() {
                return reimbursementPercentage;
            }

            /**
             * Sets the value of the reimbursementPercentage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReimbursementPercentage(String value) {
                this.reimbursementPercentage = value;
            }

            /**
             * Gets the value of the lineItemOverrideLinkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLineItemOverrideLinkInd() {
                return lineItemOverrideLinkInd;
            }

            /**
             * Sets the value of the lineItemOverrideLinkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLineItemOverrideLinkInd(String value) {
                this.lineItemOverrideLinkInd = value;
            }

            /**
             * Gets the value of the cdhp property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP getCDHP() {
                return cdhp;
            }

            /**
             * Sets the value of the cdhp property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP }
             *     
             */
            public void setCDHP(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP value) {
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
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "scheduledAmount"
            })
            public static class Agreement {

                protected String scheduledAmount;

                /**
                 * Gets the value of the scheduledAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheduledAmount() {
                    return scheduledAmount;
                }

                /**
                 * Sets the value of the scheduledAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheduledAmount(String value) {
                    this.scheduledAmount = value;
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
             *         &lt;element name="BenefitLevel" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Paid" minOccurs="0">
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
             *         &lt;element name="Disallowed" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="nonCoveredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="codeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Explanations" maxOccurs="3" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "benefitLevel",
                "paid",
                "disallowed"
            })
            public static class CDHP {

                @XmlElement(name = "BenefitLevel")
                protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.BenefitLevel benefitLevel;
                @XmlElement(name = "Paid")
                protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Paid paid;
                @XmlElement(name = "Disallowed")
                protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed disallowed;

                /**
                 * Gets the value of the benefitLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.BenefitLevel }
                 *     
                 */
                public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.BenefitLevel getBenefitLevel() {
                    return benefitLevel;
                }

                /**
                 * Sets the value of the benefitLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.BenefitLevel }
                 *     
                 */
                public void setBenefitLevel(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.BenefitLevel value) {
                    this.benefitLevel = value;
                }

                /**
                 * Gets the value of the paid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Paid }
                 *     
                 */
                public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Paid getPaid() {
                    return paid;
                }

                /**
                 * Sets the value of the paid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Paid }
                 *     
                 */
                public void setPaid(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Paid value) {
                    this.paid = value;
                }

                /**
                 * Gets the value of the disallowed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed }
                 *     
                 */
                public EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed getDisallowed() {
                    return disallowed;
                }

                /**
                 * Sets the value of the disallowed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed }
                 *     
                 */
                public void setDisallowed(EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed value) {
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
                 *         &lt;element name="coinsurancePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "coinsurancePercentage"
                })
                public static class BenefitLevel {

                    protected String coinsurancePercentage;

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
                 *         &lt;element name="Explanations" maxOccurs="3" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "nonCoveredAmount",
                    "codeValue",
                    "explanations"
                })
                public static class Disallowed {

                    protected String nonCoveredAmount;
                    protected String codeValue;
                    @XmlElement(name = "Explanations")
                    protected List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed.Explanations> explanations;

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

                    /**
                     * Gets the value of the explanations property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the explanations property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getExplanations().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed.Explanations }
                     * 
                     * 
                     */
                    public List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed.Explanations> getExplanations() {
                        if (explanations == null) {
                            explanations = new ArrayList<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.CDHP.Disallowed.Explanations>();
                        }
                        return this.explanations;
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
                     *         &lt;element name="explanationOfServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="explanationOfServiceTextDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "explanationOfServiceCode",
                        "explanationOfServiceTextDescription"
                    })
                    public static class Explanations {

                        protected String explanationOfServiceCode;
                        protected String explanationOfServiceTextDescription;

                        /**
                         * Gets the value of the explanationOfServiceCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExplanationOfServiceCode() {
                            return explanationOfServiceCode;
                        }

                        /**
                         * Sets the value of the explanationOfServiceCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExplanationOfServiceCode(String value) {
                            this.explanationOfServiceCode = value;
                        }

                        /**
                         * Gets the value of the explanationOfServiceTextDescription property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExplanationOfServiceTextDescription() {
                            return explanationOfServiceTextDescription;
                        }

                        /**
                         * Sets the value of the explanationOfServiceTextDescription property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExplanationOfServiceTextDescription(String value) {
                            this.explanationOfServiceTextDescription = value;
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
                public static class Paid {

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
             *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "billedChargeAmount"
            })
            public static class Consolidated {

                protected String billedChargeAmount;

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
             *         &lt;element name="reasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="reasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="reasonSorCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "reasonSorCode",
                "reasonWlpCode",
                "reasonSorCodeDescriptionText",
                "reasonWlpCodeDescriptionText"
            })
            public static class Disallowed {

                protected String reasonSorCode;
                protected String reasonWlpCode;
                protected String reasonSorCodeDescriptionText;
                protected String reasonWlpCodeDescriptionText;

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
                 * Gets the value of the reasonSorCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReasonSorCodeDescriptionText() {
                    return reasonSorCodeDescriptionText;
                }

                /**
                 * Sets the value of the reasonSorCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReasonSorCodeDescriptionText(String value) {
                    this.reasonSorCodeDescriptionText = value;
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
                "claimLineNumber",
                "claimRevisionNumber"
            })
            public static class DuplicateClaim {

                protected String claimNumber;
                protected String claimLineNumber;
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
             *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "scheduledAmount"
            })
            public static class External {

                protected String scheduledAmount;

                /**
                 * Gets the value of the scheduledAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheduledAmount() {
                    return scheduledAmount;
                }

                /**
                 * Sets the value of the scheduledAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheduledAmount(String value) {
                    this.scheduledAmount = value;
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
                "ub92RevenueCode"
            })
            public static class Facility {

                protected String ub92RevenueCode;

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
             *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "scheduledAmount"
            })
            public static class Final {

                protected String scheduledAmount;

                /**
                 * Gets the value of the scheduledAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheduledAmount() {
                    return scheduledAmount;
                }

                /**
                 * Sets the value of the scheduledAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheduledAmount(String value) {
                    this.scheduledAmount = value;
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
             *         &lt;element name="hcpcsModifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "hcpcsModifierCode"
            })
            public static class HCPCSModifierCodeArray {

                protected String hcpcsModifierCode;

                /**
                 * Gets the value of the hcpcsModifierCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHcpcsModifierCode() {
                    return hcpcsModifierCode;
                }

                /**
                 * Sets the value of the hcpcsModifierCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHcpcsModifierCode(String value) {
                    this.hcpcsModifierCode = value;
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
             *         &lt;element name="allowedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="paidAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="coinsuranceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "allowedAmount",
                "deductibleAmount",
                "paidAmount",
                "coinsuranceAmount"
            })
            public static class Medicare {

                protected String allowedAmount;
                protected String deductibleAmount;
                protected String paidAmount;
                protected String coinsuranceAmount;

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
             *         &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "providerOrganizationIdSuffix"
            })
            public static class PrimaryCarePhysician {

                protected String providerOrganizationId;
                protected String providerOrganizationIdSuffix;

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
             *         &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "poAind"
            })
            public static class PrimaryProfessional {

                protected String icd9DiagnosisCode;
                @XmlElement(name = "pOAind")
                protected String poAind;

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
                 * Gets the value of the poAind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPOAind() {
                    return poAind;
                }

                /**
                 * Sets the value of the poAind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPOAind(String value) {
                    this.poAind = value;
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
             *         &lt;element name="claimLineStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineStatusSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineStatusWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="occurrenceFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="icd9SuspectedWorkersCompensationInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="autoAccidentConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherConditionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ClaimLineErrorCodeArray" maxOccurs="15" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="claimLineErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimLineErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="servicePaymentTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="servicePaymentTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="anesthesiaMinutesQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="medicareEobReceivedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherInsuranceTypeSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherInsuranceTypeWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimLineStatusSorCode",
                "claimLineStatusSorCodeNameText",
                "claimLineStatusWlpCode",
                "claimLineStatusWlpCodeNameText",
                "occurrenceFromDate",
                "patientAccountNumber",
                "icd9SuspectedWorkersCompensationInd",
                "autoAccidentConditionInd",
                "otherConditionInd",
                "claimLineErrorCodeArray",
                "servicePaymentTypeSorCode",
                "servicePaymentTypeWlpCode",
                "anesthesiaMinutesQuantity",
                "medicareEobReceivedInd",
                "otherInsuranceTypeSorCode",
                "otherInsuranceTypeWlpCode"
            })
            public static class Professional {

                protected String claimLineStatusSorCode;
                protected String claimLineStatusSorCodeNameText;
                protected String claimLineStatusWlpCode;
                protected String claimLineStatusWlpCodeNameText;
                protected String occurrenceFromDate;
                protected String patientAccountNumber;
                protected String icd9SuspectedWorkersCompensationInd;
                protected String autoAccidentConditionInd;
                protected String otherConditionInd;
                @XmlElement(name = "ClaimLineErrorCodeArray")
                protected List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional.ClaimLineErrorCodeArray> claimLineErrorCodeArray;
                protected String servicePaymentTypeSorCode;
                protected String servicePaymentTypeWlpCode;
                protected String anesthesiaMinutesQuantity;
                protected String medicareEobReceivedInd;
                protected String otherInsuranceTypeSorCode;
                protected String otherInsuranceTypeWlpCode;

                /**
                 * Gets the value of the claimLineStatusSorCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineStatusSorCode() {
                    return claimLineStatusSorCode;
                }

                /**
                 * Sets the value of the claimLineStatusSorCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineStatusSorCode(String value) {
                    this.claimLineStatusSorCode = value;
                }

                /**
                 * Gets the value of the claimLineStatusSorCodeNameText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineStatusSorCodeNameText() {
                    return claimLineStatusSorCodeNameText;
                }

                /**
                 * Sets the value of the claimLineStatusSorCodeNameText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineStatusSorCodeNameText(String value) {
                    this.claimLineStatusSorCodeNameText = value;
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
                 * Gets the value of the claimLineErrorCodeArray property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the claimLineErrorCodeArray property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getClaimLineErrorCodeArray().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional.ClaimLineErrorCodeArray }
                 * 
                 * 
                 */
                public List<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional.ClaimLineErrorCodeArray> getClaimLineErrorCodeArray() {
                    if (claimLineErrorCodeArray == null) {
                        claimLineErrorCodeArray = new ArrayList<EBSResponse.GetClaimsPaymentDetailExResponseV1 .DynamicData.Professional.ClaimLineErrorCodeArray>();
                    }
                    return this.claimLineErrorCodeArray;
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
                 * Gets the value of the anesthesiaMinutesQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAnesthesiaMinutesQuantity() {
                    return anesthesiaMinutesQuantity;
                }

                /**
                 * Sets the value of the anesthesiaMinutesQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAnesthesiaMinutesQuantity(String value) {
                    this.anesthesiaMinutesQuantity = value;
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
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element name="claimLineErrorSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimLineErrorSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimLineErrorWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="claimLineErrorWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "claimLineErrorSorCode",
                    "claimLineErrorSorCodeNameText",
                    "claimLineErrorWlpCode",
                    "claimLineErrorWlpCodeNameText"
                })
                public static class ClaimLineErrorCodeArray {

                    protected String claimLineErrorSorCode;
                    protected String claimLineErrorSorCodeNameText;
                    protected String claimLineErrorWlpCode;
                    protected String claimLineErrorWlpCodeNameText;

                    /**
                     * Gets the value of the claimLineErrorSorCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimLineErrorSorCode() {
                        return claimLineErrorSorCode;
                    }

                    /**
                     * Sets the value of the claimLineErrorSorCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimLineErrorSorCode(String value) {
                        this.claimLineErrorSorCode = value;
                    }

                    /**
                     * Gets the value of the claimLineErrorSorCodeNameText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getClaimLineErrorSorCodeNameText() {
                        return claimLineErrorSorCodeNameText;
                    }

                    /**
                     * Sets the value of the claimLineErrorSorCodeNameText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setClaimLineErrorSorCodeNameText(String value) {
                        this.claimLineErrorSorCodeNameText = value;
                    }

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
            public static class ProfessionalAncillary {

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
             *         &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "hcpcsCode"
            })
            public static class ProfessionalBilled {

                protected String hcpcsCode;

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
            public static class ProfessionalCapitated {

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
             *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "scheduledAmount"
            })
            public static class Profile {

                protected String scheduledAmount;

                /**
                 * Gets the value of the scheduledAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheduledAmount() {
                    return scheduledAmount;
                }

                /**
                 * Sets the value of the scheduledAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheduledAmount(String value) {
                    this.scheduledAmount = value;
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
             *         &lt;element name="pOAind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "poAind"
            })
            public static class SecondaryProfessional {

                protected String icd9DiagnosisCode;
                @XmlElement(name = "pOAind")
                protected String poAind;

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
                 * Gets the value of the poAind property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPOAind() {
                    return poAind;
                }

                /**
                 * Sets the value of the poAind property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPOAind(String value) {
                    this.poAind = value;
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
             *         &lt;element name="scheduledAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "scheduledAmount"
            })
            public static class Service {

                protected String scheduledAmount;

                /**
                 * Gets the value of the scheduledAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getScheduledAmount() {
                    return scheduledAmount;
                }

                /**
                 * Sets the value of the scheduledAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setScheduledAmount(String value) {
                    this.scheduledAmount = value;
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
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimNumber",
            "nextPage"
        })
        public static class StaticData {

            protected String claimNumber;
            @XmlElement(name = "NextPage")
            protected EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData.NextPage nextPage;

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
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData.NextPage }
             *     
             */
            public EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.GetClaimsPaymentDetailExResponseV1 .StaticData.NextPage value) {
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
             *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimLineNumber",
                "claimRevisionNumber"
            })
            public static class NextPage {

                protected String claimNumber;
                protected String claimLineNumber;
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

            }

        }

    }

}
