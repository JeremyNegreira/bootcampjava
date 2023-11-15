package logica;

import java.util.List;

import utils.RegistroMascotas;

public class Main {

	private static String separador = "----------------------------------------------------------------";

	/**
	 * Una clínica veterinaria necesita un sistema para administrar su registro de
	 * mascotas, para ello, se solicita la definición de una clase genérica
	 * Mascota<T> con atributos como nombre, edad, y especie (no olvides el código o
	 * id de mascota para identificar a cada una). Crea una clase utilitaria propia
	 * llamada RegistroMascotas que cuente con métodos genéricos para:
	 * 
	 * Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con
	 * genéricos para manipular colecciones como ArrayList o LinkedList y agregar
	 * mascotas de distinto tipo al registro de la veterinaria (puedes tomar como
	 * ejemplos de tipos: perros, gatos, reptiles y aves).
	 * 
	 * Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases
	 * utilitarias como Collections o Arrays junto con genéricos para realizar
	 * búsquedas eficientes por nombre o especie dentro del registro de mascotas.
	 * 
	 * Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de
	 * java.util para obtener el tamaño de la colección y contar la cantidad total
	 * de mascotas registradas en la veterinaria.
	 * 
	 * Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util
	 * para generar datos aleatorios, como nombres, edades o especies, para agregar
	 * mascotas al registro.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		RegistroMascotas registroMascotas = new RegistroMascotas();

		// Agregar Mascotas al Registro
		registroMascotas.agregarMascota(new Mascota<>("Firulais", 3, "perros"));
		registroMascotas.agregarMascota(new Mascota<>("Michi", 2, "gatos"));

		// Generar Datos Aleatorios para Mascotas
		separar();
		registroMascotas.generarDatosAleatoriosDeMascotas(5);
		System.out.println("Mascotas: ");
		registroMascotas.getRegistro().forEach(System.out::println);

		// Buscar Mascotas por Nombre o Especie
		separar();
		List<Mascota<?>> mascotasPorNombre = registroMascotas.buscarPorNombre("Firulais");
		System.out.println("Mascotas encontradas (por nombre): ");
		mascotasPorNombre.forEach(System.out::println);

		separar();
		List<Mascota<?>> mascotasPorEspecie = registroMascotas.buscarPorEspecie("gatos");
		System.out.println("Mascotas encontradas (por especie): ");
		mascotasPorEspecie.forEach(System.out::println);

		// Contar la Cantidad Total de Mascotas Registradas
		separar();
		int totalMascotas = registroMascotas.size();
		System.out.println("Total mascotas: " + totalMascotas);
	}

	private static void separar() {
		System.out.println(separador);
	}
}
