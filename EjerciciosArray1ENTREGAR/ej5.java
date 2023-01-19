package EjerciciosArray1ENTREGAR;

public class ej5 {

	/*
	 * Dado un array de 50 números entre 1 y 100, aleatorios, escribir una lista
	 * ordenada con los valores que no aparecen en el array.
	 */
	public static void main(String[] args) {

		int[] numeros = new int[50];
		int[] array2 = new int[101];

		// Relleno el array con números aleatorios entre 1 y 100
		for (int i = 0; i < 50; i++) {
			numeros[i] = (int) (Math.random() * (100 - 1) + 1);
			System.out.print("A-" + numeros[i] + " "); // muestro el contenido del array tambien
		}

		// relleno el array2 con los numeros del 1 al 100 para poder
		// compararlos luego con los numeros aleatorios
		for (int i = 0; i < array2.length; i++) {
			array2[i] = i;
		}

		// comparamos el array de 50 con el de 100
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (numeros[i] == array2[j]) {
					array2[j] = 0; // lo igualo a cero para sacar luego los numeros
									// que no se repiten
				}
			}
		}

		for (int i = 0; i < array2.length; i++) {
			if (array2[i] != 0) {
				System.out.println(array2[i]);
			}
		}
	}

}
