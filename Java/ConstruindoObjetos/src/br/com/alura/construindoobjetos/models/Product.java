package br.com.alura.construindoobjetos.models;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product:" + getName() + " Price: R$" + getPrice() + ",00";
	}
	
	
}
