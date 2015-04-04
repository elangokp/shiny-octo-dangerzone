
package com.wellpoint.services.senior.claims.schemas.claimsinquiry.getclaimroutingdetails_v2_0;

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
 *         &lt;element name="GetClaimRoutingDetailResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="StaticData" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NextPage" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="DynamicData" maxOccurs="27" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="claimRouteSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRouteWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRouteSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimRouteWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="routeToUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="routeReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="routeReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="routeReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="routeReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getClaimRoutingDetailResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "GetClaimRoutingDetailResponse")
    protected EBSResponse.GetClaimRoutingDetailResponse getClaimRoutingDetailResponse;

    /**
     * Gets the value of the getClaimRoutingDetailResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.GetClaimRoutingDetailResponse }
     *     
     */
    public EBSResponse.GetClaimRoutingDetailResponse getGetClaimRoutingDetailResponse() {
        return getClaimRoutingDetailResponse;
    }

    /**
     * Sets the value of the getClaimRoutingDetailResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.GetClaimRoutingDetailResponse }
     *     
     */
    public void setGetClaimRoutingDetailResponse(EBSResponse.GetClaimRoutingDetailResponse value) {
        this.getClaimRoutingDetailResponse = value;
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
     *                   &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NextPage" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="DynamicData" maxOccurs="27" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="claimRouteSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRouteWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRouteSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimRouteWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="routeToUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="routeReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="routeReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="routeReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="routeReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class GetClaimRoutingDetailResponse {

        @XmlElement(name = "StaticData")
        protected EBSResponse.GetClaimRoutingDetailResponse.StaticData staticData;
        @XmlElement(name = "DynamicData")
        protected List<EBSResponse.GetClaimRoutingDetailResponse.DynamicData> dynamicData;

        /**
         * Gets the value of the staticData property.
         * 
         * @return
         *     possible object is
         *     {@link EBSResponse.GetClaimRoutingDetailResponse.StaticData }
         *     
         */
        public EBSResponse.GetClaimRoutingDetailResponse.StaticData getStaticData() {
            return staticData;
        }

        /**
         * Sets the value of the staticData property.
         * 
         * @param value
         *     allowed object is
         *     {@link EBSResponse.GetClaimRoutingDetailResponse.StaticData }
         *     
         */
        public void setStaticData(EBSResponse.GetClaimRoutingDetailResponse.StaticData value) {
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
         * {@link EBSResponse.GetClaimRoutingDetailResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.GetClaimRoutingDetailResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.GetClaimRoutingDetailResponse.DynamicData>();
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
         *         &lt;element name="claimRouteSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRouteWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRouteSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRouteWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="modifyUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimStatusWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rejectReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="routeToUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="routeReasonSorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="routeReasonSorCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="routeReasonWlpCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="routeReasonWlpCodeNameText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimRouteSorCode",
            "claimRouteWlpCode",
            "claimRouteSorCodeNameText",
            "claimRouteWlpCodeNameText",
            "modifyUserId",
            "claimStatusSorCode",
            "claimStatusWlpCode",
            "modifyDatetime",
            "rejectReasonSorCode",
            "rejectReasonSorCodeNameText",
            "rejectReasonWlpCode",
            "rejectReasonWlpCodeNameText",
            "routeToUserId",
            "routeReasonSorCode",
            "routeReasonSorCodeNameText",
            "routeReasonWlpCode",
            "routeReasonWlpCodeNameText"
        })
        public static class DynamicData {

            protected String claimRouteSorCode;
            protected String claimRouteWlpCode;
            protected String claimRouteSorCodeNameText;
            protected String claimRouteWlpCodeNameText;
            protected String modifyUserId;
            protected String claimStatusSorCode;
            protected String claimStatusWlpCode;
            protected String modifyDatetime;
            protected String rejectReasonSorCode;
            protected String rejectReasonSorCodeNameText;
            protected String rejectReasonWlpCode;
            protected String rejectReasonWlpCodeNameText;
            protected String routeToUserId;
            protected String routeReasonSorCode;
            protected String routeReasonSorCodeNameText;
            protected String routeReasonWlpCode;
            protected String routeReasonWlpCodeNameText;

            /**
             * Gets the value of the claimRouteSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRouteSorCode() {
                return claimRouteSorCode;
            }

            /**
             * Sets the value of the claimRouteSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRouteSorCode(String value) {
                this.claimRouteSorCode = value;
            }

            /**
             * Gets the value of the claimRouteWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRouteWlpCode() {
                return claimRouteWlpCode;
            }

            /**
             * Sets the value of the claimRouteWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRouteWlpCode(String value) {
                this.claimRouteWlpCode = value;
            }

            /**
             * Gets the value of the claimRouteSorCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRouteSorCodeNameText() {
                return claimRouteSorCodeNameText;
            }

            /**
             * Sets the value of the claimRouteSorCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRouteSorCodeNameText(String value) {
                this.claimRouteSorCodeNameText = value;
            }

            /**
             * Gets the value of the claimRouteWlpCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimRouteWlpCodeNameText() {
                return claimRouteWlpCodeNameText;
            }

            /**
             * Sets the value of the claimRouteWlpCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimRouteWlpCodeNameText(String value) {
                this.claimRouteWlpCodeNameText = value;
            }

            /**
             * Gets the value of the modifyUserId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifyUserId() {
                return modifyUserId;
            }

            /**
             * Sets the value of the modifyUserId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifyUserId(String value) {
                this.modifyUserId = value;
            }

            /**
             * Gets the value of the claimStatusSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimStatusSorCode() {
                return claimStatusSorCode;
            }

            /**
             * Sets the value of the claimStatusSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimStatusSorCode(String value) {
                this.claimStatusSorCode = value;
            }

            /**
             * Gets the value of the claimStatusWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClaimStatusWlpCode() {
                return claimStatusWlpCode;
            }

            /**
             * Sets the value of the claimStatusWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClaimStatusWlpCode(String value) {
                this.claimStatusWlpCode = value;
            }

            /**
             * Gets the value of the modifyDatetime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModifyDatetime() {
                return modifyDatetime;
            }

            /**
             * Sets the value of the modifyDatetime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModifyDatetime(String value) {
                this.modifyDatetime = value;
            }

            /**
             * Gets the value of the rejectReasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCode() {
                return rejectReasonSorCode;
            }

            /**
             * Sets the value of the rejectReasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCode(String value) {
                this.rejectReasonSorCode = value;
            }

            /**
             * Gets the value of the rejectReasonSorCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonSorCodeNameText() {
                return rejectReasonSorCodeNameText;
            }

            /**
             * Sets the value of the rejectReasonSorCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonSorCodeNameText(String value) {
                this.rejectReasonSorCodeNameText = value;
            }

            /**
             * Gets the value of the rejectReasonWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonWlpCode() {
                return rejectReasonWlpCode;
            }

            /**
             * Sets the value of the rejectReasonWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonWlpCode(String value) {
                this.rejectReasonWlpCode = value;
            }

            /**
             * Gets the value of the rejectReasonWlpCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRejectReasonWlpCodeNameText() {
                return rejectReasonWlpCodeNameText;
            }

            /**
             * Sets the value of the rejectReasonWlpCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRejectReasonWlpCodeNameText(String value) {
                this.rejectReasonWlpCodeNameText = value;
            }

            /**
             * Gets the value of the routeToUserId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRouteToUserId() {
                return routeToUserId;
            }

            /**
             * Sets the value of the routeToUserId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRouteToUserId(String value) {
                this.routeToUserId = value;
            }

            /**
             * Gets the value of the routeReasonSorCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRouteReasonSorCode() {
                return routeReasonSorCode;
            }

            /**
             * Sets the value of the routeReasonSorCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRouteReasonSorCode(String value) {
                this.routeReasonSorCode = value;
            }

            /**
             * Gets the value of the routeReasonSorCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRouteReasonSorCodeNameText() {
                return routeReasonSorCodeNameText;
            }

            /**
             * Sets the value of the routeReasonSorCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRouteReasonSorCodeNameText(String value) {
                this.routeReasonSorCodeNameText = value;
            }

            /**
             * Gets the value of the routeReasonWlpCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRouteReasonWlpCode() {
                return routeReasonWlpCode;
            }

            /**
             * Sets the value of the routeReasonWlpCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRouteReasonWlpCode(String value) {
                this.routeReasonWlpCode = value;
            }

            /**
             * Gets the value of the routeReasonWlpCodeNameText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRouteReasonWlpCodeNameText() {
                return routeReasonWlpCodeNameText;
            }

            /**
             * Sets the value of the routeReasonWlpCodeNameText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRouteReasonWlpCodeNameText(String value) {
                this.routeReasonWlpCodeNameText = value;
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
         *         &lt;element name="claimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="claimTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NextPage" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "claimNumber",
            "claimLineNumber",
            "claimRevisionNumber",
            "claimTypeCode",
            "nextPage"
        })
        public static class StaticData {

            protected String claimNumber;
            protected String claimLineNumber;
            protected String claimRevisionNumber;
            protected String claimTypeCode;
            @XmlElement(name = "NextPage")
            protected EBSResponse.GetClaimRoutingDetailResponse.StaticData.NextPage nextPage;

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
             *     {@link EBSResponse.GetClaimRoutingDetailResponse.StaticData.NextPage }
             *     
             */
            public EBSResponse.GetClaimRoutingDetailResponse.StaticData.NextPage getNextPage() {
                return nextPage;
            }

            /**
             * Sets the value of the nextPage property.
             * 
             * @param value
             *     allowed object is
             *     {@link EBSResponse.GetClaimRoutingDetailResponse.StaticData.NextPage }
             *     
             */
            public void setNextPage(EBSResponse.GetClaimRoutingDetailResponse.StaticData.NextPage value) {
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
             *         &lt;element name="modifyDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="claimRevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "modifyDatetime",
                "claimRevisionNumber"
            })
            public static class NextPage {

                protected String modifyDatetime;
                protected String claimRevisionNumber;

                /**
                 * Gets the value of the modifyDatetime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getModifyDatetime() {
                    return modifyDatetime;
                }

                /**
                 * Sets the value of the modifyDatetime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setModifyDatetime(String value) {
                    this.modifyDatetime = value;
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

            }

        }

    }

}
