package com.itcinfotech.moviecruiserapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.itcinfotech.moviecruiserapp.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository< Movie,Long> {


//	@Modifying
//	@Query("update Movie m set m = :mv where m.id = :i")
//	void updateMovie(@Param("mv") Movie movie, @Param("i")Long id);
	
}
