package br.com.alura.construindoobjetos.models;

public class PerishableProduct extends Product {
	private String validateDate;

	public PerishableProduct(String name, int price, int quantity, String validateDate) {
		super(name, price, quantity);
		this.validateDate = validateDate;
	}
	
}
