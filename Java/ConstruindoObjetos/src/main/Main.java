package main;

import java.util.ArrayList;

import br.com.alura.construindoobjetos.models.PerishableProduct;
import br.com.alura.construindoobjetos.models.Product;

public class Main {
	public static void main(String[] args) {
		Product laptop = new Product("Laptop", 2899, 1);
		Product keyboard = new Product("Keyboard", 299, 1);
		Product mouse = new Product("Mouse", 45, 1);
		
		ArrayList<Product> products = new ArrayList<>();
		products.add(laptop);
		products.add(keyboard);
		products.add(mouse);
		
		System.out.println("The list contains: " + products.size() + " itens");
		System.out.println("Product list: " + products.toString());
		
		PerishableProduct rice = new PerishableProduct("Rice", 24, 1, "20/12/2027");
		System.out.println(rice.toString());
		
	}
	
}
