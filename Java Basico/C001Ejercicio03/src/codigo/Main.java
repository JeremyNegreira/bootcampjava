package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * Escribe un programa que permita calcular el área de un triángulo y luego
	 * mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular
	 * esto es: (base * altura) / 2 (base por altura dividido dos).
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Escribe un programa que permita calcular el área de un triángulo y luego
		// mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular
		// esto es: (base * altura) / 2 (base por altura dividido dos).

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la base y altura del triángulo");
			double base = scanner.nextDouble();
			double altura = scanner.nextDouble();

			double area = (base * altura) / 2;

			System.out.println("El área del triángulo es " + area);
		}

	}

}
