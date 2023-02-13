package ejerciciosRecursividad;

public class ej3BusquedaBinaria {

	/*
	 * 3. Desarrolla el algoritmo de búsqueda binaria. “La búsqueda binaria funciona
	 * en arrays ordenados. El algoritmo comienza por comparar el elemento del medio
	 * del array con el valor buscado. Si el valor buscado es igual al elemento del
	 * medio, se devuelve la posición. Si el valor buscado es menor o mayor que el
	 * elemento del medio, la búsqueda continua en la primera o segunda mitad,
	 * respectivamente, dejando la otra mitad fuera de consideración.”
	 */

	public static void main(String[] args) {
		Integer[] listado = { 1, 2, 3, 6, 7, 8, 9, 10, 11, 14, 16, 19, 21 };

		//int numBuscar = 3;
		System.out.println("Posicion busqueda binaria: " + busquedaBinaria(listado, 0, listado.length - 1, 9));

	}

	private static int busquedaBinaria(Integer[] listado, int i_inferior, int i_superior, int numBuscar) {
		if(i_inferior <= i_superior) {
			int i_medio = (i_inferior + i_superior) / 2;
			System.out.println(String.format("Indice inferior %d - Indice superior %d "
					+ "- Indice medio &d - Valor busqueda %d", i_inferior, i_superior, i_medio, numBuscar));
		
			if(listado[i_medio] == numBuscar) {
				return i_medio;
			} else if (listado[i_medio] > numBuscar) {
				//El elemento a buscar esta en la mitad inferior de la lista.
				return busquedaBinaria(listado, i_inferior, i_medio - 1, numBuscar);
			} else {
				//El elemento a buscar esta en la mitad superior de la lista.
				return busquedaBinaria(listado, i_inferior + 1, i_superior, numBuscar);
			}
		}
		return -1;
	}
}
