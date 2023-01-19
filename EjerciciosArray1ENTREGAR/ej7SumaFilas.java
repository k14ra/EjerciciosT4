package EjerciciosArray1ENTREGAR;


public class ej7SumaFilas {

	/*
	 * . Dado un array de 3x3 elementos, calcular la suma de sus filas y sus
	 * columnas almacenándolas en dos array de 3 elementos.
	 */

	public static void main(String[] args) {

		int[][] figura = { { 1, 1, 3}, { 1, 1, 5}, {2, 1, 4}};

		int[] suma1 = new int[3];
		int[] suma2 = new int[3];
		
		for (int i = 0; i < figura.length; i++) {
			for (int j = 0; j < figura[i].length; j++) {
				suma1[i] += figura[i][j];
				suma2[j] += figura[i][j];
			}
		}
		
		for (int i = 0; i < figura.length; i++) {
			for (int j = 0; j < figura.length; j++) {
				System.out.print(figura[i][j]);
			}
			System.out.println();
		}
		
		for (int item : suma1) {
			System.out.println(item);
		}
		for (int item : suma2) {
			System.out.println(item);
		}
	}
}
