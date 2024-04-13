package com.bookmyshow.model;

import java.util.List;

public class Theater {
	
	private int theaterId;
	private List<Show> shows;
	private List<Screen> screens;
	private City city;
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	public List<Screen> getScreens() {
		return screens;
	}
	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
	
	
} 
