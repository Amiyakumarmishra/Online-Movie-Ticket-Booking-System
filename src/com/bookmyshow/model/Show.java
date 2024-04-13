package com.bookmyshow.model;

import java.util.List;

public class Show {
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Integer> getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(List<Integer> bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	private Movie movie;
	private Screen screen;
	private List<Integer> bookedSeats;
	private int startTime;
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public List<Integer> getBookedSeat() {
		return bookedSeats;
	}
	public void setBookedSeat(List<Integer> bookedSeat) {
		this.bookedSeats = bookedSeat;
	}
}
