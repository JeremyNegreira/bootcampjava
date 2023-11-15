package logica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	/**
	 * Crea una aplicación que maneje información sobre empleados. Cada empleado
	 * tiene un nombre, un salario y una categoría (por ejemplo, "Desarrollador",
	 * "Analista", "Gerente"). Implementa las siguientes operaciones utilizando
	 * Streams y Optionals:
	 * 
	 * Filtra los empleados cuyo salario sea mayor a cierto valor específico.
	 * 
	 * Agrupa los empleados por categoría y calcula el salario promedio para cada
	 * categoría.
	 * 
	 * Encuentra al empleado con el salario más alto utilizando Optionals.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Logica de datos de empleados simple de ejemplo
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado("Juan", 1333.33, "Desarrollador"));
		empleados.add(new Empleado("Juana", 1333.33, "Desarrollador"));
		empleados.add(new Empleado("María", 1500, "Analista"));
		empleados.add(new Empleado("Pedro", 1252.52, "Gerente"));

		//
		double valorEspecifico = 1300.0;

		// Stream
		Map<String, Double> salarioPromedioPorCategoriaDesdeValorEspecifico = empleados.stream()
				.filter(empleado -> empleado.getSalario() > valorEspecifico) // Filtrar por valor específico
				.collect(Collectors.groupingBy(Empleado::getCategoría, // Agrupar los empleados por categoría
						Collectors.averagingDouble(Empleado::getSalario))); // Calcular el salario promedio por
																			// categoria

		// Ver resultados con el toString autogenerado
		salarioPromedioPorCategoriaDesdeValorEspecifico.forEach((categoria, salarioPromedio) -> System.out
				.println("Categoría: " + categoria + ", Salario Promedio: " + salarioPromedio));

		// Encuentra al empleado con el salario más alto utilizando Optionals
		Optional<Empleado> empleadoMasSalario = empleados.stream()
				.max(Comparator.comparing(Empleado::getSalario)); // valor maximo comparando salario

		if (empleadoMasSalario.isEmpty()) {
			System.out.println("No hay coincidencias");
		} else {
			System.out.println(empleadoMasSalario);
		}
	}

}

class Empleado {
	private String nombre;
	private double salario;
	private String categoría;

	public Empleado(String nombre, double salario, String categoría) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.categoría = categoría;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + ", categoría=" + categoría + "]";
	}

}