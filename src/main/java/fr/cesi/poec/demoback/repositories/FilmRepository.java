package fr.cesi.poec.demoback.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.cesi.poec.demoback.models.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long>{
	//@Query("SELECT * FROM films WHERE film.date >= ?1 and film.cinema_id = ?2")
	//List<Film> findComingFilmsForCinema(Date date, Long cinema_id);
}
