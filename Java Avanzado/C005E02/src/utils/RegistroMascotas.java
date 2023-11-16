package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import logica.Mascota;

public class RegistroMascotas {
	private List<Mascota<?>> registro;

	public void setRegistro(List<Mascota<?>> registro) {
		this.registro = registro;
	}

	public RegistroMascotas() {
		this.registro = new ArrayList<>();
	}

	public void agregarMascota(Mascota<?> mascota) {
		registro.add(mascota);
	}

	public List<Mascota<?>> getRegistro() {
		return registro;
	}

	/**
	 * Devuelve el resultado de búsqueda utilizando equals sobre cada elemento de la
	 * List<Mascota<?>> registro. El método equals() debe estar implementado en el
	 * tipo de especie.
	 * 
	 * @param especie
	 * @return List<Mascota<?>> resultadoBusqueda
	 */
	public List<Mascota<?>> buscarMascota(Object campoBusqueda) {
		List<Mascota<?>> resultadoBusqueda = new ArrayList<>();
		for (Mascota<?> mascota : registro) {
			if (mascota.getEspecie().equals(campoBusqueda) || mascota.getNombre().equals(campoBusqueda)) {
				resultadoBusqueda.add(mascota);
			}
		}
		return resultadoBusqueda;
	}

	public int size() {
		return registro.size();
	}

	public void generarDatosAleatoriosDeMascotas(int cantidad) {
		Random random = new Random();
		String[] nombres = { "Luna", "Coco", "Nala", "Kira", "Lola", "Bimba", "Mia", "Maya", "Bella", "Dana", };
		String[] especies = { "perros", "gatos", "reptiles", "aves" };

		for (int i = 0; i < cantidad; i++) {
			String nombreAleatorio = nombres[random.nextInt(nombres.length)];
			int edadAleatoria = random.nextInt(10);
			String especieAleatoria = especies[random.nextInt(especies.length)];

			Mascota<String> mascota = new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria);
			agregarMascota(mascota);
		}
	}
}
