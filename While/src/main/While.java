package main;

public class While {

	public static void main(String[] args) {
		/* While

			int counter = 1;
			
			while(counter < 11){
				System.out.println("Junior "+counter);
				counter++;
			}
		 
		
			// 100 / 10 Al dividir cualquier numero entre 10 retornará un resultado que quita un digito al numero ingresado.
			// a contador se le suma un valor cada que el ciclo while itera el numero varInt
			
	
			int counter = 0, varInt = 345;
			
			while(varInt > 0){
				varInt = varInt / 10; 
				counter++;
			}
			
			System.out.println("El número ingresado cuenta con "+counter+" dígitos");
		*/
		
		// Do While
		
		int counter = 0;
		
		do{
			System.out.println(counter);
			counter++;
		}while(counter < 10);
	}
}


