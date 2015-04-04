package com.caremore.sbi.services.constructors;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest;
import com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp;
import com.caremore.sbi.utils.JaxbUtils;

public class GetMemberClaimDetailsRequestResponseConstructor {

	public static com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad createGetMemberClaimDetailsRequestResponsePayload(File getMemberClaimDetailsRequestResponseFile) {
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad getMemberClaimDetailsPayload = null;
		getMemberClaimDetailsPayload = JaxbUtils.unmarshal(com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad.class, getMemberClaimDetailsRequestResponseFile);
		return getMemberClaimDetailsPayload;
	}
	public static com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad createGetMemberClaimDetailsRequestPayload(
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest,
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse,
			com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsResponse) {

		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.PayLoad getMemberClaimsPayload = null;

		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSHeader searchMemberRequestHeaderData = searchMemberRequest.getEBSHeader();
		
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData> searchMemberResponseDynamicData = searchMemberResponse
		.getEBSResponse().getSearchMemberResponse().getDynamicData();
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData firstMemberDynamicData = searchMemberResponseDynamicData
		.get(0);
		
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products> firstMemberProducts = firstMemberDynamicData
		.getProducts();
		/*com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSRequest.SearchMemberRequest.StaticData searchMemberRequestStaticData = searchMemberRequest
				.getEBSRequest().getSearchMemberRequest().getStaticData();
		
		
		k*/
		List<com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp> searchProvClmsResponseList = searchProviderClaimsResponse.getEBSResponse().getSearchProvClmsResp();
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp firstsearchProvClmsResponse = searchProvClmsResponseList.get(0);
		List<com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp.ClaimList.Claim> SearchProvClmsResponseClaimList = firstsearchProvClmsResponse.getClaimList().getClaim();
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSResponse.SearchProvClmsResp.ClaimList.Claim firstSearchProvClmsResponseFirstClaim = SearchProvClmsResponseClaimList.get(0);
		

		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.ObjectFactory MbrClmDetailsObjectFactory = new com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.ObjectFactory();
		
		getMemberClaimsPayload = MbrClmDetailsObjectFactory.createPayLoad();
		getMemberClaimsPayload.setEBSHeader(MbrClmDetailsObjectFactory
				.createEBSHeader());
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSHeader getMbrClmDetailsEBSHeader = getMemberClaimsPayload.getEBSHeader();
		
		getMbrClmDetailsEBSHeader.setClientRowsPerPage(searchMemberRequestHeaderData.getClientRowsPerPage());
		getMbrClmDetailsEBSHeader.setClientUserID(searchMemberRequestHeaderData.getClientUserID());
		getMbrClmDetailsEBSHeader.setClientUserPassword(searchMemberRequestHeaderData.getClientUserPassword());
		getMbrClmDetailsEBSHeader.setErrorRows(searchMemberRequestHeaderData.getErrorRows());
		getMbrClmDetailsEBSHeader.setMoreData(searchMemberRequestHeaderData.getMoreData());
		getMbrClmDetailsEBSHeader.setRequestRowLength(searchMemberRequestHeaderData.getRequestRowLength());
		getMbrClmDetailsEBSHeader.setRequestRows(searchMemberRequestHeaderData.getRequestRows());
		getMbrClmDetailsEBSHeader.setResponseDynamicRowLength(searchMemberRequestHeaderData.getResponseDynamicRowLength());
		getMbrClmDetailsEBSHeader.setResponseDynamicRows(searchMemberRequestHeaderData.getResponseDynamicRows());
		getMbrClmDetailsEBSHeader.setResponseStaticLength(searchMemberRequestHeaderData.getResponseStaticLength());
		getMbrClmDetailsEBSHeader.setResponseStaticRows(searchMemberRequestHeaderData.getResponseStaticRows());
		getMbrClmDetailsEBSHeader.setSbiAdditionalPageKeys(searchMemberRequestHeaderData.getSbiAdditionalPageKeys());
		getMbrClmDetailsEBSHeader.setSecurityToken(searchMemberRequestHeaderData.getSecurityToken());
		getMbrClmDetailsEBSHeader.setServiceDuration(searchMemberRequestHeaderData.getServiceDuration());
		
		
		getMemberClaimsPayload.setEBSRequest(MbrClmDetailsObjectFactory.createEBSRequest());

		getMemberClaimsPayload.getEBSRequest().setGetMemberClaimsDetailRqst(MbrClmDetailsObjectFactory.createEBSRequestGetMemberClaimsDetailRqst());
		
		getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().add(MbrClmDetailsObjectFactory.createEBSRequestGetMemberClaimsDetailRqstClaim());
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim firstMbrClaim = 
			getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0);
		
		firstMbrClaim.setExtensionList(MbrClmDetailsObjectFactory.createEBSRequestGetMemberClaimsDetailRqstClaimExtensionList());
		
