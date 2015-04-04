
package com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emTypCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emlTypTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailType", propOrder = {
    "emTypCd",
    "emlTypTxt"
})
public class EmailType {

    protected String emTypCd;
    protected String emlTypTxt;

    /**
     * Gets the value of the emTypCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmTypCd() {
        return emTypCd;
    }

    /**
     * Sets the value of the emTypCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmTypCd(String value) {
        this.emTypCd = value;
    }

    /**
     * Gets the value of the emlTypTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmlTypTxt() {
        return emlTypTxt;
    }

    /**
     * Sets the value of the emlTypTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmlTypTxt(String value) {
        this.emlTypTxt = value;
    }

}
