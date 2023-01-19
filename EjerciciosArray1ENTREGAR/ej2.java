package EjerciciosArray1ENTREGAR;

public class ej2 {

	/*
	 * Dado un array de números enteros, realiza un programa que indique si está
	 * ordenado o no.
	 */
	
	public static void main(String[] args) {
		
		boolean booleano = false;
		int contador = 0;
		int[] numerosEnteros = {2, 3, 4, 3};
		
		System.out.println("¿El array esta ordenado? ");
		
		for (int i = 0; i < numerosEnteros.length-1; i++) {
			
			contador = numerosEnteros[i+1];
			if(numerosEnteros[i] < contador) {
				booleano = true;
			}else {
				booleano = false;
			}
			
		}
		
		System.out.println(booleano);
	}
}


/*

*/