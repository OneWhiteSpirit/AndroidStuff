package abc;

public abstract class HomeAnimal {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public HomeAnimal(String theName) {
		name = theName;
	}
	
	public void bark() { }
}
