package Main;

public class MainClass {

	public static void main(String[] args) {
		// Clases Abstractas
		
		Figura f[] = new Figura[2];
		
		Figura c = new Circle(9f);
		Figura t = new Triangle(10f, 5f);
		
		f[0] = c; // Circle
		f[1] = t; // Triangle
		
		System.out.println(f[0].area());
		System.out.println(f[1].area());
	}
}
