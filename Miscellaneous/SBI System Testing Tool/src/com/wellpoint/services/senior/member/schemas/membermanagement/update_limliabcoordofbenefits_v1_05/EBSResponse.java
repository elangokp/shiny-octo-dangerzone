
package com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05;

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
 *         &lt;element name="UpdateLimLiabCoordOfBenefitsResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="updateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updateLimLiabCoordOfBenefitsResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "UpdateLimLiabCoordOfBenefitsResponse")
    protected EBSResponse.UpdateLimLiabCoordOfBenefitsResponse updateLimLiabCoordOfBenefitsResponse;

    /**
     * Gets the value of the updateLimLiabCoordOfBenefitsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.UpdateLimLiabCoordOfBenefitsResponse }
     *     
     */
    public EBSResponse.UpdateLimLiabCoordOfBenefitsResponse getUpdateLimLiabCoordOfBenefitsResponse() {
        return updateLimLiabCoordOfBenefitsResponse;
    }

    /**
     * Sets the value of the updateLimLiabCoordOfBenefitsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.UpdateLimLiabCoordOfBenefitsResponse }
     *     
     */
    public void setUpdateLimLiabCoordOfBenefitsResponse(EBSResponse.UpdateLimLiabCoordOfBenefitsResponse value) {
        this.updateLimLiabCoordOfBenefitsResponse = value;
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
     *                   &lt;element name="updateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData"
    })
    public static class UpdateLimLiabCoordOfBenefitsResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.UpdateLimLiabCoordOfBenefitsResponse.StaticData staticData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.UpdateLimLiabCoordOfBenefitsResponse.StaticData }
         *     
         */
        public EBSResponse.UpdateLimLiabCoordOfBenefitsResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.UpdateLimLiabCoordOfBenefitsResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.UpdateLimLiabCoordOfBenefitsResponse.StaticData value) {
            this.staticData = value;
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
         *         &lt;element name="updateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "updateStatus"
        })
        public static class StaticData {

            protected String updateStatus;

            /**
             * Gets the value of the updateStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpdateStatus() {
                return updateStatus;
            }

            /**
             * Sets the value of the updateStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpdateStatus(String value) {
                this.updateStatus = value;
            }

        }

    }

}
