package Main;

public class MainClass {
	// Main Class
	public static void main(String[] args) {
		
		Dog mascota = new Dog(); // Object or instance
		
		// Arguments 
		mascota.setParams("Yonclin", "French poodle", 1); // ---> Arguments 
		
		System.out.println("El nombre de la mascota es: "+mascota.name);
		System.out.println("La raza de la mascota es: "+ mascota.raza);
		System.out.println("La edad de la mascota es: "+ mascota.age);
		
		System.out.println();
		
		// Instancia de metodos en la clase Dog
		mascota.bark();
		mascota.eat();
		mascota.sleep();
	}
}
