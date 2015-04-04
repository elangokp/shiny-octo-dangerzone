drop table `serp2`.`urls`;
drop table `serp2`.`keywords`;
drop table `serp2`.`projects`;

CREATE TABLE `serp2`.`projects` (
  `project_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(100) NOT NULL DEFAULT 'untitled',
  `project_desc` varchar(600) DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  UNIQUE KEY `projects_project_id_UNIQUE` (`project_id`)
);

CREATE TABLE `serp2`.`keywords` (
  `project_id` int(11) NOT NULL,
  `keyword_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `keyword` varchar(10000) NOT NULL,
  `status` varchar(45) NOT NULL,
  `broad_search` bigint(20) DEFAULT NULL,
  `phrase_search` bigint(20) DEFAULT NULL,
  `exact_search` bigint(20) DEFAULT NULL,
  `SEOBC` bigint(20) DEFAULT NULL,
  `SEOPC` bigint(20) DEFAULT NULL,
  `SEOTC` bigint(20) DEFAULT NULL,
  `SEOBLI` bigint(20) DEFAULT NULL,
  `SEOPLI` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`keyword_id`),
  KEY `keywords_project_id_foreign_key` (`project_id`),
  CONSTRAINT `keywords_project_id_foreign_key` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE `serp2`.`urls` (
  `project_id` int(11) NOT NULL,
  `url_id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `url` varchar(10000) NOT NULL,
  `domain` varchar(500) NOT NULL,
  `keyword_id` bigint(20) NOT NULL,
  `rank` int(11) NOT NULL,
  `url_pr` int(3),
  `domain_pr` int(3),
  `majesticseo_backlinks_status` varchar(50),
  `majesticseo_url_type` varchar(50),
  `majesticseo_acrank` int(3),
  `majesticseo_external_backlinks_count` BIGINT(20),
  `majesticseo_gov_external_backlinks_count` BIGINT(20),
  `majesticseo_edu_external_backlinks_count` BIGINT(20),
  `majesticseo_referring_domains_count` BIGINT(20),
  `majesticseo_gov_referring_domains_Count` BIGINT(20),
  `majesticseo_edu_referring_domains_Count` BIGINT(20),
  `majesticseo_ip_addresses_count` BIGINT(20),
  `majesticseo_class_c_subnets_count` BIGINT(20),
  `majesticseo_backlinks_to_domain_status` varchar(50),
  `majesticseo_external_backlinks_to_domain_count` BIGINT(20),
  `majesticseo_gov_external_backlinks_to_domain_count` BIGINT(20),
  `majesticseo_edu_external_backlinks_to_domain_count` BIGINT(20),
  `majesticseo_referring_domains_to_domain_count` BIGINT(20),
  `majesticseo_gov_referring_domains_to_domain_Count` BIGINT(20),
  `majesticseo_edu_referring_domains_to_domain_Count` BIGINT(20),
  `majesticseo_ip_addresses_to_domain_count` BIGINT(20),
  `majesticseo_class_c_subnets_to_domain_count` BIGINT(20),
  PRIMARY KEY (`url_id`),
  KEY `urls_keyword_id_foreign_key` (`keyword_id`),
  KEY `urls_project_id_foreign_key` (`project_id`),
  CONSTRAINT `urls_keyword_id_foreign_key` FOREIGN KEY (`keyword_id`) REFERENCES `keywords` (`keyword_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `urls_project_id_foreign_key` FOREIGN KEY (`project_id`) REFERENCES `projects` (`project_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);