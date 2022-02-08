package pet;

public class Main {
	public static void main(String[] args) {
		Dog[] dogs = new Dog[] {
				new Dog("Spot", "1234"),
				new Dog("Rover", "6789")
		};
				
		for (Dog dog : dogs) {
			System.out.printf("%s says '%s'%n", dog.toString(), dog.says());
		}

	}
}
