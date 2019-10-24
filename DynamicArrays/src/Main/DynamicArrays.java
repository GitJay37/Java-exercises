package Main;

public class DynamicArrays {

	public static void main(String[] args) {
		// Dynamic Arrays
		
		int calificaciones[][] = new int[5][]; // Array de 5 filas
		calificaciones[0] = new int[1]; //E
		calificaciones[1] = new int[2];	//A
		calificaciones[2] = new int[3]; //D
		calificaciones[3] = new int[4];	//B
		calificaciones[4] = new int[5];	//C
		
		calificaciones[0][0] = 4;
		
		calificaciones[1][0] = 4;
		calificaciones[1][1] = 3;
		
		calificaciones[2][0] = 4;
		calificaciones[2][1] = 3;
		calificaciones[2][2] = 4;
		
		calificaciones[3][0] = 2;
		calificaciones[3][1] = 3;
		calificaciones[3][2] = 5;
		calificaciones[3][3] = 3;
		
		calificaciones[4][0] = 4;
		calificaciones[4][1] = 3;
		calificaciones[4][2] = 5;
		calificaciones[4][3] = 3;
		calificaciones[4][4] = 4;
		
		for(int []calPorAlumn : calificaciones) {
			
			for(int calificacion : calPorAlumn) {
				System.out.print(calificacion + " ");
			}
			System.out.println();
		}
	}

}
