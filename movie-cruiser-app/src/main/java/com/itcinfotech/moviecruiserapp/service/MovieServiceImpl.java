package com.itcinfotech.moviecruiserapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itcinfotech.moviecruiserapp.domain.Movie;
import com.itcinfotech.moviecruiserapp.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		 return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		 Movie savedmovie = 	movieRepository.save(movie);
		 return savedmovie;
				
	}

	@Override
	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);
		
	}
	
	 public Optional<Movie> getMovieById(Long id)  {
	        Optional<Movie> movie;
	        movie=movieRepository.findById(id);
	        return movie;
	 }

	@Override
	public Movie updateMovie( Movie  mv,Long id) {
		Optional<Movie> movieup=getMovieById(id);
		movieup.get().setComments(mv.getComments());
		 Movie savedMovie=movieRepository.save(movieup.get());
		 return savedMovie;
	}

}
