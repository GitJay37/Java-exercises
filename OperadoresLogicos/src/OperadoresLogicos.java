
public class OperadoresLogicos {

	public static void main(String[] args) {
		/* Logic operators:
			
			And(&&), Not(!true) and Or(||);
		*/
		
		
		boolean result;
		
		result = 5 >= 5 && true &&  10 > 9;
		System.out.println(result);
		
		result = false || false || false || true; 
		System.out.println(result);
		
		result = (5 >= (2*3) || true) && (true && 30 > 2);
		System.out.println(result);
		
		System.out.println(!result);
	}
}