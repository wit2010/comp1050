package pet;

public class Pet {

	private String name;
	private String id;

	public Pet(String name, String id) {
		super();
		this.name = name;	
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("%s (%s)", getName(), getId());
	}		

	public String says() {
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pet))
			return false;
		Pet other = (Pet) obj;
		if (!getId().equals(other.getId()))
			return false;
		return true;
	}
	
	

}
