package logica;

import java.util.ArrayList;
import java.util.List;

public class Tarea {
	private String nombre;
	private List<Tarea> subtareas;

	// Constructor, métodos para agregar subdirectorios y archivos, etc.
	public Tarea(String nombre) {
		super();
		this.nombre = nombre;
		this.subtareas = new ArrayList<Tarea>(1);
	}

	public void agregarSubtarea(Tarea subtarea) {
		subtareas.add(subtarea);
	}

	public List<Tarea> getSubtareas() {
		return subtareas;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
