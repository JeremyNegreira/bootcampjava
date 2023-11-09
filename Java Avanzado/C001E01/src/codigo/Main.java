package codigo;

import java.util.Scanner;

public class Main {

	private static int numeroAsientosDisponibles = 20;

	/**
	 * Imagina que estás desarrollando un sistema de reservas de vuelos para una
	 * aerolínea. Los usuarios pueden realizar reservas de vuelos proporcionando
	 * información como su nombre, destino, fecha de viaje y número de asientos
	 * deseados. Tu tarea es implementar una función de reserva de vuelos que valide
	 * los datos ingresados y maneje excepciones si los datos son incorrectos o si
	 * no hay suficientes asientos disponibles en el vuelo.
	 * 
	 * Debes crear una excepción personalizada, por ejemplo,
	 * ReservaInvalidaException, que se lance en situaciones excepcionales, como
	 * cuando un usuario intenta reservar más asientos de los disponibles o si falta
	 * información esencial. La excepción personalizada debe proporcionar un mensaje
	 * claro sobre la causa del error.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Bienvenido a la aplicación de reserva de vuelos.");

		String nombre = "", destino = "", fecha = "";
		int nAsientos = 0;

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Introduzca su destino.");
			destino = scanner.nextLine();

			System.out.println("Introduzca su fecha de viaje (DD/MM/YYYY).");
			fecha = scanner.nextLine();

			System.out.println("Introduzca su nombre.");
			nombre = scanner.nextLine();

			System.out.println("Introduzca cuántos asientos desea.");
			nAsientos = Integer.parseInt(scanner.nextLine());

			// Se comprueba que campos están vacíos y si hay suficientes asientos
			if (nombre.isEmpty() || destino.isEmpty() || fecha.isEmpty() || numeroAsientosDisponibles < nAsientos) {
				String errMessage = "No se ha podido realizar la reserva: ";

				if (nombre.isEmpty()) {
					errMessage += "\nFalta el campo nombre. ";
				}

				if (destino.isEmpty()) {
					errMessage += "\nFalta el campo destino. ";
				}

				if (fecha.isEmpty()) {
					errMessage += "\nFalta el campo fecha. ";
				}

				if (numeroAsientosDisponibles < nAsientos) {
					errMessage += "\nNo hay suficientes asientos disponibles. ";
				}

				throw new ReservaInvalidaException(errMessage);
			}
		} catch (NumberFormatException e) {
			System.err.println("No se ha introducido un número de asientos válido");
		} catch (ReservaInvalidaException e) {
			System.err.println(e.getMessage());
		}
	}

}
