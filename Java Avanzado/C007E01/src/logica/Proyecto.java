package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Proyecto {
	private static int contadorId = 0;
	private int id;
	private String nombre;
	private List<Proyecto> subdirectorios;
	private List<String> archivos;

	// Constructor, métodos para agregar subdirectorios y archivos, etc.
	public Proyecto(String nombre) {
		super();
		this.id = ++contadorId;
		this.nombre = nombre;
		this.subdirectorios = new ArrayList<Proyecto>(1);
		this.archivos = new ArrayList<String>(1);
	}

	public void agregarSubdirectorio(Proyecto subdirectorio) {
		subdirectorios.add(subdirectorio);
	}

	public void agregarArchivo(String archivo) {
		archivos.add(archivo);
	}

	public List<Proyecto> getSubdirectorios() {
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
