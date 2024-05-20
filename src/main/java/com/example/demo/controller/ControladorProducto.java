package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.business.GestorProducto;
@RestController
@RequestMapping("")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class ControladorProducto {

	@Autowired
	private GestorProducto gp;

	 // Buscar películas o series por palabra clave
    @GetMapping("/search")
    public String searchMulti(@RequestParam  String query) {
        return gp.searchMulti(query);
    }
    
	//GENEROS de películas
	@GetMapping("/movies/genrelist")
	public String getMovieGenreList() {
		return gp.getMovieGenreList();

	}

	// Películas populares
	@GetMapping("/movies/popular")
	public String getPopularMovies() {
		return gp.getPopularMovies();

	}

	// Películas en cartelera
	@GetMapping("/movies/current")
	public String getCurrentMovies() {
		return gp.getCurrentMovies();

	}

	// Películas próximas
	@GetMapping("/movies/upcoming")
	public String getUpcomingMovies() {
		return gp.getUpcomingMovies();

	}

	// Películas mejor valoradas
	@GetMapping("/movies/toprated")
	public String getTopRatedMovies() {
		return gp.getTopRatedMovies();

	}

	// Filtrar Películas por genero
	@GetMapping("/movies/genre/{id_genre}")
	public String getMoviesByGenre(@PathVariable int id_genre) {
		return gp.getMoviesByGenre(id_genre);

	}
	

	// Buscar serie por ID
	@GetMapping("/movies/search/{id_movie}")
	public String getMovieById(@PathVariable long id_movie) {
		return gp.getMovieById(id_movie);

	}
	
	//GENEROS de series
	@GetMapping("/series/genrelist")
	public String getSerieGenreList() {
		return gp.getSerieGenreList();

	}
	
	// Series populares
	@GetMapping("/series/popular")
	public String getPopularSeries() {
		return gp.getPopularSeries();

	}

	// Series que se emiten hoy
	@GetMapping("/series/today")
	public String getSeriesAiringToday() {
		return gp.getSeriesAiringToday();

	}

	// Series en emisión
	@GetMapping("/series/onair")
	public String getSeriesOnAir() {
		return gp.getSeriesOnAir();

	}

	// Series mejor valoradas
	@GetMapping("/series/toprated")
	public String getTopRatedSeries() {
		return gp.getTopRatedSeries();

	}

	// Filtrar Series por genero
	@GetMapping("/series/genre/{id_genre}")
	public String getSeriesByGenre(@PathVariable int id_genre) {
		return gp.getSeriesByGenre(id_genre);

	}

	// Buscar serie por ID
	@GetMapping("/series/search/{id_serie}")
	public String getSeriesById(@PathVariable long id_serie) {
		return gp.getSeriesById(id_serie);

	}

}