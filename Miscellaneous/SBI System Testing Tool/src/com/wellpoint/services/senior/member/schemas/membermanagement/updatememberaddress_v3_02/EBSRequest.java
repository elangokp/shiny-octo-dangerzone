
package com.wellpoint.services.senior.member.schemas.membermanagement.updatememberaddress_v3_02;

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
 *         &lt;element name="UpdateMemberAddressRequest" minOccurs="0">
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
 *                             &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressLine3Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Fax" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="emailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DynamicData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    "updateMemberAddressRequest"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "UpdateMemberAddressRequest")
    protected EBSRequest.UpdateMemberAddressRequest updateMemberAddressRequest;

    /**
     * Gets the value of the updateMemberAddressRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.UpdateMemberAddressRequest }
     *     
     */
    public EBSRequest.UpdateMemberAddressRequest getUpdateMemberAddressRequest() {
        return updateMemberAddressRequest;
    }

    /**
     * Sets the value of the updateMemberAddressRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.UpdateMemberAddressRequest }
     *     
     */
    public void setUpdateMemberAddressRequest(EBSRequest.UpdateMemberAddressRequest value) {
        this.updateMemberAddressRequest = value;
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
     *                   &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressLine3Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Fax" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="emailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DynamicData" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
    public static class UpdateMemberAddressRequest {

        @XmlElement(name = "StaticData")
        protected EBSRequest.UpdateMemberAddressRequest.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected Object dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.UpdateMemberAddressRequest.StaticData }
         *     
         */
        public EBSRequest.UpdateMemberAddressRequest.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.UpdateMemberAddressRequest.StaticData }
         *     
         */
        public void setStaticData(EBSRequest.UpdateMemberAddressRequest.StaticData value) {
            this.staticData = value;
        }

        /**
         * Gets the value of the dynamicData property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDynamicData() {
            return dynamicData;
        }

        /**
         * Sets the value of the dynamicData property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDynamicData(Object value) {
            this.dynamicData = value;
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
         *         &lt;element name="addressLine1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressLine2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressLine3Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="countyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entireFamilyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Fax" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="modifyUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="emailAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "addressLine1Text",
            "addressLine2Text",
            "addressLine3Text",
            "cityName",
            "stateCode",
            "postalCode",
            "countyCode",
            "telephoneAreaCode",
            "telephoneNumber",
            "telephoneExtensionNumber",
            "entireFamilyIndicator",
            "fax",
            "modifyUserID",
            "modifyDatetime",
            "emailAddressText"
        })
        public static class StaticData {

            protected String healthCardId;
            protected String subscriberId;
            protected String memberSequenceNumber;
            protected String groupId;
            protected String addressLine1Text;
            protected String addressLine2Text;
            protected String addressLine3Text;
            protected String cityName;
            protected String stateCode;
            protected String postalCode;
            protected String countyCode;
            protected String telephoneAreaCode;
            protected String telephoneNumber;
            protected String telephoneExtensionNumber;
            protected String entireFamilyIndicator;
            @XmlElement(name = "Fax")
            protected EBSRequest.UpdateMemberAddressRequest.StaticData.Fax fax;
            protected String modifyUserID;
            protected String modifyDatetime;
            protected String emailAddressText;

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
             * Gets the value of the addressLine3Text property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressLine3Text() {
                return addressLine3Text;
            }

            /**
             * Sets the value of the addressLine3Text property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressLine3Text(String value) {
                this.addressLine3Text = value;
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
             * Gets the value of the telephoneAreaCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneAreaCode() {
                return telephoneAreaCode;
            }

            /**
             * Sets the value of the telephoneAreaCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneAreaCode(String value) {
                this.telephoneAreaCode = value;
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

            /**
             * Gets the value of the telephoneExtensionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneExtensionNumber() {
                return telephoneExtensionNumber;
            }

            /**
             * Sets the value of the telephoneExtensionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneExtensionNumber(String value) {
                this.telephoneExtensionNumber = value;
            }

            /**
             * Gets the value of the entireFamilyIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntireFamilyIndicator() {
                return entireFamilyIndicator;
            }

            /**
             * Sets the value of the entireFamilyIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntireFamilyIndicator(String value) {
                this.entireFamilyIndicator = value;
            }

            /**
             * Gets the value of the fax property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.UpdateMemberAddressRequest.StaticData.Fax }
             *     
             */
            public EBSRequest.UpdateMemberAddressRequest.StaticData.Fax getFax() {
                return fax;
            }

            /**
             * Sets the value of the fax property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.UpdateMemberAddressRequest.StaticData.Fax }
             *     
             */
            public void setFax(EBSRequest.UpdateMemberAddressRequest.StaticData.Fax value) {
                this.fax = value;
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
             * Gets the value of the emailAddressText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailAddressText() {
                return emailAddressText;
            }

            /**
             * Sets the value of the emailAddressText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailAddressText(String value) {
                this.emailAddressText = value;
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
             *         &lt;element name="telephoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="telephoneExtensionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "telephoneAreaCode",
                "telephoneNumber",
                "telephoneExtensionNumber"
            })
            public static class Fax {

                protected String telephoneAreaCode;
                protected String telephoneNumber;
                protected String telephoneExtensionNumber;

                /**
                 * Gets the value of the telephoneAreaCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelephoneAreaCode() {
                    return telephoneAreaCode;
                }

                /**
                 * Sets the value of the telephoneAreaCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelephoneAreaCode(String value) {
                    this.telephoneAreaCode = value;
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

                /**
                 * Gets the value of the telephoneExtensionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTelephoneExtensionNumber() {
                    return telephoneExtensionNumber;
                }

                /**
                 * Sets the value of the telephoneExtensionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTelephoneExtensionNumber(String value) {
                    this.telephoneExtensionNumber = value;
                }

            }

        }

    }

}
