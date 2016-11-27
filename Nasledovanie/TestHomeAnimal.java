package abc;

public class TestHomeAnimal {

	public static void main(String[] args) {

		HomeAnimal[] my = new HomeAnimal[2];
		my[0] = new Cat("Гарольд (кот)");
		my[1] = new Dog("Боб (собака)");
		
		RoboCat a = new RoboCat();
	
		System.out.println(RCat.name);
		System.out.println(a.bark());
		
		for(int i = 0; i < my.length; i++) {
		System.out.println(my[i].getName());
		my[i].bark();
		}
	}

}
