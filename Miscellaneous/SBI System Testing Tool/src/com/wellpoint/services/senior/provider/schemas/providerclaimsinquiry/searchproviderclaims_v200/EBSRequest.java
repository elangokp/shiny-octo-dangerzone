
package com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200;

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
 *       &lt;sequence>
 *         &lt;element name="SearchProvClmsRqst" maxOccurs="12" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Provider">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="npiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Patient">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Name" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="itsClmCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="recordRetrievalTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "searchProvClmsRqst"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "SearchProvClmsRqst")
    protected List<EBSRequest.SearchProvClmsRqst> searchProvClmsRqst;

    /**
     * Gets the value of the searchProvClmsRqst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchProvClmsRqst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchProvClmsRqst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSRequest.SearchProvClmsRqst }
     * 
     * 
     */
    public List<EBSRequest.SearchProvClmsRqst> getSearchProvClmsRqst() {
        if (searchProvClmsRqst == null) {
            searchProvClmsRqst = new ArrayList<EBSRequest.SearchProvClmsRqst>();
        }
        return this.searchProvClmsRqst;
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
     *         &lt;element name="Provider">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="npiNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="taxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="providerOrganizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Patient">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Name" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="eligibilityTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="itsClmCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="recordRetrievalTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "provider",
        "patient",
        "claimNumber",
        "claimTypeCode",
        "serviceStartDate",
        "serviceEndDate",
        "itsClmCd",
        "recordRetrievalTypeCode"
    })
    public static class SearchProvClmsRqst {

        @XmlElement(name = "Provider", required = true)
        protected EBSRequest.SearchProvClmsRqst.Provider provider;
        @XmlElement(name = "Patient", required = true)
        protected EBSRequest.SearchProvClmsRqst.Patient patient;
        protected String claimNumber;
        protected String claimTypeCode;
        protected String serviceStartDate;
        protected String serviceEndDate;
        protected String itsClmCd;
        protected String recordRetrievalTypeCode;

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchProvClmsRqst.Provider }
         *     
         */
        public EBSRequest.SearchProvClmsRqst.Provider getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchProvClmsRqst.Provider }
         *     
         */
        public void setProvider(EBSRequest.SearchProvClmsRqst.Provider value) {
            this.provider = value;
        }

        /**
         * Gets the value of the patient property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.SearchProvClmsRqst.Patient }
         *     
         */
        public EBSRequest.SearchProvClmsRqst.Patient getPatient() {
            return patient;
        }

        /**
         * Sets the value of the patient property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.SearchProvClmsRqst.Patient }
         *     
         */
        public void setPatient(EBSRequest.SearchProvClmsRqst.Patient value) {
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
         * Gets the value of the itsClmCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItsClmCd() {
            return itsClmCd;
        }

        /**
         * Sets the value of the itsClmCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItsClmCd(String value) {
            this.itsClmCd = value;
        }

        /**
         * Gets the value of the recordRetrievalTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordRetrievalTypeCode() {
            return recordRetrievalTypeCode;
        }

        /**
         * Sets the value of the recordRetrievalTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordRetrievalTypeCode(String value) {
            this.recordRetrievalTypeCode = value;
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
         *         &lt;element name="healthCardID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Name" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="memberRelationshipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "healthCardID",
            "memberSequenceNumber",
            "alphaPrefixCode",
            "name",
            "birthDate",
            "memberRelationshipCode",
            "groupId",
            "eligibilityTypeCode"
        })
        public static class Patient {

            protected String healthCardID;
            protected String memberSequenceNumber;
            protected String alphaPrefixCode;
            @XmlElement(name = "Name")
            protected EBSRequest.SearchProvClmsRqst.Patient.Name name;
            protected String birthDate;
            protected String memberRelationshipCode;
            protected String groupId;
            protected String eligibilityTypeCode;

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
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.SearchProvClmsRqst.Patient.Name }
             *     
             */
            public EBSRequest.SearchProvClmsRqst.Patient.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.SearchProvClmsRqst.Patient.Name }
             *     
             */
            public void setName(EBSRequest.SearchProvClmsRqst.Patient.Name value) {
                this.name = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            public static class Name {

                @XmlElement(required = true)
                protected String firstName;
                @XmlElement(required = true)
                protected String middleName;
                @XmlElement(required = true)
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
            "providerOrganizationId"
        })
        public static class Provider {

            protected String npiNumber;
            protected String taxId;
            protected String providerOrganizationId;

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

        }

    }

}
