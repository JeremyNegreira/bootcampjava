package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Directorio {
	private static int contadorId = 0;
	private int id;
	private String nombre;
	private List<Directorio> subdirectorios;
	private List<String> archivos;

	// Constructor, métodos para agregar subdirectorios y archivos, etc.
	public Directorio(String nombre) {
		super();
		this.id = ++contadorId;
		this.nombre = nombre;
		this.subdirectorios = new ArrayList<Directorio>(1);
		this.archivos = new ArrayList<String>(1);
	}

	public void agregarSubdirectorio(Directorio subdirectorio) {
		subdirectorios.add(subdirectorio);
	}

	public void agregarArchivo(String archivo) {
		archivos.add(archivo);
	}

	public List<Directorio> getSubdirectorios() {
		return subdirectorios;
	}

	public List<String> getArchivos() {
		return archivos;
	}

	@Override
	public String toString() {
		return "Directorio [id=" + id + ", nombre=" + nombre + "]";
	}

}
