select * from serp.projects;
select * from serp.keywords;
select * from serp.urls;
select count(*) from serp.urls;
select url from serp.urls where majesticseo_backlinks_status is null;
select * from serp.urls where majesticseo_backlinks_to_domain_status is null;
select distinct(domain) from serp.urls where domain_pr is null;
select distinct(url) from serp.urls where url_pr is null;
select * from serp.urls where majesticseo_backlinks_status = 'In Progress';
select * from serp.urls where majesticseo_backlinks_to_domain_status = 'In Progress';

select * from serp.keywords k where k.keyword_id in (select distinct(keyword_id) from serp.urls u1 where u1.rank=1 and u1.url_pr<2 and u1.domain_pr<4 and u1.keyword_id in (select distinct(keyword_id) from serp.urls u2 where u2.rank=2 and u2.url_pr<2 and u2.domain_pr<4 and u2.keyword_id in (select distinct(keyword_id) from serp.urls u3 where u3.rank=1 and u3.url_pr<2 and u3.domain_pr<4)));


select * from serp.keywords k where k.keyword_id in (select distinct(keyword_id) from serp.urls u1 where u1.rank=1 and u1.url_pr<2 and u1.domain_pr<4 and u1.majesticseo_class_c_subnets_count<200 and 
u1.majesticseo_class_c_subnets_to_domain_count<1000 and u1.keyword_id in (select distinct(keyword_id) from serp.urls u2 where u2.rank=2 and u2.url_pr<2 and u2.domain_pr<4 and u2.majesticseo_class_c_subnets_count<200 and 
u2.majesticseo_class_c_subnets_to_domain_count<1000 and u2.keyword_id in (select distinct(keyword_id) from serp.urls u3 where u3.rank=1 and u3.url_pr<2 and u3.domain_pr<4 and u3.majesticseo_class_c_subnets_count<200 and 
u3.majesticseo_class_c_subnets_to_domain_count<1000 )));

select * from serp.keywords k where k.keyword_id in (select distinct(keyword_id) from serp.urls u1 where u1.rank=1 and u1.url_pr<3 and u1.domain_pr<5 and u1.majesticseo_class_c_subnets_count<200 and 
u1.majesticseo_class_c_subnets_to_domain_count<1000 and u1.keyword_id in (select distinct(keyword_id) from serp.urls u2 where u2.rank=2 and u2.url_pr<3 and u2.domain_pr<5 and u2.majesticseo_class_c_subnets_count<200 and 
u2.majesticseo_class_c_subnets_to_domain_count<1000 and u2.keyword_id in (select distinct(keyword_id) from serp.urls u3 where u3.rank=1 and u3.url_pr<3 and u3.domain_pr<5 and u3.majesticseo_class_c_subnets_count<200 and 
u3.majesticseo_class_c_subnets_to_domain_count<1000 )));

select * from serp.urls u1 where u1.rank<8 and u1.url_pr<2 and u1.domain_pr<4 and u1.majesticseo_class_c_subnets_count<200 and u1.majesticseo_class_c_subnets_to_domain_count<1000

select keyword_id, count(keyword_id) keywordCount from serp.urls u1 where u1.rank<8 and u1.url_pr<2 and u1.domain_pr<4 and u1.majesticseo_class_c_subnets_count<200 and u1.majesticseo_class_c_subnets_to_domain_count<1000 and keywordCount>2 group by u1.keyword_id

select * from (select k.keyword, u1.keyword_id, count(u1.keyword_id) keywordCount from serp.urls u1, serp.keywords k where u1.rank<8 and u1.url_pr<2 and u1.domain_pr<4 and u1.majesticseo_class_c_subnets_count<200 and u1.majesticseo_class_c_subnets_to_domain_count<1000 and u1.keyword_id=k.keyword_id group by u1.keyword_id) temp where temp.keywordCount>2

update serp.urls set majesticseo_backlinks_status = NULL where majesticseo_backlinks_status = 'In Progress';
update serp.urls set majesticseo_backlinks_to_domain_status = NULL  where majesticseo_backlinks_to_domain_status = 'In Progress';
use serp;
select keywords.keyword, urls.* from keywords, urls where keywords.keyword_id = urls.keyword_id and keywords.project_id=1;

select * from urls group by url;

select * from keywords where project_id=1;
select * from keywords where project_id=2;
select * from urls where project_id=1;

select * from keywords where status='Complete';
select * from keywords where status='In Progress';
select * from keywords where status='Pending';

select * from urls where urls.keyword_id in (select keyword_id from keywords where status='In Progress');

select keywords.keyword, count(urls.*) from keywords,urls where keywords.keyword_id=urls.keyword_id and (select count(*) from urls where keywords.keyword_id=urls.keyword_id)<50

select keywords.keyword, count(select * from urls,keywords where urls.keyword_id=keywords.keyword_id) from keywords,urls group by urls.keyword_id where keywords.keyword_id=urls.keyword_id;

select urls.keyword_id, urls.url, count(*) from urls,keywords where urls.keyword_id=keywords.keyword_id group by urls.url

select * from keywords where seobc is null or seopc is null or seotc is null or seobli is null or seopli is null

select * from urls where keyword_id in (select keyword_id from keywords where seobc is null or seopc is null or seotc is null or seobli is null or seopli is null)

update keywords kwds1 set kwds1.status = 'Pending' where kwds1.keyword_id in (select * from (select kwds.keyword_id from keywords kwds where kwds.seobc is null or kwds.seopc is null or kwds.seotc is null or kwds.seobli is null or kwds.seopli is null) kwds2)

update keywords kwds1 set kwds1.status = 'Pending' where kwds1.status = 'In Progress';
commit;

select kwds.* from keywords kwds, urls urls1 where kwds.keyword_id = urls1.keyword_id and urls1.domain like '%getbackyourexnow%' group by kwds.keyword_id;

select kwds.keyword, urls.* from keywords kwds, urls where kwds.keyword_id = urls.keyword_id

select keywords.keyword_id, keywords.keyword,count(*) from urls, keywords where urls.project_id=2 and urls.keyword_id = keywords.keyword_id group by urls.keyword_id having count(*)<50

delete from urls where urls.keyword_id in (select keywords.keyword_id from urls u1, keywords where u1.project_id=2 and u1.keyword_id = keywords.keyword_id group by u1.keyword_id having count(*)<50);
Select kwds.* from keywords kwds where kwds.keyword_id in (select keywords.keyword,count(*) from urls, keywords where urls.project_id=2 and urls.keyword_id = keywords.keyword_id and No<50 group by urls.keyword_id)

delete from urls where urls.keyword_id in (408,440,475,584,585,661,671,691,702,717,725,730,733,742,753,780,793,802,809,812,815,822,844,856,885,917,926,932,946,958,959,964,983,1185,1236,1286,1337,1388,1439,1490,1540,1591,1682,1733,1784,1835);

update keywords set status = 'Pending' where keyword_id in (408,440,475,584,585,661,671,691,702,717,725,730,733,742,753,780,793,802,809,812,815,822,844,856,885,917,926,932,946,958,959,964,983,1185,1236,1286,1337,1388,1439,1490,1540,1591,1682,1733,1784,1835);