
package com.wellpoint.services.senior.member.wsdl.memberinquiry_v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MemberInquiry-v1_0", targetNamespace = "http://services.wellpoint.com/senior/member/wsdl/MemberInquiry-v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.wellpoint.services.senior.member.schemas.memberinquiry.getmemberbroker_v2_01.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchmembercontracts_v1_01.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilityaltpayeedetail_v1_03.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabtermliabdetail_v1_0.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdetails_v3_02.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_ccb_v7_02.ObjectFactory.class
})
public interface MemberInquiryV10 {


    /**
     * 
     * @param getLimitedLiabilityCoordinationRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02", partName = "getLimitedLiabilityCoordinationResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02.PayLoad getLimitedLiabilityCoordination(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityCoordination-v1_02", partName = "getLimitedLiabilityCoordinationRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilitycoordination_v1_02.PayLoad getLimitedLiabilityCoordinationRequest);

    /**
     * 
     * @param searchGeographicLocationRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchGeographicLocation-v1_02", partName = "searchGeographicLocationResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02.PayLoad searchGeographicLocation(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchGeographicLocation-v1_02", partName = "searchGeographicLocationRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchgeographiclocation_v1_02.PayLoad searchGeographicLocationRequest);

    /**
     * 
     * @param getLimLiabTerminationLiabDetailRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabtermliabdetail_v1_0.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabTermLiabDetail-v1_0", partName = "getLimLiabTerminationLiabDetailResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabtermliabdetail_v1_0.PayLoad getLimLiabTermLiabDetail(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabTermLiabDetail-v1_0", partName = "getLimLiabTerminationLiabDetailRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabtermliabdetail_v1_0.PayLoad getLimLiabTerminationLiabDetailRequest);

    /**
     * 
     * @param getLimLiabAltPayeeDetailRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilityaltpayeedetail_v1_03.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03", partName = "getLimLiabAltPayeeDetailResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilityaltpayeedetail_v1_03.PayLoad getLimitedLiabilityAltPayeeDetail(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimitedLiabilityAltPayeeDetail-v1_03", partName = "getLimLiabAltPayeeDetailRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getlimitedliabilityaltpayeedetail_v1_03.PayLoad getLimLiabAltPayeeDetailRequest);

    /**
     * 
     * @param searchMemberDetailsRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdetails_v3_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02", partName = "searchMemberDetailsResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdetails_v3_02.PayLoad searchMemberDetails(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDetails-v3_02", partName = "searchMemberDetailsRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdetails_v3_02.PayLoad searchMemberDetailsRequest);

    /**
     * 
     * @param getLimLiabCoordOfNonCCBBenefitsRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02", partName = "getLimLiabCoordOfNonCCBBenefitsResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfNonCCBBenefits(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-NonCCB-v7_02", partName = "getLimLiabCoordOfNonCCBBenefitsRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfNonCCBBenefitsRequest);

    /**
     * 
     * @param getLimLiabCoordOfCCBBenefitsRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_ccb_v7_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-CCB-v7_02", partName = "getLimLiabCoordOfCCBBenefitsResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_ccb_v7_02.PayLoad getLimLiabCoordOfCCBBenefits(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getLimLiabCoordOfBenefits-CCB-v7_02", partName = "getLimLiabCoordOfCCBBenefitsRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_ccb_v7_02.PayLoad getLimLiabCoordOfCCBBenefitsRequest);

    /**
     * 
     * @param searchMbrDmoPrflRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04", partName = "Search_MbrDmoPrfl_Response")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04.PayLoad searchMemberDemographicProfile(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberDemographicProfile-v2_04", partName = "Search_MbrDmoPrfl_Request")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchmemberdemographicprofile_v2_04.PayLoad searchMbrDmoPrflRequest);

    /**
     * 
     * @param searchMemberRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04", partName = "searchMemberResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMember(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMember-v8_04", partName = "searchMemberRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest);

    /**
     * 
     * @param getMemberBrokerRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.getmemberbroker_v2_01.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getMemberBroker-V2_01", partName = "getMemberBrokerResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.getmemberbroker_v2_01.PayLoad getMemberBroker(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/getMemberBroker-V2_01", partName = "getMemberBrokerRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.getmemberbroker_v2_01.PayLoad getMemberBrokerRequest);

    /**
     * 
     * @param searchLimLiabRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13", partName = "searchLimLiabResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13.PayLoad searchLimLiab(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchLimitedLiability-v4_13", partName = "searchLimLiabRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchlimitedliability_v4_13.PayLoad searchLimLiabRequest);

    /**
     * 
     * @param searchMemberContractsRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.memberinquiry.searchmembercontracts_v1_01.PayLoad
     */
    @WebMethod(operationName = "Search_MemberContracts")
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberContracts-V1_01", partName = "searchMemberContractsResponse")
    public com.wellpoint.services.senior.member.schemas.memberinquiry.searchmembercontracts_v1_01.PayLoad searchMemberContracts(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberInquiry/searchMemberContracts-V1_01", partName = "searchMemberContractsRequest")
        com.wellpoint.services.senior.member.schemas.memberinquiry.searchmembercontracts_v1_01.PayLoad searchMemberContractsRequest);

}
