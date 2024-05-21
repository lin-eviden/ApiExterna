package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.business.GestorAPI;

@RestController
@RequestMapping("")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
public class ControladorAPI {

	@Autowired
	private GestorAPI ga;

	// LISTA de GENEROS de películas
	@GetMapping("/movies/genrelist")
	public String getMovieGenreList() {
		return ga.getMovieGenreList();

	}

	// Peliculas populares ESPAÑOLAS
	@GetMapping("/movies/spanish")
	public String getSpanishMovie() {
		return ga.getSpanishMovie();

	}

	// Peliculas de ACCION
	@GetMapping("/movies/genre/action")
	public String getActionMovie() {
		return ga.getActionMovie();

	}

	// Peliculas de DRAMA
	@GetMapping("/movies/genre/drama")
	public String getDramaMovie() {
		return ga.getDramaMovie();

	}

	// Películas populares
	@GetMapping("/movies/popular")
	public String getPopularMovies() {
		return ga.getPopularMovies();

	}

	// Películas en cartelera
	@GetMapping("/movies/current")
	public String getCurrentMovies() {
		return ga.getCurrentMovies();

	}

	// Películas próximas
	@GetMapping("/movies/upcoming")
	public String getUpcomingMovies() {
		return ga.getUpcomingMovies();

	}

	// Películas mejor valoradas
	@GetMapping("/movies/toprated")
	public String getTopRatedMovies() {
		return ga.getTopRatedMovies();

	}

	// Filtrar Películas por genero
	@GetMapping("/movies/genre/{id_genre}")
	public String getMoviesByGenre(@PathVariable int id_genre) {
		return ga.getMoviesByGenre(id_genre);

	}

	// Buscar Películas por ID
	@GetMapping("/movies/search/{id_movie}")
	public String getMovieById(@PathVariable long id_movie) {
		return ga.getMovieById(id_movie);

	}

//SERIES

	// LISTA de GENEROS de series
	@GetMapping("/series/genrelist")
	public String getSerieGenreList() {
		return ga.getSerieGenreList();

	}

	// Series populares ESPAÑOLAS
	@GetMapping("/series/spanish")
	public String getSpanishSerie() {
		return ga.getSpanishSerie();

	}

	// Series de ACCION
	@GetMapping("/series/genre/action")
	public String getActionSerie() {
		return ga.getActionSerie();

	}

	// Series de DRAMA
	@GetMapping("/series/genre/drama")
	public String getDramaSerie() {
		return ga.getDramaSerie();

	}

	// Series populares
	@GetMapping("/series/popular")
	public String getPopularSeries() {
		return ga.getPopularSeries();

	}

	// Series que se emiten hoy
	@GetMapping("/series/today")
	public String getSeriesAiringToday() {
		return ga.getSeriesAiringToday();

	}

	// Series en emisión
	@GetMapping("/series/onair")
	public String getSeriesOnAir() {
		return ga.getSeriesOnAir();

	}

	// Series mejor valoradas
	@GetMapping("/series/toprated")
	public String getTopRatedSeries() {
		return ga.getTopRatedSeries();

	}

	// Filtrar Series por genero
	@GetMapping("/series/genre/{id_genre}")
	public String getSeriesByGenre(@PathVariable int id_genre) {
		return ga.getSeriesByGenre(id_genre);

	}

	// Buscar serie por ID
	@GetMapping("/series/search/{id_serie}")
	public String getSeriesById(@PathVariable long id_serie) {
		return ga.getSeriesById(id_serie);

	}

	// Buscar películas o series por palabra clave
	@GetMapping("/search")
	public String searchMulti(@RequestParam String query) {
		return ga.searchMulti(query);
	}

}