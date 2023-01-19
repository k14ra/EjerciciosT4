package EjerciciosArray1ENTREGAR;

import java.util.Scanner;

/*
 * Crea una agenda para almacenar nombres y direcciones de N personas. Después
 * haz un programa que permita ir consultando el nombre y la dirección de las
 * personas almacenadas.*/

public class ej3Init {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas personas quiere crear en la agenda? ");
		int numPer = sc.nextInt();
		String nombre = "";
		String direccion = "";

		ej3ClasePersona[] Agenda = new ej3ClasePersona[numPer];

		for (int i = 0; i < numPer; i++) {
			System.out.println("Nombre: ");
			nombre = sc.next();
			System.out.println("Direccion: ");
			direccion = sc.next();
			
			ej3ClasePersona persona = new ej3ClasePersona(nombre, direccion);
			Agenda[i] = persona;
		}
		
		for (int j = 0; j < Agenda.length; j++) {
			System.out.println(Agenda[j]);
		}

		sc.close(); 
	}
}
