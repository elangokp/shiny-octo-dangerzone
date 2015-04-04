
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MemberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mbrSeqNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spsDpdtCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mrtlStsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmePrfx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nmeSffx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateofDeath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberType", propOrder = {
    "subscriberId",
    "mbrSeqNum",
    "spsDpdtCd",
    "mrtlStsCd",
    "ssn",
    "nmePrfx",
    "nmeSffx",
    "firstName",
    "middleName",
    "lastName",
    "birthDate",
    "dateofDeath",
    "genderCode"
})
@XmlSeeAlso({
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02.EBSResponse.SearchLimLiabCoordResponse.Mbr.class
})
public class MemberType {

    protected String subscriberId;
    protected String mbrSeqNum;
    protected String spsDpdtCd;
    protected String mrtlStsCd;
    @XmlElement(name = "sSN")
    protected String ssn;
    protected String nmePrfx;
    protected String nmeSffx;
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String birthDate;
    protected String dateofDeath;
    protected String genderCode;

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
     * Gets the value of the mbrSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbrSeqNum() {
        return mbrSeqNum;
    }

    /**
     * Sets the value of the mbrSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbrSeqNum(String value) {
        this.mbrSeqNum = value;
    }

    /**
     * Gets the value of the spsDpdtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpsDpdtCd() {
        return spsDpdtCd;
    }

    /**
     * Sets the value of the spsDpdtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpsDpdtCd(String value) {
        this.spsDpdtCd = value;
    }

    /**
     * Gets the value of the mrtlStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrtlStsCd() {
        return mrtlStsCd;
    }

    /**
     * Sets the value of the mrtlStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrtlStsCd(String value) {
        this.mrtlStsCd = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the nmePrfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmePrfx() {
        return nmePrfx;
    }

    /**
     * Sets the value of the nmePrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmePrfx(String value) {
        this.nmePrfx = value;
    }

    /**
     * Gets the value of the nmeSffx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmeSffx() {
        return nmeSffx;
    }

    /**
     * Sets the value of the nmeSffx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmeSffx(String value) {
        this.nmeSffx = value;
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
     * Gets the value of the dateofDeath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateofDeath() {
        return dateofDeath;
    }

    /**
     * Sets the value of the dateofDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateofDeath(String value) {
        this.dateofDeath = value;
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

}
