package Main;

public class Dog {
	
	String name, raza;
	int age;
	
	// Parameters
	void setParams(String name, String raza, int age) { // ---> Parameters
		// this busca el argumento dado en la clase principal en vez de buscar la variable dada en lso parametros.
		this.name = name; 
		this.raza = raza;
		this.age = age;
	}
	
	void eat() {
		System.out.println("El perrito est� comiendo :)");
		}
		
	void sleep() {
		System.out.println("El perrito est� durmiendo zzz");
	}
	
	void bark() {
		System.out.println("El perrito est� ladrando >:P");
	}
}
