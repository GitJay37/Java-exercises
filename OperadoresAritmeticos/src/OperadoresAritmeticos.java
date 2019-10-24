
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		/* Arithmetic operators:
		 * 
		 * variableX++: Increase one value, 
		 * variableX--: Decrease one value, 
		 * variableX +=, variableX *=, variableX /=; sum, multiplication, division;
			variableX = variableX + 1;
			Casting (float)variableX I can convert a kind of data if I want to do it
		*/
		int variableX = 70, variableY = 30, result;
		float numA = 25.5f, numB = 70.5f, resultf;
		
		final int numC = 33; 
		 
		
		
		result = variableX + variableY;
		System.out.println(result);
		
		result = variableX - variableY;
		System.out.println(result);
		
		result = variableX * variableY;
		System.out.println(result);
		
		result = variableX / variableY;
		System.out.println(result);
		
		result = variableX % variableY;
		System.out.println(result);
		
		resultf = numA + numB + numC;
		System.out.println((int)resultf);
	}
}

