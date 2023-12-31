package codigo;

public class Main {

	/**
	 * a) Crea un programa que declare una variable para cada uno de los siguientes
	 * tipos de datos: int, double, boolean y String. Asigna un valor a cada
	 * variable y muestra su contenido en la consola.
	 * 
	 * b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un
	 * int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se
	 * produce algún error? ¿En qué situaciones se genera error y en cuáles no?
	 * Justificar el por qué de cada caso. Debatir con otros compañeros.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// a) Crea un programa que declare una variable para cada uno de los siguientes
		// tipos de datos: int, double, boolean y String. Asigna un valor a cada
		// variable y muestra su contenido en la consola

		int numeroEntero = 2;
		double numeroDecimal = 3.1;
		boolean esVerdadero = true;
		String texto = "String";

		// Mostrar el contenido de las variables en la consola
		System.out.println("Número entero: " + numeroEntero);
		System.out.println("Número decimal: " + numeroDecimal);
		System.out.println("Booleano: " + esVerdadero);
		System.out.println("Cadena de texto: " + texto);

		// b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un
		// int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se
		// produce algún error? ¿En qué situaciones se genera error y en cuáles no?
		// Justificar el por qué de cada caso. Debatir con otros compañeros.

//        numeroEntero = "Int";  // No se puede asignar una cadena a un int
//        numeroDecimal = "123.45";             // No se puede asignar una cadena a un double
//        esVerdadero = 123;                    // No se puede asignar un int a un boolean
//        texto = 55;                           // No se puede asignar un int a una cadena de texto

	}

}
