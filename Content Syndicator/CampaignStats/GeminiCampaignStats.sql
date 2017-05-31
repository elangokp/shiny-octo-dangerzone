USE [CampaignStats]
GO

/****** Object:  Table [dbo].[GeminiCampaignStats]    Script Date: 3/4/2017 4:19:05 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[GeminiCampaignStats](
	[AdvertiserID] [varchar](15) NOT NULL,
	[StatDate] [date] NOT NULL,
	[AdvertiserName] [varchar](50) NOT NULL,
	[AdvertiserTimeZone] [varchar](50) NOT NULL,
	[AdvertiserCurrency] [varchar](10) NOT NULL,
	[CampaignID] [varchar](15) NOT NULL,
	[CampaignName] [varchar](100) NOT NULL,
	[CampaignStartDate] [varchar](15) NOT NULL,
	[CampaignEndDate] [varchar](15) NOT NULL,
	[CampaignStatus] [varchar](15) NOT NULL,
	[CampaignObjective] [varchar](30) NOT NULL,
	[CampaignBudget] [Money] NOT NULL,
	[CampaignBudgetType] [varchar](30) NOT NULL,
	[CampaignPricingType] [varchar](15) NOT NULL,
	[AdGroupId] [varchar](30) NOT NULL,
	[AdGroupName] [varchar](30) NOT NULL,
	[AdGroupStatus] [varchar](15) NOT NULL,
	[AdId] [varchar](30) NOT NULL,
	[AdTitle] [varchar](150) NOT NULL,
	[AdDescription] [varchar](200) NOT NULL,
	[AdStatus] [varchar](15) NOT NULL,
	[AdFormat] [varchar](15) NOT NULL,
	[AdSponsoredBy] [varchar](50) NOT NULL,
	[AdImageURL] [varchar](200) NOT NULL,
	[AdLandingURL] [varchar](300) NOT NULL,
	[AdDisplayURL] [varchar](50) NOT NULL,
	[AdSupplyGrouping] [varchar](10) NOT NULL,
	[AdTitleCode] [varchar](30) NOT NULL,
	[AdImageCode] [varchar](30) NOT NULL,
	[AdImageType] [varchar](10) NOT NULL,
	[AdAccountCode] [varchar](50) NOT NULL,
	[Gender] [varchar](6) NOT NULL,
	[Age] [varchar](10) NOT NULL,
	[Location] [varchar](30) NOT NULL,
	[Impressions] [int] NOT NULL,
	[Clicks] [int] NOT NULL,
	[CTR] [decimal](13, 10) NOT NULL,
	[Conversions] [int] NOT NULL,
	[Spend] [money] NOT NULL,
	[CPC] [money] NOT NULL,
	[CPI] [money] NOT NULL,
	[CPM] [money] NOT NULL,
	[Source] [varchar](50) NOT NULL,
	[AdPosition] [decimal](4, 2) NOT NULL,
	[MaxBid] [money] NOT NULL
)

GO

SET ANSI_PADDING OFF
GO


select 
StatDate,StatDate
,'' as CPC
,sum(Spend) as Spend
,'YG' as TS
,'interest' as CVName
, concat([AdSupplyGrouping],'-', [AdImageType]) as CVValue
,'10001' as campaignid
from
GeminiCampaignStats
where 1=1
and [AdSupplyGrouping] in ('g0','g1')
group by StatDate, [AdSupplyGrouping], [AdImageType]
order by 1, [AdSupplyGrouping], [AdImageType]


select count(distinct concat([AdSupplyGrouping], [AdImageType], [AdTitleCode], [AdImageCode])), 
--StatDate,
 sum(Spend) as Spend
, sum(isnull(Revenue,0)) as Revenue
, sum(isnull(Revenue,0) - isnull(Spend,0)) as Profit
, sum(impressions) as Impressions
, sum(clicks) as Clicks
--, (sum(clicks)/(sum(impressions)*1.00))*100 as CTR
--, sum(Spend)/(sum(clicks)*1.00) as CPC
--, (sum(Spend)/(sum(impressions)*1.00))*1000 as CPM
, count(*) as Records
, count(distinct [AdvertiserID]) as Accounts
, count(distinct [CampaignID]) as Campaigns
, count(distinct [AdID]) as Ads
from GeminiCampaignStats (NOLOCK)
where 1=1
and StatDate > '2017-02-20'
--and adid is not null
--and [AdSupplyGrouping] = 'g1' and  [AdImageType] = 'whq'
and [AdSupplyGrouping] in ('g0','g1')
group by [AdvertiserID]

select StatDate,
 sum(Spend) as Spend
, sum(isnull(Revenue,0)) as Revenue
, sum(isnull(Revenue,0) - isnull(Spend,0)) as Profit
, sum(impressions) as Impressions
, sum(clicks) as Clicks
, (sum(clicks)/(sum(impressions)*1.00))*100 as CTR
, sum(Spend)/(sum(clicks)*1.00) as CPC
, (sum(Spend)/(sum(impressions)*1.00))*1000 as CPM
, count(*) as Records
, count(distinct [AdvertiserID]) as Accounts
, count(distinct [CampaignID]) as Campaigns
from GeminiCampaignStats (NOLOCK)
where 1=1
and StatDate > '2017-02-20'
group by StatDate
order by StatDate

select [AdSupplyGrouping], [AdImageType],--, StatDate
 sum(Spend) as Spend
, sum(isnull(Revenue,0)) as Revenue
, sum(isnull(Revenue,0) - isnull(Spend,0)) as Profit
, sum(impressions) as Impressions
, sum(clicks) as Clicks
, (sum(clicks)/(sum(impressions)*1.00))*100 as CTR
, sum(Spend)/(sum(clicks)*1.00) as CPC
, (sum(Spend)/(sum(impressions)*1.00))*1000 as CPM
, count(*) as Records
, count(distinct [AdvertiserID]) as Accounts
, count(distinct [CampaignID]) as Campaigns
from GeminiCampaignStats (NOLOCK)
where 1=1
and StatDate > '2017-02-21'
--and adid is not null
group by [AdSupplyGrouping], [AdImageType]


select [AdSupplyGrouping], [AdImageType], [AdTitleCode], [AdImageCode],--, StatDate
 sum(Spend) as Spend
, sum(isnull(Revenue,0)) as Revenue
, sum(isnull(Revenue,0) - isnull(Spend,0)) as Profit
, sum(impressions) as Impressions
, sum(clicks) as Clicks
, (sum(clicks)/(sum(impressions)*1.00))*100 as CTR
, sum(Spend)/(sum(clicks)*1.00) as CPC
, (sum(Spend)/(sum(impressions)*1.00))*1000 as CPM
, count(*) as Records
, count(distinct [AdvertiserID]) as Accounts
, count(distinct [CampaignID]) as Campaigns
from GeminiCampaignStats (NOLOCK)
where 1=1
--and StatDate > '2017-02-21'
--and adid is not null
--and [AdSupplyGrouping] = 'g1' and  [AdImageType] = 'whq'
and [AdSupplyGrouping] in ('g0','g1')
group by [AdSupplyGrouping], [AdImageType], [AdTitleCode], [AdImageCode]
order by [AdSupplyGrouping], [AdImageType], [AdTitleCode], [AdImageCode]


select [AdSupplyGrouping], [AdImageType],-- [AdTitleCode], [AdImageCode], 
--StatDate,
 sum(Spend) as Spend
, sum(isnull(Revenue,0)) as Revenue
, sum(isnull(Revenue,0) - isnull(Spend,0)) as Profit
, (sum(isnull(Revenue,0) - isnull(Spend,0))/sum(Spend))*100 as ROI
, sum(isnull(Revenue,0) - isnull(Spend,0))/(sum(clicks)*1.00) as PPC
, sum(impressions) as Impressions
, sum(clicks) as Clicks
, (sum(clicks)/(sum(impressions)*1.00))*100 as CTR
, sum(Spend)/(sum(clicks)*1.00) as CPC
, (sum(Spend)/(sum(impressions)*1.00))*1000 as CPM
, count(*) as Records
, count(distinct [AdvertiserID]) as Accounts
, count(distinct [CampaignID]) as Campaigns
from GeminiCampaignStats (NOLOCK)
where 1=1
and StatDate >= '2017-03-01'
--and adid is not null
--and [AdSupplyGrouping] = 'g1' and  [AdImageType] = 'whq'
and [AdSupplyGrouping] in ('g0','g1')
group by [AdSupplyGrouping], [AdImageType]--, [AdTitleCode], [AdImageCode]--,
--StatDate
order by [AdSupplyGrouping], [AdImageType]--, [AdTitleCode], [AdImageCode]--,
--StatDate


/*
update GeminiCampaignStats
set conversions = c.conversions
,Revenue = c.Revenue
from GeminiCampaignStats s
inner join Conversions c on s.Adid = c.Adid and convert(date, s.StatDate) = convert(date, c.Day)


update GeminiCampaignStats
set conversions = c.conversions
,Revenue = c.Revenue
from GeminiCampaignStats s
inner join (select 
[Campaign]
,convert(date, [Day]) as [Day]
,sum([Conversions]) as [Conversions]
,sum([Revenue]) as [Revenue] 
from Conversions
group by [Campaign], convert(date, [Day])) c on s.[CampaignName] = c.[Campaign] and convert(date, s.StatDate) = convert(date, c.[Day])
where s.adid is null

select s.*, c.conversions, c.Revenue
from GeminiCampaignStats s
inner join (select 
[Campaign]
,convert(date, [Day]) as [Day]
,sum([Conversions]) as [Conversions]
,sum([Revenue]) as [Revenue] 
from Conversions
group by [Campaign], convert(date, [Day])) c on s.[CampaignName] = c.[Campaign] and convert(date, s.StatDate) = convert(date, c.Day)
where s.adid is null

select 
[Campaign]
,convert(date, [Day])
,sum([Conversions]) as [Conversions]
,sum([Revenue]) as [Revenue] 
from Conversions
group by [Campaign], convert(date, [Day])
*/