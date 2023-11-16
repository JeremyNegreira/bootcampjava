package logica;

import utils.InventarioAutos;

public class Main {

	private static String separador = "----------------------------------------------------------------";
	
	/**
	 * Una concesionaria de vehículos necesita un sistema para administrar su
	 * inventario de autos. Crea una clase Auto con atributos como marca, modelo,
	 * año, y precio. Implementa una clase utilitaria InventarioAutos con métodos
	 * genéricos para realizar las siguientes operaciones:
	 * 
	 * Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al
	 * inventario de la concesionaria.
	 * 
	 * Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan
	 * buscar autos por marca o año dentro del inventario.
	 * 
	 * Calcular el Valor Total del Inventario: Desarrolla un método genérico que
	 * calcule el valor total de todos los autos en el inventario.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InventarioAutos inventario = new InventarioAutos();

		// Agregar Autos al Inventario
		inventario.agregarAuto(new Auto<String, String>(15000.0, 2015, "Honda", "Accord"));
		inventario.agregarAuto(new Auto<String, String>(22000.0, 2018, "Ford", "Fusion"));
		inventario.agregarAuto(new Auto<String, String>(18000.0, 2017, "Chevrolet", "Malibu"));
		inventario.agregarAuto(new Auto<String, String>(25000.0, 2020, "Nissan", "Altima"));

		// Buscar Autos por Marca o Año
		System.out.println("Coches de 2020: ");
		inventario.buscarAuto(2020).forEach(System.out::println);

		separar();
		System.out.println("\nCoches 'Ford': ");
		inventario.buscarAuto("Ford").forEach(System.out::println);

		// Calcular el Valor Total del Inventario
		separar();
		System.out.print("\nValor total: ");
		System.out.println(inventario.calcularValorTotal());
	}
	
	private static void separar() {
		System.out.println(separador);
	}

}
