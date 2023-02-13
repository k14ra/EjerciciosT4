package ejerciciosRecursividad;

public class ej4Digitos {

	/*
	 * 4. Diseña un algoritmo que permita obtener los dígitos de un número, los
	 * muestre línea a línea, y posteriormente muestre la suma
	 */
	
	public static void main(String[] args) {
		int num = 90001;
		System.out.println("Resultado: " + sumaRecursiva(num));
	}
	
	public static int sumaRecursiva(int n) {
		if (n < 10) { //caso base: un solo digito
			System.out.println(n);
			return n;
		} else {
			int sum = sumaRecursiva(n/10);
			System.out.println(n%10);
			return n%10 + sum;
		}
	}
}
