package com.caremore.sbi.services.constructors;

import java.io.File;
import java.util.List;

import com.caremore.sbi.utils.JaxbUtils;

public class Get27XBenefitAccumsRequestResponseConstructor {

	public static com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad createGet27XBenefitAccumsRequestResponsePayload(
			File get27XBenefitAccumsRequestResponseFile) {
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad get27XBenefitAccumsPayload = null;
		get27XBenefitAccumsPayload = JaxbUtils
				.unmarshal(
						com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad.class,
						get27XBenefitAccumsRequestResponseFile);
		return get27XBenefitAccumsPayload;
	}
	
	public static com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad createGet27XBenefitAccumsRequestPayload(
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest,
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse) {

		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad get27XBenefitAccumsPayload = null;
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSHeader searchMemberRequestHeaderData = searchMemberRequest.getEBSHeader();

		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSRequest.SearchMemberRequest.StaticData searchMemberRequestStaticData = searchMemberRequest
				.getEBSRequest().getSearchMemberRequest().getStaticData();
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData> searchMemberResponseDynamicData = searchMemberResponse
				.getEBSResponse().getSearchMemberResponse().getDynamicData();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData firstMemberDynamicData = searchMemberResponseDynamicData
				.get(0);
	
		// TO BE IMPLEMENTED
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.ObjectFactory BenefitAccumsFactory = new com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.ObjectFactory();
		get27XBenefitAccumsPayload = BenefitAccumsFactory.createPayLoad();
		
		get27XBenefitAccumsPayload.setEBSHeader(BenefitAccumsFactory
				.createEBSHeader());
		
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.EBSHeader get27XBenefitAccumsEBSHeader = get27XBenefitAccumsPayload.getEBSHeader();
		
		get27XBenefitAccumsEBSHeader.setClientRowsPerPage(searchMemberRequestHeaderData.getClientRowsPerPage());
		get27XBenefitAccumsEBSHeader.setClientUserID(searchMemberRequestHeaderData.getClientUserID());
		get27XBenefitAccumsEBSHeader.setClientUserPassword(searchMemberRequestHeaderData.getClientUserPassword());
		get27XBenefitAccumsEBSHeader.setErrorRows(searchMemberRequestHeaderData.getErrorRows());
		get27XBenefitAccumsEBSHeader.setMoreData(searchMemberRequestHeaderData.getMoreData());
		get27XBenefitAccumsEBSHeader.setRequestRowLength(searchMemberRequestHeaderData.getRequestRowLength());
		get27XBenefitAccumsEBSHeader.setRequestRows(searchMemberRequestHeaderData.getRequestRows());
		get27XBenefitAccumsEBSHeader.setResponseDynamicRowLength(searchMemberRequestHeaderData.getResponseDynamicRowLength());
		get27XBenefitAccumsEBSHeader.setResponseDynamicRows(searchMemberRequestHeaderData.getResponseDynamicRows());
		get27XBenefitAccumsEBSHeader.setResponseStaticLength(searchMemberRequestHeaderData.getResponseStaticLength());
		get27XBenefitAccumsEBSHeader.setResponseStaticRows(searchMemberRequestHeaderData.getResponseStaticRows());
		get27XBenefitAccumsEBSHeader.setSbiAdditionalPageKeys(searchMemberRequestHeaderData.getSbiAdditionalPageKeys());
		get27XBenefitAccumsEBSHeader.setSecurityToken(searchMemberRequestHeaderData.getSecurityToken());
		get27XBenefitAccumsEBSHeader.setServiceDuration(searchMemberRequestHeaderData.getServiceDuration());
		
		get27XBenefitAccumsPayload.setEBSRequest(BenefitAccumsFactory
				.createEBSRequest());
		get27XBenefitAccumsPayload
				.getEBSRequest()
				.setGet27XBenefitAccumsRequest(BenefitAccumsFactory
						.createEBSRequestGet27XBenefitAccumsRequest());
						
		get27XBenefitAccumsPayload
				.getEBSRequest()
				.getGet27XBenefitAccumsRequest()
				.setStaticData(
						BenefitAccumsFactory
								.createEBSRequestGet27XBenefitAccumsRequestStaticData());
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.EBSRequest.Get27XBenefitAccumsRequest.StaticData getBenefitAccumsRequestStaticData = get27XBenefitAccumsPayload
				.getEBSRequest().getGet27XBenefitAccumsRequest()
				.getStaticData();
        getBenefitAccumsRequestStaticData.setBcbsaControlPlanId(firstMemberDynamicData.getBcbsaControlPlanId());
        getBenefitAccumsRequestStaticData.setBenefitServiceCategoryTypeCode("to be set from 270x12");
        getBenefitAccumsRequestStaticData.setBirthDate(firstMemberDynamicData.getMember().getBirthDate());
        List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products> firstMemberProducts = firstMemberDynamicData
		.getProducts();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products firstMemberFirstProduct = firstMemberProducts
		.get(0);
		getBenefitAccumsRequestStaticData.setEffectiveDate(firstMemberFirstProduct.getMemberProductEligibilityEffectiveDate());
		getBenefitAccumsRequestStaticData.setEnrollmentTypeCode(firstMemberFirstProduct.getEnrollmentTypeCode());
		getBenefitAccumsRequestStaticData.setFirstName(firstMemberDynamicData.getMember().getFirstName());
		getBenefitAccumsRequestStaticData.setGroupId(firstMemberDynamicData.getGroupId());
		getBenefitAccumsRequestStaticData.setLastName(firstMemberDynamicData.getMember().getLastName());
		getBenefitAccumsRequestStaticData.setMemberLookupId(firstMemberDynamicData.getMemberLookupID());
		getBenefitAccumsRequestStaticData.setMemberSequenceNumber(firstMemberDynamicData.getMbrSqncNum());
		getBenefitAccumsRequestStaticData.setPrincipalSubscriberIdentifier(firstMemberDynamicData.getPrincipleSubscriberId());
		getBenefitAccumsRequestStaticData.setProductBenefitCode("mapping needs to be done");
		getBenefitAccumsRequestStaticData.setProductIdentifier(firstMemberFirstProduct.getProductIdentifier());
		getBenefitAccumsRequestStaticData.setSearchEndDate(searchMemberRequestStaticData.getSearchEndDate());
		getBenefitAccumsRequestStaticData.setSearchStartDate(searchMemberRequestStaticData.getSearchStartDate());
		getBenefitAccumsRequestStaticData.setSourceSystemIdentifier(firstMemberDynamicData.getSourceSystemIdentifier());
		getBenefitAccumsRequestStaticData.setSpouseDependentCode(firstMemberDynamicData.getSpouseDependentCode());
		getBenefitAccumsRequestStaticData.setSubgroupId(firstMemberFirstProduct.getSubgroupId());
		getBenefitAccumsRequestStaticData.setSubscriberId(firstMemberDynamicData.getSubscriberId());
		getBenefitAccumsRequestStaticData.setTerminationDate(firstMemberFirstProduct.getMemberProductEligibilityTerminationDate());
		return get27XBenefitAccumsPayload;
	}
}
