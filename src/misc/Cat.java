package misc;

public class Cat {

	final private String name;
	final private String id;
	final private boolean hairBalls;

	public Cat(String name, String id, boolean hairBalls) {
		this.name = name;	
		this.id = id;
		this.hairBalls = hairBalls;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String toString() {
		return String.format("%s (%s)", getName(), getId());
	}		

	public String says() {
		return "meow";
	}

	public boolean hasHairBalls() {
		return hairBalls;
	}

	public static void main(String[] args) {
		Cat c1 = new Cat("Mittens", "5432", true);
		Cat c2 = new Cat("Garfield", "8765", false);

		System.out.println(c1.getName() + " says " + c1.says());
		System.out.println(c2.getName() + " says " + c2.says());
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
