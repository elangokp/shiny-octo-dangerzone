SELECT CMC_SBSB_SUBSC.SBSB_ID AS 'PolicyNumber'
	,LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_LAST_NAME)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_MID_INIT)) + ' ' + LTRIM(RTRIM(CMC_MEME_MEMBER.MEME_FIRST_NAME)) AS 'PolicyHolderName'
	,CASE 
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'M') THEN 'Subscriber'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'D') THEN 'Daughter'		
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'H') THEN 'Husband'	
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'S') THEN 'Son'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'W') THEN 'Wife'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'O') THEN 'Other Dependent'				
		END AS 'Relationship'
	,CASE 
		WHEN (CMC_MEME_MEMBER.MEME_SEX = 'M') THEN 'Male'
		WHEN (CMC_MEME_MEMBER.MEME_SEX = 'F') THEN 'Female'
		END AS 'Gender'
	,DATENAME(day, CMC_MEME_MEMBER.MEME_BIRTH_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEME_MEMBER.MEME_BIRTH_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEME_MEMBER.MEME_BIRTH_DT) AS 'DateofBirth'
	,CMC_CSCS_CLASS.CSCS_DESC AS 'Class'
	,CMC_CSPD_DESC.CSPD_CAT_DESC AS 'ProductCategoryDesc'
	,CASE 
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'A') THEN 'Family'
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'B') THEN 'Subscriber and Spouse'		
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'C') THEN 'Subscriber Only'	
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'D') THEN 'Subscriber and Dependents'
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'E') THEN 'Spouse and Dependents'
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'F') THEN 'Spouse Only'				
		WHEN (CMC_MEPE_PRCS_ELIG.MEPE_FI = 'G') THEN 'Dependents Only'
		END AS 'CoveredMembers'
	,CMC_PLDS_PLAN_DESC.PLDS_DESC AS 'PlanDesc'
	,CMC_PDDS_PROD_DESC.PDDS_DESC AS 'ProductDesc'
	,CMC_SGSG_SUB_GROUP.SGSG_NAME AS 'SubgroupName'
	,CASE 
		WHEN (
				CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND = 'Y'
				AND GETDATE() BETWEEN CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT
				)
			THEN 'Active'
		ELSE 'Inactive'
		END AS 'PolicyStatus'
	,DATENAME(day, CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT) AS 'PolicyEffectiveDate'
	,DATENAME(day, CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT) +'-'+ SUBSTRING(UPPER(DATENAME(month, CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT)), 0,4) +'-'+ DATENAME(year,CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT) AS 'PolicyTerminationDate'

FROM FACETS.dbo.CMC_SBSB_SUBSC CMC_SBSB_SUBSC(NOLOCK)
INNER JOIN FACETS.dbo.CMC_MEME_MEMBER CMC_MEME_MEMBER(NOLOCK) ON CMC_SBSB_SUBSC.SBSB_CK = CMC_MEME_MEMBER.SBSB_CK
INNER JOIN FACETS.dbo.CMC_MEPE_PRCS_ELIG CMC_MEPE_PRCS_ELIG(NOLOCK) ON CMC_MEME_MEMBER.MEME_CK = CMC_MEPE_PRCS_ELIG.MEME_CK
INNER JOIN FACETS.dbo.CMC_PDDS_PROD_DESC CMC_PDDS_PROD_DESC(NOLOCK) ON CMC_MEPE_PRCS_ELIG.PDPD_ID = CMC_PDDS_PROD_DESC.PDPD_ID
INNER JOIN FACETS.dbo.CMC_CSPD_DESC CMC_CSPD_DESC(NOLOCK) ON CMC_MEPE_PRCS_ELIG.CSPD_CAT = CMC_CSPD_DESC.CSPD_CAT
INNER JOIN FACETS.dbo.CMC_PLDS_PLAN_DESC CMC_PLDS_PLAN_DESC(NOLOCK) ON CMC_PLDS_PLAN_DESC.CSPI_ID = CMC_MEPE_PRCS_ELIG.CSPI_ID
INNER JOIN FACETS.dbo.CMC_CSCS_CLASS CMC_CSCS_CLASS(NOLOCK) ON CMC_CSCS_CLASS.CSCS_ID = CMC_MEPE_PRCS_ELIG.CSCS_ID AND CMC_CSCS_CLASS.GRGR_CK = CMC_MEPE_PRCS_ELIG.GRGR_CK
INNER JOIN FACETS.dbo.CMC_SGSG_SUB_GROUP(NOLOCK) ON CMC_SGSG_SUB_GROUP.SGSG_CK = CMC_MEPE_PRCS_ELIG.SGSG_CK AND CMC_SGSG_SUB_GROUP.GRGR_CK = CMC_MEPE_PRCS_ELIG.GRGR_CK
WHERE CMC_SBSB_SUBSC.SBSB_ID = 'C03154201'
--AND CMC_MEME_MEMBER.MEME_REL = 'M'
AND	GETDATE() BETWEEN CMC_MEPE_PRCS_ELIG.MEPE_EFF_DT
		AND CMC_MEPE_PRCS_ELIG.MEPE_TERM_DT
AND CMC_MEPE_PRCS_ELIG.MEPE_ELIG_IND = 'Y'
    AND CMC_MEPE_PRCS_ELIG.CSPD_CAT = 'M'	