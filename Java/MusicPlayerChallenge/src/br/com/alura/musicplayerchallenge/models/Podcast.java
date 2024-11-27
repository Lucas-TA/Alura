package br.com.alura.musicplayerchallenge.models;

public class Podcast extends Audio {
	private String host;
	private String description;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public int getClassification() {
		if (getTotalViews() >= 250) {
			return 4;
		} else {
			return 2;
		}
	}
}
