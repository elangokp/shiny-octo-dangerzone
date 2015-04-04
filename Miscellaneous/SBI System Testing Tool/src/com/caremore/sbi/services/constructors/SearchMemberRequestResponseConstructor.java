package com.caremore.sbi.services.constructors;

import java.io.File;

import com.caremore.sbi.utils.JaxbUtils;

public class SearchMemberRequestResponseConstructor {

	public static com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad createSearchMemberRequestResponsePayload(File searchMemberRequestResponseFile) {
		com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad searchMemberPayload = null;
		searchMemberPayload = JaxbUtils.unmarshal(com.wellpoint.services.senior.member.schemas.memberinquiry.searchmember_v8_04.PayLoad.class, searchMemberRequestResponseFile);
		return searchMemberPayload;
	}
}
