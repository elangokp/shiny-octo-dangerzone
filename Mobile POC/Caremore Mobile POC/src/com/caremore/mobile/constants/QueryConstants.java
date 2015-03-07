package com.caremore.mobile.constants;

public class QueryConstants {

	public static String eligibilityQuery2 = "SELECT CMC_SBSB_SUBSC.SBSB_ID AS 'PolicyNumber', LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_LAST_NAME)) +' '+ LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_MID_INIT)) +' '+ LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_FIRST_NAME)) AS 'PolicyHolderName', CASE WHEN (CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND = 'Y' AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT >= GETDATE() AND CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT <= GETDATE()) THEN 'Active' ELSE 'Inactive' END AS 'PolicyStatus', CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT AS 'PolicyEffectiveDate', CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT AS 'PolicyTerminationDate', CMC_MEME_MEMBER.MEME_SFX AS 'Relationship', CMC_MEME_MEMBER.MEME_SEX AS 'Gender', CMC_MEME_MEMBER.MEME_BIRTH_DT AS 'DateofBirth', CMC_MEPR_PRIM_PROV.MEPR_PCP_TYPE AS 'PCPType', CMC_PRPR_PROV.PRPR_NPI + ' - ' + CMC_PRPR_PROV.PRPR_NAME AS 'PCP' FROM CMC_SBSB_SUBSC CMC_SBSB_SUBSC (NOLOCK) JOIN  CMC_MEME_MEMBER CMC_MEME_MEMBER(NOLOCK) ON CMC_SBSB_SUBSC.SBSB_CK = CMC_MEME_MEMBER.SBSB_CK JOIN CMC_MEPE_PRCS_ELIG CMC_MEPE_PRCS_ELIG (NOLOCK) ON CMC_MEME_MEMBER.MEME_CK = CMC_MEPE_PRCS_ELIG.MEME_CK LEFT OUTER JOIN CMC_MEPR_PRIM_PROV CMC_MEPR_PRIM_PROV (NOLOCK) ON CMC_MEPR_PRIM_PROV.MEME_CK = CMC_MEME_MEMBER.MEME_CK LEFT OUTER JOIN CMC_PRPR_PROV CMC_PRPR_PROV (NOLOCK) ON CMC_PRPR_PROV.PRPR_ID = CMC_MEPR_PRIM_PROV.PRPR_ID WHERE CMC_SBSB_SUBSC.SBSB_ID= ? AND CMC_MEME_MEMBER.MEME_SFX= ? AND ? BETWEEN CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT AND ? BETWEEN CMC_MEPR_PRIM_PROV.MEPR_EFF_DT AND CMC_MEPR_PRIM_PROV.MEPR_TERM_DT AND CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND='Y'";

