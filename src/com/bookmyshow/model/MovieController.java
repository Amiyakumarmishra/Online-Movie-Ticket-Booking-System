package com.bookmyshow.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

	Map<City, List<Movie>> cityVsMovie;
	List<Movie> allMovies ;
	
	MovieController(){
		this.cityVsMovie=new HashMap<>();
		this.allMovies=new ArrayList<>();
	}

	void addMovie(Movie movie, City city) {

		this.allMovies.add(movie);
		List<Movie> movies = this.cityVsMovie.getOrDefault(city, new ArrayList<>());
		movies.add(movie);
		this.cityVsMovie.put(city, movies);
	}

	List<Movie> getAllMoviesByCity(City city) {
		return this.cityVsMovie.get(city);
	}

	Movie getMovieByMovieName(String movieName) {

		for (Movie movie : this.allMovies) {
			if (movie.getMovieName().equals(movieName)) {
				return movie;
			}
		}
		return null;

	}
}
