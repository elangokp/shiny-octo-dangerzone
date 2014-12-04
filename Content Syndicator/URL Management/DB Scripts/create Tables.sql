drop table `urlmanagement`.`urls`;

CREATE TABLE `urlmanagement`.`urls` (
  `project_name` varchar(100) NOT NULL,
  `url_id` int(9) NOT NULL AUTO_INCREMENT,
  `url` varchar(10000) NOT NULL,
  `domain` varchar(5000) NOT NULL,
  `primary_keyword` varchar(500) NOT NULL,
  `phrase_match_anchor` varchar(5000) NOT NULL,
  `lateral_match_anchor` varchar(5000) NOT NULL,
  `general_match_anchor` varchar(5000) NOT NULL,
  `title_anchor` TEXT(500000) NOT NULL,
  `description` TEXT(500000) NOT NULL,
  `categories` varchar(2000) NOT NULL,
  `tags` varchar(2000) NOT NULL,
  PRIMARY KEY (`url_id`)
);
