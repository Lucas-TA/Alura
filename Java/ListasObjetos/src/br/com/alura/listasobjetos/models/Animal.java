package br.com.alura.listasobjetos.models;

public class Animal {
	private String name;
	private String genre;
	private String species;
	
	public Animal(String name, String genre, String species) {
		super();
		this.name = name;
		this.genre = genre;
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}	
	
	public void makeSong(String song) {
		System.out.println(getName() + ": makes a noise...");
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " | Genre: " + getGenre() + " | Species: " + getSpecies();
	}
}
