package com.cybermint.clients.api.voluum.objects;

public class VoluumCampaign {

	private String namePostfix;
	
	private String postbackUrl;
	
	private String pixelUrl;
	
	private String pixelRedirectUrl;
	
	private CostModel costModel;
	
	private RevenueModel revenueModel;
	
	private CountryCode country;
	
	private TrafficSource trafficSource;
	
	private RedirectTarget redirectTarget;
	
	//private Advertiser advertiser;
	
	public VoluumCampaign() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNamePostfix() {
		return namePostfix;
	}

	public void setNamePostfix(String namePostfix) {
		this.namePostfix = namePostfix;
	}

	public String getPostbackUrl() {
		return postbackUrl;
	}

	public void setPostbackUrl(String postbackUrl) {
		this.postbackUrl = postbackUrl;
	}

	public String getPixelUrl() {
		return pixelUrl;
	}

	public void setPixelUrl(String pixelUrl) {
		this.pixelUrl = pixelUrl;
	}

	public String getPixelRedirectUrl() {
		return pixelRedirectUrl;
	}

	public void setPixelRedirectUrl(String pixelRedirectUrl) {
		this.pixelRedirectUrl = pixelRedirectUrl;
	}

	public CostModel getCostModel() {
		return costModel;
	}

	public void setCostModel(String type, int value) {
		this.costModel = new CostModel(type, value);
	}
	
	public RevenueModel getRevenueModel() {
		return revenueModel;
	}

	public void setRevenueModel(String type, int value) {
		this.revenueModel = new RevenueModel(type, value);
	}
	
	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(String code) {
		this.country = new CountryCode(code);
	}
	
	public TrafficSource getTrafficSource() {
		return trafficSource;
	}

	public void setTrafficSource(String id) {
		this.trafficSource = new TrafficSource(id);
	}
	
	/*
	public Advertiser getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String id) {
		this.advertiser = new Advertiser(id);
	}
	*/
	
	public RedirectTarget getRedirectTarget() {
		return redirectTarget;
	}

	public void setRedirectTarget(String flowId) {
		this.redirectTarget = new RedirectTarget(flowId);
	}

	private class CostModel {
		private String type;
		private int value;
		
		public CostModel(String type, int value) {
			this.type = type;
			this.value =  value;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
	}
	
	
	private class RevenueModel {
		private String type;
		private int value;
		
		public RevenueModel(String type, int value) {
			this.type = type;
			this.value =  value;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}
		
	}
	
	private class CountryCode {
		private String code;
		
		public CountryCode(String code) {
			this.code = code;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

	}
	
	private class TrafficSource {
		private String id;
		
		public TrafficSource(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

	}
	
	private class Advertiser {
		private String id;
		
		public Advertiser(String id) {
			this.id = id;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

	}
	
	private class RedirectTarget {
		private String flowId;
		
		public RedirectTarget(String flowId) {
			this.flowId = flowId;
		}

		public String getFlowId() {
			return flowId;
		}

		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}

	}

}
