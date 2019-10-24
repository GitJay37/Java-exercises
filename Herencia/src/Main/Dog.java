package Main;

public class Dog extends Pet{
	
	public Dog(String name, String raza, int age) {
		super(name, raza, age); // Herencia del metodo constructor padre.
	}
	
	@Override
	public void sleep() {
		super.sleep(); // Metodo Heredado de la clase padre
		System.out.println("The Dog is sleeping");
	}
}