	public static String eligibilityQuery = "SELECT CMC_SBSB_SUBSC.SBSB_ID AS 'PolicyNumber',LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_LAST_NAME)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_MID_INIT)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_FIRST_NAME)) AS 'PolicyHolderName',CASE WHEN (CMC_MEME_MEMBER.MEME_REL = 'M') THEN 'Subscriber' WHEN (CMC_MEME_MEMBER.MEME_REL = 'D') THEN 'Daughter' WHEN  (CMC_MEME_MEMBER.MEME_REL = 'H') THEN 'Husband'	WHEN (CMC_MEME_MEMBER.MEME_REL = 'S') THEN 'Son' WHEN (CMC_MEME_MEMBER.MEME_REL = 'W') THEN 'Wife' WHEN (CMC_MEME_MEMBER.MEME_REL = 'O') THEN 'Other Dependent' END AS 'Relationship' ,CASE WHEN (CMC_MEME_MEMBER.MEME_SEX = 'M') THEN 'Male' WHEN (CMC_MEME_MEMBER.MEME_SEX = 'F') THEN 'Female' END AS 'Gender'	,DATENAME(day, CMC_MEME_MEMBER.MEME_BIRTH_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEME_MEMBER.MEME_BIRTH_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEME_MEMBER.MEME_BIRTH_DT) AS 'DateofBirth' ,CMC_CSCS_CLASS.CSCS_DESC AS 'Class' ,CMC_CSPD_DESC.CSPD_CAT_DESC AS 'ProductCategoryDesc' ,CASE WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'A') THEN 'Family' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'B') THEN 'Subscriber and Spouse' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'C') THEN 'Subscriber Only' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'D') THEN 'Subscriber and Dependents' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'E') THEN 'Spouse and Dependents' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'F') THEN 'Spouse Only' WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'G') THEN 'Dependents Only' END AS 'CoveredMembers' ,CMC_PLDS_PLAN_DESC.PLDS_DESC AS 'PlanDesc' ,CMC_PDDS_PROD_DESC.PDDS_DESC AS 'ProductDesc' ,CMC_SGSG_SUB_GROUP.SGSG_NAME AS 'SubgroupName' ,CASE WHEN (CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND = 'Y' AND ? BETWEEN CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT) THEN 'Active' ELSE 'Inactive' END AS 'PolicyStatus' ,DATENAME(day, CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT) AS 'PolicyEffectiveDate' ,DATENAME(day, CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT) AS 'PolicyTerminationDate' FROM CMC_SBSB_SUBSC CMC_SBSB_SUBSC(NOLOCK) INNER JOIN CMC_MEME_MEMBER CMC_MEME_MEMBER(NOLOCK) ON CMC_SBSB_SUBSC.SBSB_CK = CMC_MEME_MEMBER.SBSB_CK INNER JOIN CMC_MEPE_PRCS_ELIG CMC_MEPE_PRCS_ELIG(NOLOCK) ON CMC_MEME_MEMBER.MEME_CK = CMC_MEPE_PRCS_ELIG.MEME_CK INNER JOIN CMC_PDDS_PROD_DESC CMC_PDDS_PROD_DESC(NOLOCK) ON CMC_MEPE_PRCS_ELIG.PDPD_ID = CMC_PDDS_PROD_DESC.PDPD_ID INNER JOIN CMC_CSPD_DESC CMC_CSPD_DESC(NOLOCK) ON CMC_MEPE_PRCS_ELIG.CSPD_CAT = CMC_CSPD_DESC.CSPD_CAT INNER JOIN CMC_PLDS_PLAN_DESC CMC_PLDS_PLAN_DESC(NOLOCK) ON CMC_PLDS_PLAN_DESC.CSPI_ID = CMC_MEPE_PRCS_ELIG.CSPI_ID INNER JOIN CMC_CSCS_CLASS CMC_CSCS_CLASS(NOLOCK) ON CMC_CSCS_CLASS.CSCS_ID = CMC_MEPE_PRCS_ELIG.CSCS_ID AND CMC_CSCS_CLASS.GRGR_CK = CMC_MEPE_PRCS_ELIG.GRGR_CK INNER JOIN CMC_SGSG_SUB_GROUP(NOLOCK) ON CMC_SGSG_SUB_GROUP.SGSG_CK = CMC_MEPE_PRCS_ELIG.SGSG_CK AND CMC_SGSG_SUB_GROUP.GRGR_CK = CMC_MEPE_PRCS_ELIG.GRGR_CK WHERE CMC_SBSB_SUBSC.SBSB_ID = ? AND ? BETWEEN CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT AND CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND = 'Y' AND CMC_MEPE_PRCS_ELIG.CSPD_CAT = ?";
	
	public static String relationshipsQuery = "select distinct CMC_MEME_MEMBER.MEME_REL AS 'RelationshipCode',CASE WHEN (CMC_MEME_MEMBER.MEME_REL = 'M') THEN 'Subscriber'	WHEN (CMC_MEME_MEMBER.MEME_REL = 'D') THEN 'Daughter' WHEN (CMC_MEME_MEMBER.MEME_REL = 'H') THEN 'Husband' WHEN (CMC_MEME_MEMBER.MEME_REL = 'S') THEN 'Son' WHEN (CMC_MEME_MEMBER.MEME_REL = 'W') THEN 'Wife' WHEN (CMC_MEME_MEMBER.MEME_REL = 'O') THEN 'Other Dependent' END AS 'RelationshipDesc' from CMC_MEME_MEMBER";
	
	public static String productCategoriesQuery = "select distinct CMC_MEPE_PRCS_ELIG.CSPD_CAT AS 'ProductCategoryCode',CMC_CSPD_DESC.CSPD_CAT_DESC AS 'ProductCategoryDesc' from CMC_MEPE_PRCS_ELIG INNER JOIN CMC_CSPD_DESC ON CMC_CSPD_DESC.CSPD_CAT = CMC_MEPE_PRCS_ELIG.CSPD_CAT";
	
	public static String memberClaimsQuery = "select CMC_CLCL_CLAIM.CLCL_ID as 'claimId' ,CASE WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 02) THEN 'Paid' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 01) THEN 'Pending Payment' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 15) THEN 'Pending' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 16) THEN 'Pending' ELSE CMC_CLCL_CLAIM.CLCL_CUR_STS	END AS 'status' ,CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT ,CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT from CMC_CLCL_CLAIM INNER JOIN CMC_SBSB_SUBSC ON CMC_CLCL_CLAIM.SBSB_CK = CMC_SBSB_SUBSC.SBSB_CK where CMC_SBSB_SUBSC.SBSB_ID = ? AND (CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT between ? and ? OR CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT between ? and ?)";
	
