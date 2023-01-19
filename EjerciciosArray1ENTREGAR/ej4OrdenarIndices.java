package EjerciciosArray1ENTREGAR;

public class ej4OrdenarIndices {

	/*
	 * . Desarrolla un programa que ordene los índices de un array de enteros, en
	 * función del contenido de cada elemento del array, de mayor a menor, es decir,
	 * hay que almacenar en otro array el índice del array original, en función del
	 * contenido del último.
	 */

	public static void main(String[] args) {

		//Necesito dos bucles for, uno para ir subiendo posiciones y otro para
		//recorrer los numeros.

		int[] numEnteros = { 2, 30, 40, 3};
		int[] indicesOrdenados = new int[numEnteros.length];
		
		for (int i = 0; i < numEnteros.length; i++) {
			
			int numMayor = 0;
			//Variable numMayor para: al recorrer las posiciones guardar el numMayor en esta variable
			//Cada vez que encuentre uno lo guardo aqui, a la vez tendria que guardar el indice.
			
			int indice = 0;
			
			for (int j = 0; j < numEnteros.length; j++) {
				if (numEnteros[j] > numMayor) {
					numMayor = numEnteros[j];
					indice = j; //pq j es la posicion en el array que contiene el numero mas grande
				}
			}
			numEnteros[indice] = 0;
			indicesOrdenados[i] = indice;

		}
		
		for (int numeros : indicesOrdenados) {
			System.out.println(numeros);
		}
	}

}
