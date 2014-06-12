
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimsadjudicationdetail_v2_02;

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
 *         &lt;element name="GetClmsAdjdctnDtlRqst" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ExtLst" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="Extension" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="extNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="extVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClmsAdjdctnDtlRqst"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetClmsAdjdctnDtlRqst", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
    protected EBSRequest.GetClmsAdjdctnDtlRqst getClmsAdjdctnDtlRqst;

    /**
     * Gets the value of the getClmsAdjdctnDtlRqst property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetClmsAdjdctnDtlRqst }
     *     
     */
    public EBSRequest.GetClmsAdjdctnDtlRqst getGetClmsAdjdctnDtlRqst() {
        return getClmsAdjdctnDtlRqst;
    }

    /**
     * Sets the value of the getClmsAdjdctnDtlRqst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetClmsAdjdctnDtlRqst }
     *     
     */
    public void setGetClmsAdjdctnDtlRqst(EBSRequest.GetClmsAdjdctnDtlRqst value) {
        this.getClmsAdjdctnDtlRqst = value;
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
     *         &lt;element name="clmNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmLnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="clmRvsnNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ExtLst" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="Extension" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="extNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="extVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "clmNbr",
        "clmLnNbr",
        "clmRvsnNbr",
        "extLst"
    })
    public static class GetClmsAdjdctnDtlRqst {

        @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
        protected String clmNbr;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
        protected String clmLnNbr;
        @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
        protected String clmRvsnNbr;
        @XmlElement(name = "ExtLst", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
        protected EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst extLst;

        /**
         * Gets the value of the clmNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmNbr() {
            return clmNbr;
        }

        /**
         * Sets the value of the clmNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmNbr(String value) {
            this.clmNbr = value;
        }

        /**
         * Gets the value of the clmLnNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmLnNbr() {
            return clmLnNbr;
        }

        /**
         * Sets the value of the clmLnNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmLnNbr(String value) {
            this.clmLnNbr = value;
        }

        /**
         * Gets the value of the clmRvsnNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClmRvsnNbr() {
            return clmRvsnNbr;
        }

        /**
         * Sets the value of the clmRvsnNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClmRvsnNbr(String value) {
            this.clmRvsnNbr = value;
        }

        /**
         * Gets the value of the extLst property.
         * 
         * @return
         *     possible object is
         *     {@link EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst }
         *     
         */
        public EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst getExtLst() {
            return extLst;
        }

        /**
         * Sets the value of the extLst property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst }
         *     
         */
        public void setExtLst(EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst value) {
            this.extLst = value;
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
         *         &lt;element name="Extension" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="extNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="extVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "extension"
        })
        public static class ExtLst {

            @XmlElement(name = "Extension", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
            protected List<EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst.Extension> extension;

            /**
             * Gets the value of the extension property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the extension property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExtension().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst.Extension }
             * 
             * 
             */
            public List<EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst.Extension> getExtension() {
                if (extension == null) {
                    extension = new ArrayList<EBSRequest.GetClmsAdjdctnDtlRqst.ExtLst.Extension>();
                }
                return this.extension;
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
             *         &lt;element name="extNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="extVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "extNm",
                "extVal"
            })
            public static class Extension {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
                protected String extNm;
                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/GetClaimsAdjudicationDetail-v2_02")
                protected String extVal;

                /**
                 * Gets the value of the extNm property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtNm() {
                    return extNm;
                }

                /**
                 * Sets the value of the extNm property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtNm(String value) {
                    this.extNm = value;
                }

                /**
                 * Gets the value of the extVal property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExtVal() {
                    return extVal;
                }

                /**
                 * Sets the value of the extVal property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExtVal(String value) {
                    this.extVal = value;
                }

            }

        }

    }

}
