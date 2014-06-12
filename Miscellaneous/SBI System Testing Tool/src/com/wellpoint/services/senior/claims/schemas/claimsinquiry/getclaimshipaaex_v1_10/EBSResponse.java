
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimshipaaex_v1_10;

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
 *         &lt;element name="GetClaimsHIPAAExResponse">
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
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FacilityStatic" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hipaaPayerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="submittedClaimRevenueLineTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FacilityNextPage" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="104" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="ProfessionalDynamic" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="8" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="bundledIntoClaimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hipaaSplitClaimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="FacilityDynamic" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="originalSubmittedUB92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="editTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="editActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="formatTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="relatedClaimIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimsHIPAAExResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimsHIPAAExResponse")
    protected EBSResponse.GetClaimsHIPAAExResponse getClaimsHIPAAExResponse;

    /**
     * Gets the value of the getClaimsHIPAAExResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsHIPAAExResponse }
     *     
     */
    public EBSResponse.GetClaimsHIPAAExResponse getGetClaimsHIPAAExResponse() {
        return getClaimsHIPAAExResponse;
    }

    /**
     * Sets the value of the getClaimsHIPAAExResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsHIPAAExResponse }
     *     
     */
    public void setGetClaimsHIPAAExResponse(EBSResponse.GetClaimsHIPAAExResponse value) {
        this.getClaimsHIPAAExResponse = value;
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
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FacilityStatic" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hipaaPayerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="submittedClaimRevenueLineTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FacilityNextPage" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="104" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="ProfessionalDynamic" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="8" minOccurs="0">
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
     *                             &lt;element name="bundledIntoClaimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hipaaSplitClaimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="FacilityDynamic" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="originalSubmittedUB92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="editTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="editActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="formatTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="relatedClaimIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetClaimsHIPAAExResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimsHIPAAExResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimsHIPAAExResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsHIPAAExResponse.StaticData value) {
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
         * {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetClaimsHIPAAExResponse.DynamicData>();
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
         *         &lt;element name="hcpcsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="billedChargeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="unitsOfOccurrenceQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="ProfessionalDynamic" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="8" minOccurs="0">
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
         *                   &lt;element name="bundledIntoClaimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hipaaSplitClaimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="FacilityDynamic" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="originalSubmittedUB92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="editTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="editActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="formatTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="relatedClaimIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "billedChargeAmount",
            "claimLineNumber",
            "unitsOfOccurrenceQuantity",
            "patientAccountNumber",
            "hcpcsModifierCodeArray",
            "professionalDynamic",
            "facilityDynamic",
            "editTypeCode",
            "editActionCode",
            "formatTypeCode",
            "relatedClaimIdentifier"
        })
        public static class DynamicData {

            protected String hcpcsCode;
            protected String billedChargeAmount;
            protected String claimLineNumber;
            protected String unitsOfOccurrenceQuantity;
            protected String patientAccountNumber;
            @XmlElement(name = "HCPCSModifierCodeArray")
            protected List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.HCPCSModifierCodeArray> hcpcsModifierCodeArray;
            @XmlElement(name = "ProfessionalDynamic")
            protected EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic professionalDynamic;
            @XmlElement(name = "FacilityDynamic")
            protected EBSResponse.GetClaimsHIPAAExResponse.DynamicData.FacilityDynamic facilityDynamic;
            protected String editTypeCode;
            protected String editActionCode;
            protected String formatTypeCode;
            protected String relatedClaimIdentifier;

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
             * {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.HCPCSModifierCodeArray }
             * 
             * 
             */
            public List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.HCPCSModifierCodeArray> getHCPCSModifierCodeArray() {
                if (hcpcsModifierCodeArray == null) {
                    hcpcsModifierCodeArray = new ArrayList<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.HCPCSModifierCodeArray>();
                }
                return this.hcpcsModifierCodeArray;
            }

            /**
             * Gets the value of the professionalDynamic property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic }
             *     
             */
            public EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic getProfessionalDynamic() {
                return professionalDynamic;
            }

            /**
             * Sets the value of the professionalDynamic property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic }
             *     
             */
            public void setProfessionalDynamic(EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic value) {
                this.professionalDynamic = value;
            }

            /**
             * Gets the value of the facilityDynamic property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.FacilityDynamic }
             *     
             */
            public EBSResponse.GetClaimsHIPAAExResponse.DynamicData.FacilityDynamic getFacilityDynamic() {
                return facilityDynamic;
            }

            /**
             * Sets the value of the facilityDynamic property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.FacilityDynamic }
             *     
             */
            public void setFacilityDynamic(EBSResponse.GetClaimsHIPAAExResponse.DynamicData.FacilityDynamic value) {
                this.facilityDynamic = value;
            }

            /**
             * Gets the value of the editTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEditTypeCode() {
                return editTypeCode;
            }

            /**
             * Sets the value of the editTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEditTypeCode(String value) {
                this.editTypeCode = value;
            }

            /**
             * Gets the value of the editActionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEditActionCode() {
                return editActionCode;
            }

            /**
             * Sets the value of the editActionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEditActionCode(String value) {
                this.editActionCode = value;
            }

            /**
             * Gets the value of the formatTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormatTypeCode() {
                return formatTypeCode;
            }

            /**
             * Sets the value of the formatTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormatTypeCode(String value) {
                this.formatTypeCode = value;
            }

            /**
             * Gets the value of the relatedClaimIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelatedClaimIdentifier() {
                return relatedClaimIdentifier;
            }

            /**
             * Sets the value of the relatedClaimIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelatedClaimIdentifier(String value) {
                this.relatedClaimIdentifier = value;
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
             *         &lt;element name="originalSubmittedUB92RevenueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "originalSubmittedUB92RevenueCode",
                "serviceStartDate",
                "hipaaOriginalRevenueLineNumber"
            })
            public static class FacilityDynamic {

                protected String originalSubmittedUB92RevenueCode;
                protected String serviceStartDate;
                protected String hipaaOriginalRevenueLineNumber;

                /**
                 * Gets the value of the originalSubmittedUB92RevenueCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginalSubmittedUB92RevenueCode() {
                    return originalSubmittedUB92RevenueCode;
                }

                /**
                 * Sets the value of the originalSubmittedUB92RevenueCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginalSubmittedUB92RevenueCode(String value) {
                    this.originalSubmittedUB92RevenueCode = value;
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
                 * Gets the value of the hipaaOriginalRevenueLineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHipaaOriginalRevenueLineNumber() {
                    return hipaaOriginalRevenueLineNumber;
                }

                /**
                 * Sets the value of the hipaaOriginalRevenueLineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHipaaOriginalRevenueLineNumber(String value) {
                    this.hipaaOriginalRevenueLineNumber = value;
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
             *         &lt;element name="ICD9DiagnosisCodeArray" maxOccurs="8" minOccurs="0">
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
             *         &lt;element name="bundledIntoClaimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hipaaSplitClaimReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "bundledIntoClaimLineNumber",
                "hipaaSplitClaimReferenceNumber"
            })
            public static class ProfessionalDynamic {

                @XmlElement(name = "ICD9DiagnosisCodeArray")
                protected List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic.ICD9DiagnosisCodeArray> icd9DiagnosisCodeArray;
                protected String bundledIntoClaimLineNumber;
                protected String hipaaSplitClaimReferenceNumber;

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
                 * {@link EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic.ICD9DiagnosisCodeArray }
                 * 
                 * 
                 */
                public List<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic.ICD9DiagnosisCodeArray> getICD9DiagnosisCodeArray() {
                    if (icd9DiagnosisCodeArray == null) {
                        icd9DiagnosisCodeArray = new ArrayList<EBSResponse.GetClaimsHIPAAExResponse.DynamicData.ProfessionalDynamic.ICD9DiagnosisCodeArray>();
                    }
                    return this.icd9DiagnosisCodeArray;
                }

                /**
                 * Gets the value of the bundledIntoClaimLineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBundledIntoClaimLineNumber() {
                    return bundledIntoClaimLineNumber;
                }

                /**
                 * Sets the value of the bundledIntoClaimLineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBundledIntoClaimLineNumber(String value) {
                    this.bundledIntoClaimLineNumber = value;
                }

                /**
                 * Gets the value of the hipaaSplitClaimReferenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHipaaSplitClaimReferenceNumber() {
                    return hipaaSplitClaimReferenceNumber;
                }

                /**
                 * Sets the value of the hipaaSplitClaimReferenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHipaaSplitClaimReferenceNumber(String value) {
                    this.hipaaSplitClaimReferenceNumber = value;
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
                public static class ICD9DiagnosisCodeArray {

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
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="patientAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FacilityStatic" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="hipaaPayerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="submittedClaimRevenueLineTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FacilityNextPage" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimNumber",
            "subscriberId",
            "memberSequenceNumber",
            "claimRevisionNumber",
            "claimTypeCode",
            "patientAccountNumber",
            "facilityStatic",
            "nextPage"
        })
        public static class StaticData {

            protected String claimNumber;
            protected String subscriberId;
            protected String memberSequenceNumber;
            protected String claimRevisionNumber;
            protected String claimTypeCode;
            protected String patientAccountNumber;
            @XmlElement(name = "FacilityStatic")
            protected EBSResponse.GetClaimsHIPAAExResponse.StaticData.FacilityStatic facilityStatic;
            @XmlElement(name = "NextPage")
            protected EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage nextPage;

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
             * Gets the value of the facilityStatic property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.FacilityStatic }
             *     
             */
            public EBSResponse.GetClaimsHIPAAExResponse.StaticData.FacilityStatic getFacilityStatic() {
                return facilityStatic;
            }

            /**
             * Sets the value of the facilityStatic property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.FacilityStatic }
             *     
             */
            public void setFacilityStatic(EBSResponse.GetClaimsHIPAAExResponse.StaticData.FacilityStatic value) {
                this.facilityStatic = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage value) {
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
             *         &lt;element name="ub92BillTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="hipaaPayerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="submittedClaimRevenueLineTotalCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "ub92BillTypeCode",
                "hipaaPayerTypeCode",
                "submittedClaimRevenueLineTotalCount"
            })
            public static class FacilityStatic {

                protected String ub92BillTypeCode;
                protected String hipaaPayerTypeCode;
                protected String submittedClaimRevenueLineTotalCount;

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
                 * Gets the value of the hipaaPayerTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHipaaPayerTypeCode() {
                    return hipaaPayerTypeCode;
                }

                /**
                 * Sets the value of the hipaaPayerTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHipaaPayerTypeCode(String value) {
                    this.hipaaPayerTypeCode = value;
                }

                /**
                 * Gets the value of the submittedClaimRevenueLineTotalCount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubmittedClaimRevenueLineTotalCount() {
                    return submittedClaimRevenueLineTotalCount;
                }

                /**
                 * Sets the value of the submittedClaimRevenueLineTotalCount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubmittedClaimRevenueLineTotalCount(String value) {
                    this.submittedClaimRevenueLineTotalCount = value;
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
             *         &lt;element name="FacilityNextPage" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimLineNumber",
                "claimRevisionNumber",
                "facilityNextPage"
            })
            public static class NextPage {

                protected String claimNumber;
                protected String claimLineNumber;
                protected String claimRevisionNumber;
                @XmlElement(name = "FacilityNextPage")
                protected EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage.FacilityNextPage facilityNextPage;

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
                 * Gets the value of the facilityNextPage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage.FacilityNextPage }
                 *     
                 */
                public EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage.FacilityNextPage getFacilityNextPage() {
                    return facilityNextPage;
                }

                /**
                 * Sets the value of the facilityNextPage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage.FacilityNextPage }
                 *     
                 */
                public void setFacilityNextPage(EBSResponse.GetClaimsHIPAAExResponse.StaticData.NextPage.FacilityNextPage value) {
                    this.facilityNextPage = value;
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
                 *         &lt;element name="hipaaOriginalRevenueLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "hipaaOriginalRevenueLineNumber"
                })
                public static class FacilityNextPage {

                    protected String hipaaOriginalRevenueLineNumber;

                    /**
                     * Gets the value of the hipaaOriginalRevenueLineNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHipaaOriginalRevenueLineNumber() {
                        return hipaaOriginalRevenueLineNumber;
                    }

                    /**
                     * Sets the value of the hipaaOriginalRevenueLineNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHipaaOriginalRevenueLineNumber(String value) {
                        this.hipaaOriginalRevenueLineNumber = value;
                    }

                }

            }

        }

    }

}
