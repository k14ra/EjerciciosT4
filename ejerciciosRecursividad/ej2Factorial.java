package ejerciciosRecursividad;

import java.math.BigInteger;

public class ej2Factorial {

	/*2. Calcula el factorial de un número, de forma recursiva.*/
	
	public static void main(String[] args) {
		BigInteger num = new BigInteger("5");
		System.out.println("Factorial de " + num + "! es igual a: " + factorial(num));;	
	}
	
	public static BigInteger factorial(BigInteger num) {
		if(num == null || num.signum() == -1) {
			return null;
		}
		else if (num.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {
			return num.multiply(factorial(num.subtract(BigInteger.ONE)));
		}
	}
}
