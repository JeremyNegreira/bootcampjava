package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * Crea un programa que pida al usuario que ingrese por teclado dos números
	 * enteros y realice las siguientes operaciones con ellos: suma, resta,
	 * multiplicación y división. Muestra por pantalla/consola los resultados de
	 * cada una de las operaciones con un mensaje amigable para el usuario.
	 * 
	 * Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con
	 * lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar
	 * ésta situación?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese dos números enteros ");
			int numero1 = scanner.nextInt(), numero2 = scanner.nextInt();

			int suma = numero1 + numero2;
			int resta = numero1 - numero2;
			int multiplicacion = numero1 * numero2;

			// Extra: Comprobamos que no sea una indeterminación al dividir entre 0
			double division = 0;
			if (numero2 != 0) {
				division = (double) numero1 / numero2;
			}

			System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
			System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);
			System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);

			// Extra: Decimos si no es posible dividir y en caso negativo decimos el
			// cociente
			if (numero2 == 0) {
				System.out.println("División: No es posible dividir por 0.");
			} else {
				System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);
			}
		}
	}

}
