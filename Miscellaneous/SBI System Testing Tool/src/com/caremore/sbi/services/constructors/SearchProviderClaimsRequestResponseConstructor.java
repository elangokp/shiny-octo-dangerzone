package com.caremore.sbi.services.constructors;

import java.io.File;
import java.util.List;

import com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSRequest;
import com.caremore.sbi.utils.JaxbUtils;

public class SearchProviderClaimsRequestResponseConstructor {

	public static com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad createSearchProviderClaimsRequestResponsePayload(File searchProviderClaimsRequestResponseFile) {
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsPayload = null;
		searchProviderClaimsPayload = JaxbUtils.unmarshal(com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad.class, searchProviderClaimsRequestResponseFile);
		return searchProviderClaimsPayload;
	}
	public static com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad createSearchProviderClaimsRequestPayload(
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberRequest,
			com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberResponse) {

		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.PayLoad searchProviderClaimsPayload = null;

		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSHeader searchMemberRequestHeaderData = searchMemberRequest.getEBSHeader();
		
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSRequest.SearchMemberRequest.StaticData searchMemberRequestStaticData = searchMemberRequest
				.getEBSRequest().getSearchMemberRequest().getStaticData();
		List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData> searchMemberResponseDynamicData = searchMemberResponse
				.getEBSResponse().getSearchMemberResponse().getDynamicData();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData firstMemberDynamicData = searchMemberResponseDynamicData
				.get(0);

		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.ObjectFactory provrClmsObjectFactory = new com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.ObjectFactory();
		
		searchProviderClaimsPayload = provrClmsObjectFactory.createPayLoad();
		searchProviderClaimsPayload.setEBSHeader(provrClmsObjectFactory
				.createEBSHeader());
		
		com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSHeader searchProviderClaimsEBSHeader = searchProviderClaimsPayload.getEBSHeader();
		
		
		
		
		searchProviderClaimsEBSHeader.setClientRowsPerPage(searchMemberRequestHeaderData.getClientRowsPerPage());
		searchProviderClaimsEBSHeader.setClientUserID(searchMemberRequestHeaderData.getClientUserID());
		searchProviderClaimsEBSHeader.setClientUserPassword(searchMemberRequestHeaderData.getClientUserPassword());
		searchProviderClaimsEBSHeader.setErrorRows(searchMemberRequestHeaderData.getErrorRows());
		searchProviderClaimsEBSHeader.setMoreData(searchMemberRequestHeaderData.getMoreData());
		searchProviderClaimsEBSHeader.setRequestRowLength(searchMemberRequestHeaderData.getRequestRowLength());
		searchProviderClaimsEBSHeader.setRequestRows(searchMemberRequestHeaderData.getRequestRows());
		searchProviderClaimsEBSHeader.setResponseDynamicRowLength(searchMemberRequestHeaderData.getResponseDynamicRowLength());
		searchProviderClaimsEBSHeader.setResponseDynamicRows(searchMemberRequestHeaderData.getResponseDynamicRows());
		searchProviderClaimsEBSHeader.setResponseStaticLength(searchMemberRequestHeaderData.getResponseStaticLength());
		searchProviderClaimsEBSHeader.setResponseStaticRows(searchMemberRequestHeaderData.getResponseStaticRows());
		searchProviderClaimsEBSHeader.setSbiAdditionalPageKeys(searchMemberRequestHeaderData.getSbiAdditionalPageKeys());
		searchProviderClaimsEBSHeader.setSecurityToken(searchMemberRequestHeaderData.getSecurityToken());
		searchProviderClaimsEBSHeader.setServiceDuration(searchMemberRequestHeaderData.getServiceDuration());
		
		
		
		
		searchProviderClaimsPayload.setEBSRequest(provrClmsObjectFactory.createEBSRequest());
	    searchProviderClaimsPayload.getEBSRequest().getSearchProvClmsRqst().add(provrClmsObjectFactory.createEBSRequestSearchProvClmsRqst());
	    com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSRequest.SearchProvClmsRqst firstSearchProvClmsRqstObj = searchProviderClaimsPayload.getEBSRequest().getSearchProvClmsRqst().get(0);
	    firstSearchProvClmsRqstObj.setProvider(provrClmsObjectFactory.createEBSRequestSearchProvClmsRqstProvider());
	    firstSearchProvClmsRqstObj.setPatient(provrClmsObjectFactory.createEBSRequestSearchProvClmsRqstPatient());  
	    firstSearchProvClmsRqstObj.getPatient().setName(provrClmsObjectFactory.createEBSRequestSearchProvClmsRqstPatientName());
	    firstSearchProvClmsRqstObj.setClaimNumber("Mapped to 276");
	    firstSearchProvClmsRqstObj.setClaimTypeCode("Mapped to 276");
	    firstSearchProvClmsRqstObj.setServiceStartDate("Mapped to 276");
	    firstSearchProvClmsRqstObj.setServiceEndDate("Mapped to 276");
	    firstSearchProvClmsRqstObj.setItsClmCd("Mapped to 276");
	    firstSearchProvClmsRqstObj.setRecordRetrievalTypeCode("Mapped to 276");
	        
	    
	    com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSRequest.SearchProvClmsRqst.Provider SearchProvClmsRqstProviderData = 
	    	 firstSearchProvClmsRqstObj.getProvider();
	    SearchProvClmsRqstProviderData.setNpiNumber("Mapped to 276");
	    SearchProvClmsRqstProviderData.setProviderOrganizationId("Mapped to 276");
	    SearchProvClmsRqstProviderData.setTaxId("Mapped to 276");
	    
	    
	    com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSRequest.SearchProvClmsRqst.Patient SearchProvClmsRqstPatientData =
	    firstSearchProvClmsRqstObj.getPatient();
	    SearchProvClmsRqstPatientData.setHealthCardID(firstMemberDynamicData.getHealthCardId());
	    SearchProvClmsRqstPatientData.setMemberSequenceNumber(firstMemberDynamicData.getMbrSqncNum());
	    SearchProvClmsRqstPatientData.setBirthDate(firstMemberDynamicData.getMember().getBirthDate());
	    SearchProvClmsRqstPatientData.setMemberRelationshipCode(firstMemberDynamicData.getMemberRelationshipCode());
	    
	    List<com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products> firstMemberProducts = firstMemberDynamicData
		.getProducts();
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.EBSResponse.SearchMemberResponse.DynamicData.Products firstMemberFirstProduct = firstMemberProducts
		.get(0);
	    SearchProvClmsRqstPatientData.setAlphaPrefixCode(firstMemberFirstProduct.getAlphaPrefixCode());
	    
	    
	    com.wellpoint.services.senior.provider.schemas.providerclaimsinquiry.searchproviderclaims_v200.EBSRequest.SearchProvClmsRqst.Patient.Name SrchProvClmsRqstPatientName =
	    firstSearchProvClmsRqstObj.getPatient().getName();
	    
	    SrchProvClmsRqstPatientName.setFirstName(firstMemberDynamicData.getMember().getFirstName());
	    SrchProvClmsRqstPatientName.setMiddleName(firstMemberDynamicData.getMember().getMiddleName());
	    SrchProvClmsRqstPatientName.setLastName(firstMemberDynamicData.getMember().getLastName());
	    
	    
		
	    
	    
		
		
		
		
		
		
		
		
		
		
		return searchProviderClaimsPayload;
	}
}


