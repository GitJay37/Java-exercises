package Main;

public class Circle extends Figura {

	public static final float pi = 3.1415f;
	
	private float radio;
	
	public Circle(float radio) {
		this.radio = radio;
	}	
	
	@Override
	public float area() {
		return Circle.pi * (this.radio * this.radio);
	}
}