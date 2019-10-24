package Main;

public class Array {

	public static void main(String[] args) {
		// Arrays
		
		/*
		
		1era forma de trabajar con arrays
		
		String nombres[];
		nombres = new String[3];
		
		nombres[0] = "First value";
		nombres[1] = "Second value";
		nombres[2] = "Third value";
		
		// Si llamo a lo sgte System.out.println( nombres[3] ); 
		// 3 = 0, 1, 2, 3.
		// Me arrojará error porque el array es de tres prosiciones y no cuatro.
		 
		2da forma de trabajar con arrays
		String nombres[] = {"Primer valor", "Segundo Valor", "Tercer Valor"};
		
		System.out.println( nombres[0] );
		System.out.println( nombres[1] );
		System.out.println( nombres[2] );
		
		3ra forma de trabajar con arrays:
		
		int notas[] = {2, 3, 3, 4, 5, 1};
		int sumT = 0;
		// Promedio es igual suma / total
		for( int index = 0; index < notas.length; index ++ ){
			sumT += notas[index];
		}
		float promedio = sumT / notas.length;
		System.out.println("La suma de todos los elementos es igual a: "+sumT);
		System.out.println("Promedio es igual a: "+promedio);
		
		4ta forma de trabajar arreglos el metodo foreach:
		
		int notas[] = {2, 3, 3, 4, 5, 1};
		int sumT = 0;
		// metodo foreach: sirve para recorrer arrays.
		for( int nota : notas ){
			System.out.println(nota); // Recorre los valores de cada indice en el array.
			sumT += nota;
		}	
		float promedio = sumT / notas.length;
		System.out.println("Total suma: "+ sumT);
		System.out.println("Total promedio: "+promedio);
		*/
		
		// Insertar valores:
		
		int values[] = new int[10];
		
		for(int index = 0; index < values.length; index ++) {
			values[index] = index;
		}
		
		for(int value : values){
			System.out.println( value );
		}
	}	
}
