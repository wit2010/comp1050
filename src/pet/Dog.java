package pet;

public class Dog extends Pet {

	public Dog(String name, String id) {
		super(name, id);
	}

	@Override
	public String says() {
		return "Woof";
	}

	
}
