package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * Estás desarrollando una aplicación de gestión de datos en la que puedes
	 * almacenar información en un vector y acceder a ella posteriormente. Tu tarea
	 * es implementar una función que te permita almacenar datos en un vector y
	 * manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
	 * 
	 * Desarrolla una función que te permita almacenar datos en un vector. Puedes
	 * utilizar un vector de tamaño fijo para simplificar el ejercicio.
	 * 
	 * Luego, implementa un mecanismo que te permita acceder a los datos almacenados
	 * en el vector proporcionando un índice.
	 * 
	 * Utiliza una excepción estándar de Java que, al intentar acceder a una
	 * posición que no existe en el vector, por ejemplo, un índice que esté fuera
	 * del rango del vector se pueda capturar.
	 * 
	 * Captura la excepción y proporciona un mensaje de error descriptivo que
	 * indique que estás intentando acceder a una posición inválida en el vector.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scannerDatos = new Scanner(System.in)) {
			// Desarrolla una función que te permita almacenar datos en un vector. Puedes
			// utilizar un vector de tamaño fijo para simplificar el ejercicio.
			String[] vector = new String[3];
			for (int i = 0; i <= vector.length - 1; i++) {
				System.out.println("Introduce el valor de índice " + i);;
				vector[i] = scannerDatos.nextLine();
			}

			// Luego, implementa un mecanismo que te permita acceder a los datos almacenados
			// en el vector proporcionando un índice.
			Scanner scannerIndice = new Scanner(System.in);
			System.out.println("Consulta un valor introduciendo el índice a continuación [0, " + (vector.length - 1) + "]");
			int indice = scannerIndice.nextInt();
			try {
				System.out.println("Posición " + indice + ": " + vector[indice]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Estás tratando de entrar en una posición inválida");
				
			}
			scannerIndice.nextLine();
			scannerIndice.close();
		}
	}

}
