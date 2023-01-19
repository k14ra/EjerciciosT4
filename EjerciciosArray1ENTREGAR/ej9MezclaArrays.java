package EjerciciosArray1ENTREGAR;

public class ej9MezclaArrays {

	/*
	 * Crea un programa que mezcle dos arrays ordenados de N elementos, consiguiendo
	 * otro array de N*2 elementos igualmente ordenados.
	 */
	
	//3 4 6 8 15 18 21 22 25 25 40 47  --> resultado esperado

	public static void main(String[] args) {

		int[] array1 = { 4, 8, 15, 22, 25, 40 };
		int[] array2 = { 3, 6, 18, 21, 25, 47 };
		int[] juntos = new int[array1.length + array2.length];
		int cont = 0;
		int temporal = 0;
		
		//con estos dos for met el contenido de array1 y array2 en l array juntos
		for (int i = 0; i < array1.length; i++) {
			juntos[i] = array1[i];
		}
		for (int i = juntos.length / 2; i < juntos.length; i++) {
			juntos[i] = array2[cont];
			cont++;
		}
		//------------------------

		//ORDENO EL ARRAY JUNTOS
		for (int i = 0; i < juntos.length; i++) {
			for (int j = i+1; j < juntos.length; j++) {
				if(juntos[i] > juntos[j]) {
					temporal = juntos[i];
					juntos[i] = juntos[j];
					juntos[j] = temporal;
				}
			}
		}
		
		for (int i = 0; i < juntos.length; i++) {
			System.out.println(juntos[i]);
		}

	}
}
