package com.caremore.sbi.services.constructors;

import java.io.File;
import java.util.List;

import com.caremore.sbi.utils.JaxbUtils;

public class GetLimLiabCoordofBenefitsRequestResponseConstructor {

	public static com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad createGetLimLiabCoordofBenefitsRequestResponsePayload(
			File getLimLiabCoordOfBenefitsRequestResponseFile) {
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfBenefitsPayload = null;
		getLimLiabCoordOfBenefitsPayload = JaxbUtils
				.unmarshal(
						com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad.class,
						getLimLiabCoordOfBenefitsRequestResponseFile);
		return getLimLiabCoordOfBenefitsPayload;
	}

	public static com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad createGetLimLiabCoordofBenefitsRequestPayload(
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest,
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse) {

		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfBenefitsPayload = null;

		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSHeader searchMemberRequestHeaderData = searchMemberRequest.getEBSHeader();
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSRequest.SearchMemberRequest.StaticData searchMemberRequestStaticData = searchMemberRequest
				.getEBSRequest().getSearchMemberRequest().getStaticData();
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData> searchMemberResponseDynamicData = searchMemberResponse
				.getEBSResponse().getSearchMemberResponse().getDynamicData();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData firstMemberDynamicData = searchMemberResponseDynamicData
				.get(0);

		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.ObjectFactory limLiabObjectFactory = new com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.ObjectFactory();
		
		getLimLiabCoordOfBenefitsPayload = limLiabObjectFactory.createPayLoad();
		getLimLiabCoordOfBenefitsPayload.setEBSHeader(limLiabObjectFactory
				.createEBSHeader());
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.EBSHeader getLimLiabCoordOfBenefitsEBSHeader = getLimLiabCoordOfBenefitsPayload.getEBSHeader();
		
		getLimLiabCoordOfBenefitsEBSHeader.setClientRowsPerPage(searchMemberRequestHeaderData.getClientRowsPerPage());
		getLimLiabCoordOfBenefitsEBSHeader.setClientUserID(searchMemberRequestHeaderData.getClientUserID());
		getLimLiabCoordOfBenefitsEBSHeader.setClientUserPassword(searchMemberRequestHeaderData.getClientUserPassword());
		getLimLiabCoordOfBenefitsEBSHeader.setErrorRows(searchMemberRequestHeaderData.getErrorRows());
		getLimLiabCoordOfBenefitsEBSHeader.setMoreData(searchMemberRequestHeaderData.getMoreData());
		getLimLiabCoordOfBenefitsEBSHeader.setRequestRowLength(searchMemberRequestHeaderData.getRequestRowLength());
		getLimLiabCoordOfBenefitsEBSHeader.setRequestRows(searchMemberRequestHeaderData.getRequestRows());
		getLimLiabCoordOfBenefitsEBSHeader.setResponseDynamicRowLength(searchMemberRequestHeaderData.getResponseDynamicRowLength());
		getLimLiabCoordOfBenefitsEBSHeader.setResponseDynamicRows(searchMemberRequestHeaderData.getResponseDynamicRows());
		getLimLiabCoordOfBenefitsEBSHeader.setResponseStaticLength(searchMemberRequestHeaderData.getResponseStaticLength());
		getLimLiabCoordOfBenefitsEBSHeader.setResponseStaticRows(searchMemberRequestHeaderData.getResponseStaticRows());
		getLimLiabCoordOfBenefitsEBSHeader.setSbiAdditionalPageKeys(searchMemberRequestHeaderData.getSbiAdditionalPageKeys());
		getLimLiabCoordOfBenefitsEBSHeader.setSecurityToken(searchMemberRequestHeaderData.getSecurityToken());
		getLimLiabCoordOfBenefitsEBSHeader.setServiceDuration(searchMemberRequestHeaderData.getServiceDuration());

		getLimLiabCoordOfBenefitsPayload.setEBSRequest(limLiabObjectFactory
				.createEBSRequest());
		
		getLimLiabCoordOfBenefitsPayload
				.getEBSRequest()
				.setGetLimLiabCoordOfBenefitsRequest(
						limLiabObjectFactory
								.createEBSRequestGetLimLiabCoordOfBenefitsRequest());
		getLimLiabCoordOfBenefitsPayload
				.getEBSRequest()
				.getGetLimLiabCoordOfBenefitsRequest()
				.setStaticData(
						limLiabObjectFactory
								.createEBSRequestGetLimLiabCoordOfBenefitsRequestStaticData());
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.EBSRequest.GetLimLiabCoordOfBenefitsRequest.StaticData getLimLiabCoordOfBenefitsRequestStaticData = getLimLiabCoordOfBenefitsPayload
				.getEBSRequest().getGetLimLiabCoordOfBenefitsRequest()
				.getStaticData();

		getLimLiabCoordOfBenefitsRequestStaticData
				.setBCBSAControlPlnID(firstMemberDynamicData
						.getBcbsaControlPlanId());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setDateofBirth(firstMemberDynamicData.getMember()
						.getBirthDate());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setFirstName(firstMemberDynamicData.getMember().getFirstName());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setGroupId(firstMemberDynamicData.getGroupId());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setLastName(firstMemberDynamicData.getMember().getLastName());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setLimitedLiabilityEffectiveDate(searchMemberRequestStaticData
						.getSearchStartDate());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setLimitedLiabilityTerminationDate(searchMemberRequestStaticData
						.getSearchEndDate());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setMemberLookupId(firstMemberDynamicData.getMemberLookupID());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setMemberSequenceNumber(firstMemberDynamicData.getMbrSqncNum());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setMiddleName(firstMemberDynamicData.getMember()
						.getMiddleName());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setPrincipleSubscriberId(firstMemberDynamicData
						.getPrincipleSubscriberId());
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products> firstMemberProducts = firstMemberDynamicData
				.getProducts();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products firstMemberFirstProduct = firstMemberProducts
				.get(0);
		getLimLiabCoordOfBenefitsRequestStaticData
				.setSubgroupId(firstMemberFirstProduct.getSubgroupId());
		getLimLiabCoordOfBenefitsRequestStaticData
				.setSubscriberId(firstMemberDynamicData.getSubscriberId());
		return getLimLiabCoordOfBenefitsPayload;
	}
}
