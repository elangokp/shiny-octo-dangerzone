package com.cybermint.serpScraper.reports;

public class KeywordsFilter {

	private Integer ranksToBeConsidered;
	private Integer minUrlPr;
	private Integer minDomainPr;
	private Integer minSubnetsToUrl;
	private Integer minSubnetsToDomain;
	
	public String constructQuery() {
		String query = "select distinct(keyword_id) from serp.urls u1 where u1.rank=1 and u1.url_pr<3 and u1.domain_pr<5 and u1.majesticseo_class_c_subnets_count<200 and u1.majesticseo_class_c_subnets_to_domain_count<1000 and u1.keyword_id in";
		return query;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
