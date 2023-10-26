package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * a) Escribir un programa en Java que muestre por pantalla un mensaje de
	 * Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
	 * 
	 * b) Una vez logrado esta primera parte, permitir que se almacene el nombre del
	 * usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo:
	 * “Hola Eduardo, bienvenida al sistema”.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// a) Escribir un programa en Java que muestre por pantalla un mensaje de
		// Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.
		
		System.out.println("Hola, bienvenido al sistema");

		// b) Una vez logrado esta primera parte, permitir que se almacene el nombre del
		// usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo:
		// “Hola Eduardo, bienvenida al sistema”.
		
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Por favor, ingrese su nombre: ");
			String nombre = scanner.nextLine();

			System.out.println("Hola " + nombre + ", bienvenido al sistema");
		}
	}

}
