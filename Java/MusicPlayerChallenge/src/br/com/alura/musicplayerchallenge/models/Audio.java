package br.com.alura.musicplayerchallenge.models;

import br.com.alura.musicplayerchallenge.interfaces.Classification;

public class Audio implements Classification {
	private String title;
	private int totalViews;
	private int totalLikes;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTotalViews() {
		return totalViews;
	}
	public int getTotalLikes() {
		return totalLikes;
	}
	
	public void like() {
		totalLikes++;
	}
	
	public void play() {
		totalViews++;
	}
	@Override
	public int getClassification() {
		if (totalLikes >= 100) {
			return 4;
		} else {
			return 2;
		}
	}
	
}
