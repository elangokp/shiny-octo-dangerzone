alter table serp.urls add column majesticseo_backlinks_to_domain_status varchar(50)

alter table serp.urls CHANGE url_id  url_id BIGINT(20) NOT NULL AUTO_INCREMENT;
alter table serp.urls CHANGE majesticseo_external_backlinks_count  majesticseo_external_backlinks_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_gov_external_backlinks_count  majesticseo_gov_external_backlinks_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_edu_external_backlinks_count  majesticseo_edu_external_backlinks_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_referring_domains_count  majesticseo_referring_domains_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_gov_referring_domains_Count  majesticseo_gov_referring_domains_Count BIGINT(20);
alter table serp.urls CHANGE majesticseo_edu_referring_domains_Count  majesticseo_edu_referring_domains_Count BIGINT(20);
alter table serp.urls CHANGE majesticseo_ip_addresses_count  majesticseo_ip_addresses_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_class_c_subnets_count  majesticseo_class_c_subnets_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_external_backlinks_to_domain_count  majesticseo_external_backlinks_to_domain_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_gov_external_backlinks_to_domain_count  majesticseo_gov_external_backlinks_to_domain_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_edu_external_backlinks_to_domain_count  majesticseo_edu_external_backlinks_to_domain_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_referring_domains_to_domain_count  majesticseo_referring_domains_to_domain_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_gov_referring_domains_to_domain_Count  majesticseo_gov_referring_domains_to_domain_Count BIGINT(20);
alter table serp.urls CHANGE majesticseo_edu_referring_domains_to_domain_Count  majesticseo_edu_referring_domains_to_domain_Count BIGINT(20);
alter table serp.urls CHANGE majesticseo_ip_addresses_to_domain_count  majesticseo_ip_addresses_to_domain_count BIGINT(20);
alter table serp.urls CHANGE majesticseo_class_c_subnets_to_domain_count  majesticseo_class_c_subnets_to_domain_count BIGINT(20);