package Main;

public class MainClass {

	public static void main(String[] args) {
		// Sobrecarga de metodos
		
		Calc calculator = new Calc();
		
		float result = calculator.suma(35, 534, 32.5f, -21, 34.21f, 0.9f);
		System.out.println("El resultado de la suma es igual a: "+result);
	}
}