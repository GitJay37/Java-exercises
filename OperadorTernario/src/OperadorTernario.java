
public class OperadorTernario {

	public static void main(String[] args) {
		/* Ternary operator:
			
			expression1 ? expression2 : expression3
			
		*	expression 1 = If the first expression is true then the statement will be execute
			expression 2 = If the second expression is true then the statement will be execute
		*/
		
		String result = 10 < 2 ? "El numero es mayor!" : "El numero es menor";
		int numbers = !true ? 1 : 2;
		
		System.out.println(result);
		System.out.println(numbers);
	}

}
