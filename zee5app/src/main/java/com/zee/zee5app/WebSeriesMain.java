package com.zee.zee5app;



import java.io.FileNotFoundException;

import javax.naming.InvalidNameException;

import com.zee.zee5app.dto.WebSeries;
import com.zee.zee5app.enums.Geners;
import com.zee.zee5app.enums.Languages;
import com.zee.zee5app.exceptions.InvalidIdException;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.service.WebSeriesService;
import com.zee.zee5app.service.WebSeriesServiceImpl;

public class WebSeriesMain {
	
	public static void main(String[] args) {
		WebSeriesService movieService = WebSeriesServiceImpl.getInstance();
		String[] actors = new String[2];
		actors[0] = "Ajay";
		actors[1] = "Kajol";
		String[] language = {"HINDI", "ENGLISH"};
		Geners geners = Geners.ACTION;
		try {
		movieService.insertWebSeries(new WebSeries(actors, "Jeet", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4"));
		movieService.insertWebSeries(new WebSeries(actors, "Jeet", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4"));
		movieService.insertWebSeries(new WebSeries(actors, "jiddi", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4"));
		movieService.insertWebSeries(new WebSeries(actors, "ghayal", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4"));
		movieService.insertWebSeries(new WebSeries(actors, "ghatak", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4"));
		System.out.println("getWebSeriesByWebSeriesId: "+movieService.getWebSeriesByWebSeriesId("gh00000014").get());
		System.out.println("getAllWebSeriess: "+movieService.getAllWebSeriess().get());
		System.out.println("getAllWebSeriessByGenre: "+ movieService.getAllWebSeriessByGenre(Geners.ACTION.name()).get());
		System.out.println("getAllWebSeriessByName: "+ movieService.getAllWebSeriessByName("Jeet").get());
		System.out.println("findByOrderByWebSeriesNameDsc: "+ movieService.findByOrderByWebSeriesNameDsc());
		System.out.println("findByOrderByWebSeriesNameDsc: "+ movieService.updateWebSeries("gh00000014", new WebSeries(actors, "Jeet", "Kajol", geners, "Darma", language, 3, "D:\\trailer.mp4")));
		System.out.println("deleteWebSeriesByWebSeriesId: "+ movieService.deleteWebSeriesByWebSeriesId("gh00000014"));
		
		} catch (InvalidIdException | FileNotFoundException | InvalidNameException | UnableToGenerateIdException | NoDataFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
