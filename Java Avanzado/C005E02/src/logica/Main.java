package logica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	/**
	 * Imagina que estás construyendo una aplicación para gestionar eventos en una
	 * agenda. Cada evento tiene un nombre, una fecha y una categoría (por ejemplo,
	 * "Reunión", "Conferencia", "Taller"). Implementa las siguientes operaciones
	 * utilizando Streams y Optionals:
	 * 
	 * Filtra los eventos que están programados para una fecha específica.
	 * 
	 * Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada
	 * categoría.
	 * 
	 * Encuentra el evento más próximo en el tiempo utilizando Optionals.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Logica de datos de eventos simple de ejemplo
		List<Evento> eventos = new ArrayList<>();
		eventos.add(new Evento("Churros", "Taller", LocalDate.of(2024, 1, 15)));
		eventos.add(new Evento("Agentes", "Reunión", LocalDate.of(2024, 3, 25)));
		eventos.add(new Evento("Socios", "Conferencia", LocalDate.of(2024, 3, 25)));

		// Filtrado de eventos para una fecha especifica
		System.out.println("Eventos de la fecha " + LocalDate.of(2024, 3, 25));
		eventos.stream().filter(evento -> evento.getFecha().equals(LocalDate.of(2024, 3, 25)))
				.forEach(System.out::println);
		System.out.println("\n");

		// Agrupado de eventos por categoría y recuento
		Map<String, Long> recuentoEventosPorCategoria = eventos.stream()
				.collect(Collectors.groupingBy(Evento::getCategoria, // Agrupar los eventos por categoría
						Collectors.counting())); // Recuento

		recuentoEventosPorCategoria.forEach((categoria, count) -> System.out.println(categoria + ": " + count));

		// Evento más próximo en el tiempo utilizando Optionals.
		Optional<Evento> eventoMasProximo = eventos.stream().sorted(Comparator.comparing(Evento::getFecha)).findFirst();

		System.out.println("\n\n" + eventoMasProximo);
	}

}

class Evento {
	private String nombre;
	private String categoria;
	private LocalDate fecha;

	public Evento(String nombre, String categoria, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Evento [nombre=" + nombre + ", categoria=" + categoria + ", fecha=" + fecha + "]";
	}

}
