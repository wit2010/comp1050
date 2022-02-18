package pet;

public class Cat extends Pet {

	public Cat(String name, String id) {
		super(name, id);
	}

	@Override
	public String says() {
		return "Meow";
	}

}
