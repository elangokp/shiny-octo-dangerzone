package com.caremore.sbi.executors;

import java.io.File;

import com.caremore.sbi.services.constructors.Get27XBenefitAccumsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetLimLiabCoordofBenefitsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetMemberClaimDetailsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetMemberPCPDetailRequestResponseConstructor;
import com.caremore.sbi.services.constructors.SearchProviderClaimsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.SearchMemberRequestResponseConstructor;
import com.caremore.sbi.utils.JaxbUtils;

public class CreateRequests {
	
	public static void main(String args[]) {
		String searchMemberRequestXmlFilePath = args[0];
		String searchMemberResponseXmlFilePath = args[1];
		String generatedRequestsFolderPath = args[2];
		
		File searchMemberRequestXmlFile = new File(searchMemberRequestXmlFilePath);
		File searchMemberResponseXmlFile = new File(searchMemberResponseXmlFilePath);
		File generatedRequestsFolder = new File(generatedRequestsFolderPath);
		
		generatedRequestsFolder.mkdirs();
		
		File getLimLiabCoordOfBenefitsXmlFile = new File(generatedRequestsFolderPath+"/GetLimLiabCoordOfBenefits-Request.xml");
		File getMemberPCPDetailXmlFile = new File(generatedRequestsFolderPath+"/GetMemberPCPDetail-Request.xml");
		File get27XBenefitAccumsXmlFile = new File(generatedRequestsFolderPath+"/Get27XBenefitAccums-Request.xml");
		File searchProviderClaimsXmlFile = new File(generatedRequestsFolderPath+"/SearchProviderClaims-Request.xml");
		
		
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequestPayload = SearchMemberRequestResponseConstructor.createSearchMemberRequestResponsePayload(searchMemberRequestXmlFile);
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponsePayload = SearchMemberRequestResponseConstructor.createSearchMemberRequestResponsePayload(searchMemberResponseXmlFile);
		
		
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfBenefitsPayload = GetLimLiabCoordofBenefitsRequestResponseConstructor.createGetLimLiabCoordofBenefitsRequestPayload(searchMemberRequestPayload, searchMemberResponsePayload);
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailPayload = GetMemberPCPDetailRequestResponseConstructor.createGetMemberPCPDetailRequestPayload(searchMemberRequestPayload, searchMemberResponsePayload);
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad get27XBenefitAccumsPayload = Get27XBenefitAccumsRequestResponseConstructor.createGet27XBenefitAccumsRequestPayload(searchMemberRequestPayload, searchMemberResponsePayload);
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsPayload = SearchProviderClaimsRequestResponseConstructor.createSearchProviderClaimsRequestPayload(searchMemberRequestPayload, searchMemberResponsePayload);
		
		
		JaxbUtils.marshall(getLimLiabCoordOfBenefitsPayload, getLimLiabCoordOfBenefitsXmlFile);
		JaxbUtils.marshall(getMemberPCPDetailPayload, getMemberPCPDetailXmlFile);
		JaxbUtils.marshall(get27XBenefitAccumsPayload, get27XBenefitAccumsXmlFile);
		JaxbUtils.marshall(searchProviderClaimsPayload, searchProviderClaimsXmlFile);
		
		
		if(args.length>3) {
			String searchProvClaimDetailRespnsPath = args[3];
			File searchProvClmDetailResponsXMLFile = new File(searchProvClaimDetailRespnsPath);
			File getMemberClaimDetailsXmlFile = new File(generatedRequestsFolderPath+"/GetMemberClaimDetails-Request.xml");
			com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad srchProvClmDetailResponsePayload = SearchProviderClaimsRequestResponseConstructor.createSearchProviderClaimsRequestResponsePayload(searchProvClmDetailResponsXMLFile);
			com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad getMemberClaimDetailPayLoad = GetMemberClaimDetailsRequestResponseConstructor.createGetMemberClaimDetailsRequestPayload(searchMemberRequestPayload, searchMemberResponsePayload, srchProvClmDetailResponsePayload);
			JaxbUtils.marshall(getMemberClaimDetailPayLoad, getMemberClaimDetailsXmlFile);
		}
		
	}

}
