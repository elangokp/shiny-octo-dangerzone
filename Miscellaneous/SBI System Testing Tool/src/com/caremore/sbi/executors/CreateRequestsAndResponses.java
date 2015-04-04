package com.caremore.sbi.executors;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import com.aw.ad.util.InstallCert;
import com.caremore.sbi.services.constructors.Get27XBenefitAccumsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetLimLiabCoordofBenefitsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetMemberClaimDetailsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.GetMemberPCPDetailRequestResponseConstructor;
import com.caremore.sbi.services.constructors.SearchProviderClaimsRequestResponseConstructor;
import com.caremore.sbi.services.constructors.SearchMemberRequestResponseConstructor;
import com.caremore.sbi.utils.JaxbUtils;
import com.wellpoint.services.senior.claims.wsdl.claimsinquiry_v1.ClaimsInquiryV10;
import com.wellpoint.services.senior.claims.wsdl.claimsinquiry_v1.ClaimsInquiryV10_Service;
import com.wellpoint.services.senior.member.wsdl.memberinquiry_v1.MemberInquiryV10;
import com.wellpoint.services.senior.member.wsdl.memberinquiry_v1.MemberInquiryV10_Service;
import com.wellpoint.services.senior.member.wsdl.membermanagement_v1.MemberManagementV10;
import com.wellpoint.services.senior.member.wsdl.membermanagement_v1.MemberManagementV10_Service;
import com.wellpoint.services.senior.product.wsdl.benefitsinquiry_v1.BenefitsInquiryV10;
import com.wellpoint.services.senior.product.wsdl.benefitsinquiry_v1.BenefitsInquiryV10_Service;
import com.wellpoint.services.senior.provider.wsdl.providerclaimsinquiry_v1.ProviderClaimsInquiryV10;
import com.wellpoint.services.senior.provider.wsdl.providerclaimsinquiry_v1.ProviderClaimsInquiryV10_Service;

public class CreateRequestsAndResponses {
	
