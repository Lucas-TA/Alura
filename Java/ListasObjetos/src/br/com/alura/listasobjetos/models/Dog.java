package br.com.alura.listasobjetos.models;

public class Dog extends Animal {

	public Dog(String name, String genre, String species) {
		super(name, genre, species);
	}
	
	public void bark() {
        System.out.println(getName() + " is barking: Woof! Woof!");
    }

}
