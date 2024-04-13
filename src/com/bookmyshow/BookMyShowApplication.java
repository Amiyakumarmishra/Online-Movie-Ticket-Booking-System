package com.bookmyshow;

import com.bookmyshow.model.BookMyShow;
import com.bookmyshow.model.City;

public class BookMyShowApplication {
	
	public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Banglore, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.Banglore, "BAAHUBALI");

	}
}
