package ejerciciosRecursividad;

import java.util.Scanner;

public class ej1Fibonacci {

	/*
	 * 1. Escribe un método recursivo Fibonacci() que calcule el valor de la serie
	 * para un valor dado, siendo: 
	 * F(1)=0 
	 * F(2)=1 
	 * F(n)=F(n-1)+F(n-2), para n>=3
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		sc.close();
		
		System.out.println(fibonacci(numero));
	
	}
	
	public static int fibonacci(int numero) {
		if(numero == 1) {  //caso base si la posicion es 0
			return 0;
		} else if (numero == 2) { //caso base si la pos es 1
			return 1;
		} else {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		}
	} 
}