	public static void main(String args[]) {
		String searchMemberRequestXmlFilePath = args[0];
		String generatedRequestsFolderPath = args[1];
		
		File searchMemberRequestXmlFile = new File(searchMemberRequestXmlFilePath);
		File generatedRequestsFolder = new File(generatedRequestsFolderPath);
		
		generatedRequestsFolder.mkdirs();
		
		URL memberInquiryWsdlLocation = null;
		URL memberManagementWsdlLocation = null;
		URL claimsInquiryWsdlLocation = null;
		URL providerClaimsInquiryWsdlLocation = null;
		URL benefitsInquiryWsdlLocation = null;
		
		/*try {
			InstallCert.installAllCerts("facdevwasp001.caremore.com:9453", null);
		} catch (Exception e1) {
			e1.printStackTrace();
		}*/

		try {
			memberInquiryWsdlLocation = new URL("https://facdevwasp001.caremore.com:9453/senior/member/wsdl/MemberInquiry-v1_0/MemberInquiryV10.wsdl");
			memberManagementWsdlLocation = new URL("https://facdevwasp001.caremore.com:9453/senior/member/wsdl/MemberManagement-v1_0/MemberManagementV10.wsdl");
			claimsInquiryWsdlLocation = new URL("https://facdevwasp001.caremore.com:9453/senior/claims/wsdl/ClaimsInquiry-v1_0/ClaimsInquiryV10.wsdl");
			providerClaimsInquiryWsdlLocation = new URL("https://facdevwasp001.caremore.com:9453/senior/provider/wsdl/ProviderClaimsInquiry-v1_0/ProviderClaimsInquiryV10.wsdl");
			//benefitsInquiryWsdlLocation = new URL("https://facdevwasp001.caremore.com:9453/senior/product/wsdl/BenefitsInquiry-v1_0/BenefitsInquiryV10.wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		MemberInquiryV10_Service memberInquiryServiceLocator = new MemberInquiryV10_Service(memberInquiryWsdlLocation);
		MemberManagementV10_Service memberManagementServiceLocator = new MemberManagementV10_Service(memberManagementWsdlLocation);
		ClaimsInquiryV10_Service claimsInquiryServiceLocator = new ClaimsInquiryV10_Service(claimsInquiryWsdlLocation);
		ProviderClaimsInquiryV10_Service providerClaimsInquiryServiceLocator = new ProviderClaimsInquiryV10_Service(providerClaimsInquiryWsdlLocation);
		//BenefitsInquiryV10_Service benefitsInquiryServiceLocator = new BenefitsInquiryV10_Service(benefitsInquiryWsdlLocation);
		
		MemberInquiryV10 memberInquiryV10Proxy = memberInquiryServiceLocator.getMemberInquiryImpl();
		MemberManagementV10 memberManagementV10Proxy = memberManagementServiceLocator.getMemberManagementImpl();
		ClaimsInquiryV10 claimsInquiryV10Proxy = claimsInquiryServiceLocator.getClaimsInquiryImpl();
		ProviderClaimsInquiryV10 providerClaimsInquiryV10Proxy = providerClaimsInquiryServiceLocator.getProviderClaimsInquiryV10Impl();
		//BenefitsInquiryV10 benefitsInquiryV10Proxy = benefitsInquiryServiceLocator.getBenefitsInquiryv10Impl();
		
		
		
		
		File getLimLiabCoordOfNonCCBBenefitsRequestXmlFile = new File(generatedRequestsFolderPath+"/getLimLiabCoordOfNonCCBBenefits-Request.xml");
		File getMemberPCPDetailRequestXmlFile = new File(generatedRequestsFolderPath+"/GetMemberPCPDetail-Request.xml");
		File get27XBenefitAccumsRequestXmlFile = new File(generatedRequestsFolderPath+"/Get27XBenefitAccums-Request.xml");
		File searchProviderClaimsRequestXmlFile = new File(generatedRequestsFolderPath+"/SearchProviderClaims-Request.xml");
		File getMemberClaimDetailsRequestXmlFile = new File(generatedRequestsFolderPath+"/GetMemberClaimDetails-Request.xml");
		
		File searchMemberResponseXmlFile = new File(generatedRequestsFolderPath+"/searchMember-Response.xml");
		File getLimLiabCoordOfNonCCBBenefitsResponseXmlFile = new File(generatedRequestsFolderPath+"/getLimLiabCoordOfNonCCBBenefits-Response.xml");
		File getMemberPCPDetailResponseXmlFile = new File(generatedRequestsFolderPath+"/GetMemberPCPDetail-Response.xml");
		File get27XBenefitAccumsResponseXmlFile = new File(generatedRequestsFolderPath+"/Get27XBenefitAccums-Response.xml");
		File searchProviderClaimsResponseXmlFile = new File(generatedRequestsFolderPath+"/SearchProviderClaims-Response.xml");
		File getMemberClaimDetailsResponseXmlFile = new File(generatedRequestsFolderPath+"/GetMemberClaimDetails-Response.xml");
		
		
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest = SearchMemberRequestResponseConstructor.createSearchMemberRequestResponsePayload(searchMemberRequestXmlFile);
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse = memberInquiryV10Proxy.searchMember(searchMemberRequest);
		JaxbUtils.marshall(searchMemberResponse, searchMemberResponseXmlFile);
				
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfNonCCBBenefitsRequest = GetLimLiabCoordofBenefitsRequestResponseConstructor.createGetLimLiabCoordofBenefitsRequestPayload(searchMemberRequest, searchMemberResponse);
		JaxbUtils.marshall(getLimLiabCoordOfNonCCBBenefitsRequest, getLimLiabCoordOfNonCCBBenefitsRequestXmlFile);
		com.wellpoint.services.senior.member.schemas.memberinquiry.getlimliabcoordofbenefits_nonccb_v7_02.PayLoad getLimLiabCoordOfNonCCBBenefitsResponse = memberInquiryV10Proxy.getLimLiabCoordOfNonCCBBenefits(getLimLiabCoordOfNonCCBBenefitsRequest);
		JaxbUtils.marshall(getLimLiabCoordOfNonCCBBenefitsResponse, getLimLiabCoordOfNonCCBBenefitsResponseXmlFile);
		
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailRequest = GetMemberPCPDetailRequestResponseConstructor.createGetMemberPCPDetailRequestPayload(searchMemberRequest, searchMemberResponse);
		JaxbUtils.marshall(getMemberPCPDetailRequest, getMemberPCPDetailRequestXmlFile);
		com.wellpoint.services.senior.member.schemas.membermanagement.getmemberpcpdetail_v8_03.PayLoad getMemberPCPDetailResponse = memberManagementV10Proxy.getMemberPCPDetails(getMemberPCPDetailRequest);
		JaxbUtils.marshall(getMemberPCPDetailResponse, getMemberPCPDetailResponseXmlFile);
		
		com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad get27XBenefitAccumsRequest = Get27XBenefitAccumsRequestResponseConstructor.createGet27XBenefitAccumsRequestPayload(searchMemberRequest, searchMemberResponse);
		JaxbUtils.marshall(get27XBenefitAccumsRequest, get27XBenefitAccumsRequestXmlFile);
		//com.wellpoint.services.senior.product.schemas.benefitsinquiry.get27xbenefitaccums_v3_0.PayLoad get27XBenefitAccumsResponse = benefitsInquiryV10Proxy.get27XBenefitAccums(get27XBenefitAccumsRequest);
		//JaxbUtils.marshall(get27XBenefitAccumsResponse, get27XBenefitAccumsResponseXmlFile);
		
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsRequest = SearchProviderClaimsRequestResponseConstructor.createSearchProviderClaimsRequestPayload(searchMemberRequest, searchMemberResponse);
		JaxbUtils.marshall(searchProviderClaimsRequest, searchProviderClaimsRequestXmlFile);
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsResponse = providerClaimsInquiryV10Proxy.searchProviderClaims(searchProviderClaimsRequest);
		JaxbUtils.marshall(searchProviderClaimsResponse, searchProviderClaimsResponseXmlFile);
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad getMemberClaimsDetailRequest = GetMemberClaimDetailsRequestResponseConstructor.createGetMemberClaimDetailsRequestPayload(searchMemberRequest, searchMemberResponse, searchProviderClaimsResponse);
		JaxbUtils.marshall(getMemberClaimsDetailRequest, getMemberClaimDetailsRequestXmlFile);
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad getMemberClaimsDetailResponse = claimsInquiryV10Proxy.getMemberClaimDetail(getMemberClaimsDetailRequest);
		JaxbUtils.marshall(getMemberClaimsDetailResponse, getMemberClaimDetailsResponseXmlFile);
		
	}

}
