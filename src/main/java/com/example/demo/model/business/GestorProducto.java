package com.example.demo.model.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GestorProducto {

	@Autowired
	private RestTemplate rt;

	@Value("${tmdb.api.key}")
	private String apiKey;

	private final String url = "https://api.themoviedb.org/3";

	public GestorProducto(RestTemplate rt) {
		this.rt = rt;

	}

	public String getPeliculasPopulares() {
		String busqueda = url + "/movie/popular?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getPeliculasActuales() {
		String busqueda = url + "/movie/now_playing?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getPeliculasProximas() {
		String busqueda = url + "/movie/upcoming?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getPeliculasValoradas() {
		String busqueda = url + "/movie/top_rated?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}
	
	public String getPeliculasGenero(int id_genero) {
		String busqueda = url + "/discover/movie?api_key=" + apiKey + "&with_genres=" + id_genero;
		
		return rt.getForObject(busqueda, String.class);
 
	}
	
	public String getPeliculasPorId(long id_pelicula) {
		String busqueda = url + "/movie/" + id_pelicula + "?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}
	
	public String getSeriesPopulares() {
		String busqueda = url + "/tv/popular?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getSeriesHoy() {
		String busqueda = url + "/tv/airing_today?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getSeriesEmision() {
		String busqueda = url + "/tv/on_the_air?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

	public String getSeriesValoradas() {
		String busqueda = url + "/tv/top_rated?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}
	
	public String getSeriesGenero(int id_genero) {
		String busqueda = url + "/discover/tv?api_key=" + apiKey + "&with_genres=" + id_genero;
		
		return rt.getForObject(busqueda, String.class);
 
	}
	
	public String getSeriesPorId(long id_serie) {
		String busqueda = url + "/tv/" + id_serie + "?api_key=" + apiKey;

		return rt.getForObject(busqueda, String.class);

	}

}