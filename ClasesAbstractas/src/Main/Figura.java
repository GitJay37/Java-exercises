package Main;

public abstract class Figura {
	
	private int numLados;
	
	public Figura() {
		this.numLados = 0;
	}

	public abstract float area(); // Abstract define que hacer, pero no como se debe hacer
}
