package Main;

public class Triangle extends Figura {
	
	// Las clases hijas se encarganb de definir como se debe hacer algo.
	
	private float base;
	private float height;
	
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public float area() {
		return (base * height)/ 2;
	}
}
