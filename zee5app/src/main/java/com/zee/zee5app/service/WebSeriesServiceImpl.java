package com.zee.zee5app.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import javax.naming.InvalidNameException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.WebSeries;
import com.zee.zee5app.exceptions.InvalidIdException;
import com.zee.zee5app.exceptions.NoDataFoundException;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.repo.WebSeriesRepository;
import com.zee.zee5app.repo.WebSeriesRepositoryImpl;

@Service
public class WebSeriesServiceImpl implements WebSeriesService {

	@Autowired
	private WebSeriesRepository webSeriesRepository;  // Interface ref = class object()
	
	@Override
	public WebSeries insertWebSeries(WebSeries webSeries) throws UnableToGenerateIdException, FileNotFoundException {
		// TODO Auto-generated method stub
		return webSeriesRepository.insertWebSeries(webSeries);
	}

	@Override
	public Optional<WebSeries> updateWebSeries(String webSeriesId, WebSeries webSeries) throws NoDataFoundException {
		// TODO Auto-generated method stub
		return webSeriesRepository.updateWebSeries(webSeriesId, webSeries);
	}

	@Override
	public Optional<WebSeries> getWebSeriesByWebSeriesId(String webSeriesId) throws InvalidNameException, InvalidIdException {
		// TODO Auto-generated method stub
		return webSeriesRepository.getWebSeriesByWebSeriesId(webSeriesId);
	}

	@Override
	public Optional<List<WebSeries>> getAllWebSeriess() throws InvalidNameException, InvalidIdException {
		// TODO Auto-generated method stub
		return webSeriesRepository.getAllWebSeriess();
	}

	@Override
	public Optional<List<WebSeries>> getAllWebSeriessByGenre(String genre) throws InvalidNameException, InvalidIdException, NoDataFoundException {
		// TODO Auto-generated method stub
		return webSeriesRepository.getAllWebSeriessByGenre(genre);
	}

	@Override
	public Optional<List<WebSeries>> getAllWebSeriessByName(String webSeriesName) throws InvalidNameException, InvalidIdException, NoDataFoundException {
		// TODO Auto-generated method stub
		return webSeriesRepository.getAllWebSeriessByName(webSeriesName);
	}

	@Override
	public String deleteWebSeriesByWebSeriesId(String webSeriesId) throws NoDataFoundException {
		// TODO Auto-generated method stub
		return webSeriesRepository.deleteWebSeriesByWebSeriesId(webSeriesId);
	}

	@Override
	public Optional<List<WebSeries>> findByOrderByWebSeriesNameDsc() throws InvalidNameException, InvalidIdException {
		// TODO Auto-generated method stub
		return webSeriesRepository.findByOrderByWebSeriesNameDsc();
	}

}
