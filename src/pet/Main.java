package pet;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", "1234");
		Dog d2 = new Dog("Rover", "6789");
		
		// Primitive array
		Dog[] dogs = new Dog[] { d1, d2 };
				
		for (Dog dog : dogs) {
			System.out.printf("%s says '%s'%n", dog.toString(), dog.says());
		}
		
		// Complex array
		ArrayList<Dog> dogs1 = new ArrayList<>();
		
		dogs1.add(d1);
		dogs1.add(d2);
		
		for (Dog dog : dogs1) {
			System.out.printf("%s says '%s'%n", dog.toString(), dog.says());
		}
	}
}
