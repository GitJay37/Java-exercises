
public class Variables {

	public static void main(String[] args) {
		/* There are four kinds of variables:
			
			Integers, floats, strings and booleans.
		*/
		
		int num1 = 1, num2 = 30;
		int result; 
		float pi = 3.1415f; 
		
		final float someData = 16.323f; // A constant variable  can't be replaced
		final int num3 = 10;
		final boolean verdad = true;
		
		result = num1 + num2 + num3;
		
		System.out.println(result + someData);
		System.out.println(!verdad);
		System.out.println(pi + result);		
	}

}
