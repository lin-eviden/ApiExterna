package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.business.GestorProducto;

@RestController
public class ControladorProducto {

	@Autowired
	private GestorProducto gp;

	// Películas populares
	@GetMapping("/peliculas/populares")
	public String getPeliculasPopulares() {
		return gp.getPeliculasPopulares();

	}

	// Películas en cartelera
	@GetMapping("/peliculas/actuales")
	public String getPeliculasActuales() {
		return gp.getPeliculasActuales();

	}

	// Películas próximas
	@GetMapping("/peliculas/proximas")
	public String getPeliculasProximas() {
		return gp.getPeliculasProximas();

	}

	// Películas mejor valoradas
	@GetMapping("/peliculas/valoradas")
	public String getPeliculasValoradas() {
		return gp.getPeliculasValoradas();

	}

	// Filtrar Películas por genero
	@GetMapping("/peliculas/genero/{id_genero}")
	public String getPeliculasGenero(@PathVariable int id_genero) {
		return gp.getPeliculasGenero(id_genero);

	}

	// Buscar serie por ID
	@GetMapping("/peliculas/buscar/{id_pelicula}")
	public String getPeliculasPorId(@PathVariable long id_pelicula) {
		return gp.getPeliculasPorId(id_pelicula);

	}

	// Series populares
	@GetMapping("/series/populares")
	public String getPopulares() {
		return gp.getSeriesPopulares();

	}

	// Series que se emiten hoy
	@GetMapping("/series/hoy")
	public String getActuales() {
		return gp.getSeriesHoy();

	}

	// Series en emisión
	@GetMapping("/series/emision")
	public String getProximas() {
		return gp.getSeriesEmision();

	}

	// Series mejor valoradas
	@GetMapping("/series/valoradas")
	public String getValoradas() {
		return gp.getSeriesValoradas();

	}

	// Filtrar Series por genero
	@GetMapping("/series/genero/{id_genero}")
	public String getSeriesGenero(@PathVariable int id_genero) {
		return gp.getSeriesGenero(id_genero);

	}

	// Buscar serie por ID
	@GetMapping("/series/buscar/{id_serie}")
	public String getSeriesPorId(@PathVariable long id_serie) {
		return gp.getSeriesPorId(id_serie);

	}

}