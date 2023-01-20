package EjerciciosArray1ENTREGAR;

import java.util.Random;
import java.util.Scanner;

public class ej1 {

	/*
	 * En un array de 20 elementos hay almacenados números enteros. Haz un programa
	 * que pida un número y diga cuántas veces aparece el número dentro del array.
	 */
	
	public static void main(String[] args) {
		
		int contador = 0;
		//int[] numerosEnteros = {2, 7, 34, 475, 4, 9, 8, 2, 2, 9, 8, 10, 19, 20, 18, 45, 45, 2, 7, 6};
		int[] numerosEnteros = new int[20];
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		sc.close();
		
		/*
		for (int i = 0; i < numerosEnteros.length; i++) {
			if(numerosEnteros[i] == num) {
				contador++;
			}
		}*/
		
		for (int i = 0; i < numerosEnteros.length; i++) {
			numerosEnteros[i] = r.nextInt(51);
			//RANDOM GENERA NUMEROS DESDE 0 HASTA EL NUMERO
			//INDICADO ¡EXCLUIDO!			//Para numeros del 1 al 10 seria: r.nextInt(11) + 1;
			
		}
		
		for(int item : numerosEnteros) {
			if(item == num) {
				contador++;
			}
		}
		
		System.out.println("El numero introducido aparece " + contador + " veces dentro del array");
		
	}
}
