
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimspaymentdetail_v2_1;

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
 *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1}EBSRequest" minOccurs="0"/>
 *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1}EBSResponse" minOccurs="0"/>
 *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1}EBSHeader"/>
 *         &lt;element ref="{http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1}EBSExceptions" minOccurs="0"/>
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
    "ebsRequest",
    "ebsResponse",
    "ebsHeader",
    "ebsExceptions"
})
@XmlRootElement(name = "PayLoad")
public class PayLoad {

    @XmlElement(name = "EBSRequest", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1")
    protected EBSRequest ebsRequest;
    @XmlElement(name = "EBSResponse", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1")
    protected EBSResponse ebsResponse;
    @XmlElement(name = "EBSHeader", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1", required = true)
    protected EBSHeader ebsHeader;
    @XmlElement(name = "EBSExceptions", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsPaymentDetail-v2_1")
    protected EBSExceptions ebsExceptions;

    /**
     * Gets the value of the ebsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest }
     *     
     */
    public EBSRequest getEBSRequest() {
        return ebsRequest;
    }

    /**
     * Sets the value of the ebsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest }
     *     
     */
    public void setEBSRequest(EBSRequest value) {
        this.ebsRequest = value;
    }

    /**
     * Gets the value of the ebsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse }
     *     
     */
    public EBSResponse getEBSResponse() {
        return ebsResponse;
    }

    /**
     * Sets the value of the ebsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse }
     *     
     */
    public void setEBSResponse(EBSResponse value) {
        this.ebsResponse = value;
    }

    /**
     * Gets the value of the ebsHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EBSHeader }
     *     
     */
    public EBSHeader getEBSHeader() {
        return ebsHeader;
    }

    /**
     * Sets the value of the ebsHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSHeader }
     *     
     */
    public void setEBSHeader(EBSHeader value) {
        this.ebsHeader = value;
    }

    /**
     * Gets the value of the ebsExceptions property.
     * 
     * @return
     *     possible object is
     *     {@link EBSExceptions }
     *     
     */
    public EBSExceptions getEBSExceptions() {
        return ebsExceptions;
    }

    /**
     * Sets the value of the ebsExceptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSExceptions }
     *     
     */
    public void setEBSExceptions(EBSExceptions value) {
        this.ebsExceptions = value;
    }

}
