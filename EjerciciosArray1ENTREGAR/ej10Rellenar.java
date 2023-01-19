package EjerciciosArray1ENTREGAR;

public class ej10Rellenar {

	/*
	 * Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura
	 * 0 1 2 3 4 1 2 3 4 3 2 3 4 3 2 3 4 3 2 1 4 3 2 1 0
	 */

	public static void main(String[] args) {
		
		int[][] cuadrado = new int[5][5];
		
		for (int i = 0; i < cuadrado.length; i++) {
			//cuando j vale 4 sale del bucle y vale 0, haciendo i++ despues.
			for (int j = 0; j < cuadrado[i].length; j++) {
				if (i + j <= 4) {
					cuadrado[i][j] = i + j;
				} else {
					cuadrado[i][j] = 4 - ((i + j) - 4);
				}
			}
		}
		
		//VISUALIZAR CONTENIDO DEL ARRAY
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[i].length; j++) {
				System.out.print(cuadrado[i][j] + " ");
			}
			System.out.println();
		}
	}
}
