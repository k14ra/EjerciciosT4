package ejerciciosRecursividad;

public class Ejercicio6 {

	private static int numMovimientos = 0;

	public static void main(String[] args) {

		int numDiscos = 10;
		System.out.println("Algoritmo de Hanoi con " + numDiscos + " discos.");
		
		char tOrigen = 'A', tAux = 'B', tDestino = 'C';
		
		// Hanoi
		hanoi(numDiscos, tOrigen, tAux, tDestino);
		
		System.out.println("El algoritmo acaba con " + numMovimientos + " movimientos");
	}
	
	

	private static void hanoi(int numDiscos, char origen, char aux, char destino) {
		if(numDiscos == 1) { // Caso base
			mover(origen, destino);
		} else {
			// Muevo de origen al aux
			hanoi(numDiscos-1, origen, destino, aux);
			mover(origen, destino);
			// Muevo de aux a destino
			hanoi(numDiscos-1, aux, origen, destino);
		}
		
	}



	private static void mover(char origen, char destino) {
		System.out.println(numMovimientos++ + ": " 
					+ origen + " -> " + destino);
	}
}
