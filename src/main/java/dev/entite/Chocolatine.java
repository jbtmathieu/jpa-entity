package dev.entite;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chocolatine {

	@Id
	private Integer id;

	private String nom;

	private Float temperature;

	private Float poids;
	
	

	public Chocolatine() {
		super();
	}

	public Chocolatine(Integer id, String nom, Float temperature, Float poids) {
		super();
		this.id = id;
		this.nom = nom;
		this.temperature = temperature;
		this.poids = poids;
	}

	public Chocolatine(String nom, Float temperature, Float poids) {
		super();
		this.nom = nom;
		this.temperature = temperature;
		this.poids = poids;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Chocolatine [id=" + id + ", nom=" + nom + ", temperature=" + temperature + ", poids=" + poids + "]";
	}
	
	
	

}
