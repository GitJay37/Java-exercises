package Main;

public class Pet {
	
	public String name;
	public String raza;
	public int age;
	
	public Pet(String name, String raza, int age) { // Metodo Constructor
		this.name = name;
		this.raza = raza;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("The Pet "+name+" is sleeping");
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
