package logica;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	private String nombre;
	private List<Tarea> tareas;

	// Constructor, métodos para agregar subdirectorios y archivos, etc.
	public Proyecto(String nombre) {
		super();
		this.nombre = nombre;
		this.tareas = new ArrayList<Tarea>(1);
	}

	public void agregarTarea(Tarea tarea) {
		tareas.add(tarea);
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
