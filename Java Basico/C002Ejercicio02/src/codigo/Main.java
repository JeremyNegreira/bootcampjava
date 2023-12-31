package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * a) Imagina que eres un cajero en un supermercado. Crea un programa en Java
	 * que permita ingresar el precio de varios productos comprados por un cliente.
	 * 
	 * 
	 * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo
	 * precios hasta que el usuario decida finalizar. Luego, muestra el total de la
	 * compra que debe abonar.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double totalCompra = 0;
			boolean continuarComprando = true;

			System.out.println("Ingrese los precios de los productos (o ingrese -1 para finalizar):");

			while (continuarComprando) {
				double precioProducto = scanner.nextDouble();

				if (precioProducto == -1) {
					continuarComprando = false;
				} else if (precioProducto <= 0) {
					System.out.println("El precio no puede ser negativo.");
				} else {
					totalCompra += precioProducto;
				}
			}

			System.out.println("Total de la compra: " + totalCompra);
		}
	}

}
