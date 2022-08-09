package com.zee.zee5app;


import java.io.FileNotFoundException;

import javax.naming.InvalidNameException;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.enums.Geners;
import com.zee.zee5app.exceptions.InvalidIdException;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.MovieServiceImpl;

public class MovieMain {

	public static void main(String[] args) {
		MovieService movieService = MovieServiceImpl.getInstance();
		String[] actors = new String[2];
		actors[0] = "Ajay";
		actors[1] = "Kajol";
		String[] language = {"HINDI", "ENGLISH"};
		Geners geners = Geners.ACTION;
		try {
		movieService.insertMovie(new Movie(actors, "Jeet", "Kajol", geners, "Darma", language, 180.9f, "D:\\trailer.mp4"));
		System.out.println("getMovieByMovieId: "+movieService.getMovieByMovieId("Je1").get());
		System.out.println("getAllMovies: "+movieService.getAllMovies().get());
		System.out.println("getAllMoviesByGenre: "+ movieService.getAllMoviesByGenre(Geners.ACTION.name()).get());
		System.out.println("getAllMoviesByName: "+ movieService.getAllMoviesByName("Jeet").get());
		System.out.println("findByOrderByMovieNameDsc: "+ movieService.findByOrderByMovieNameDsc());
		System.out.println("deleteMovieByMovieId: "+ movieService.deleteMovieByMovieId("Je1"));
		
		} catch (InvalidIdException | FileNotFoundException | InvalidNameException | UnableToGenerateIdException | NoDataFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
