
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.searchclaimsaccumulator_v2_0;

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
 *         &lt;element name="SearchClaimsAccumulatorsResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="86" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceClassificationCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorServiceUnitsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastUpdateClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorLevelSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorLevelWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OccursYear1Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OccursYear2Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="OccursYear3Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DaysYear1Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DaysYear2Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DaysYear3Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year1Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year1Amount2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year1Amount3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year2Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year2Amount2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year2Amount3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year3Amount1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year3Amount2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year3Amount3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year1" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Year3" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="accumulatorNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchClaimsAccumulatorsResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchClaimsAccumulatorsResponse")
    protected EBSResponse.SearchClaimsAccumulatorsResponse searchClaimsAccumulatorsResponse;

    /**
     * Gets the value of the searchClaimsAccumulatorsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.SearchClaimsAccumulatorsResponse }
     *     
     */
    public EBSResponse.SearchClaimsAccumulatorsResponse getSearchClaimsAccumulatorsResponse() {
        return searchClaimsAccumulatorsResponse;
    }

    /**
     * Sets the value of the searchClaimsAccumulatorsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.SearchClaimsAccumulatorsResponse }
     *     
     */
    public void setSearchClaimsAccumulatorsResponse(EBSResponse.SearchClaimsAccumulatorsResponse value) {
        this.searchClaimsAccumulatorsResponse = value;
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
     *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="86" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceClassificationCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorServiceUnitsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastUpdateClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorLevelSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorLevelWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OccursYear1Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OccursYear2Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="OccursYear3Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DaysYear1Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DaysYear2Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DaysYear3Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year1Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year1Amount2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year1Amount3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year2Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year2Amount2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year2Amount3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year3Amount1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year3Amount2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year3Amount3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year1" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Year3" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="accumulatorNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchClaimsAccumulatorsResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.SearchClaimsAccumulatorsResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.StaticData }
         *     
         */
        public EBSResponse.SearchClaimsAccumulatorsResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.SearchClaimsAccumulatorsResponse.StaticData value) {
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
         * {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData>();
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
         *         &lt;element name="serviceClassificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceClassificationCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorServiceUnitsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastUpdateClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorLevelSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorLevelWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OccursYear1Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OccursYear2Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="OccursYear3Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DaysYear1Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DaysYear2Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DaysYear3Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year1Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year1Amount2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year1Amount3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year2Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year2Amount2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year2Amount3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year3Amount1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year3Amount2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year3Amount3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year1" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Year3" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="accumulatorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "serviceClassificationCode",
            "serviceClassificationCodeNameText",
            "benefitPeriodStartDate",
            "benefitPeriodEndDate",
            "accumulatorServiceUnitsValue",
            "accumulatorAmount",
            "accumulatorUpdateDate",
            "lastUpdateClaimNumber",
            "accumulatorLevelSorCode",
            "accumulatorLevelWlpCode",
            "occursYear1Amount1",
            "occursYear2Amount1",
            "occursYear3Amount1",
            "daysYear1Amount1",
            "daysYear2Amount1",
            "daysYear3Amount1",
            "year1Amount1",
            "year1Amount2",
            "year1Amount3",
            "year2Amount1",
            "year2Amount2",
            "year2Amount3",
            "year3Amount1",
            "year3Amount2",
            "year3Amount3",
            "year1",
            "year2",
            "year3",
            "accumulatorId",
            "accumulatorNameText"
        })
        public static class DynamicData {

            protected String serviceClassificationCode;
            protected String serviceClassificationCodeNameText;
            protected String benefitPeriodStartDate;
            protected String benefitPeriodEndDate;
            protected String accumulatorServiceUnitsValue;
            protected String accumulatorAmount;
            protected String accumulatorUpdateDate;
            protected String lastUpdateClaimNumber;
            protected String accumulatorLevelSorCode;
            protected String accumulatorLevelWlpCode;
            @XmlElement(name = "OccursYear1Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear1Amount1 occursYear1Amount1;
            @XmlElement(name = "OccursYear2Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear2Amount1 occursYear2Amount1;
            @XmlElement(name = "OccursYear3Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear3Amount1 occursYear3Amount1;
            @XmlElement(name = "DaysYear1Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear1Amount1 daysYear1Amount1;
            @XmlElement(name = "DaysYear2Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear2Amount1 daysYear2Amount1;
            @XmlElement(name = "DaysYear3Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear3Amount1 daysYear3Amount1;
            @XmlElement(name = "Year1Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount1 year1Amount1;
            @XmlElement(name = "Year1Amount2")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount2 year1Amount2;
            @XmlElement(name = "Year1Amount3")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount3 year1Amount3;
            @XmlElement(name = "Year2Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount1 year2Amount1;
            @XmlElement(name = "Year2Amount2")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount2 year2Amount2;
            @XmlElement(name = "Year2Amount3")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount3 year2Amount3;
            @XmlElement(name = "Year3Amount1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount1 year3Amount1;
            @XmlElement(name = "Year3Amount2")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount2 year3Amount2;
            @XmlElement(name = "Year3Amount3")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount3 year3Amount3;
            @XmlElement(name = "Year1")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1 year1;
            @XmlElement(name = "Year2")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2 year2;
            @XmlElement(name = "Year3")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3 year3;
            protected String accumulatorId;
            protected String accumulatorNameText;

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
             * Gets the value of the serviceClassificationCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceClassificationCodeNameText() {
                return serviceClassificationCodeNameText;
            }

            /**
             * Sets the value of the serviceClassificationCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceClassificationCodeNameText(String value) {
                this.serviceClassificationCodeNameText = value;
            }

            /**
             * Gets the value of the benefitPeriodStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenefitPeriodStartDate() {
                return benefitPeriodStartDate;
            }

            /**
             * Sets the value of the benefitPeriodStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenefitPeriodStartDate(String value) {
                this.benefitPeriodStartDate = value;
            }

            /**
             * Gets the value of the benefitPeriodEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenefitPeriodEndDate() {
                return benefitPeriodEndDate;
            }

            /**
             * Sets the value of the benefitPeriodEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenefitPeriodEndDate(String value) {
                this.benefitPeriodEndDate = value;
            }

            /**
             * Gets the value of the accumulatorServiceUnitsValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorServiceUnitsValue() {
                return accumulatorServiceUnitsValue;
            }

            /**
             * Sets the value of the accumulatorServiceUnitsValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorServiceUnitsValue(String value) {
                this.accumulatorServiceUnitsValue = value;
            }

            /**
             * Gets the value of the accumulatorAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorAmount() {
                return accumulatorAmount;
            }

            /**
             * Sets the value of the accumulatorAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorAmount(String value) {
                this.accumulatorAmount = value;
            }

            /**
             * Gets the value of the accumulatorUpdateDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorUpdateDate() {
                return accumulatorUpdateDate;
            }

            /**
             * Sets the value of the accumulatorUpdateDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorUpdateDate(String value) {
                this.accumulatorUpdateDate = value;
            }

            /**
             * Gets the value of the lastUpdateClaimNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdateClaimNumber() {
                return lastUpdateClaimNumber;
            }

            /**
             * Sets the value of the lastUpdateClaimNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdateClaimNumber(String value) {
                this.lastUpdateClaimNumber = value;
            }

            /**
             * Gets the value of the accumulatorLevelSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorLevelSorCode() {
                return accumulatorLevelSorCode;
            }

            /**
             * Sets the value of the accumulatorLevelSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorLevelSorCode(String value) {
                this.accumulatorLevelSorCode = value;
            }

            /**
             * Gets the value of the accumulatorLevelWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorLevelWlpCode() {
                return accumulatorLevelWlpCode;
            }

            /**
             * Sets the value of the accumulatorLevelWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorLevelWlpCode(String value) {
                this.accumulatorLevelWlpCode = value;
            }

            /**
             * Gets the value of the occursYear1Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear1Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear1Amount1 getOccursYear1Amount1() {
                return occursYear1Amount1;
            }

            /**
             * Sets the value of the occursYear1Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear1Amount1 }
             *     
             */
            public void setOccursYear1Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear1Amount1 value) {
                this.occursYear1Amount1 = value;
            }

            /**
             * Gets the value of the occursYear2Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear2Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear2Amount1 getOccursYear2Amount1() {
                return occursYear2Amount1;
            }

            /**
             * Sets the value of the occursYear2Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear2Amount1 }
             *     
             */
            public void setOccursYear2Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear2Amount1 value) {
                this.occursYear2Amount1 = value;
            }

            /**
             * Gets the value of the occursYear3Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear3Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear3Amount1 getOccursYear3Amount1() {
                return occursYear3Amount1;
            }

            /**
             * Sets the value of the occursYear3Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear3Amount1 }
             *     
             */
            public void setOccursYear3Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.OccursYear3Amount1 value) {
                this.occursYear3Amount1 = value;
            }

            /**
             * Gets the value of the daysYear1Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear1Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear1Amount1 getDaysYear1Amount1() {
                return daysYear1Amount1;
            }

            /**
             * Sets the value of the daysYear1Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear1Amount1 }
             *     
             */
            public void setDaysYear1Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear1Amount1 value) {
                this.daysYear1Amount1 = value;
            }

            /**
             * Gets the value of the daysYear2Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear2Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear2Amount1 getDaysYear2Amount1() {
                return daysYear2Amount1;
            }

            /**
             * Sets the value of the daysYear2Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear2Amount1 }
             *     
             */
            public void setDaysYear2Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear2Amount1 value) {
                this.daysYear2Amount1 = value;
            }

            /**
             * Gets the value of the daysYear3Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear3Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear3Amount1 getDaysYear3Amount1() {
                return daysYear3Amount1;
            }

            /**
             * Sets the value of the daysYear3Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear3Amount1 }
             *     
             */
            public void setDaysYear3Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.DaysYear3Amount1 value) {
                this.daysYear3Amount1 = value;
            }

            /**
             * Gets the value of the year1Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount1 getYear1Amount1() {
                return year1Amount1;
            }

            /**
             * Sets the value of the year1Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount1 }
             *     
             */
            public void setYear1Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount1 value) {
                this.year1Amount1 = value;
            }

            /**
             * Gets the value of the year1Amount2 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount2 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount2 getYear1Amount2() {
                return year1Amount2;
            }

            /**
             * Sets the value of the year1Amount2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount2 }
             *     
             */
            public void setYear1Amount2(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount2 value) {
                this.year1Amount2 = value;
            }

            /**
             * Gets the value of the year1Amount3 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount3 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount3 getYear1Amount3() {
                return year1Amount3;
            }

            /**
             * Sets the value of the year1Amount3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount3 }
             *     
             */
            public void setYear1Amount3(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1Amount3 value) {
                this.year1Amount3 = value;
            }

            /**
             * Gets the value of the year2Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount1 getYear2Amount1() {
                return year2Amount1;
            }

            /**
             * Sets the value of the year2Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount1 }
             *     
             */
            public void setYear2Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount1 value) {
                this.year2Amount1 = value;
            }

            /**
             * Gets the value of the year2Amount2 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount2 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount2 getYear2Amount2() {
                return year2Amount2;
            }

            /**
             * Sets the value of the year2Amount2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount2 }
             *     
             */
            public void setYear2Amount2(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount2 value) {
                this.year2Amount2 = value;
            }

            /**
             * Gets the value of the year2Amount3 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount3 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount3 getYear2Amount3() {
                return year2Amount3;
            }

            /**
             * Sets the value of the year2Amount3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount3 }
             *     
             */
            public void setYear2Amount3(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2Amount3 value) {
                this.year2Amount3 = value;
            }

            /**
             * Gets the value of the year3Amount1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount1 getYear3Amount1() {
                return year3Amount1;
            }

            /**
             * Sets the value of the year3Amount1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount1 }
             *     
             */
            public void setYear3Amount1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount1 value) {
                this.year3Amount1 = value;
            }

            /**
             * Gets the value of the year3Amount2 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount2 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount2 getYear3Amount2() {
                return year3Amount2;
            }

            /**
             * Sets the value of the year3Amount2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount2 }
             *     
             */
            public void setYear3Amount2(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount2 value) {
                this.year3Amount2 = value;
            }

            /**
             * Gets the value of the year3Amount3 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount3 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount3 getYear3Amount3() {
                return year3Amount3;
            }

            /**
             * Sets the value of the year3Amount3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount3 }
             *     
             */
            public void setYear3Amount3(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3Amount3 value) {
                this.year3Amount3 = value;
            }

            /**
             * Gets the value of the year1 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1 getYear1() {
                return year1;
            }

            /**
             * Sets the value of the year1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1 }
             *     
             */
            public void setYear1(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year1 value) {
                this.year1 = value;
            }

            /**
             * Gets the value of the year2 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2 getYear2() {
                return year2;
            }

            /**
             * Sets the value of the year2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2 }
             *     
             */
            public void setYear2(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year2 value) {
                this.year2 = value;
            }

            /**
             * Gets the value of the year3 property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3 }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3 getYear3() {
                return year3;
            }

            /**
             * Sets the value of the year3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3 }
             *     
             */
            public void setYear3(EBSResponse.SearchClaimsAccumulatorsResponse.DynamicData.Year3 value) {
                this.year3 = value;
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

            /**
             * Gets the value of the accumulatorNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorNameText() {
                return accumulatorNameText;
            }

            /**
             * Sets the value of the accumulatorNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorNameText(String value) {
                this.accumulatorNameText = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class DaysYear1Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class DaysYear2Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class DaysYear3Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class OccursYear1Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class OccursYear2Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class OccursYear3Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorYear"
            })
            public static class Year1 {

                protected String accumulatorYear;

                /**
                 * Gets the value of the accumulatorYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorYear() {
                    return accumulatorYear;
                }

                /**
                 * Sets the value of the accumulatorYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorYear(String value) {
                    this.accumulatorYear = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year1Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year1Amount2 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year1Amount3 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorYear"
            })
            public static class Year2 {

                protected String accumulatorYear;

                /**
                 * Gets the value of the accumulatorYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorYear() {
                    return accumulatorYear;
                }

                /**
                 * Sets the value of the accumulatorYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorYear(String value) {
                    this.accumulatorYear = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year2Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year2Amount2 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year2Amount3 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorYear"
            })
            public static class Year3 {

                protected String accumulatorYear;

                /**
                 * Gets the value of the accumulatorYear property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorYear() {
                    return accumulatorYear;
                }

                /**
                 * Sets the value of the accumulatorYear property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorYear(String value) {
                    this.accumulatorYear = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year3Amount1 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year3Amount2 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
             *         &lt;element name="accumulatorAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "accumulatorAmount"
            })
            public static class Year3Amount3 {

                protected String accumulatorAmount;

                /**
                 * Gets the value of the accumulatorAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccumulatorAmount() {
                    return accumulatorAmount;
                }

                /**
                 * Sets the value of the accumulatorAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccumulatorAmount(String value) {
                    this.accumulatorAmount = value;
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
         *         &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="accumulatorYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subgroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="classificationOfServiceSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="classificationOfServiceWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "memberSequenceNumber",
            "firstName",
            "middleName",
            "lastName",
            "serviceStartDate",
            "accumulatorYear",
            "groupId",
            "subgroupId",
            "classificationOfServiceSorCode",
            "classificationOfServiceWlpCode",
            "nextPage"
        })
        public static class StaticData {

            protected String healthCardId;
            protected String subscriberId;
            protected String memberSequenceNumber;
            protected String firstName;
            protected String middleName;
            protected String lastName;
            protected String serviceStartDate;
            protected String accumulatorYear;
            protected String groupId;
            protected String subgroupId;
            protected String classificationOfServiceSorCode;
            protected String classificationOfServiceWlpCode;
            @XmlElement(name = "NextPage")
            protected EBSResponse.SearchClaimsAccumulatorsResponse.StaticData.NextPage nextPage;

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
             * Gets the value of the accumulatorYear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAccumulatorYear() {
                return accumulatorYear;
            }

            /**
             * Sets the value of the accumulatorYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAccumulatorYear(String value) {
                this.accumulatorYear = value;
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
             * Gets the value of the classificationOfServiceSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassificationOfServiceSorCode() {
                return classificationOfServiceSorCode;
            }

            /**
             * Sets the value of the classificationOfServiceSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassificationOfServiceSorCode(String value) {
                this.classificationOfServiceSorCode = value;
            }

            /**
             * Gets the value of the classificationOfServiceWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassificationOfServiceWlpCode() {
                return classificationOfServiceWlpCode;
            }

            /**
             * Sets the value of the classificationOfServiceWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassificationOfServiceWlpCode(String value) {
                this.classificationOfServiceWlpCode = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.SearchClaimsAccumulatorsResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchClaimsAccumulatorsResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.SearchClaimsAccumulatorsResponse.StaticData.NextPage value) {
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
             *         &lt;element name="claimId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="benefitPeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimId",
                "benefitPeriodStartDate",
                "benefitPeriodEndDate"
            })
            public static class NextPage {

                protected String claimId;
                protected String benefitPeriodStartDate;
                protected String benefitPeriodEndDate;

                /**
                 * Gets the value of the claimId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimId() {
                    return claimId;
                }

                /**
                 * Sets the value of the claimId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimId(String value) {
                    this.claimId = value;
                }

                /**
                 * Gets the value of the benefitPeriodStartDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitPeriodStartDate() {
                    return benefitPeriodStartDate;
                }

                /**
                 * Sets the value of the benefitPeriodStartDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitPeriodStartDate(String value) {
                    this.benefitPeriodStartDate = value;
                }

                /**
                 * Gets the value of the benefitPeriodEndDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBenefitPeriodEndDate() {
                    return benefitPeriodEndDate;
                }

                /**
                 * Sets the value of the benefitPeriodEndDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBenefitPeriodEndDate(String value) {
                    this.benefitPeriodEndDate = value;
                }

            }

        }

    }

}
