package com.bookmyshow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
	
	Map<City, List<Theater>> cityVsTheater;
	List<Theater> allTheaters ;
	
	TheaterController(){
		this.cityVsTheater=new HashMap<>();
		this.allTheaters=new ArrayList<>();
	}

	void addTheater(Theater Theater, City city) {

		this.allTheaters.add(Theater);
		List<Theater> Theaters = this.cityVsTheater.getOrDefault(city, new ArrayList<>());
		Theaters.add(Theater);
		this.cityVsTheater.put(city, Theaters);
	}

	List<Theater> getAllTheatersByCity(City city) {
		return this.cityVsTheater.get(city);
	}

	Map<Theater,List<Show>> getAllShow(Movie movie,City city) {
		
		List<Theater> allTheater = this.cityVsTheater.get(city);
		
		Map<Theater,List<Show>> ret= new HashMap<>();
		
		for(Theater theater : allTheater) {
			List<Show> shows = theater.getShows();
			List<Show> wantedShows = theater.getShows();
			for(Show show:shows) {
				if(movie.getMovieId()==show.getMovie().getMovieId()) {
					wantedShows.add(show);
				}
			}
			if(wantedShows.size()>0) {
				ret.put(theater, wantedShows);
			}
		}

		return ret;

	}
}
