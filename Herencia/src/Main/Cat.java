package Main;

public class Cat extends Pet{
	
	public Cat(String name, String raza, int age) {
		super(name, raza, age);
	}
	
	@Override
	public void sleep() {
		System.out.println("The Cat is sleeping");
		super.sleep(); // Metodo heredado de la clase padre.
	}
}
