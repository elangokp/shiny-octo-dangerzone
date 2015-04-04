
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03;

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
 *         &lt;element name="GetMemberClaimsDetailRqst" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Claim" maxOccurs="7" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="disambgtnKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SysInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExtensionList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="Extension" maxOccurs="8" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
    "getMemberClaimsDetailRqst"
})
@XmlRootElement(name = "EBSRequest")
public class EBSRequest {

    @XmlElement(name = "GetMemberClaimsDetailRqst", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
    protected EBSRequest.GetMemberClaimsDetailRqst getMemberClaimsDetailRqst;

    /**
     * Gets the value of the getMemberClaimsDetailRqst property.
     * 
     * @return
     *     possible object is
     *     {@link EBSRequest.GetMemberClaimsDetailRqst }
     *     
     */
    public EBSRequest.GetMemberClaimsDetailRqst getGetMemberClaimsDetailRqst() {
        return getMemberClaimsDetailRqst;
    }

    /**
     * Sets the value of the getMemberClaimsDetailRqst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSRequest.GetMemberClaimsDetailRqst }
     *     
     */
    public void setGetMemberClaimsDetailRqst(EBSRequest.GetMemberClaimsDetailRqst value) {
        this.getMemberClaimsDetailRqst = value;
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
     *         &lt;element name="Claim" maxOccurs="7" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="disambgtnKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SysInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ExtensionList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="Extension" maxOccurs="8" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "claim"
    })
    public static class GetMemberClaimsDetailRqst {

        @XmlElement(name = "Claim", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
        protected List<EBSRequest.GetMemberClaimsDetailRqst.Claim> claim;

        /**
         * Gets the value of the claim property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the claim property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClaim().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSRequest.GetMemberClaimsDetailRqst.Claim }
         * 
         * 
         */
        public List<EBSRequest.GetMemberClaimsDetailRqst.Claim> getClaim() {
            if (claim == null) {
                claim = new ArrayList<EBSRequest.GetMemberClaimsDetailRqst.Claim>();
            }
            return this.claim;
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
         *         &lt;element name="memberLookupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="disambgtnKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimSequenceNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SysInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ExtensionList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="Extension" maxOccurs="8" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "memberLookupId",
            "claimNumber",
            "disambgtnKey",
            "claimSequenceNbr",
            "sysInfo",
            "extensionList"
        })
        public static class Claim {

            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected String memberLookupId;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected String claimNumber;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected String disambgtnKey;
            @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected String claimSequenceNbr;
            @XmlElement(name = "SysInfo", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected EBSRequest.GetMemberClaimsDetailRqst.Claim.SysInfo sysInfo;
            @XmlElement(name = "ExtensionList", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
            protected EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList extensionList;

            /**
             * Gets the value of the memberLookupId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMemberLookupId() {
                return memberLookupId;
            }

            /**
             * Sets the value of the memberLookupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMemberLookupId(String value) {
                this.memberLookupId = value;
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
             * Gets the value of the disambgtnKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisambgtnKey() {
                return disambgtnKey;
            }

            /**
             * Sets the value of the disambgtnKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisambgtnKey(String value) {
                this.disambgtnKey = value;
            }

            /**
             * Gets the value of the claimSequenceNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimSequenceNbr() {
                return claimSequenceNbr;
            }

            /**
             * Sets the value of the claimSequenceNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimSequenceNbr(String value) {
                this.claimSequenceNbr = value;
            }

            /**
             * Gets the value of the sysInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.GetMemberClaimsDetailRqst.Claim.SysInfo }
             *     
             */
            public EBSRequest.GetMemberClaimsDetailRqst.Claim.SysInfo getSysInfo() {
                return sysInfo;
            }

            /**
             * Sets the value of the sysInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.GetMemberClaimsDetailRqst.Claim.SysInfo }
             *     
             */
            public void setSysInfo(EBSRequest.GetMemberClaimsDetailRqst.Claim.SysInfo value) {
                this.sysInfo = value;
            }

            /**
             * Gets the value of the extensionList property.
             * 
             * @return
             *     possible object is
             *     {@link EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList }
             *     
             */
            public EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList getExtensionList() {
                return extensionList;
            }

            /**
             * Sets the value of the extensionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList }
             *     
             */
            public void setExtensionList(EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList value) {
                this.extensionList = value;
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
             *         &lt;element name="Extension" maxOccurs="8" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            public static class ExtensionList {

                @XmlElement(name = "Extension", namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
                protected List<EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension> extension;

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
                 * {@link EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension }
                 * 
                 * 
                 */
                public List<EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension> getExtension() {
                    if (extension == null) {
                        extension = new ArrayList<EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension>();
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
                 *         &lt;element name="extensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="extensionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "extensionName",
                    "extensionValue"
                })
                public static class Extension {

                    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
                    protected String extensionName;
                    @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
                    protected String extensionValue;

                    /**
                     * Gets the value of the extensionName property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExtensionName() {
                        return extensionName;
                    }

                    /**
                     * Sets the value of the extensionName property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExtensionName(String value) {
                        this.extensionName = value;
                    }

                    /**
                     * Gets the value of the extensionValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExtensionValue() {
                        return extensionValue;
                    }

                    /**
                     * Sets the value of the extensionValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExtensionValue(String value) {
                        this.extensionValue = value;
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
             *         &lt;element name="srcSytmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "srcSytmId"
            })
            public static class SysInfo {

                @XmlElement(namespace = "http://services.wellpoint.com/senior/claims/schemas/ClaimsInquiry/getMemberClaimDetail-v2_03")
                protected String srcSytmId;

                /**
                 * Gets the value of the srcSytmId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSrcSytmId() {
                    return srcSytmId;
                }

                /**
                 * Sets the value of the srcSytmId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSrcSytmId(String value) {
                    this.srcSytmId = value;
                }

            }

        }

    }

}