		firstMbrClaim.setMemberLookupId(firstSearchProvClmsResponseFirstClaim.getMember().getHealthCardId());
		firstMbrClaim.setClaimNumber(firstSearchProvClmsResponseFirstClaim.getClaimNumber());
		firstMbrClaim.setClaimSequenceNbr(firstSearchProvClmsResponseFirstClaim.getClmSequenceNbr());
		
		List<EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension> firstMbrClaimExtensionList = firstMbrClaim.getExtensionList().getExtension();
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension patientFirstNameExtension = new com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension();
		patientFirstNameExtension.setExtensionName("PatientFirstName");
		patientFirstNameExtension.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getName().getFirstName());
		firstMbrClaimExtensionList.add(patientFirstNameExtension);
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension patientLastNameExtension = new com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension();
		patientLastNameExtension.setExtensionName("PatientLastName");
		patientLastNameExtension.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getName().getLastName());
		firstMbrClaimExtensionList.add(patientLastNameExtension);
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension patientDOBExtension = new com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension();
		patientDOBExtension.setExtensionName("PatientDOB");
		patientDOBExtension.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getBirthDate());
		firstMbrClaimExtensionList.add(patientDOBExtension);
		
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension patientAlphaPrefixCodeExtension = new com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension();
		patientAlphaPrefixCodeExtension.setExtensionName("AlphaPrfxCd");
		if(null != firstSearchProvClmsResponseFirstClaim.getMember().getAlphaPrefixCode() && !firstSearchProvClmsResponseFirstClaim.getMember().getAlphaPrefixCode().trim().isEmpty()) {
			patientAlphaPrefixCodeExtension.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getAlphaPrefixCode());
		} else {
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products firstMemberProductWithLatestTerminationDate = null;
			for(com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products afirstMemberProduct:firstMemberProducts) {
				try {
					Date thisTerminationDate = new SimpleDateFormat("yyyymmdd", Locale.ENGLISH).parse(afirstMemberProduct.getMemberProductEligibilityTerminationDate());
					if(null != firstMemberProductWithLatestTerminationDate) {
						Date latestTerminationDate = new SimpleDateFormat("yyyymmdd", Locale.ENGLISH).parse(firstMemberProductWithLatestTerminationDate.getMemberProductEligibilityTerminationDate());
						if(latestTerminationDate.after(thisTerminationDate)) {
							firstMemberProductWithLatestTerminationDate = afirstMemberProduct;
						}
					} else {
						firstMemberProductWithLatestTerminationDate = afirstMemberProduct;
					}
				} catch (ParseException e) {
					e.printStackTrace();
				} 
			}
			patientAlphaPrefixCodeExtension.setExtensionValue(firstMemberProductWithLatestTerminationDate.getAlphaPrefixCode());
		}
		
		if(null!= patientAlphaPrefixCodeExtension.getExtensionValue() && patientAlphaPrefixCodeExtension.getExtensionValue().trim().isEmpty()) {
			patientAlphaPrefixCodeExtension.setExtensionValue("Mapped from 276 if possible, else empty this");
		}
		
		firstMbrClaimExtensionList.add(patientAlphaPrefixCodeExtension);
		
		/*
		if(null!=firstmbrClaim)
		{
		  List<com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension> mbrClaimExtnList = 
	      getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0).getExtensionList().getExtension();
	
		if(0< mbrClaimExtnList.size())
		{
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension firstMbrClaimExtn = 
		getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0).getExtensionList().getExtension().get(0);
		
		firstMbrClaimExtn.setExtensionName("Patient First Name");
		firstMbrClaimExtn.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getName().getFirstName());
		}
		
		if(mbrClaimExtnList.size()>0)
		{
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension secondMbrClaimExtn = 
			getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0).getExtensionList().getExtension().get(1);
		secondMbrClaimExtn.setExtensionName("Patient Last Name");
		secondMbrClaimExtn.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getName().getLastName());
		}
		 if(mbrClaimExtnList.size()>1)
		 {	 
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension thirdMbrClaimExtn = 
			getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0).getExtensionList().getExtension().get(2);
		thirdMbrClaimExtn.setExtensionName("DateOfBirth");
		thirdMbrClaimExtn.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getBirthDate());
		 }
		if(mbrClaimExtnList.size()>2)
		{	
		com.wellpoint.services.senior.claims.schemas.claimsinquiry.getmemberclaimdetail_v2_03.EBSRequest.GetMemberClaimsDetailRqst.Claim.ExtensionList.Extension fourthMbrClaimExtn = 
			getMemberClaimsPayload.getEBSRequest().getGetMemberClaimsDetailRqst().getClaim().get(0).getExtensionList().getExtension().get(3);
		fourthMbrClaimExtn.setExtensionName("AlphaPrefixCode");
		fourthMbrClaimExtn.setExtensionValue(firstSearchProvClmsResponseFirstClaim.getMember().getAlphaPrefixCode());
		}		
	  }*/
		return getMemberClaimsPayload;
	}
}










