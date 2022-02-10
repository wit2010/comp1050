package misc;

public class Dog {

	final private String name;
	final private String id;

	public Dog(String name, String id) {
		this.name = name;	
		this.id = id;
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
		return "woof";
	}

	public void says(int count) {
		for (int i = 0; i < count; i++)
			System.out.println("woof");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", "1234");
		Dog d2 = new Dog("Spot", "1234");

		if (d1 == d2)
			System.out.println("(d1 == d2) is true");
		else
			System.out.println("(d1 == d2) is false");
			
		System.out.println(d1.getName() + " says " + d1.says());
		System.out.println(d2.getName() + " says " + d2.says());
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
