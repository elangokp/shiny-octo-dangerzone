select distinct CMC_MEME_MEMBER.MEME_REL AS 'RelationshipCode'
,CASE 
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'M') THEN 'Subscriber'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'D') THEN 'Daughter'		
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'H') THEN 'Husband'	
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'S') THEN 'Son'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'W') THEN 'Wife'
		WHEN (CMC_MEME_MEMBER.MEME_REL = 'O') THEN 'Other Dependent'				
		END AS 'RelationshipDesc'
from CMC_MEME_MEMBER