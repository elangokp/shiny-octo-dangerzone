package com.cybermint.clients.api.revcontent.objects;

import java.util.ArrayList;
import java.util.List;

import com.cybermint.utils.TextFileWriterUtils;

public class Boost {

	private String ID;
	
	private String name;
	
	private List<Content> contents = new ArrayList<Content>();
	
	public Boost(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	
	public void printStats(String fileLocation) {
		List<String> stats = new ArrayList<String>();
		stats.add("Boost ID,Boost Name,Content ID,Headline,Target URL,Title ID,Image ID,Image URL,Brand Name,Date,Widget ID,Impressions,Clicks,Spend");
		for(Content aContent : contents) {
			for(ContentStat aContentStat : aContent.getContentStats()) {
				stats.add(this.getID()+","
						+this.getName()+","
						+aContent.getID()+","
						+aContent.getHeadline()+","
						+aContent.getTargetURL()+","
						+aContent.getTitleIdentifier()+","
						+aContent.getImageIdentifier()+","
						+aContent.getImageURL()+","
						+aContent.getBrandName()+","
						+aContentStat.getDate()+","
						+aContentStat.getWidgetID()+","
						+aContentStat.getImpressions()+","
						+aContentStat.getClicks()+","
						+aContentStat.getSpend());
			}
		}
		TextFileWriterUtils.writeListAsLines(stats, fileLocation, false);
	}
	public void addContent(Content aContent) {
		contents.add(aContent);
	}

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
