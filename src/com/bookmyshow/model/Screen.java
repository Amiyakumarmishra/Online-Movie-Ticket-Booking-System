package com.bookmyshow.model;

import java.util.List;

public class Screen {
	
	private int screenId;
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	private List<Seat> seats;
	
}
