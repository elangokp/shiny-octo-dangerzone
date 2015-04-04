package com.caremore.sbi.services.constructors;

import java.io.File;
import java.util.List;

import com.caremore.sbi.utils.JaxbUtils;

public class GetMemberPCPDetailRequestResponseConstructor {

	public static com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad createGetMemberPCPDetailRequestResponsePayload(
			File getMemberPCPDetailRequestResponseFile) {
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailPayload = null;
		getMemberPCPDetailPayload = JaxbUtils
				.unmarshal(
						com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad.class,
						getMemberPCPDetailRequestResponseFile);
		return getMemberPCPDetailPayload;
	}
	
	public static com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad createGetMemberPCPDetailRequestPayload(
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest,
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse) {

		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailPayload = null;
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSHeader searchMemberRequestHeaderData = searchMemberRequest.getEBSHeader();

		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSRequest.SearchMemberRequest.StaticData searchMemberRequestStaticData = searchMemberRequest
				.getEBSRequest().getSearchMemberRequest().getStaticData();
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData> searchMemberResponseDynamicData = searchMemberResponse
				.getEBSResponse().getSearchMemberResponse().getDynamicData();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData firstMemberDynamicData = searchMemberResponseDynamicData
				.get(0);

		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.ObjectFactory getMemberPCPDetailObjectFactory = new com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.ObjectFactory();
		getMemberPCPDetailPayload = getMemberPCPDetailObjectFactory.createPayLoad();
		
		getMemberPCPDetailPayload.setEBSHeader(getMemberPCPDetailObjectFactory
				.createEBSHeader());
				
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.EBSHeader getMemberPCPDetailEBSHeader = getMemberPCPDetailPayload.getEBSHeader();
		
		getMemberPCPDetailEBSHeader.setClientRowsPerPage(searchMemberRequestHeaderData.getClientRowsPerPage());
		getMemberPCPDetailEBSHeader.setClientUserID(searchMemberRequestHeaderData.getClientUserID());
		getMemberPCPDetailEBSHeader.setClientUserPassword(searchMemberRequestHeaderData.getClientUserPassword());
		getMemberPCPDetailEBSHeader.setErrorRows(searchMemberRequestHeaderData.getErrorRows());
		getMemberPCPDetailEBSHeader.setMoreData(searchMemberRequestHeaderData.getMoreData());
		getMemberPCPDetailEBSHeader.setRequestRowLength(searchMemberRequestHeaderData.getRequestRowLength());
		getMemberPCPDetailEBSHeader.setRequestRows(searchMemberRequestHeaderData.getRequestRows());
		getMemberPCPDetailEBSHeader.setResponseDynamicRowLength(searchMemberRequestHeaderData.getResponseDynamicRowLength());
		getMemberPCPDetailEBSHeader.setResponseDynamicRows(searchMemberRequestHeaderData.getResponseDynamicRows());
		getMemberPCPDetailEBSHeader.setResponseStaticLength(searchMemberRequestHeaderData.getResponseStaticLength());
		getMemberPCPDetailEBSHeader.setResponseStaticRows(searchMemberRequestHeaderData.getResponseStaticRows());
		getMemberPCPDetailEBSHeader.setSbiAdditionalPageKeys(searchMemberRequestHeaderData.getSbiAdditionalPageKeys());
		getMemberPCPDetailEBSHeader.setSecurityToken(searchMemberRequestHeaderData.getSecurityToken());
		getMemberPCPDetailEBSHeader.setServiceDuration(searchMemberRequestHeaderData.getServiceDuration());
		
		getMemberPCPDetailPayload.setEBSRequest(getMemberPCPDetailObjectFactory
				.createEBSRequest());
		getMemberPCPDetailPayload
				.getEBSRequest().setGetMemberPCPDetailRequest(getMemberPCPDetailObjectFactory.createEBSRequestGetMemberPCPDetailRequest());
		getMemberPCPDetailPayload
				.getEBSRequest()
				.getGetMemberPCPDetailRequest()
				.setStaticData(
						getMemberPCPDetailObjectFactory.createEBSRequestGetMemberPCPDetailRequestStaticData());
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.EBSRequest.GetMemberPCPDetailRequest.StaticData getMemberPCPDetailRequestStaticData = getMemberPCPDetailPayload
				.getEBSRequest().getGetMemberPCPDetailRequest()
				.getStaticData();

		getMemberPCPDetailRequestStaticData.setBirthDate(firstMemberDynamicData.getMember().getBirthDate());
		getMemberPCPDetailRequestStaticData.setFirstName(firstMemberDynamicData.getMember().getFirstName());
		getMemberPCPDetailRequestStaticData.setGroupId(firstMemberDynamicData.getGroupId());
		getMemberPCPDetailRequestStaticData.setLastName(firstMemberDynamicData.getMember().getLastName());
		getMemberPCPDetailRequestStaticData.setMbrLkupId(firstMemberDynamicData.getSubscriberId());
		getMemberPCPDetailRequestStaticData.setMbrSeqNum(firstMemberDynamicData.getMbrSqncNum());
		getMemberPCPDetailRequestStaticData.setMiddleName(firstMemberDynamicData.getMember().getMiddleName());
		
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products> firstMemberProducts = firstMemberDynamicData
		.getProducts();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products firstMemberFirstProduct = firstMemberProducts
		.get(0);

		getMemberPCPDetailRequestStaticData.setPCpId(firstMemberFirstProduct.getPrimaryCareProviderId());
		getMemberPCPDetailRequestStaticData.setPrncSbscrbrId(firstMemberDynamicData.getPrincipleSubscriberId());
		getMemberPCPDetailRequestStaticData.setSrchEndDt(searchMemberRequestStaticData.getSearchEndDate());
		getMemberPCPDetailRequestStaticData.setSrchSrtDt(searchMemberRequestStaticData.getSearchStartDate());
		getMemberPCPDetailRequestStaticData.setSubgrpId(firstMemberFirstProduct.getSubgroupId());
		getMemberPCPDetailRequestStaticData.setSubscriberId(searchMemberRequestStaticData.getSubscriberId());
		return getMemberPCPDetailPayload;
	}
}
