package ejerciciosRecursividad;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String palabra = "Hola";
		System.out.println(invertirPalabra(palabra, palabra.length() -1));
	}

	private static String invertirPalabra(String palabra, int index) {
		
		if(index == 0) { // Caso base
			return String.valueOf(palabra.charAt(index));
		} else {			
			return palabra.charAt(index) + (invertirPalabra(palabra, index-1));
		}
		
	}

}
