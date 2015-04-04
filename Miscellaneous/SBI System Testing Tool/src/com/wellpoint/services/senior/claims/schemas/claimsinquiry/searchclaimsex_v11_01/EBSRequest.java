
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimsex_v11_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="SearchClaimsExRequest" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="latestClaimRevisionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="membershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="selectedPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="preAuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sorClaimStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="geographicIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mailBoostClaimsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="View">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="N"/>
 *                       &lt;enumeration value="Y"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
    "searchClaimsExRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchClaimsExRequest")
    protected EBSRequest.SearchClaimsExRequest searchClaimsExRequest;

    /**
     * Gets the value of the searchClaimsExRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.SearchClaimsExRequest }
     *     
     */
    public EBSRequest.SearchClaimsExRequest getSearchClaimsExRequest() {
        return searchClaimsExRequest;
    }

    /**
     * Sets the value of the searchClaimsExRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.SearchClaimsExRequest }
     *     
     */
    public void setSearchClaimsExRequest(EBSRequest.SearchClaimsExRequest value) {
        this.searchClaimsExRequest = value;
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
     *                   &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="latestClaimRevisionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="membershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="selectedPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="preAuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sorClaimStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="geographicIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mailBoostClaimsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="View">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="N"/>
     *             &lt;enumeration value="Y"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class SearchClaimsExRequest {

        @XmlElement(name = "StaticData")
        protected EBSRequest.SearchClaimsExRequest.StaticData staticData;
        @XmlAttribute(name = "View")
        protected String view;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchClaimsExRequest.StaticData }
         *     
         */
        public EBSRequest.SearchClaimsExRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchClaimsExRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.SearchClaimsExRequest.StaticData value) {
            this.staticData = value;
        }

        /**
         * Gets the value of the view property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getView() {
            return view;
        }

        /**
         * Sets the value of the view property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setView(String value) {
            this.view = value;
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
         *         &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationIdSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPlanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="financialCompanyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="latestClaimRevisionInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="itsClaimSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="membershipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="selectedPageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="preAuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="pharmacyNabpIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sorClaimStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="geographicIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalProviderIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="providerOrganizationTaxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prescriptionRefillNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="payerResponsibilitySequenceNumberCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="genericProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nationalDrugCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mailBoostClaimsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "memberLookupId",
            "memberSequenceNumber",
            "claimNumber",
            "claimTypeCode",
            "serviceStartDate",
            "serviceEndDate",
            "providerOrganizationId",
            "providerOrganizationIdSuffix",
            "icd9DiagnosisCode",
            "groupId",
            "benefitPlanId",
            "financialCompanyCode",
            "memberRelationshipCode",
            "billedChargeAmount",
            "latestClaimRevisionInd",
            "eligibilityTypeCode",
            "itsClaimSerialNumber",
            "membershipCode",
            "selectedPageNumber",
            "nextPage",
            "preAuthorizationNumber",
            "prescriptionTypeCode",
            "pharmacyNabpIdentifier",
            "sorClaimStatusCode",
            "geographicIdentifier",
            "nationalProviderIdNumber",
            "providerOrganizationTaxId",
            "prescriptionNumber",
            "prescriptionRefillNumber",
            "payerResponsibilitySequenceNumberCode",
            "genericProductId",
            "nationalDrugCode",
            "mailBoostClaimsCode"
        })
        public static class StaticData {

            protected String memberLookupId;
            protected String memberSequenceNumber;
            protected String claimNumber;
            protected String claimTypeCode;
            protected String serviceStartDate;
            protected String serviceEndDate;
            protected String providerOrganizationId;
            protected String providerOrganizationIdSuffix;
            protected String icd9DiagnosisCode;
            protected String groupId;
            protected String benefitPlanId;
            protected String financialCompanyCode;
            protected String memberRelationshipCode;
            protected String billedChargeAmount;
            protected String latestClaimRevisionInd;
            protected String eligibilityTypeCode;
            protected String itsClaimSerialNumber;
            protected String membershipCode;
            protected String selectedPageNumber;
            @XmlElement(name = "NextPage")
            protected EBSRequest.SearchClaimsExRequest.StaticData.NextPage nextPage;
            protected String preAuthorizationNumber;
            protected String prescriptionTypeCode;
            protected String pharmacyNabpIdentifier;
            protected String sorClaimStatusCode;
            protected String geographicIdentifier;
            protected String nationalProviderIdNumber;
            protected String providerOrganizationTaxId;
            protected String prescriptionNumber;
            protected String prescriptionRefillNumber;
            protected String payerResponsibilitySequenceNumberCode;
            protected String genericProductId;
            protected String nationalDrugCode;
            protected String mailBoostClaimsCode;

            /**
             * Gets the value of the memberLookupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLookupId() {
                return memberLookupId;
            }

            /**
             * Sets the value of the memberLookupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLookupId(String value) {
                this.memberLookupId = value;
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
             * Gets the value of the latestClaimRevisionInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatestClaimRevisionInd() {
                return latestClaimRevisionInd;
            }

            /**
             * Sets the value of the latestClaimRevisionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatestClaimRevisionInd(String value) {
                this.latestClaimRevisionInd = value;
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
             * Gets the value of the membershipCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMembershipCode() {
                return membershipCode;
            }

            /**
             * Sets the value of the membershipCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMembershipCode(String value) {
                this.membershipCode = value;
            }

            /**
             * Gets the value of the selectedPageNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSelectedPageNumber() {
                return selectedPageNumber;
            }

            /**
             * Sets the value of the selectedPageNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSelectedPageNumber(String value) {
                this.selectedPageNumber = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.SearchClaimsExRequest.StaticData.NextPage }
             *     
             */
            public EBSRequest.SearchClaimsExRequest.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchClaimsExRequest.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSRequest.SearchClaimsExRequest.StaticData.NextPage value) {
                this.nextPage = value;
            }

            /**
             * Gets the value of the preAuthorizationNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreAuthorizationNumber() {
                return preAuthorizationNumber;
            }

            /**
             * Sets the value of the preAuthorizationNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreAuthorizationNumber(String value) {
                this.preAuthorizationNumber = value;
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
             * Gets the value of the sorClaimStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSorClaimStatusCode() {
                return sorClaimStatusCode;
            }

            /**
             * Sets the value of the sorClaimStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSorClaimStatusCode(String value) {
                this.sorClaimStatusCode = value;
            }

            /**
             * Gets the value of the geographicIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeographicIdentifier() {
                return geographicIdentifier;
            }

            /**
             * Sets the value of the geographicIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeographicIdentifier(String value) {
                this.geographicIdentifier = value;
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
             * Gets the value of the mailBoostClaimsCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMailBoostClaimsCode() {
                return mailBoostClaimsCode;
            }

            /**
             * Sets the value of the mailBoostClaimsCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMailBoostClaimsCode(String value) {
                this.mailBoostClaimsCode = value;
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

    }

}
