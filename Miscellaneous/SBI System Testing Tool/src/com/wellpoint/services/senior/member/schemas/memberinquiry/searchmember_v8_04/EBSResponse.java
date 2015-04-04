
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04;

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
 *         &lt;element name="SearchMemberResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DynamicData" maxOccurs="59" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberLookupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Member" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="genderCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="spouseDependentCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CoverageTypeArray" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberEligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="crdInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dcmntLvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="dsplyCntrctTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="memberEligibleInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="financialCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPlanNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="defaultEmailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MemberAddress" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PhysicalAddress" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="hipaaCommunicationsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Products" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="memberProductEligibilityStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="providerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="primaryCareProviderIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="pcpRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CDHP" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BenefitClass" maxOccurs="8" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="benefitClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="healthCareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="documentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="conversionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="handicappedMemberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="bcbsaControlPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="residentialPlanCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="directPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Subscriber" minOccurs="0">
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
 *                             &lt;element name="ClientIndicator" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VoidRecord" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchMemberResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchMemberResponse")
    protected EBSResponse.SearchMemberResponse searchMemberResponse;

    /**
     * Gets the value of the searchMemberResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.SearchMemberResponse }
     *     
     */
    public EBSResponse.SearchMemberResponse getSearchMemberResponse() {
        return searchMemberResponse;
    }

    /**
     * Sets the value of the searchMemberResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.SearchMemberResponse }
     *     
     */
    public void setSearchMemberResponse(EBSResponse.SearchMemberResponse value) {
        this.searchMemberResponse = value;
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
     *         &lt;element name="DynamicData" maxOccurs="59" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberLookupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Member" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="genderCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="spouseDependentCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CoverageTypeArray" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberEligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="crdInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dcmntLvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="dsplyCntrctTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="memberEligibleInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="financialCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPlanNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="defaultEmailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MemberAddress" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PhysicalAddress" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="hipaaCommunicationsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Products" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="memberProductEligibilityStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="providerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="primaryCareProviderIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="pcpRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CDHP" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BenefitClass" maxOccurs="8" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="benefitClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="healthCareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="documentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="conversionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="handicappedMemberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="bcbsaControlPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="residentialPlanCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="directPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Subscriber" minOccurs="0">
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
     *                   &lt;element name="ClientIndicator" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VoidRecord" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dynamicData"
    })
    public static class SearchMemberResponse {

        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.SearchMemberResponse.DynamicData> dynamicData;

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
         * {@link EBSResponse.SearchMemberResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.SearchMemberResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.SearchMemberResponse.DynamicData>();
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
         *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberLookupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrSqncNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Member" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="genderCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="spouseDependentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="spouseDependentCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CoverageTypeArray" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberEligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="crdInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dcmntLvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="dsplyCntrctTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="memberEligibleInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="financialCompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPlanNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="defaultEmailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MemberAddress" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PhysicalAddress" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="hipaaInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="hipaaCommunicationsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sourceSystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Products" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="memberProductEligibilityStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="providerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="primaryCareProviderIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="pcpRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CDHP" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BenefitClass" maxOccurs="8" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="benefitClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="healthCareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="documentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="conversionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="handicappedMemberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="businessUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="bcbsaControlPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="residentialPlanCodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="principleSubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="directPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Subscriber" minOccurs="0">
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
         *         &lt;element name="ClientIndicator" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VoidRecord" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "healthCardId",
            "subscriberId",
            "memberLookupID",
            "mbrSqncNum",
            "member",
            "spouseDependentCode",
            "spouseDependentCodeDescriptionText",
            "subscriberSequenceNumber",
            "coverageTypeArray",
            "groupId",
            "crdInfo",
            "memberEligibleInd",
            "groupNameText",
            "financialCompanyCode",
            "financialCompanyName",
            "benefitPlanId",
            "benefitPlanNm",
            "memberRelationshipCode",
            "postalCode",
            "defaultEmailAddressText",
            "memberAddress",
            "physicalAddress",
            "hipaaInd",
            "hipaaCommunicationsIndicator",
            "sourceSystemIdentifier",
            "products",
            "conversionDate",
            "studentTypeCode",
            "handicappedMemberIndicator",
            "businessUnitCode",
            "bcbsaControlPlanId",
            "residentialPlanCodeId",
            "principleSubscriberId",
            "directPayIndicator",
            "subscriber",
            "clientIndicator",
            "voidRecord"
        })
        public static class DynamicData {

            protected String healthCardId;
            protected String subscriberId;
            protected String memberLookupID;
            protected String mbrSqncNum;
            @XmlElement(name = "Member")
            protected EBSResponse.SearchMemberResponse.DynamicData.Member member;
            protected String spouseDependentCode;
            protected String spouseDependentCodeDescriptionText;
            protected String subscriberSequenceNumber;
            @XmlElement(name = "CoverageTypeArray")
            protected List<EBSResponse.SearchMemberResponse.DynamicData.CoverageTypeArray> coverageTypeArray;
            protected String groupId;
            protected EBSResponse.SearchMemberResponse.DynamicData.CrdInfo crdInfo;
            protected String memberEligibleInd;
            protected String groupNameText;
            protected String financialCompanyCode;
            protected String financialCompanyName;
            protected String benefitPlanId;
            protected String benefitPlanNm;
            protected String memberRelationshipCode;
            protected String postalCode;
            protected String defaultEmailAddressText;
            @XmlElement(name = "MemberAddress")
            protected EBSResponse.SearchMemberResponse.DynamicData.MemberAddress memberAddress;
            @XmlElement(name = "PhysicalAddress")
            protected EBSResponse.SearchMemberResponse.DynamicData.PhysicalAddress physicalAddress;
            protected String hipaaInd;
            protected String hipaaCommunicationsIndicator;
            protected String sourceSystemIdentifier;
            @XmlElement(name = "Products")
            protected List<EBSResponse.SearchMemberResponse.DynamicData.Products> products;
            protected String conversionDate;
            protected String studentTypeCode;
            protected String handicappedMemberIndicator;
            protected String businessUnitCode;
            protected String bcbsaControlPlanId;
            protected String residentialPlanCodeId;
            protected String principleSubscriberId;
            protected String directPayIndicator;
            @XmlElement(name = "Subscriber")
            protected EBSResponse.SearchMemberResponse.DynamicData.Subscriber subscriber;
            @XmlElement(name = "ClientIndicator")
            protected EBSResponse.SearchMemberResponse.DynamicData.ClientIndicator clientIndicator;
            @XmlElement(name = "VoidRecord")
            protected EBSResponse.SearchMemberResponse.DynamicData.VoidRecord voidRecord;

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
             * Gets the value of the memberLookupID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLookupID() {
                return memberLookupID;
            }

            /**
             * Sets the value of the memberLookupID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLookupID(String value) {
                this.memberLookupID = value;
            }

            /**
             * Gets the value of the mbrSqncNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrSqncNum() {
                return mbrSqncNum;
            }

            /**
             * Sets the value of the mbrSqncNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrSqncNum(String value) {
                this.mbrSqncNum = value;
            }

            /**
             * Gets the value of the member property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.Member }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.Member getMember() {
                return member;
            }

            /**
             * Sets the value of the member property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.Member }
             *     
             */
            public void setMember(EBSResponse.SearchMemberResponse.DynamicData.Member value) {
                this.member = value;
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
             * Gets the value of the spouseDependentCodeDescriptionText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpouseDependentCodeDescriptionText() {
                return spouseDependentCodeDescriptionText;
            }

            /**
             * Sets the value of the spouseDependentCodeDescriptionText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpouseDependentCodeDescriptionText(String value) {
                this.spouseDependentCodeDescriptionText = value;
            }

            /**
             * Gets the value of the subscriberSequenceNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubscriberSequenceNumber() {
                return subscriberSequenceNumber;
            }

            /**
             * Sets the value of the subscriberSequenceNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubscriberSequenceNumber(String value) {
                this.subscriberSequenceNumber = value;
            }

            /**
             * Gets the value of the coverageTypeArray property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the coverageTypeArray property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCoverageTypeArray().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.SearchMemberResponse.DynamicData.CoverageTypeArray }
             * 
             * 
             */
            public List<EBSResponse.SearchMemberResponse.DynamicData.CoverageTypeArray> getCoverageTypeArray() {
                if (coverageTypeArray == null) {
                    coverageTypeArray = new ArrayList<EBSResponse.SearchMemberResponse.DynamicData.CoverageTypeArray>();
                }
                return this.coverageTypeArray;
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
             * Gets the value of the crdInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.CrdInfo }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.CrdInfo getCrdInfo() {
                return crdInfo;
            }

            /**
             * Sets the value of the crdInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.CrdInfo }
             *     
             */
            public void setCrdInfo(EBSResponse.SearchMemberResponse.DynamicData.CrdInfo value) {
                this.crdInfo = value;
            }

            /**
             * Gets the value of the memberEligibleInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberEligibleInd() {
                return memberEligibleInd;
            }

            /**
             * Sets the value of the memberEligibleInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberEligibleInd(String value) {
                this.memberEligibleInd = value;
            }

            /**
             * Gets the value of the groupNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGroupNameText() {
                return groupNameText;
            }

            /**
             * Sets the value of the groupNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGroupNameText(String value) {
                this.groupNameText = value;
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
             * Gets the value of the financialCompanyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinancialCompanyName() {
                return financialCompanyName;
            }

            /**
             * Sets the value of the financialCompanyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinancialCompanyName(String value) {
                this.financialCompanyName = value;
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
             * Gets the value of the benefitPlanNm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenefitPlanNm() {
                return benefitPlanNm;
            }

            /**
             * Sets the value of the benefitPlanNm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenefitPlanNm(String value) {
                this.benefitPlanNm = value;
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
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Gets the value of the defaultEmailAddressText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefaultEmailAddressText() {
                return defaultEmailAddressText;
            }

            /**
             * Sets the value of the defaultEmailAddressText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefaultEmailAddressText(String value) {
                this.defaultEmailAddressText = value;
            }

            /**
             * Gets the value of the memberAddress property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.MemberAddress }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.MemberAddress getMemberAddress() {
                return memberAddress;
            }

            /**
             * Sets the value of the memberAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.MemberAddress }
             *     
             */
            public void setMemberAddress(EBSResponse.SearchMemberResponse.DynamicData.MemberAddress value) {
                this.memberAddress = value;
            }

            /**
             * Gets the value of the physicalAddress property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.PhysicalAddress }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.PhysicalAddress getPhysicalAddress() {
                return physicalAddress;
            }

            /**
             * Sets the value of the physicalAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.PhysicalAddress }
             *     
             */
            public void setPhysicalAddress(EBSResponse.SearchMemberResponse.DynamicData.PhysicalAddress value) {
                this.physicalAddress = value;
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
             * Gets the value of the hipaaCommunicationsIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHipaaCommunicationsIndicator() {
                return hipaaCommunicationsIndicator;
            }

            /**
             * Sets the value of the hipaaCommunicationsIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHipaaCommunicationsIndicator(String value) {
                this.hipaaCommunicationsIndicator = value;
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
             * Gets the value of the products property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the products property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProducts().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSResponse.SearchMemberResponse.DynamicData.Products }
             * 
             * 
             */
            public List<EBSResponse.SearchMemberResponse.DynamicData.Products> getProducts() {
                if (products == null) {
                    products = new ArrayList<EBSResponse.SearchMemberResponse.DynamicData.Products>();
                }
                return this.products;
            }

            /**
             * Gets the value of the conversionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConversionDate() {
                return conversionDate;
            }

            /**
             * Sets the value of the conversionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConversionDate(String value) {
                this.conversionDate = value;
            }

            /**
             * Gets the value of the studentTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentTypeCode() {
                return studentTypeCode;
            }

            /**
             * Sets the value of the studentTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentTypeCode(String value) {
                this.studentTypeCode = value;
            }

            /**
             * Gets the value of the handicappedMemberIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHandicappedMemberIndicator() {
                return handicappedMemberIndicator;
            }

            /**
             * Sets the value of the handicappedMemberIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHandicappedMemberIndicator(String value) {
                this.handicappedMemberIndicator = value;
            }

            /**
             * Gets the value of the businessUnitCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBusinessUnitCode() {
                return businessUnitCode;
            }

            /**
             * Sets the value of the businessUnitCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBusinessUnitCode(String value) {
                this.businessUnitCode = value;
            }

            /**
             * Gets the value of the bcbsaControlPlanId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBcbsaControlPlanId() {
                return bcbsaControlPlanId;
            }

            /**
             * Sets the value of the bcbsaControlPlanId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBcbsaControlPlanId(String value) {
                this.bcbsaControlPlanId = value;
            }

            /**
             * Gets the value of the residentialPlanCodeId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResidentialPlanCodeId() {
                return residentialPlanCodeId;
            }

            /**
             * Sets the value of the residentialPlanCodeId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResidentialPlanCodeId(String value) {
                this.residentialPlanCodeId = value;
            }

            /**
             * Gets the value of the principleSubscriberId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrincipleSubscriberId() {
                return principleSubscriberId;
            }

            /**
             * Sets the value of the principleSubscriberId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrincipleSubscriberId(String value) {
                this.principleSubscriberId = value;
            }

            /**
             * Gets the value of the directPayIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDirectPayIndicator() {
                return directPayIndicator;
            }

            /**
             * Sets the value of the directPayIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDirectPayIndicator(String value) {
                this.directPayIndicator = value;
            }

            /**
             * Gets the value of the subscriber property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.Subscriber }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.Subscriber getSubscriber() {
                return subscriber;
            }

            /**
             * Sets the value of the subscriber property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.Subscriber }
             *     
             */
            public void setSubscriber(EBSResponse.SearchMemberResponse.DynamicData.Subscriber value) {
                this.subscriber = value;
            }

            /**
             * Gets the value of the clientIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.ClientIndicator }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.ClientIndicator getClientIndicator() {
                return clientIndicator;
            }

            /**
             * Sets the value of the clientIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.ClientIndicator }
             *     
             */
            public void setClientIndicator(EBSResponse.SearchMemberResponse.DynamicData.ClientIndicator value) {
                this.clientIndicator = value;
            }

            /**
             * Gets the value of the voidRecord property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.VoidRecord }
             *     
             */
            public EBSResponse.SearchMemberResponse.DynamicData.VoidRecord getVoidRecord() {
                return voidRecord;
            }

            /**
             * Sets the value of the voidRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchMemberResponse.DynamicData.VoidRecord }
             *     
             */
            public void setVoidRecord(EBSResponse.SearchMemberResponse.DynamicData.VoidRecord value) {
                this.voidRecord = value;
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
             *         &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "eligibilityTypeCode"
            })
            public static class ClientIndicator {

                protected String eligibilityTypeCode;

                /**
                 * Gets the value of the eligibilityTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEligibilityTypeCode() {
                    return eligibilityTypeCode;
                }

                /**
                 * Sets the value of the eligibilityTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEligibilityTypeCode(String value) {
                    this.eligibilityTypeCode = value;
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
             *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberEligibilityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "productFamilyCode",
                "memberEligibilityCode"
            })
            public static class CoverageTypeArray {

                protected String productFamilyCode;
                protected String memberEligibilityCode;

                /**
                 * Gets the value of the productFamilyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductFamilyCode() {
                    return productFamilyCode;
                }

                /**
                 * Sets the value of the productFamilyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductFamilyCode(String value) {
                    this.productFamilyCode = value;
                }

                /**
                 * Gets the value of the memberEligibilityCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberEligibilityCode() {
                    return memberEligibilityCode;
                }

                /**
                 * Sets the value of the memberEligibilityCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberEligibilityCode(String value) {
                    this.memberEligibilityCode = value;
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
             *         &lt;element name="dcmntLvl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="dsplyCntrctTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "dcmntLvl",
                "dsplyCntrctTypCd"
            })
            public static class CrdInfo {

                protected String dcmntLvl;
                protected String dsplyCntrctTypCd;

                /**
                 * Gets the value of the dcmntLvl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDcmntLvl() {
                    return dcmntLvl;
                }

                /**
                 * Sets the value of the dcmntLvl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDcmntLvl(String value) {
                    this.dcmntLvl = value;
                }

                /**
                 * Gets the value of the dsplyCntrctTypCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDsplyCntrctTypCd() {
                    return dsplyCntrctTypCd;
                }

                /**
                 * Sets the value of the dsplyCntrctTypCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDsplyCntrctTypCd(String value) {
                    this.dsplyCntrctTypCd = value;
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
             *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="genderCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "birthDate",
                "genderCode",
                "genderCodeDescriptionText",
                "stateCode"
            })
            public static class Member {

                protected String firstName;
                protected String middleName;
                protected String lastName;
                protected String birthDate;
                protected String genderCode;
                protected String genderCodeDescriptionText;
                protected String stateCode;

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

                /**
                 * Gets the value of the genderCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGenderCode() {
                    return genderCode;
                }

                /**
                 * Sets the value of the genderCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGenderCode(String value) {
                    this.genderCode = value;
                }

                /**
                 * Gets the value of the genderCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGenderCodeDescriptionText() {
                    return genderCodeDescriptionText;
                }

                /**
                 * Sets the value of the genderCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGenderCodeDescriptionText(String value) {
                    this.genderCodeDescriptionText = value;
                }

                /**
                 * Gets the value of the stateCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateCode() {
                    return stateCode;
                }

                /**
                 * Sets the value of the stateCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateCode(String value) {
                    this.stateCode = value;
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
             *         &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "addressLine1Text",
                "addressLine2Text",
                "cityName",
                "stateCode",
                "postalCode",
                "countyCode"
            })
            public static class MemberAddress {

                protected String addressLine1Text;
                protected String addressLine2Text;
                protected String cityName;
                protected String stateCode;
                protected String postalCode;
                protected String countyCode;

                /**
                 * Gets the value of the addressLine1Text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine1Text() {
                    return addressLine1Text;
                }

                /**
                 * Sets the value of the addressLine1Text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine1Text(String value) {
                    this.addressLine1Text = value;
                }

                /**
                 * Gets the value of the addressLine2Text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine2Text() {
                    return addressLine2Text;
                }

                /**
                 * Sets the value of the addressLine2Text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine2Text(String value) {
                    this.addressLine2Text = value;
                }

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
                 * Gets the value of the stateCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateCode() {
                    return stateCode;
                }

                /**
                 * Sets the value of the stateCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateCode(String value) {
                    this.stateCode = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the countyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountyCode() {
                    return countyCode;
                }

                /**
                 * Sets the value of the countyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountyCode(String value) {
                    this.countyCode = value;
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
             *         &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "addressLine1Text",
                "addressLine2Text",
                "cityName",
                "stateCode",
                "postalCode",
                "countyCode",
                "telephoneNumber"
            })
            public static class PhysicalAddress {

                protected String addressLine1Text;
                protected String addressLine2Text;
                protected String cityName;
                protected String stateCode;
                protected String postalCode;
                protected String countyCode;
                protected String telephoneNumber;

                /**
                 * Gets the value of the addressLine1Text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine1Text() {
                    return addressLine1Text;
                }

                /**
                 * Sets the value of the addressLine1Text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine1Text(String value) {
                    this.addressLine1Text = value;
                }

                /**
                 * Gets the value of the addressLine2Text property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine2Text() {
                    return addressLine2Text;
                }

                /**
                 * Sets the value of the addressLine2Text property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine2Text(String value) {
                    this.addressLine2Text = value;
                }

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
                 * Gets the value of the stateCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateCode() {
                    return stateCode;
                }

                /**
                 * Sets the value of the stateCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateCode(String value) {
                    this.stateCode = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the countyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountyCode() {
                    return countyCode;
                }

                /**
                 * Sets the value of the countyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountyCode(String value) {
                    this.countyCode = value;
                }

                /**
                 * Gets the value of the telephoneNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelephoneNumber() {
                    return telephoneNumber;
                }

                /**
                 * Sets the value of the telephoneNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelephoneNumber(String value) {
                    this.telephoneNumber = value;
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
             *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberProductEligibilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberProductEligibilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="memberProductEligibilityStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="providerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="primaryCareProviderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="primaryCareProviderIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="pcpRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="enrollmentTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="enrollmentTypeCodeDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CDHP" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="productIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BenefitClass" maxOccurs="8" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="benefitClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="healthCareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="documentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "subgroupId",
                "memberProductEligibilityEffectiveDate",
                "memberProductEligibilityTerminationDate",
                "memberProductEligibilityStatusCode",
                "providerTypeCode",
                "primaryCareProviderId",
                "primaryCareProviderIdSuffix",
                "productIdentifier",
                "productDescriptionText",
                "pcpRequiredIndicator",
                "eligibilityTypeCode",
                "enrollmentTypeCode",
                "enrollmentTypeCodeDescriptionText",
                "cdhp",
                "benefitClass",
                "healthCareArrangementCode",
                "documentLevel",
                "alphaPrefixCode"
            })
            public static class Products {

                protected String subgroupId;
                protected String memberProductEligibilityEffectiveDate;
                protected String memberProductEligibilityTerminationDate;
                protected String memberProductEligibilityStatusCode;
                protected String providerTypeCode;
                protected String primaryCareProviderId;
                protected String primaryCareProviderIdSuffix;
                protected String productIdentifier;
                protected String productDescriptionText;
                protected String pcpRequiredIndicator;
                protected String eligibilityTypeCode;
                protected String enrollmentTypeCode;
                protected String enrollmentTypeCodeDescriptionText;
                @XmlElement(name = "CDHP")
                protected EBSResponse.SearchMemberResponse.DynamicData.Products.CDHP cdhp;
                @XmlElement(name = "BenefitClass")
                protected List<EBSResponse.SearchMemberResponse.DynamicData.Products.BenefitClass> benefitClass;
                protected String healthCareArrangementCode;
                protected String documentLevel;
                protected String alphaPrefixCode;

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
                 * Gets the value of the memberProductEligibilityEffectiveDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberProductEligibilityEffectiveDate() {
                    return memberProductEligibilityEffectiveDate;
                }

                /**
                 * Sets the value of the memberProductEligibilityEffectiveDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberProductEligibilityEffectiveDate(String value) {
                    this.memberProductEligibilityEffectiveDate = value;
                }

                /**
                 * Gets the value of the memberProductEligibilityTerminationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberProductEligibilityTerminationDate() {
                    return memberProductEligibilityTerminationDate;
                }

                /**
                 * Sets the value of the memberProductEligibilityTerminationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberProductEligibilityTerminationDate(String value) {
                    this.memberProductEligibilityTerminationDate = value;
                }

                /**
                 * Gets the value of the memberProductEligibilityStatusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMemberProductEligibilityStatusCode() {
                    return memberProductEligibilityStatusCode;
                }

                /**
                 * Sets the value of the memberProductEligibilityStatusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMemberProductEligibilityStatusCode(String value) {
                    this.memberProductEligibilityStatusCode = value;
                }

                /**
                 * Gets the value of the providerTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProviderTypeCode() {
                    return providerTypeCode;
                }

                /**
                 * Sets the value of the providerTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProviderTypeCode(String value) {
                    this.providerTypeCode = value;
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
                 * Gets the value of the primaryCareProviderIdSuffix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrimaryCareProviderIdSuffix() {
                    return primaryCareProviderIdSuffix;
                }

                /**
                 * Sets the value of the primaryCareProviderIdSuffix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrimaryCareProviderIdSuffix(String value) {
                    this.primaryCareProviderIdSuffix = value;
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
                 * Gets the value of the pcpRequiredIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPcpRequiredIndicator() {
                    return pcpRequiredIndicator;
                }

                /**
                 * Sets the value of the pcpRequiredIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPcpRequiredIndicator(String value) {
                    this.pcpRequiredIndicator = value;
                }

                /**
                 * Gets the value of the eligibilityTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEligibilityTypeCode() {
                    return eligibilityTypeCode;
                }

                /**
                 * Sets the value of the eligibilityTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEligibilityTypeCode(String value) {
                    this.eligibilityTypeCode = value;
                }

                /**
                 * Gets the value of the enrollmentTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnrollmentTypeCode() {
                    return enrollmentTypeCode;
                }

                /**
                 * Sets the value of the enrollmentTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnrollmentTypeCode(String value) {
                    this.enrollmentTypeCode = value;
                }

                /**
                 * Gets the value of the enrollmentTypeCodeDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnrollmentTypeCodeDescriptionText() {
                    return enrollmentTypeCodeDescriptionText;
                }

                /**
                 * Sets the value of the enrollmentTypeCodeDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnrollmentTypeCodeDescriptionText(String value) {
                    this.enrollmentTypeCodeDescriptionText = value;
                }

                /**
                 * Gets the value of the cdhp property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchMemberResponse.DynamicData.Products.CDHP }
                 *     
                 */
                public EBSResponse.SearchMemberResponse.DynamicData.Products.CDHP getCDHP() {
                    return cdhp;
                }

                /**
                 * Sets the value of the cdhp property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchMemberResponse.DynamicData.Products.CDHP }
                 *     
                 */
                public void setCDHP(EBSResponse.SearchMemberResponse.DynamicData.Products.CDHP value) {
                    this.cdhp = value;
                }

                /**
                 * Gets the value of the benefitClass property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the benefitClass property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBenefitClass().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.SearchMemberResponse.DynamicData.Products.BenefitClass }
                 * 
                 * 
                 */
                public List<EBSResponse.SearchMemberResponse.DynamicData.Products.BenefitClass> getBenefitClass() {
                    if (benefitClass == null) {
                        benefitClass = new ArrayList<EBSResponse.SearchMemberResponse.DynamicData.Products.BenefitClass>();
                    }
                    return this.benefitClass;
                }

                /**
                 * Gets the value of the healthCareArrangementCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHealthCareArrangementCode() {
                    return healthCareArrangementCode;
                }

                /**
                 * Sets the value of the healthCareArrangementCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHealthCareArrangementCode(String value) {
                    this.healthCareArrangementCode = value;
                }

                /**
                 * Gets the value of the documentLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentLevel() {
                    return documentLevel;
                }

                /**
                 * Sets the value of the documentLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentLevel(String value) {
                    this.documentLevel = value;
                }

                /**
                 * Gets the value of the alphaPrefixCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlphaPrefixCode() {
                    return alphaPrefixCode;
                }

                /**
                 * Sets the value of the alphaPrefixCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlphaPrefixCode(String value) {
                    this.alphaPrefixCode = value;
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
                 *         &lt;element name="benefitClassIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="TerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "benefitClassIdentifier",
                    "effectiveDate",
                    "terminationDate"
                })
                public static class BenefitClass {

                    protected String benefitClassIdentifier;
                    @XmlElement(name = "EffectiveDate")
                    protected String effectiveDate;
                    @XmlElement(name = "TerminationDate")
                    protected String terminationDate;

                    /**
                     * Gets the value of the benefitClassIdentifier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBenefitClassIdentifier() {
                        return benefitClassIdentifier;
                    }

                    /**
                     * Sets the value of the benefitClassIdentifier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBenefitClassIdentifier(String value) {
                        this.benefitClassIdentifier = value;
                    }

                    /**
                     * Gets the value of the effectiveDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEffectiveDate() {
                        return effectiveDate;
                    }

                    /**
                     * Sets the value of the effectiveDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEffectiveDate(String value) {
                        this.effectiveDate = value;
                    }

                    /**
                     * Gets the value of the terminationDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTerminationDate() {
                        return terminationDate;
                    }

                    /**
                     * Sets the value of the terminationDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTerminationDate(String value) {
                        this.terminationDate = value;
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
             *         &lt;element name="statusIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "statusIndicator"
            })
            public static class VoidRecord {

                protected String statusIndicator;

                /**
                 * Gets the value of the statusIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusIndicator() {
                    return statusIndicator;
                }

                /**
                 * Sets the value of the statusIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusIndicator(String value) {
                    this.statusIndicator = value;
                }

            }

        }

    }

}
