
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimseobdetailsex_v2_0;

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
 *         &lt;element name="requestRows" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="requestRowLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="responseStaticRows" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="responseStaticLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="responseDynamicRows" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="responseDynamicRowLength" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="errorRows" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="moreData" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="clientRowsPerPage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="securityToken" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="clientUserID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="clientUserPassword" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceDuration" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sbiAdditionalPageKeys" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
    "requestRows",
    "requestRowLength",
    "responseStaticRows",
    "responseStaticLength",
    "responseDynamicRows",
    "responseDynamicRowLength",
    "errorRows",
    "moreData",
    "clientRowsPerPage",
    "securityToken",
    "clientUserID",
    "clientUserPassword",
    "serviceDuration",
    "sbiAdditionalPageKeys"
})
@XmlRootElement(name = "EBSHeader")
public class EBSHeader {

    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String requestRows;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String requestRowLength;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String responseStaticRows;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String responseStaticLength;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String responseDynamicRows;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String responseDynamicRowLength;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String errorRows;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String moreData;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String clientRowsPerPage;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String securityToken;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String clientUserID;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String clientUserPassword;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String serviceDuration;
    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsEOBDetailsEx-v2_0")
    protected String sbiAdditionalPageKeys;

    /**
     * Gets the value of the requestRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestRows() {
        return requestRows;
    }

    /**
     * Sets the value of the requestRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestRows(String value) {
        this.requestRows = value;
    }

    /**
     * Gets the value of the requestRowLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestRowLength() {
        return requestRowLength;
    }

    /**
     * Sets the value of the requestRowLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestRowLength(String value) {
        this.requestRowLength = value;
    }

    /**
     * Gets the value of the responseStaticRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStaticRows() {
        return responseStaticRows;
    }

    /**
     * Sets the value of the responseStaticRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStaticRows(String value) {
        this.responseStaticRows = value;
    }

    /**
     * Gets the value of the responseStaticLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseStaticLength() {
        return responseStaticLength;
    }

    /**
     * Sets the value of the responseStaticLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseStaticLength(String value) {
        this.responseStaticLength = value;
    }

    /**
     * Gets the value of the responseDynamicRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDynamicRows() {
        return responseDynamicRows;
    }

    /**
     * Sets the value of the responseDynamicRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDynamicRows(String value) {
        this.responseDynamicRows = value;
    }

    /**
     * Gets the value of the responseDynamicRowLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDynamicRowLength() {
        return responseDynamicRowLength;
    }

    /**
     * Sets the value of the responseDynamicRowLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDynamicRowLength(String value) {
        this.responseDynamicRowLength = value;
    }

    /**
     * Gets the value of the errorRows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorRows() {
        return errorRows;
    }

    /**
     * Sets the value of the errorRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorRows(String value) {
        this.errorRows = value;
    }

    /**
     * Gets the value of the moreData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoreData() {
        return moreData;
    }

    /**
     * Sets the value of the moreData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoreData(String value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the clientRowsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRowsPerPage() {
        return clientRowsPerPage;
    }

    /**
     * Sets the value of the clientRowsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRowsPerPage(String value) {
        this.clientRowsPerPage = value;
    }

    /**
     * Gets the value of the securityToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
     * Sets the value of the securityToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityToken(String value) {
        this.securityToken = value;
    }

    /**
     * Gets the value of the clientUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUserID() {
        return clientUserID;
    }

    /**
     * Sets the value of the clientUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUserID(String value) {
        this.clientUserID = value;
    }

    /**
     * Gets the value of the clientUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientUserPassword() {
        return clientUserPassword;
    }

    /**
     * Sets the value of the clientUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientUserPassword(String value) {
        this.clientUserPassword = value;
    }

    /**
     * Gets the value of the serviceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDuration() {
        return serviceDuration;
    }

    /**
     * Sets the value of the serviceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDuration(String value) {
        this.serviceDuration = value;
    }

    /**
     * Gets the value of the sbiAdditionalPageKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbiAdditionalPageKeys() {
        return sbiAdditionalPageKeys;
    }

    /**
     * Sets the value of the sbiAdditionalPageKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbiAdditionalPageKeys(String value) {
        this.sbiAdditionalPageKeys = value;
    }

}