	public static String providerClaimsQuery = "select CMC_CLCL_CLAIM.CLCL_ID as 'claimId' ,CASE WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 02) THEN 'Paid' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 01) THEN 'Pending Payment' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 15) THEN 'Pending' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 16) THEN 'Pending' ELSE CMC_CLCL_CLAIM.CLCL_CUR_STS	END AS 'status' ,CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT ,CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT from CMC_CLCL_CLAIM INNER JOIN CMC_PRPR_PROV ON CMC_CLCL_CLAIM.PRPR_ID = CMC_PRPR_PROV.PRPR_ID where CMC_PRPR_PROV.PRPR_NPI = ? AND (CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT between ? and ? OR CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT between ? and ?)";
	
	public static String claimsQuery = "select CMC_CLCL_CLAIM.CLCL_ID as 'claimId' ,CASE WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 02) THEN 'Paid' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 01) THEN 'Pending Payment' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 15) THEN 'Pending' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 16) THEN 'Pending' ELSE CMC_CLCL_CLAIM.CLCL_CUR_STS	END AS 'status' ,CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT ,CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT from CMC_CLCL_CLAIM INNER JOIN CMC_SBSB_SUBSC ON CMC_CLCL_CLAIM.SBSB_CK = CMC_SBSB_SUBSC.SBSB_CK INNER JOIN CMC_PRPR_PROV ON CMC_CLCL_CLAIM.PRPR_ID = CMC_PRPR_PROV.PRPR_ID where CMC_PRPR_PROV.PRPR_NPI = ? AND CMC_SBSB_SUBSC.SBSB_ID = ? AND (CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT between ? and ? OR CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT between ? and ?)";
	
	public static String getClaimDetailsQuery = "select CMC_CLCL_CLAIM.CLCL_ID as 'claimId' ,CASE WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 02) THEN 'Paid' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 01) THEN 'Pending Payment' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 15) THEN 'Pended for Review' WHEN (CMC_CLCL_CLAIM.CLCL_CUR_STS = 16) THEN 'Pending' ELSE CMC_CLCL_CLAIM.CLCL_CUR_STS END AS 'status' ,DATENAME(day, CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT)), 0,4) +'-'+ DATENAME(year,CMC_CLCL_CLAIM.CLCL_LOW_SVC_DT) AS 'lowServiceDate' ,DATENAME(day, CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT)), 0,4) +'-'+ DATENAME(year,CMC_CLCL_CLAIM.CLCL_HIGH_SVC_DT) AS 'highServiceDate' ,DATENAME(day, CMC_CLCL_CLAIM.CLCL_PAID_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_CLCL_CLAIM.CLCL_PAID_DT)), 0,4) +'-'+ DATENAME(year,CMC_CLCL_CLAIM.CLCL_PAID_DT) AS 'paidDate' ,DATENAME(day, CMC_CLCL_CLAIM.CLCL_RECD_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_CLCL_CLAIM.CLCL_RECD_DT)), 0,4) +'-'+ DATENAME(year,CMC_CLCL_CLAIM.CLCL_RECD_DT) AS 'receivedDate' ,CMC_CLCL_CLAIM.CLCL_TOT_CHG as 'totalCharge' ,CMC_CLCL_CLAIM.CLCL_TOT_PAYABLE as 'totalPayable' ,CMC_CLCL_CLAIM.CLCL_PA_PAID_AMT as 'paidAmount' ,CMC_SBSB_SUBSC.SBSB_ID as 'policyNumber',LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_LAST_NAME)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_MID_INIT)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_FIRST_NAME)) AS 'PolicyHolderName' ,CASE WHEN (CMC_MEME_MEMBER.MEME_SEX = 'M') THEN 'Male' WHEN (CMC_MEME_MEMBER.MEME_SEX = 'F') THEN 'Female' END AS 'Gender' ,CMC_PRPR_PROV.PRPR_NAME as 'providerName' ,CMC_PRPR_PROV.PRPR_NPI as 'npi'from CMC_CLCL_CLAIM INNER JOIN CMC_SBSB_SUBSC ON CMC_SBSB_SUBSC.SBSB_CK = CMC_CLCL_CLAIM.SBSB_CK INNER JOIN CMC_MEME_MEMBER ON CMC_MEME_MEMBER.MEME_CK = CMC_CLCL_CLAIM.MEME_CK INNER JOIN CMC_PRPR_PROV ON CMC_PRPR_PROV.PRPR_ID = CMC_CLCL_CLAIM.CLCL_PAYEE_PR_ID where CMC_CLCL_CLAIM.CLCL_ID = ?";
}