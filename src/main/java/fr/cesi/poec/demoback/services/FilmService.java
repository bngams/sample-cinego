package fr.cesi.poec.demoback.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cesi.poec.demoback.models.Film;
import fr.cesi.poec.demoback.repositories.FilmRepository;

@Service
public class FilmService {
	
	private FilmRepository filmRepo;

	@Autowired
	FilmService(FilmRepository filmRepo) {
	}
	
	public List<Film> findAllFilms() {
		return (List<Film>) filmRepo.findAll();
	}
}
