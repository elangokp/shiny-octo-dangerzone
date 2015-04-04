
package com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00;

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
 *         &lt;element name="UpdateMbrCmmnctnPrfrncResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DynamicData" maxOccurs="50" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence minOccurs="0">
 *                             &lt;element name="updtSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sttsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rowCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "updateMbrCmmnctnPrfrncResponse"
})
@XmlRootElement(name = "EBSResponse")
public class EBSResponse {

    @XmlElement(name = "UpdateMbrCmmnctnPrfrncResponse", namespace = "")
    protected EBSResponse.UpdateMbrCmmnctnPrfrncResponse updateMbrCmmnctnPrfrncResponse;

    /**
     * Gets the value of the updateMbrCmmnctnPrfrncResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EBSResponse.UpdateMbrCmmnctnPrfrncResponse }
     *     
     */
    public EBSResponse.UpdateMbrCmmnctnPrfrncResponse getUpdateMbrCmmnctnPrfrncResponse() {
        return updateMbrCmmnctnPrfrncResponse;
    }

    /**
     * Sets the value of the updateMbrCmmnctnPrfrncResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBSResponse.UpdateMbrCmmnctnPrfrncResponse }
     *     
     */
    public void setUpdateMbrCmmnctnPrfrncResponse(EBSResponse.UpdateMbrCmmnctnPrfrncResponse value) {
        this.updateMbrCmmnctnPrfrncResponse = value;
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
     *         &lt;element name="DynamicData" maxOccurs="50" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence minOccurs="0">
     *                   &lt;element name="updtSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sttsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rowCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "dynamicData"
    })
    public static class UpdateMbrCmmnctnPrfrncResponse {

        @XmlElement(name = "DynamicData", namespace = "")
        protected List<EBSResponse.UpdateMbrCmmnctnPrfrncResponse.DynamicData> dynamicData;

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
         * {@link EBSResponse.UpdateMbrCmmnctnPrfrncResponse.DynamicData }
         * 
         * 
         */
        public List<EBSResponse.UpdateMbrCmmnctnPrfrncResponse.DynamicData> getDynamicData() {
            if (dynamicData == null) {
                dynamicData = new ArrayList<EBSResponse.UpdateMbrCmmnctnPrfrncResponse.DynamicData>();
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
         *         &lt;element name="updtSttsCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sttsCdDescTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rowCnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sbscrbrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="subGrpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entirFmlyInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="mbrSqncNbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="srcSysId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "updtSttsCd",
            "sttsCdDescTxt",
            "rowCnt",
            "sbscrbrId",
            "grpId",
            "subGrpId",
            "entirFmlyInd",
            "mbrSqncNbr",
            "srcSysId"
        })
        public static class DynamicData {

            @XmlElement(namespace = "")
            protected String updtSttsCd;
            @XmlElement(namespace = "")
            protected String sttsCdDescTxt;
            @XmlElement(namespace = "")
            protected String rowCnt;
            @XmlElement(namespace = "")
            protected String sbscrbrId;
            @XmlElement(namespace = "")
            protected String grpId;
            @XmlElement(namespace = "")
            protected String subGrpId;
            @XmlElement(namespace = "")
            protected String entirFmlyInd;
            @XmlElement(namespace = "")
            protected String mbrSqncNbr;
            @XmlElement(namespace = "")
            protected String srcSysId;

            /**
             * Gets the value of the updtSttsCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUpdtSttsCd() {
                return updtSttsCd;
            }

            /**
             * Sets the value of the updtSttsCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUpdtSttsCd(String value) {
                this.updtSttsCd = value;
            }

            /**
             * Gets the value of the sttsCdDescTxt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSttsCdDescTxt() {
                return sttsCdDescTxt;
            }

            /**
             * Sets the value of the sttsCdDescTxt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSttsCdDescTxt(String value) {
                this.sttsCdDescTxt = value;
            }

            /**
             * Gets the value of the rowCnt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRowCnt() {
                return rowCnt;
            }

            /**
             * Sets the value of the rowCnt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRowCnt(String value) {
                this.rowCnt = value;
            }

            /**
             * Gets the value of the sbscrbrId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSbscrbrId() {
                return sbscrbrId;
            }

            /**
             * Sets the value of the sbscrbrId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSbscrbrId(String value) {
                this.sbscrbrId = value;
            }

            /**
             * Gets the value of the grpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrpId() {
                return grpId;
            }

            /**
             * Sets the value of the grpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrpId(String value) {
                this.grpId = value;
            }

            /**
             * Gets the value of the subGrpId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubGrpId() {
                return subGrpId;
            }

            /**
             * Sets the value of the subGrpId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubGrpId(String value) {
                this.subGrpId = value;
            }

            /**
             * Gets the value of the entirFmlyInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntirFmlyInd() {
                return entirFmlyInd;
            }

            /**
             * Sets the value of the entirFmlyInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntirFmlyInd(String value) {
                this.entirFmlyInd = value;
            }

            /**
             * Gets the value of the mbrSqncNbr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMbrSqncNbr() {
                return mbrSqncNbr;
            }

            /**
             * Sets the value of the mbrSqncNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMbrSqncNbr(String value) {
                this.mbrSqncNbr = value;
            }

            /**
             * Gets the value of the srcSysId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcSysId() {
                return srcSysId;
            }

            /**
             * Sets the value of the srcSysId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcSysId(String value) {
                this.srcSysId = value;
            }

        }

    }

}
