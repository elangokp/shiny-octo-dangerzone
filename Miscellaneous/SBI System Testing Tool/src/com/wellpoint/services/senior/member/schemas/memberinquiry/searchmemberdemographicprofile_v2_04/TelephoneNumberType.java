
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelephoneNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tlphTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tlphnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="araCdNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tlphnExtn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumberType", propOrder = {
    "tlphTypCd",
    "tlphnNbr",
    "araCdNbr",
    "tlphnExtn"
})
public class TelephoneNumberType {

    protected String tlphTypCd;
    protected String tlphnNbr;
    protected String araCdNbr;
    protected String tlphnExtn;

    /**
     * Gets the value of the tlphTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlphTypCd() {
        return tlphTypCd;
    }

    /**
     * Sets the value of the tlphTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlphTypCd(String value) {
        this.tlphTypCd = value;
    }

    /**
     * Gets the value of the tlphnNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlphnNbr() {
        return tlphnNbr;
    }

    /**
     * Sets the value of the tlphnNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlphnNbr(String value) {
        this.tlphnNbr = value;
    }

    /**
     * Gets the value of the araCdNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAraCdNbr() {
        return araCdNbr;
    }

    /**
     * Sets the value of the araCdNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAraCdNbr(String value) {
        this.araCdNbr = value;
    }

    /**
     * Gets the value of the tlphnExtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlphnExtn() {
        return tlphnExtn;
    }

    /**
     * Sets the value of the tlphnExtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlphnExtn(String value) {
        this.tlphnExtn = value;
    }

}
