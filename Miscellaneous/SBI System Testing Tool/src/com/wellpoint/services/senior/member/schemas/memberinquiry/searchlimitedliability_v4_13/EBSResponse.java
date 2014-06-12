
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13;

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
 *         &lt;element name="SearchLimLiabResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="301" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="coordinationOfBenefitsPrimaryRuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cOBStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="medicareEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchLimLiabResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchLimLiabResponse")
    protected EBSResponse.SearchLimLiabResponse searchLimLiabResponse;

    /**
     * Gets the value of the searchLimLiabResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.SearchLimLiabResponse }
     *     
     */
    public EBSResponse.SearchLimLiabResponse getSearchLimLiabResponse() {
        return searchLimLiabResponse;
    }

    /**
     * Sets the value of the searchLimLiabResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.SearchLimLiabResponse }
     *     
     */
    public void setSearchLimLiabResponse(EBSResponse.SearchLimLiabResponse value) {
        this.searchLimLiabResponse = value;
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
     *                   &lt;element name="healthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="301" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="coordinationOfBenefitsPrimaryRuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cOBStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="medicareEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class SearchLimLiabResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.SearchLimLiabResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.SearchLimLiabResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchLimLiabResponse.StaticData }
         *     
         */
        public EBSResponse.SearchLimLiabResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchLimLiabResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.SearchLimLiabResponse.StaticData value) {
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
         * {@link EBSResponse.SearchLimLiabResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.SearchLimLiabResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.SearchLimLiabResponse.DynamicData>();
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
         *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="limitedLiabilityTerminationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="coordinationOfBenefitsPrimaryRuleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cOBStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="insuranceOrderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actualInsuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="medicareEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "limitedLiabilityEffectiveDate",
            "insuranceTypeCode",
            "productFamilyCode",
            "limitedLiabilityTerminationDate",
            "icd9DiagnosisCode",
            "coordinationOfBenefitsPrimaryRuleCode",
            "productId",
            "cobStatusCd",
            "modifyUserID",
            "modifyDatetime",
            "insuranceOrderCode",
            "createDatetime",
            "actualInsuranceTypeCode",
            "medicareEventCode"
        })
        public static class DynamicData {

            protected String limitedLiabilityEffectiveDate;
            protected String insuranceTypeCode;
            protected String productFamilyCode;
            protected String limitedLiabilityTerminationDate;
            protected String icd9DiagnosisCode;
            protected String coordinationOfBenefitsPrimaryRuleCode;
            protected String productId;
            @XmlElement(name = "cOBStatusCd")
            protected String cobStatusCd;
            protected String modifyUserID;
            protected String modifyDatetime;
            protected String insuranceOrderCode;
            protected String createDatetime;
            protected String actualInsuranceTypeCode;
            protected String medicareEventCode;

            /**
             * Gets the value of the limitedLiabilityEffectiveDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitedLiabilityEffectiveDate() {
                return limitedLiabilityEffectiveDate;
            }

            /**
             * Sets the value of the limitedLiabilityEffectiveDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitedLiabilityEffectiveDate(String value) {
                this.limitedLiabilityEffectiveDate = value;
            }

            /**
             * Gets the value of the insuranceTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceTypeCode() {
                return insuranceTypeCode;
            }

            /**
             * Sets the value of the insuranceTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuranceTypeCode(String value) {
                this.insuranceTypeCode = value;
            }

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
             * Gets the value of the limitedLiabilityTerminationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLimitedLiabilityTerminationDate() {
                return limitedLiabilityTerminationDate;
            }

            /**
             * Sets the value of the limitedLiabilityTerminationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLimitedLiabilityTerminationDate(String value) {
                this.limitedLiabilityTerminationDate = value;
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
             * Gets the value of the coordinationOfBenefitsPrimaryRuleCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCoordinationOfBenefitsPrimaryRuleCode() {
                return coordinationOfBenefitsPrimaryRuleCode;
            }

            /**
             * Sets the value of the coordinationOfBenefitsPrimaryRuleCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCoordinationOfBenefitsPrimaryRuleCode(String value) {
                this.coordinationOfBenefitsPrimaryRuleCode = value;
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
             * Gets the value of the cobStatusCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCOBStatusCd() {
                return cobStatusCd;
            }

            /**
             * Sets the value of the cobStatusCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCOBStatusCd(String value) {
                this.cobStatusCd = value;
            }

            /**
             * Gets the value of the modifyUserID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifyUserID() {
                return modifyUserID;
            }

            /**
             * Sets the value of the modifyUserID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifyUserID(String value) {
                this.modifyUserID = value;
            }

            /**
             * Gets the value of the modifyDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifyDatetime() {
                return modifyDatetime;
            }

            /**
             * Sets the value of the modifyDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifyDatetime(String value) {
                this.modifyDatetime = value;
            }

            /**
             * Gets the value of the insuranceOrderCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceOrderCode() {
                return insuranceOrderCode;
            }

            /**
             * Sets the value of the insuranceOrderCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuranceOrderCode(String value) {
                this.insuranceOrderCode = value;
            }

            /**
             * Gets the value of the createDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateDatetime() {
                return createDatetime;
            }

            /**
             * Sets the value of the createDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateDatetime(String value) {
                this.createDatetime = value;
            }

            /**
             * Gets the value of the actualInsuranceTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActualInsuranceTypeCode() {
                return actualInsuranceTypeCode;
            }

            /**
             * Sets the value of the actualInsuranceTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActualInsuranceTypeCode(String value) {
                this.actualInsuranceTypeCode = value;
            }

            /**
             * Gets the value of the medicareEventCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicareEventCode() {
                return medicareEventCode;
            }

            /**
             * Sets the value of the medicareEventCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicareEventCode(String value) {
                this.medicareEventCode = value;
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
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "groupId",
            "nextPage"
        })
        public static class StaticData {

            protected String healthCardId;
            protected String subscriberId;
            protected String memberSequenceNumber;
            protected String groupId;
            @XmlElement(name = "NextPage")
            protected EBSResponse.SearchLimLiabResponse.StaticData.NextPage nextPage;

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
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.SearchLimLiabResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.SearchLimLiabResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.SearchLimLiabResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.SearchLimLiabResponse.StaticData.NextPage value) {
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
             *         &lt;element name="insuranceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="productFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="icd9DiagnosisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="limitedLiabilityEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "insuranceTypeCode",
                "productFamilyCode",
                "icd9DiagnosisCode",
                "limitedLiabilityEffectiveDate"
            })
            public static class NextPage {

                protected String insuranceTypeCode;
                protected String productFamilyCode;
                protected String icd9DiagnosisCode;
                protected String limitedLiabilityEffectiveDate;

                /**
                 * Gets the value of the insuranceTypeCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInsuranceTypeCode() {
                    return insuranceTypeCode;
                }

                /**
                 * Sets the value of the insuranceTypeCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInsuranceTypeCode(String value) {
                    this.insuranceTypeCode = value;
                }

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
                 * Gets the value of the limitedLiabilityEffectiveDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLimitedLiabilityEffectiveDate() {
                    return limitedLiabilityEffectiveDate;
                }

                /**
                 * Sets the value of the limitedLiabilityEffectiveDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLimitedLiabilityEffectiveDate(String value) {
                    this.limitedLiabilityEffectiveDate = value;
                }

            }

        }

    }

}
