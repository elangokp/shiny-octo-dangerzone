
package com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0;

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
 *         &lt;element name="Get27XBenefitAccumsResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="calendarTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="calendarTypeCodeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CntrctBnftPrd" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumrBnftPrdStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="accumrBnftPrdEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Child" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Student" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DynamicData" maxOccurs="213" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Major" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Minor" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Benefit" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="productBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitLimitInfo" maxOccurs="3" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="benefitServiceCategoryUnitLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="StandardizeBenefit" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="AuthrznTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="NetworkTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="FreeFormNoteText" maxOccurs="7" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="HealthCareServicesDelivery" maxOccurs="5" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="DiagnosisPlaceOfService" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="BenefitRelatedEntity" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence minOccurs="0">
 *                                                                     &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Accumulator" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence minOccurs="0">
 *                                                           &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                                       &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="wlobNetworkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "get27XBenefitAccumsResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "Get27XBenefitAccumsResponse")
    protected EBSResponse.Get27XBenefitAccumsResponse get27XBenefitAccumsResponse;

    /**
     * Gets the value of the get27XBenefitAccumsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.Get27XBenefitAccumsResponse }
     *     
     */
    public EBSResponse.Get27XBenefitAccumsResponse getGet27XBenefitAccumsResponse() {
        return get27XBenefitAccumsResponse;
    }

    /**
     * Sets the value of the get27XBenefitAccumsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.Get27XBenefitAccumsResponse }
     *     
     */
    public void setGet27XBenefitAccumsResponse(EBSResponse.Get27XBenefitAccumsResponse value) {
        this.get27XBenefitAccumsResponse = value;
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
     *                   &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="calendarTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="calendarTypeCodeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CntrctBnftPrd" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumrBnftPrdStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="accumrBnftPrdEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Child" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Student" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DynamicData" maxOccurs="213" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="Major" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Minor" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Benefit" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="productBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitLimitInfo" maxOccurs="3" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="benefitServiceCategoryUnitLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="StandardizeBenefit" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="AuthrznTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="NetworkTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="FreeFormNoteText" maxOccurs="7" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="HealthCareServicesDelivery" maxOccurs="5" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DiagnosisPlaceOfService" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="BenefitRelatedEntity" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence minOccurs="0">
     *                                                           &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                                       &lt;element name="Accumulator" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence minOccurs="0">
     *                                                 &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="wlobNetworkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class Get27XBenefitAccumsResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.Get27XBenefitAccumsResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData }
         *     
         */
        public EBSResponse.Get27XBenefitAccumsResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.Get27XBenefitAccumsResponse.StaticData value) {
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
         * {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.Get27XBenefitAccumsResponse.DynamicData>();
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
         *         &lt;element name="Major" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Minor" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Benefit" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="productBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitLimitInfo" maxOccurs="3" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="benefitServiceCategoryUnitLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="StandardizeBenefit" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="AuthrznTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="NetworkTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="FreeFormNoteText" maxOccurs="7" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="HealthCareServicesDelivery" maxOccurs="5" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DiagnosisPlaceOfService" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="BenefitRelatedEntity" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence minOccurs="0">
         *                                                 &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                             &lt;element name="Accumulator" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence minOccurs="0">
         *                                       &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="wlobNetworkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "major",
            "minor",
            "benefit",
            "wlobNetworkCode"
        })
        public static class DynamicData {

            @XmlElement(name = "Major")
            protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Major major;
            @XmlElement(name = "Minor")
            protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Minor minor;
            @XmlElement(name = "Benefit")
            protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit benefit;
            protected String wlobNetworkCode;

            /**
             * Gets the value of the major property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Major }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Major getMajor() {
                return major;
            }

            /**
             * Sets the value of the major property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Major }
             *     
             */
            public void setMajor(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Major value) {
                this.major = value;
            }

            /**
             * Gets the value of the minor property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Minor }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Minor getMinor() {
                return minor;
            }

            /**
             * Sets the value of the minor property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Minor }
             *     
             */
            public void setMinor(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Minor value) {
                this.minor = value;
            }

            /**
             * Gets the value of the benefit property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit getBenefit() {
                return benefit;
            }

            /**
             * Sets the value of the benefit property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit }
             *     
             */
            public void setBenefit(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit value) {
                this.benefit = value;
            }

            /**
             * Gets the value of the wlobNetworkCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWlobNetworkCode() {
                return wlobNetworkCode;
            }

            /**
             * Sets the value of the wlobNetworkCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWlobNetworkCode(String value) {
                this.wlobNetworkCode = value;
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
             *         &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="productBenefitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitLimitInfo" maxOccurs="3" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="benefitServiceCategoryUnitLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="StandardizeBenefit" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="AuthrznTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="NetworkTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="FreeFormNoteText" maxOccurs="7" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="HealthCareServicesDelivery" maxOccurs="5" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DiagnosisPlaceOfService" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="BenefitRelatedEntity" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence minOccurs="0">
             *                                       &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *                   &lt;element name="Accumulator" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence minOccurs="0">
             *                             &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *         &lt;element name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="terminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "benefitDescriptionText",
                "productBenefitCode",
                "benefitServiceCategoryTypeCode",
                "costShareRuleApplicationLevelCode",
                "costShareRuleCategoryCode",
                "benefitLimitInfo",
                "standardizeBenefit",
                "effectiveDate",
                "terminationDate"
            })
            public static class Benefit {

                protected String benefitDescriptionText;
                protected String productBenefitCode;
                protected String benefitServiceCategoryTypeCode;
                protected String costShareRuleApplicationLevelCode;
                protected String costShareRuleCategoryCode;
                protected List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.BenefitLimitInfo> benefitLimitInfo;
                @XmlElement(name = "StandardizeBenefit")
                protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit standardizeBenefit;
                protected String effectiveDate;
                protected String terminationDate;

                /**
                 * Gets the value of the benefitDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitDescriptionText() {
                    return benefitDescriptionText;
                }

                /**
                 * Sets the value of the benefitDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitDescriptionText(String value) {
                    this.benefitDescriptionText = value;
                }

                /**
                 * Gets the value of the productBenefitCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProductBenefitCode() {
                    return productBenefitCode;
                }

                /**
                 * Sets the value of the productBenefitCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProductBenefitCode(String value) {
                    this.productBenefitCode = value;
                }

                /**
                 * Gets the value of the benefitServiceCategoryTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitServiceCategoryTypeCode() {
                    return benefitServiceCategoryTypeCode;
                }

                /**
                 * Sets the value of the benefitServiceCategoryTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitServiceCategoryTypeCode(String value) {
                    this.benefitServiceCategoryTypeCode = value;
                }

                /**
                 * Gets the value of the costShareRuleApplicationLevelCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCostShareRuleApplicationLevelCode() {
                    return costShareRuleApplicationLevelCode;
                }

                /**
                 * Sets the value of the costShareRuleApplicationLevelCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCostShareRuleApplicationLevelCode(String value) {
                    this.costShareRuleApplicationLevelCode = value;
                }

                /**
                 * Gets the value of the costShareRuleCategoryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCostShareRuleCategoryCode() {
                    return costShareRuleCategoryCode;
                }

                /**
                 * Sets the value of the costShareRuleCategoryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCostShareRuleCategoryCode(String value) {
                    this.costShareRuleCategoryCode = value;
                }

                /**
                 * Gets the value of the benefitLimitInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the benefitLimitInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBenefitLimitInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.BenefitLimitInfo }
                 * 
                 * 
                 */
                public List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.BenefitLimitInfo> getBenefitLimitInfo() {
                    if (benefitLimitInfo == null) {
                        benefitLimitInfo = new ArrayList<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.BenefitLimitInfo>();
                    }
                    return this.benefitLimitInfo;
                }

                /**
                 * Gets the value of the standardizeBenefit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit }
                 *     
                 */
                public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit getStandardizeBenefit() {
                    return standardizeBenefit;
                }

                /**
                 * Sets the value of the standardizeBenefit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit }
                 *     
                 */
                public void setStandardizeBenefit(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit value) {
                    this.standardizeBenefit = value;
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
                 *         &lt;element name="benefitServiceCategoryUnitLimitTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "benefitServiceCategoryUnitLimitTypeCode",
                    "benefitServiceCategoryUnitLimitValue",
                    "costShareValueTypeCode"
                })
                public static class BenefitLimitInfo {

                    protected String benefitServiceCategoryUnitLimitTypeCode;
                    protected String benefitServiceCategoryUnitLimitValue;
                    protected String costShareValueTypeCode;

                    /**
                     * Gets the value of the benefitServiceCategoryUnitLimitTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBenefitServiceCategoryUnitLimitTypeCode() {
                        return benefitServiceCategoryUnitLimitTypeCode;
                    }

                    /**
                     * Sets the value of the benefitServiceCategoryUnitLimitTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBenefitServiceCategoryUnitLimitTypeCode(String value) {
                        this.benefitServiceCategoryUnitLimitTypeCode = value;
                    }

                    /**
                     * Gets the value of the benefitServiceCategoryUnitLimitValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBenefitServiceCategoryUnitLimitValue() {
                        return benefitServiceCategoryUnitLimitValue;
                    }

                    /**
                     * Sets the value of the benefitServiceCategoryUnitLimitValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBenefitServiceCategoryUnitLimitValue(String value) {
                        this.benefitServiceCategoryUnitLimitValue = value;
                    }

                    /**
                     * Gets the value of the costShareValueTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCostShareValueTypeCode() {
                        return costShareValueTypeCode;
                    }

                    /**
                     * Sets the value of the costShareValueTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCostShareValueTypeCode(String value) {
                        this.costShareValueTypeCode = value;
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
                 *         &lt;element name="costShareRuleCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="costShareRuleApplicationLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="benefitServiceCategoryTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="AuthrznTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="NetworkTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="FreeFormNoteText" maxOccurs="7" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="HealthCareServicesDelivery" maxOccurs="5" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DiagnosisPlaceOfService" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="BenefitRelatedEntity" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence minOccurs="0">
                 *                             &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                 *         &lt;element name="Accumulator" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence minOccurs="0">
                 *                   &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "costShareRuleCategoryCode",
                    "costShareRuleApplicationLevelCode",
                    "benefitServiceCategoryTypeCode",
                    "timePeriodQualifierCode",
                    "authrznTypCd",
                    "networkTypCd",
                    "freeFormNoteText",
                    "healthCareServicesDelivery",
                    "diagnosisPlaceOfService",
                    "benefitRelatedEntity",
                    "accumulator"
                })
                public static class StandardizeBenefit {

                    protected String costShareRuleCategoryCode;
                    protected String costShareRuleApplicationLevelCode;
                    protected String benefitServiceCategoryTypeCode;
                    protected String timePeriodQualifierCode;
                    @XmlElement(name = "AuthrznTypCd")
                    protected String authrznTypCd;
                    @XmlElement(name = "NetworkTypCd")
                    protected String networkTypCd;
                    @XmlElement(name = "FreeFormNoteText")
                    protected List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.FreeFormNoteText> freeFormNoteText;
                    @XmlElement(name = "HealthCareServicesDelivery")
                    protected List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.HealthCareServicesDelivery> healthCareServicesDelivery;
                    @XmlElement(name = "DiagnosisPlaceOfService")
                    protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.DiagnosisPlaceOfService diagnosisPlaceOfService;
                    @XmlElement(name = "BenefitRelatedEntity")
                    protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity benefitRelatedEntity;
                    @XmlElement(name = "Accumulator")
                    protected EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.Accumulator accumulator;

                    /**
                     * Gets the value of the costShareRuleCategoryCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCostShareRuleCategoryCode() {
                        return costShareRuleCategoryCode;
                    }

                    /**
                     * Sets the value of the costShareRuleCategoryCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCostShareRuleCategoryCode(String value) {
                        this.costShareRuleCategoryCode = value;
                    }

                    /**
                     * Gets the value of the costShareRuleApplicationLevelCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCostShareRuleApplicationLevelCode() {
                        return costShareRuleApplicationLevelCode;
                    }

                    /**
                     * Sets the value of the costShareRuleApplicationLevelCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCostShareRuleApplicationLevelCode(String value) {
                        this.costShareRuleApplicationLevelCode = value;
                    }

                    /**
                     * Gets the value of the benefitServiceCategoryTypeCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBenefitServiceCategoryTypeCode() {
                        return benefitServiceCategoryTypeCode;
                    }

                    /**
                     * Sets the value of the benefitServiceCategoryTypeCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBenefitServiceCategoryTypeCode(String value) {
                        this.benefitServiceCategoryTypeCode = value;
                    }

                    /**
                     * Gets the value of the timePeriodQualifierCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTimePeriodQualifierCode() {
                        return timePeriodQualifierCode;
                    }

                    /**
                     * Sets the value of the timePeriodQualifierCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTimePeriodQualifierCode(String value) {
                        this.timePeriodQualifierCode = value;
                    }

                    /**
                     * Gets the value of the authrznTypCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAuthrznTypCd() {
                        return authrznTypCd;
                    }

                    /**
                     * Sets the value of the authrznTypCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAuthrznTypCd(String value) {
                        this.authrznTypCd = value;
                    }

                    /**
                     * Gets the value of the networkTypCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNetworkTypCd() {
                        return networkTypCd;
                    }

                    /**
                     * Sets the value of the networkTypCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNetworkTypCd(String value) {
                        this.networkTypCd = value;
                    }

                    /**
                     * Gets the value of the freeFormNoteText property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the freeFormNoteText property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFreeFormNoteText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.FreeFormNoteText }
                     * 
                     * 
                     */
                    public List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.FreeFormNoteText> getFreeFormNoteText() {
                        if (freeFormNoteText == null) {
                            freeFormNoteText = new ArrayList<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.FreeFormNoteText>();
                        }
                        return this.freeFormNoteText;
                    }

                    /**
                     * Gets the value of the healthCareServicesDelivery property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the healthCareServicesDelivery property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHealthCareServicesDelivery().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.HealthCareServicesDelivery }
                     * 
                     * 
                     */
                    public List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.HealthCareServicesDelivery> getHealthCareServicesDelivery() {
                        if (healthCareServicesDelivery == null) {
                            healthCareServicesDelivery = new ArrayList<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.HealthCareServicesDelivery>();
                        }
                        return this.healthCareServicesDelivery;
                    }

                    /**
                     * Gets the value of the diagnosisPlaceOfService property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.DiagnosisPlaceOfService }
                     *     
                     */
                    public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.DiagnosisPlaceOfService getDiagnosisPlaceOfService() {
                        return diagnosisPlaceOfService;
                    }

                    /**
                     * Sets the value of the diagnosisPlaceOfService property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.DiagnosisPlaceOfService }
                     *     
                     */
                    public void setDiagnosisPlaceOfService(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.DiagnosisPlaceOfService value) {
                        this.diagnosisPlaceOfService = value;
                    }

                    /**
                     * Gets the value of the benefitRelatedEntity property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity }
                     *     
                     */
                    public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity getBenefitRelatedEntity() {
                        return benefitRelatedEntity;
                    }

                    /**
                     * Sets the value of the benefitRelatedEntity property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity }
                     *     
                     */
                    public void setBenefitRelatedEntity(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity value) {
                        this.benefitRelatedEntity = value;
                    }

                    /**
                     * Gets the value of the accumulator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.Accumulator }
                     *     
                     */
                    public EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.Accumulator getAccumulator() {
                        return accumulator;
                    }

                    /**
                     * Sets the value of the accumulator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.Accumulator }
                     *     
                     */
                    public void setAccumulator(EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.Accumulator value) {
                        this.accumulator = value;
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
                     *         &lt;element name="remainingAccumAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="accumQualifierTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "remainingAccumAmt",
                        "accumQualifierTypeCd",
                        "accumulatorId"
                    })
                    public static class Accumulator {

                        protected String remainingAccumAmt;
                        protected String accumQualifierTypeCd;
                        protected String accumulatorId;

                        /**
                         * Gets the value of the remainingAccumAmt property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRemainingAccumAmt() {
                            return remainingAccumAmt;
                        }

                        /**
                         * Sets the value of the remainingAccumAmt property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRemainingAccumAmt(String value) {
                            this.remainingAccumAmt = value;
                        }

                        /**
                         * Gets the value of the accumQualifierTypeCd property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAccumQualifierTypeCd() {
                            return accumQualifierTypeCd;
                        }

                        /**
                         * Sets the value of the accumQualifierTypeCd property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAccumQualifierTypeCd(String value) {
                            this.accumQualifierTypeCd = value;
                        }

                        /**
                         * Gets the value of the accumulatorId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAccumulatorId() {
                            return accumulatorId;
                        }

                        /**
                         * Sets the value of the accumulatorId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAccumulatorId(String value) {
                            this.accumulatorId = value;
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
                     *         &lt;element name="benefitRelatedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="benefitRelatedEntityIDTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="benefitRelatedEntityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ChnlInfo" maxOccurs="3" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence minOccurs="0">
                     *                   &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "benefitRelatedEntityType",
                        "lastName",
                        "firstName",
                        "benefitRelatedEntityIDTypeCode",
                        "benefitRelatedEntityID",
                        "chnlInfo"
                    })
                    public static class BenefitRelatedEntity {

                        protected String benefitRelatedEntityType;
                        protected String lastName;
                        protected String firstName;
                        protected String benefitRelatedEntityIDTypeCode;
                        protected String benefitRelatedEntityID;
                        @XmlElement(name = "ChnlInfo")
                        protected List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity.ChnlInfo> chnlInfo;

                        /**
                         * Gets the value of the benefitRelatedEntityType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBenefitRelatedEntityType() {
                            return benefitRelatedEntityType;
                        }

                        /**
                         * Sets the value of the benefitRelatedEntityType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBenefitRelatedEntityType(String value) {
                            this.benefitRelatedEntityType = value;
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
                         * Gets the value of the benefitRelatedEntityIDTypeCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBenefitRelatedEntityIDTypeCode() {
                            return benefitRelatedEntityIDTypeCode;
                        }

                        /**
                         * Sets the value of the benefitRelatedEntityIDTypeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBenefitRelatedEntityIDTypeCode(String value) {
                            this.benefitRelatedEntityIDTypeCode = value;
                        }

                        /**
                         * Gets the value of the benefitRelatedEntityID property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBenefitRelatedEntityID() {
                            return benefitRelatedEntityID;
                        }

                        /**
                         * Sets the value of the benefitRelatedEntityID property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBenefitRelatedEntityID(String value) {
                            this.benefitRelatedEntityID = value;
                        }

                        /**
                         * Gets the value of the chnlInfo property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the chnlInfo property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getChnlInfo().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity.ChnlInfo }
                         * 
                         * 
                         */
                        public List<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity.ChnlInfo> getChnlInfo() {
                            if (chnlInfo == null) {
                                chnlInfo = new ArrayList<EBSResponse.Get27XBenefitAccumsResponse.DynamicData.Benefit.StandardizeBenefit.BenefitRelatedEntity.ChnlInfo>();
                            }
                            return this.chnlInfo;
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
                         *         &lt;element name="IndvdlcntctNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="chnlRfrncIdTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="chnlRfrncId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "indvdlcntctNm",
                            "chnlRfrncIdTypCd",
                            "chnlRfrncId"
                        })
                        public static class ChnlInfo {

                            @XmlElement(name = "IndvdlcntctNm")
                            protected String indvdlcntctNm;
                            protected String chnlRfrncIdTypCd;
                            protected String chnlRfrncId;

                            /**
                             * Gets the value of the indvdlcntctNm property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getIndvdlcntctNm() {
                                return indvdlcntctNm;
                            }

                            /**
                             * Sets the value of the indvdlcntctNm property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setIndvdlcntctNm(String value) {
                                this.indvdlcntctNm = value;
                            }

                            /**
                             * Gets the value of the chnlRfrncIdTypCd property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getChnlRfrncIdTypCd() {
                                return chnlRfrncIdTypCd;
                            }

                            /**
                             * Sets the value of the chnlRfrncIdTypCd property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setChnlRfrncIdTypCd(String value) {
                                this.chnlRfrncIdTypCd = value;
                            }

                            /**
                             * Gets the value of the chnlRfrncId property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getChnlRfrncId() {
                                return chnlRfrncId;
                            }

                            /**
                             * Sets the value of the chnlRfrncId property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setChnlRfrncId(String value) {
                                this.chnlRfrncId = value;
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
                     *         &lt;element name="diagnosisPlaceofServiceQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="diagnosisPlaceofServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "diagnosisPlaceofServiceQualifierCode",
                        "diagnosisPlaceofServiceCode"
                    })
                    public static class DiagnosisPlaceOfService {

                        protected String diagnosisPlaceofServiceQualifierCode;
                        protected String diagnosisPlaceofServiceCode;

                        /**
                         * Gets the value of the diagnosisPlaceofServiceQualifierCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDiagnosisPlaceofServiceQualifierCode() {
                            return diagnosisPlaceofServiceQualifierCode;
                        }

                        /**
                         * Sets the value of the diagnosisPlaceofServiceQualifierCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDiagnosisPlaceofServiceQualifierCode(String value) {
                            this.diagnosisPlaceofServiceQualifierCode = value;
                        }

                        /**
                         * Gets the value of the diagnosisPlaceofServiceCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDiagnosisPlaceofServiceCode() {
                            return diagnosisPlaceofServiceCode;
                        }

                        /**
                         * Sets the value of the diagnosisPlaceofServiceCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDiagnosisPlaceofServiceCode(String value) {
                            this.diagnosisPlaceofServiceCode = value;
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
                     *         &lt;element name="noteTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "noteTypeCode",
                        "noteText"
                    })
                    public static class FreeFormNoteText {

                        protected String noteTypeCode;
                        protected String noteText;

                        /**
                         * Gets the value of the noteTypeCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNoteTypeCode() {
                            return noteTypeCode;
                        }

                        /**
                         * Sets the value of the noteTypeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNoteTypeCode(String value) {
                            this.noteTypeCode = value;
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
                     *         &lt;element name="costShareValueTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="benefitServiceCategoryUnitLimitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="unitBaseMeasurementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="sampleSelectionModulusAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="timePeriodQualifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="periodCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="shipDeliveryCalendarPatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="shipDeliveryTimePatternCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "costShareValueTypeCode",
                        "benefitServiceCategoryUnitLimitValue",
                        "unitBaseMeasurementCode",
                        "sampleSelectionModulusAmount",
                        "timePeriodQualifierCode",
                        "periodCount",
                        "shipDeliveryCalendarPatternCode",
                        "shipDeliveryTimePatternCode"
                    })
                    public static class HealthCareServicesDelivery {

                        protected String costShareValueTypeCode;
                        protected String benefitServiceCategoryUnitLimitValue;
                        protected String unitBaseMeasurementCode;
                        protected String sampleSelectionModulusAmount;
                        protected String timePeriodQualifierCode;
                        protected String periodCount;
                        protected String shipDeliveryCalendarPatternCode;
                        protected String shipDeliveryTimePatternCode;

                        /**
                         * Gets the value of the costShareValueTypeCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCostShareValueTypeCode() {
                            return costShareValueTypeCode;
                        }

                        /**
                         * Sets the value of the costShareValueTypeCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCostShareValueTypeCode(String value) {
                            this.costShareValueTypeCode = value;
                        }

                        /**
                         * Gets the value of the benefitServiceCategoryUnitLimitValue property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBenefitServiceCategoryUnitLimitValue() {
                            return benefitServiceCategoryUnitLimitValue;
                        }

                        /**
                         * Sets the value of the benefitServiceCategoryUnitLimitValue property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBenefitServiceCategoryUnitLimitValue(String value) {
                            this.benefitServiceCategoryUnitLimitValue = value;
                        }

                        /**
                         * Gets the value of the unitBaseMeasurementCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnitBaseMeasurementCode() {
                            return unitBaseMeasurementCode;
                        }

                        /**
                         * Sets the value of the unitBaseMeasurementCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnitBaseMeasurementCode(String value) {
                            this.unitBaseMeasurementCode = value;
                        }

                        /**
                         * Gets the value of the sampleSelectionModulusAmount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSampleSelectionModulusAmount() {
                            return sampleSelectionModulusAmount;
                        }

                        /**
                         * Sets the value of the sampleSelectionModulusAmount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSampleSelectionModulusAmount(String value) {
                            this.sampleSelectionModulusAmount = value;
                        }

                        /**
                         * Gets the value of the timePeriodQualifierCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTimePeriodQualifierCode() {
                            return timePeriodQualifierCode;
                        }

                        /**
                         * Sets the value of the timePeriodQualifierCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTimePeriodQualifierCode(String value) {
                            this.timePeriodQualifierCode = value;
                        }

                        /**
                         * Gets the value of the periodCount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPeriodCount() {
                            return periodCount;
                        }

                        /**
                         * Sets the value of the periodCount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPeriodCount(String value) {
                            this.periodCount = value;
                        }

                        /**
                         * Gets the value of the shipDeliveryCalendarPatternCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getShipDeliveryCalendarPatternCode() {
                            return shipDeliveryCalendarPatternCode;
                        }

                        /**
                         * Sets the value of the shipDeliveryCalendarPatternCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setShipDeliveryCalendarPatternCode(String value) {
                            this.shipDeliveryCalendarPatternCode = value;
                        }

                        /**
                         * Gets the value of the shipDeliveryTimePatternCode property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getShipDeliveryTimePatternCode() {
                            return shipDeliveryTimePatternCode;
                        }

                        /**
                         * Sets the value of the shipDeliveryTimePatternCode property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setShipDeliveryTimePatternCode(String value) {
                            this.shipDeliveryTimePatternCode = value;
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
             *         &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "benefitDescriptionText"
            })
            public static class Major {

                protected String benefitDescriptionText;

                /**
                 * Gets the value of the benefitDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitDescriptionText() {
                    return benefitDescriptionText;
                }

                /**
                 * Sets the value of the benefitDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitDescriptionText(String value) {
                    this.benefitDescriptionText = value;
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
             *         &lt;element name="benefitDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "benefitDescriptionText"
            })
            public static class Minor {

                protected String benefitDescriptionText;

                /**
                 * Gets the value of the benefitDescriptionText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitDescriptionText() {
                    return benefitDescriptionText;
                }

                /**
                 * Sets the value of the benefitDescriptionText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitDescriptionText(String value) {
                    this.benefitDescriptionText = value;
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
         *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productDescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="calendarTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="calendarTypeCodeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CntrctBnftPrd" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumrBnftPrdStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="accumrBnftPrdEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Child" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Student" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="healthcareArrangementCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "productIdentifier",
            "productDescriptionText",
            "calendarTypeCode",
            "calendarTypeCodeText",
            "cntrctBnftPrd",
            "child",
            "student",
            "healthcareArrangementCode"
        })
        public static class StaticData {

            protected String productIdentifier;
            protected String productDescriptionText;
            protected String calendarTypeCode;
            protected String calendarTypeCodeText;
            @XmlElement(name = "CntrctBnftPrd")
            protected EBSResponse.Get27XBenefitAccumsResponse.StaticData.CntrctBnftPrd cntrctBnftPrd;
            @XmlElement(name = "Child")
            protected EBSResponse.Get27XBenefitAccumsResponse.StaticData.Child child;
            @XmlElement(name = "Student")
            protected EBSResponse.Get27XBenefitAccumsResponse.StaticData.Student student;
            protected String healthcareArrangementCode;

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
             * Gets the value of the calendarTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalendarTypeCode() {
                return calendarTypeCode;
            }

            /**
             * Sets the value of the calendarTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCalendarTypeCode(String value) {
                this.calendarTypeCode = value;
            }

            /**
             * Gets the value of the calendarTypeCodeText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalendarTypeCodeText() {
                return calendarTypeCodeText;
            }

            /**
             * Sets the value of the calendarTypeCodeText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCalendarTypeCodeText(String value) {
                this.calendarTypeCodeText = value;
            }

            /**
             * Gets the value of the cntrctBnftPrd property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.CntrctBnftPrd }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.StaticData.CntrctBnftPrd getCntrctBnftPrd() {
                return cntrctBnftPrd;
            }

            /**
             * Sets the value of the cntrctBnftPrd property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.CntrctBnftPrd }
             *     
             */
            public void setCntrctBnftPrd(EBSResponse.Get27XBenefitAccumsResponse.StaticData.CntrctBnftPrd value) {
                this.cntrctBnftPrd = value;
            }

            /**
             * Gets the value of the child property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.Child }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.StaticData.Child getChild() {
                return child;
            }

            /**
             * Sets the value of the child property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.Child }
             *     
             */
            public void setChild(EBSResponse.Get27XBenefitAccumsResponse.StaticData.Child value) {
                this.child = value;
            }

            /**
             * Gets the value of the student property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.Student }
             *     
             */
            public EBSResponse.Get27XBenefitAccumsResponse.StaticData.Student getStudent() {
                return student;
            }

            /**
             * Sets the value of the student property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.Get27XBenefitAccumsResponse.StaticData.Student }
             *     
             */
            public void setStudent(EBSResponse.Get27XBenefitAccumsResponse.StaticData.Student value) {
                this.student = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "patientMaximumAge"
            })
            public static class Child {

                protected String patientMaximumAge;

                /**
                 * Gets the value of the patientMaximumAge property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPatientMaximumAge() {
                    return patientMaximumAge;
                }

                /**
                 * Sets the value of the patientMaximumAge property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPatientMaximumAge(String value) {
                    this.patientMaximumAge = value;
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
             *         &lt;element name="accumrBnftPrdStrtDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="accumrBnftPrdEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumrBnftPrdStrtDt",
                "accumrBnftPrdEndDt",
                "groupId"
            })
            public static class CntrctBnftPrd {

                protected String accumrBnftPrdStrtDt;
                protected String accumrBnftPrdEndDt;
                protected String groupId;

                /**
                 * Gets the value of the accumrBnftPrdStrtDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumrBnftPrdStrtDt() {
                    return accumrBnftPrdStrtDt;
                }

                /**
                 * Sets the value of the accumrBnftPrdStrtDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumrBnftPrdStrtDt(String value) {
                    this.accumrBnftPrdStrtDt = value;
                }

                /**
                 * Gets the value of the accumrBnftPrdEndDt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumrBnftPrdEndDt() {
                    return accumrBnftPrdEndDt;
                }

                /**
                 * Sets the value of the accumrBnftPrdEndDt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumrBnftPrdEndDt(String value) {
                    this.accumrBnftPrdEndDt = value;
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
             *         &lt;element name="patientMaximumAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "patientMaximumAge"
            })
            public static class Student {

                protected String patientMaximumAge;

                /**
                 * Gets the value of the patientMaximumAge property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPatientMaximumAge() {
                    return patientMaximumAge;
                }

                /**
                 * Sets the value of the patientMaximumAge property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPatientMaximumAge(String value) {
                    this.patientMaximumAge = value;
                }

            }

        }

    }

}
