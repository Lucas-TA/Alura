package br.com.alura.listasobjetos.models;

public class Product {
	private String name;
	private double price;
	private double totalPrice;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	public double getTotalPrice(double itemPrice) {
		return totalPrice += itemPrice;
	}
	
	
}
