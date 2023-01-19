package EjerciciosArray1ENTREGAR;

public class ej8CuadradoMagico {

	/*
	 * . Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro
	 * mágico aquel en el que las filas, las columnas y las diagonales suman igual.
	 */

	public static void main(String[] args) {

		int[][] cuadro = new int[5][5];
		int[] sumaFilas = new int[cuadro.length];
		int[] sumaColumnas = new int[cuadro.length];
		int diagonal1 = 0;
		int diagonal2 = 0;
		boolean magico = false;

		// Relleno el array con números aleatorios entre 1 y 5
		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				cuadro[i][j] = (int) (Math.random() * (5 - 1) + 1);
			}
		}

		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				if (i == j) {
					diagonal1 += cuadro[j][i];
				}
				if (i + j == cuadro.length - 1) {
					diagonal2 += cuadro[i][j];
				}
			}
		}

		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro[i].length; j++) {
				sumaFilas[i] += cuadro[i][j];
				sumaColumnas[i] += cuadro[j][i];
			}
		}

		for (int i = 0; i < sumaFilas.length - 1; i++) {
			if (sumaFilas[i] == sumaFilas[i + 1]) {
				if (sumaColumnas[i] == sumaColumnas[i + 1]) {
					if (diagonal1 == diagonal2) {
						magico = true;
					}
				}
			}
		}

		for (int i = 0; i < cuadro.length; i++) {
			for (int j = 0; j < cuadro.length; j++) {
				System.out.print(cuadro[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < sumaFilas.length; i++) {
			System.out.println("Suma filas: " + sumaFilas[i]);
		}
		for (int i = 0; i < sumaColumnas.length; i++) {
			System.out.println("Suma columnas" + sumaColumnas[i]);
		}
		
		
		if(magico == true) {
			System.out.println("Es un cuadro magico");
		} else {
			System.out.println("NO es un cuadro magico");
		}
	}
}
