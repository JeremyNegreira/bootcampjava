package codigo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			// Inicializar el mapa de asientos
			char[][] mapaAsientos = new char[5][5];
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					mapaAsientos[i][j] = 'O';
				}
			}

			boolean finalizar = false;

			while (!finalizar) {
				// Mostrar el mapa de asientos
				System.out.println("Asientos:");
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(mapaAsientos[i][j] + " ");
					}
					System.out.println();
				}

				// Solicitar al usuario que elija un asiento
				System.out.print("Ingrese la fila (1-5) y el número de asiento (1-5): ");
				int fila = scanner.nextInt() - 1;
				int numeroAsiento = scanner.nextInt() - 1;

				// Verificar si el asiento está disponible
				if (fila >= 0 && fila < 5 && numeroAsiento >= 0 && numeroAsiento < 5) {
					if (mapaAsientos[fila][numeroAsiento] == 'O') {
						mapaAsientos[fila][numeroAsiento] = 'X';
						System.out.println("Asiento reservado con éxito");
					} else {
						System.out.println("EL asiento ya está ocupado");
					}
				} else {
					System.out.println("Asiento no válido");
				}

				// Preguntar al usuario si desea continuar realizando reservas
				System.out.print("¿Desea realizar otra reserva? (No/N para cancelar): ");
				String respuesta = scanner.next();
				if (respuesta.equalsIgnoreCase("No") || respuesta.equalsIgnoreCase("N")) {
					finalizar = true;
				}
			}
		}

	}

}
