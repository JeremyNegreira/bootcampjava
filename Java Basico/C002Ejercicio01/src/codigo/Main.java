package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello
	 * necesita un programa que, a partir de que un usuario ingrese su edad,
	 * determine mediante un mensaje en pantalla si la persona puede o no ingresar
	 * al evento. El programa debe mostrar (según cada caso) un mensaje informando
	 * la situación.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.print("Ingrese su edad ");
			int edad = scanner.nextInt();

			if (edad >= 18) {
				System.out.println("Disfrute del evento.");
			} else {
				System.out.println("Usted es menor de edad y no puede ingresar al recital.");
			}
		}
	}

}
