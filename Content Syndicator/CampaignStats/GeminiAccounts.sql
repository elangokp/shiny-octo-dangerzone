select status, count(*) from [GeminiAccounts]
group by status

select status, count(*) from GeminiUploadsDetail
group by status

--update GeminiUploadsDetail
--SET status = 'UPL_CAMP_SUCCESS'
--where status = 'UPL_CAMP_INPROGRESS'

select username, count(*) from [GeminiAccounts]
group by username
order by 2 desc


--update [GeminiAccounts]
--SET Status = 'CH_PASS_DONE'
--, password = '123gemini!@#'
--,lastUpdatedOn = getdate()
--where username ='donaldworkman25'

--ALTER TABLE [GeminiAccounts] ALTER COLUMN lastUpdatedOn datetime
select * from [GeminiAccounts]
where Status = 'CH_PASS_INPROGRESS'

select * from [GeminiAccounts]
where username = 'judygriffin72'


select distinct password from [GeminiAccounts]
where Status = 'CH_PASS_DONE'


select * from [GeminiAccounts]
where username = 'christophermccracken27'



select * from GeminiUploadsMaster
select * from GeminiUploadsDetail

--Alter Table GeminiUploadsMaster ADD LastUpdatedOn datetime
--Alter Table GeminiUploadsDetail ADD LastUpdatedOn datetime

--Alter Table GeminiUploadsDetail ALTER COLUMN Status varchar(100)

--insert into GeminiUploadsMaster 
--values (1,'Initial Campaign Upload','ACTIVE',getdate())

--UPDATE GeminiUploadsDetail
--SET Domain =  CONCAT('www.',Domain)


select top 1 ga.username, ga.password, gud.Template, gud.Domain, gud.SponsoredBy
from GeminiUploadsDetail gud
inner join GeminiUploadsMaster gum on gum.UploadMasterID = gud.UploadMasterID and gum.Status = 'ACTIVE'
inner join GeminiAccounts ga on gud.Username = ga.Username
where gud.Status in ('UPL_CAMP_YET_TO_START')

--update GeminiUploadsDetail SET status = ?, lastUpdatedon = getdate()
--from GeminiUploadsDetail gud
--inner join GeminiUploadsMaster gum on gum.UploadMasterID = gud.UploadMasterID and gum.Status = 'ACTIVE'
--inner join GeminiAccounts ga on gud.Username = ga.Username
--where gud.username = ?

--update GeminiAccounts SET status = ?, lastUpdatedon = getdate() where username = ?