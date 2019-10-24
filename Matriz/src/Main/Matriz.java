package Main;

public class Matriz {

	public static void main(String[] args) {
		// Matriz
		// 1er valor corresponde a las filas, 2do valor corresponde a las columns.
		// primer elemeto es x (vertical), segundo elemto es y (horizontal);
		// matriz.length retorna la cantidad de filas que tiene la matriz
		// matriz[posX].length retorna la cantidad de columns de la matriz.
		int matriz[][] = new int[4][3];
		
		matriz[0][0] = 1; 
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 4; 
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		
		matriz[2][0] = 7; 
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		matriz[3][0] = 10; 
		matriz[3][1] = 11;
		matriz[3][2] = 12;
		
		for(int posX = 0; posX < matriz.length; posX ++) {
			
			for(int posY = 0; posY < matriz[posX].length; posY ++) {
				matriz[posX][posY] = posY + 1 ;
			}
		}
		// Ciclo foreach:
		for(int[] fila : matriz){
			for(int column : fila){
				System.out.println(column);
			}
		}
	}
}
