package com.example.demo.model.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class GestorAPI {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${tmdb.api.key}")
	private String apiKey;

	private final String url = "https://api.themoviedb.org/3";

	public GestorAPI(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;

	}
	/*
	 public String searchMulti(String query) {
		String search = url + "/search/multi"+ "?api_key=" + apiKey+ "&query=" + query;
	      
	    return restTemplate.getForObject(search, String.class);	    
	}*/
	
	 public String searchMulti(String query) {
		    String searchUrl = url + "/search/multi";

		    // Construir la URL con parámetros de consulta
		    UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(searchUrl)
		            .queryParam("api_key", apiKey)
		            .queryParam("query", query);

		    // Realizar la solicitud GET a la API
		    return restTemplate.getForObject(builder.toUriString(), String.class);
		}

	public String getMovieGenreList() {
		String search = url + "/genre/movie/list"+ "?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}
	
	public String getPopularMovies() {
		String search = url + "/movie/popular?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getCurrentMovies() {
		String search = url + "/movie/now_playing?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getUpcomingMovies() {
		String search = url + "/movie/upcoming?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getTopRatedMovies() {
		String search = url + "/movie/top_rated?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}
	
	public String getMoviesByGenre(int id_genre) {
		String search = url + "/discover/movie?api_key=" + apiKey + "&with_genres=" + id_genre;
		
		return restTemplate.getForObject(search, String.class);
 
	}
	
	public String getMovieById(long id_movie) {
		String search = url + "/movie/" + id_movie + "?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	
	public String getSerieGenreList() {
		String search = url + "/genre/tv/list"+ "?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}
	
	public String getPopularSeries() {
		String search = url + "/tv/popular?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getSeriesAiringToday() {
		String search = url + "/tv/airing_today?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getSeriesOnAir() {
		String search = url + "/tv/on_the_air?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}

	public String getTopRatedSeries() {
		String search = url + "/tv/top_rated?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}
	
	public String getSeriesByGenre(int id_genre) {
		String search = url + "/discover/tv?api_key=" + apiKey + "&with_genres=" + id_genre;
		
		return restTemplate.getForObject(search, String.class);
 
	}
	
	public String getSeriesById(long id_serie) {
		String search = url + "/tv/" + id_serie + "?api_key=" + apiKey;

		return restTemplate.getForObject(search, String.class);

	}


}