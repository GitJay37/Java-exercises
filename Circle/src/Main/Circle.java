package Main;

public class Circle {
	
	public static final float pi = 3.1415926535f; // Cuando un atributo es static le pertenece a la clase y no al objeto
	public float radio = 0f;
	
	public Circle(float radio) {
		this.radio = radio;
	}
	
	public float area() {
		return pi * (radio * radio);
	}
}
