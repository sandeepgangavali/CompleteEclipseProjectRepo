package com.itcinfotech.moviecruiserapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itcinfotech.moviecruiserapp.domain.Movie;
import com.itcinfotech.moviecruiserapp.service.MovieService;

@RestController
@RequestMapping(value="/movie-api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	 @GetMapping(value="/movie")
	public ResponseEntity<?> getAllMovies()
	{
		List<Movie> movieList=movieService.getAllMovies();
		ResponseEntity responseEntity=new ResponseEntity<List<Movie>>(movieList,HttpStatus.OK);
		return responseEntity;
		
	}
	  @PostMapping(value="/movie")
	 public ResponseEntity<?> postMovie(@RequestBody Movie movie)
	 {
		 Movie savedMovie = movieService.addMovie(movie);
		 ResponseEntity responseEntity = new ResponseEntity<Movie>(savedMovie, HttpStatus.CREATED);
		 
		 return responseEntity;
	 }
	 
	 @DeleteMapping(value="/movie/{id}")
	 public ResponseEntity<?> deleateMovie(@PathVariable Long id)
	 {
		movieService.deleteMovie(id); 
		return ResponseEntity.noContent().build();
	 }
	 
	 
	 @PutMapping(value="/movie/{id}")
	 public ResponseEntity<?> updateMovie(@PathVariable(value="id") Long id ,@RequestBody Movie comments)
	 {
		 System.out.println("entered Controller method");
		 Movie savedMovie=movieService.updateMovie(comments, id) ;
		 ResponseEntity  responseEntity = new ResponseEntity<Movie>(savedMovie, HttpStatus.OK);
		  return responseEntity;
	 }
	 

	 
	 
}
