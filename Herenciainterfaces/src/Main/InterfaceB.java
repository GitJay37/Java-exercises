package Main;

public interface InterfaceB {
	
	public abstract void showMessage();
	
	public default void greet() {
		System.out.println("Saludando desde la interface B");
	}
}
