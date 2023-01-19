package EjerciciosArray1ENTREGAR;

public class ej6RellenarCuadrado {

	/*
	 * 6. Crea un programa que rellene un array de 4x4 de la siguiente manera: 
	 * 1 0 0 0
	 * 0 1 0 0 
	 * 0 0 1 0 
	 * 0 0 0 1
	 */

	public static void main(String[] args) {
		
		int[][] cuadrado = new int[4][4];
		
		for (int i = 0; i < cuadrado.length; i++) {
			 for (int j = 0; j < cuadrado[i].length; j++) {
				if(i == j) {
					cuadrado[i][j] = 1;
				} else {
					cuadrado[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado.length; j++) {
				System.out.print(cuadrado[i][j]);
			}System.out.println();
		}
	}
}
