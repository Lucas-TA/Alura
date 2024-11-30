package main;

import java.util.ArrayList;

import br.com.alura.listasobjetos.models.Animal;
import br.com.alura.listasobjetos.models.Dog;
import br.com.alura.listasobjetos.models.Product;

public class Main {
	public static void main(String[] args) {
		Dog caramelo = new Dog("Caramelo", "Male", "Dog");
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(caramelo);
		
		animalList.forEach(animal -> {
			System.out.println(animal);
			if (animal instanceof Dog dog) {
				dog.bark();
			}
		});
		
		Product rice = new Product("Rice", 25.00);
		Product apple = new Product("Apple", 8.99);
		
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(apple);
		productList.add(rice);
		
		double totalPrice = 0;
        for (int i = 0; i < productList.size(); i++) {
            double itemPrice = productList.get(i).getPrice();
            totalPrice += itemPrice;
        }
        System.out.println("Average price: " + totalPrice / productList.size());
	}
}
