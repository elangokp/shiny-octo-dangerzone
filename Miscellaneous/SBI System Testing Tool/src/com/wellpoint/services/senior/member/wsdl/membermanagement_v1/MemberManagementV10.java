
package com.wellpoint.services.senior.member.wsdl.membermanagement_v1;

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
@WebService(name = "MemberManagement-v1_0", targetNamespace = "http://services.wellpoint.com/senior/member/wsdl/MemberManagement-v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.ObjectFactory.class,
    com.wellpoint.services.senior.member.schemas.membermanagement.updatememberaddress_v3_02.ObjectFactory.class
})
public interface MemberManagementV10 {


    /**
     * 
     * @param updateMemberAddressRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.membermanagement.updatememberaddress_v3_02.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMemberAddress-v3_02", partName = "updateMemberAddressResponse")
    public com.wellpoint.services.senior.member.schemas.membermanagement.updatememberaddress_v3_02.PayLoad updateMemberAddress(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMemberAddress-v3_02", partName = "updateMemberAddressRequest")
        com.wellpoint.services.senior.member.schemas.membermanagement.updatememberaddress_v3_02.PayLoad updateMemberAddressRequest);

    /**
     * 
     * @param getMemberPCPDetailRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03", partName = "getMemberPCPDetailResponse")
    public com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetail(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/GetMemberPCPDetail-v8_03", partName = "getMemberPCPDetailRequest")
        com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailRequest);

    /**
     * 
     * @param updateLimLiabCoordOfBenefitsRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/Update_LimLiabCoordOfBenefits-v1_05", partName = "update_LimLiabCoordOfBenefitsResponse")
    public com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05.PayLoad updateLimLiabCoordOfBenefits(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/Update_LimLiabCoordOfBenefits-v1_05", partName = "update_LimLiabCoordOfBenefitsRequest")
        com.wellpoint.services.senior.member.schemas.membermanagement.update_limliabcoordofbenefits_v1_05.PayLoad updateLimLiabCoordOfBenefitsRequest);

    /**
     * 
     * @param updateMbrCmmnctnPrfrncRequest
     * @return
     *     returns com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00.PayLoad
     */
    @WebMethod
    @WebResult(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00", partName = "updateMbrCmmnctnPrfrncResponse")
    public com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00.PayLoad updateMbrCmmnctnPrfrnc(
        @WebParam(name = "PayLoad", targetNamespace = "http://services.wellpoint.com/senior/member/schemas/MemberManagement/UpdateMbrCmmnctnPrfrnc-v1_00", partName = "updateMbrCmmnctnPrfrncRequest")
        com.wellpoint.services.senior.member.schemas.membermanagement.updatembrcmmnctnprfrnc_v1_00.PayLoad updateMbrCmmnctnPrfrncRequest);

}
