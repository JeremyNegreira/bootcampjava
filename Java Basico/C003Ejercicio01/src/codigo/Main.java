package codigo;

public class Main {

	/**
	 * Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres
	 * de clases y variables no llevan tilde) con los siguientes atributos: cod,
	 * marca, modelo, consumo y color.
	 * 
	 * Luego, realiza las siguientes acciones:
	 * 
	 * a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
	 * 
	 * b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
	 * 
	 * c) Muestra por pantalla la marca, modelo y consumo energético de los 3
	 * electrodomésticos creados con parámetros.
	 * 
	 * d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se
	 * obtiene algún valor? De ser así… ¿Qué valor se obtiene?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
		Electrodomestico electrodomesticoA1 = new Electrodomestico("A1", "Marca A", "Modelo A1", 1, "Blanco"),
				electrodomesticoA2 = new Electrodomestico("A2", "Marca A", "Modelo A2", 2, "Negro"),
				electrodomesticoA3 = new Electrodomestico("A3", "Marca A", "Modelo A3", 3, "Gris");

		// b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
		Electrodomestico electrodomesticoB = new Electrodomestico();

		// c) Muestra por pantalla la marca, modelo y consumo energético de los 3
		// electrodomésticos creados con parámetros.
		System.out.println(electrodomesticoA1.toString());
		System.out.println(electrodomesticoA2.toString());
		System.out.println(electrodomesticoA3.toString());

		// d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se
		// obtiene algún valor? De ser así… ¿Qué valor se obtiene?
		System.out.println("Marca sin parámetros: " + electrodomesticoB.getMarca()); // Se obtiene null
	}

}
