package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * Imagina que estás desarrollando un sistema de gestión de inventarios para un
	 * comercio minorista. Los usuarios pueden agregar productos al inventario
	 * proporcionando información como el nombre del producto, el precio y la
	 * cantidad disponible. Tu tarea es implementar una función que maneje la
	 * gestión de inventarios, validando los datos ingresados y manejando
	 * excepciones en caso de errores o datos inválidos.
	 * 
	 * Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso
	 * de que ésta sea opersonalizada) o de utilizar los tipos correctos de
	 * excepción en cada caso.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de gestión de inventarios");

		try (Scanner scanner = new Scanner(System.in)) {
			int opcion = -1;
			while (true) {
				
					try {
						// Para evitar que el menú salga antes que el error
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
						}
						System.out.println("Introduzca 0 para salir, otro número para continuar");
						opcion = Integer.parseInt(scanner.nextLine());

						if (opcion == 0)
							break;

						System.out.println("Introduzca nombre de producto");
						String nombre = scanner.nextLine();
						if (nombre.isBlank())
							throw new Exception("Cada producto debe tener un nombre");

						System.out.println("Introduzca precio de producto");
						double precio = Double.parseDouble(scanner.nextLine());
						if (precio < 0)
							throw new Exception("No puedes tener precios negativos");

						System.out.println("Introduzca stock de producto");
						int stock = Integer.parseInt(scanner.nextLine());
						if (stock < 0)
							throw new Exception("No puedes tener stock negativo");

						System.out.println(
								"Se ha añadido producto '" + nombre + "' de precio " + precio + " con stock de " + stock);
					} catch (Exception e) {
						System.err.println(e.getMessage());
						opcion = -1;
					}
			}
		}

	}

}
