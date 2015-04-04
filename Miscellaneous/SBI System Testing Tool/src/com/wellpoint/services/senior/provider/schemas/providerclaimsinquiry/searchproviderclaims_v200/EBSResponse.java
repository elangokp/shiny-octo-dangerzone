
package com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200;

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
 *         &lt;element name="SearchProvClmsResp" maxOccurs="12" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Counters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="claimCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClaimList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Claim" maxOccurs="7" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}ClaimType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Member">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}MemberType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Subscriber">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/extension>
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
    "searchProvClmsResp"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "SearchProvClmsResp")
    protected List<EBSResponse.SearchProvClmsResp> searchProvClmsResp;

    /**
     * Gets the value of the searchProvClmsResp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchProvClmsResp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchProvClmsResp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EBSResponse.SearchProvClmsResp }
     * 
     * 
     */
    public List<EBSResponse.SearchProvClmsResp> getSearchProvClmsResp() {
        if (searchProvClmsResp == null) {
            searchProvClmsResp = new ArrayList<EBSResponse.SearchProvClmsResp>();
        }
        return this.searchProvClmsResp;
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
     *         &lt;element name="Counters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="claimCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClaimList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Claim" maxOccurs="7" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}ClaimType">
     *                           &lt;sequence>
     *                             &lt;element name="Member">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}MemberType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Subscriber">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/extension>
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
        "counters",
        "claimList"
    })
    public static class SearchProvClmsResp {

        @XmlElement(name = "Counters", required = true)
        protected EBSResponse.SearchProvClmsResp.Counters counters;
        @XmlElement(name = "ClaimList")
        protected EBSResponse.SearchProvClmsResp.ClaimList claimList;

        /**
         * Gets the value of the counters property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchProvClmsResp.Counters }
         *     
         */
        public EBSResponse.SearchProvClmsResp.Counters getCounters() {
            return counters;
        }

        /**
         * Sets the value of the counters property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchProvClmsResp.Counters }
         *     
         */
        public void setCounters(EBSResponse.SearchProvClmsResp.Counters value) {
            this.counters = value;
        }

        /**
         * Gets the value of the claimList property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.SearchProvClmsResp.ClaimList }
         *     
         */
        public EBSResponse.SearchProvClmsResp.ClaimList getClaimList() {
            return claimList;
        }

        /**
         * Sets the value of the claimList property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.SearchProvClmsResp.ClaimList }
         *     
         */
        public void setClaimList(EBSResponse.SearchProvClmsResp.ClaimList value) {
            this.claimList = value;
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
         *         &lt;element name="Claim" maxOccurs="7" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}ClaimType">
         *                 &lt;sequence>
         *                   &lt;element name="Member">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}MemberType">
         *                           &lt;sequence>
         *                             &lt;element name="Subscriber">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/extension>
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
        public static class ClaimList {

            @XmlElement(name = "Claim")
            protected List<EBSResponse.SearchProvClmsResp.ClaimList.Claim> claim;

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
             * {@link EBSResponse.SearchProvClmsResp.ClaimList.Claim }
             * 
             * 
             */
            public List<EBSResponse.SearchProvClmsResp.ClaimList.Claim> getClaim() {
                if (claim == null) {
                    claim = new ArrayList<EBSResponse.SearchProvClmsResp.ClaimList.Claim>();
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
             *     &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}ClaimType">
             *       &lt;sequence>
             *         &lt;element name="Member">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}MemberType">
             *                 &lt;sequence>
             *                   &lt;element name="Subscriber">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/extension>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "member"
            })
            public static class Claim
                extends ClaimType
            {

                @XmlElement(name = "Member", required = true)
                protected EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member member;

                /**
                 * Gets the value of the member property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member }
                 *     
                 */
                public EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member getMember() {
                    return member;
                }

                /**
                 * Sets the value of the member property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member }
                 *     
                 */
                public void setMember(EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member value) {
                    this.member = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}MemberType">
                 *       &lt;sequence>
                 *         &lt;element name="Subscriber">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="alphaPrefixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "subscriber",
                    "alphaPrefixCode"
                })
                public static class Member
                    extends MemberType
                {

                    @XmlElement(name = "Subscriber", required = true)
                    protected EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member.Subscriber subscriber;
                    protected String alphaPrefixCode;

                    /**
                     * Gets the value of the subscriber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member.Subscriber }
                     *     
                     */
                    public EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member.Subscriber getSubscriber() {
                        return subscriber;
                    }

                    /**
                     * Sets the value of the subscriber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member.Subscriber }
                     *     
                     */
                    public void setSubscriber(EBSResponse.SearchProvClmsResp.ClaimList.Claim.Member.Subscriber value) {
                        this.subscriber = value;
                    }

                    /**
                     * Gets the value of the alphaPrefixCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAlphaPrefixCode() {
                        return alphaPrefixCode;
                    }

                    /**
                     * Sets the value of the alphaPrefixCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAlphaPrefixCode(String value) {
                        this.alphaPrefixCode = value;
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
                     *         &lt;element name="Name" type="{http://services.wellpoint.com/senior/provider/schemas/ProviderClaimsInquiry/searchProviderClaims-v200}NameType"/>
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
                        "name"
                    })
                    public static class Subscriber {

                        @XmlElement(name = "Name", required = true)
                        protected NameType name;

                        /**
                         * Gets the value of the name property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link NameType }
                         *     
                         */
                        public NameType getName() {
                            return name;
                        }

                        /**
                         * Sets the value of the name property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link NameType }
                         *     
                         */
                        public void setName(NameType value) {
                            this.name = value;
                        }

                    }

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
         *         &lt;element name="claimCtr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimCtr"
        })
        public static class Counters {

            protected String claimCtr;

            /**
             * Gets the value of the claimCtr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimCtr() {
                return claimCtr;
            }

            /**
             * Sets the value of the claimCtr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimCtr(String value) {
                this.claimCtr = value;
            }

        }

    }

}
