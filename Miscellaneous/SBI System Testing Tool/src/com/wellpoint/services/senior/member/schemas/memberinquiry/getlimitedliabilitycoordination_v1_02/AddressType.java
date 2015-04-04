
package com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="adrsTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrsLn1Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adrsLn2Txt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ctyNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pstlCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cntyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tmZn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "adrsTypCd",
    "adrsLn1Txt",
    "adrsLn2Txt",
    "ctyNm",
    "stCd",
    "pstlCd",
    "cntyCd",
    "tmZn"
})
public class AddressType {

    protected String adrsTypCd;
    protected String adrsLn1Txt;
    protected String adrsLn2Txt;
    protected String ctyNm;
    protected String stCd;
    protected String pstlCd;
    protected String cntyCd;
    protected String tmZn;

    /**
     * Gets the value of the adrsTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrsTypCd() {
        return adrsTypCd;
    }

    /**
     * Sets the value of the adrsTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrsTypCd(String value) {
        this.adrsTypCd = value;
    }

    /**
     * Gets the value of the adrsLn1Txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrsLn1Txt() {
        return adrsLn1Txt;
    }

    /**
     * Sets the value of the adrsLn1Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrsLn1Txt(String value) {
        this.adrsLn1Txt = value;
    }

    /**
     * Gets the value of the adrsLn2Txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrsLn2Txt() {
        return adrsLn2Txt;
    }

    /**
     * Sets the value of the adrsLn2Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrsLn2Txt(String value) {
        this.adrsLn2Txt = value;
    }

    /**
     * Gets the value of the ctyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtyNm() {
        return ctyNm;
    }

    /**
     * Sets the value of the ctyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtyNm(String value) {
        this.ctyNm = value;
    }

    /**
     * Gets the value of the stCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStCd() {
        return stCd;
    }

    /**
     * Sets the value of the stCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStCd(String value) {
        this.stCd = value;
    }

    /**
     * Gets the value of the pstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCd() {
        return pstlCd;
    }

    /**
     * Sets the value of the pstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlCd(String value) {
        this.pstlCd = value;
    }

    /**
     * Gets the value of the cntyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCntyCd() {
        return cntyCd;
    }

    /**
     * Sets the value of the cntyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCntyCd(String value) {
        this.cntyCd = value;
    }

    /**
     * Gets the value of the tmZn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZn() {
        return tmZn;
    }

    /**
     * Sets the value of the tmZn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmZn(String value) {
        this.tmZn = value;
    }

}
