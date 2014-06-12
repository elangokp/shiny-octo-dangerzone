
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimsnotes_v2_06;

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
 *         &lt;element name="GetClaimsNotesResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="28" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimsNotesResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimsNotesResponse", namespace = "")
    protected EBSResponse.GetClaimsNotesResponse getClaimsNotesResponse;

    /**
     * Gets the value of the getClaimsNotesResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimsNotesResponse }
     *     
     */
    public EBSResponse.GetClaimsNotesResponse getGetClaimsNotesResponse() {
        return getClaimsNotesResponse;
    }

    /**
     * Sets the value of the getClaimsNotesResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimsNotesResponse }
     *     
     */
    public void setGetClaimsNotesResponse(EBSResponse.GetClaimsNotesResponse value) {
        this.getClaimsNotesResponse = value;
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
     *         &lt;element name="StaticData" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="28" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staticData",
        "dynamicData"
    })
    public static class GetClaimsNotesResponse {

        @XmlElement(name = "StaticData", namespace = "")
        protected EBSResponse.GetClaimsNotesResponse.StaticData staticData;
        @XmlElement(name = "DynamicData", namespace = "")
        protected List<EBSResponse.GetClaimsNotesResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimsNotesResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimsNotesResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimsNotesResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimsNotesResponse.StaticData value) {
            this.staticData = value;
        }

        /**
         * Gets the value of the dynamicData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dynamicData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDynamicData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EBSResponse.GetClaimsNotesResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetClaimsNotesResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetClaimsNotesResponse.DynamicData>();
            }
            return this.dynamicData;
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
         *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noteText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="noteSummaryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "createUserId",
            "createDatetime",
            "noteText",
            "noteSummaryText"
        })
        public static class DynamicData {

            @XmlElement(namespace = "")
            protected String createUserId;
            @XmlElement(namespace = "")
            protected String createDatetime;
            @XmlElement(namespace = "")
            protected String noteText;
            @XmlElement(namespace = "")
            protected String noteSummaryText;

            /**
             * Gets the value of the createUserId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateUserId() {
                return createUserId;
            }

            /**
             * Sets the value of the createUserId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateUserId(String value) {
                this.createUserId = value;
            }

            /**
             * Gets the value of the createDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateDatetime() {
                return createDatetime;
            }

            /**
             * Sets the value of the createDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateDatetime(String value) {
                this.createDatetime = value;
            }

            /**
             * Gets the value of the noteText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteText() {
                return noteText;
            }

            /**
             * Sets the value of the noteText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteText(String value) {
                this.noteText = value;
            }

            /**
             * Gets the value of the noteSummaryText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteSummaryText() {
                return noteSummaryText;
            }

            /**
             * Sets the value of the noteSummaryText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteSummaryText(String value) {
                this.noteSummaryText = value;
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
         *       &lt;sequence minOccurs="0">
         *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimRevisionNumber",
            "claimLineNumber",
            "claimNumber",
            "claimTypeCode",
            "nextPage"
        })
        public static class StaticData {

            @XmlElement(namespace = "")
            protected String claimRevisionNumber;
            @XmlElement(namespace = "")
            protected String claimLineNumber;
            @XmlElement(namespace = "")
            protected String claimNumber;
            @XmlElement(namespace = "")
            protected String claimTypeCode;
            @XmlElement(name = "NextPage", namespace = "")
            protected EBSResponse.GetClaimsNotesResponse.StaticData.NextPage nextPage;

            /**
             * Gets the value of the claimRevisionNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRevisionNumber() {
                return claimRevisionNumber;
            }

            /**
             * Sets the value of the claimRevisionNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRevisionNumber(String value) {
                this.claimRevisionNumber = value;
            }

            /**
             * Gets the value of the claimLineNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimLineNumber() {
                return claimLineNumber;
            }

            /**
             * Sets the value of the claimLineNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimLineNumber(String value) {
                this.claimLineNumber = value;
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
             * Gets the value of the claimTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimTypeCode() {
                return claimTypeCode;
            }

            /**
             * Sets the value of the claimTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimTypeCode(String value) {
                this.claimTypeCode = value;
            }

            /**
             * Gets the value of the nextPage property.
             * 
             * @return
             *     possible object is
             *     {@link EBSResponse.GetClaimsNotesResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.GetClaimsNotesResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimsNotesResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.GetClaimsNotesResponse.StaticData.NextPage value) {
                this.nextPage = value;
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
             *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="createUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "claimLineNumber",
                "claimRevisionNumber",
                "createUserId",
                "createDatetime"
            })
            public static class NextPage {

                @XmlElement(namespace = "")
                protected String claimLineNumber;
                @XmlElement(namespace = "")
                protected String claimRevisionNumber;
                @XmlElement(namespace = "")
                protected String createUserId;
                @XmlElement(namespace = "")
                protected String createDatetime;

                /**
                 * Gets the value of the claimLineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimLineNumber() {
                    return claimLineNumber;
                }

                /**
                 * Sets the value of the claimLineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimLineNumber(String value) {
                    this.claimLineNumber = value;
                }

                /**
                 * Gets the value of the claimRevisionNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClaimRevisionNumber() {
                    return claimRevisionNumber;
                }

                /**
                 * Sets the value of the claimRevisionNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClaimRevisionNumber(String value) {
                    this.claimRevisionNumber = value;
                }

                /**
                 * Gets the value of the createUserId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreateUserId() {
                    return createUserId;
                }

                /**
                 * Sets the value of the createUserId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreateUserId(String value) {
                    this.createUserId = value;
                }

                /**
                 * Gets the value of the createDatetime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreateDatetime() {
                    return createDatetime;
                }

                /**
                 * Sets the value of the createDatetime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreateDatetime(String value) {
                    this.createDatetime = value;
                }

            }

        }

    }

}
