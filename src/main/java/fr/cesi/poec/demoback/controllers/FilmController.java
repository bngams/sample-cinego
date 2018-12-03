package fr.cesi.poec.demoback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cesi.poec.demoback.models.Film;
import fr.cesi.poec.demoback.services.FilmService;


@RestController
public class FilmController {
	
	private FilmService filmService;

	@Autowired
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	
	@GetMapping("/film")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<Film>> getAll() {
		return new ResponseEntity<List<Film>>(
				filmService.findAllFilms(), 
				HttpStatus.OK);
	}
}
