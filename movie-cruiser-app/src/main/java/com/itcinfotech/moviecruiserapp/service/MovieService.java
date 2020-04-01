package com.itcinfotech.moviecruiserapp.service;

import java.util.List;

import com.itcinfotech.moviecruiserapp.domain.Movie;

public interface MovieService {

	public List<Movie> getAllMovies();

	public Movie addMovie(Movie movie);

	public void deleteMovie(Long id); 
	
    public Movie updateMovie(Movie movie,Long id);

}
