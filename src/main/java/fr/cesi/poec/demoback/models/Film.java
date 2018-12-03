package fr.cesi.poec.demoback.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="film")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	@OneToMany(mappedBy="film")
	private List<Seance> seances;
}
