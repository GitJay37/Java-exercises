package main;

public class Ciclo_For {

	public static void main(String[] args) {
		/* For loop
			variables del mismo tipo en la inicialización,
			colocar condición, por ultimo colocamos las sentencia que queramos separadas por coma.
			//For (Inicialización; Condidición; Itereación){}
		*/
		
		//for( int numA = 9, x = 1; x < 11; System.out.println(numA+" * "+ x + " = "+ numA * x), x++ ){}
		
		/* for( int numA = 9, x = 1; x < 11; ) {
			int result = numA * x;
			String message = numA+" * "+ x + " = "+ result;
			System.out.println(message);
			x++;
			}
		*/
		
		/*
			for (int numX = 1; numX < 21; numX++) {
				
				if(numX % 2 == 0) {
					System.out.println(numX);
				}
			}
		*/
		
		// Break
		
		/*
			int value = 10;
			
			switch(value) {
			
				case 10:
					System.out.println("El numero es igual a :"+value);
					break;
				default:
					System.out.println("El numero no es igual a :"+value);	
			}
			
			for (int x = 1;x < 31; x++) {
				if(x == 30 ) {
					break;
				}
				System.out.println(x);
			}
			System.out.println("Successfull loop");
		 */
		 /*
			for (int i = 0; i<3 ; i++) {
				System.out.print("Siguiente "+i+" :");
				
				for(int j = 0; j<100 ; j++) {
					if(j == 10) {
						break;
					}
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("Successfull loop");
		 */
		
		/* Continue
		
			for(int num = 1;num < 11;num++) {
				if(num == 5) {
					continue;
				}
				System.out.println(num);
			}
		*/
		
		// Sentencia unica, es necesario solo lanzar una sentencoia por bloque para ejecutar 
		// bloques de codigo sin llaves
		boolean valT = true;
			if(valT)
				System.out.println("True value!!");
			else
				System.out.println("False value!!");
			
			for(int num = 0; num < 11; num++)
				System.out.println(num);
	}		
}

