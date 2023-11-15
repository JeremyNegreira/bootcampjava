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

	public List<Mascota<?>> buscarPorNombre(String nombre) {
		List<Mascota<?>> resultado = new ArrayList<>();
		for (Mascota<?> mascota : registro) {
			if (mascota.getNombre().equals(nombre)) {
				resultado.add(mascota);
			}
		}
		return resultado;
	}

	public List<Mascota<?>> buscarPorEspecie(Object especie) {
		List<Mascota<?>> resultado = new ArrayList<>();
		for (Mascota<?> mascota : registro) {
			if (mascota.getEspecie().equals(especie)) {
				resultado.add(mascota);
			}
		}
		return resultado;
	}

	public int size() {
		return registro.size();
	}

	public void generarDatosAleatoriosDeMascotas(int cantidad) {
		Random random = new Random();
		String[] nombres = { "Max", "Luna", "Rex", "Milo", "Cleo" };
		String[] especies = { "Perro", "Gato", "Reptil", "Ave" };

		for (int i = 0; i < cantidad; i++) {
			String nombreAleatorio = nombres[random.nextInt(nombres.length)];
			int edadAleatoria = random.nextInt(10) + 1; // Edad entre 1 y 10
			String especieAleatoria = especies[random.nextInt(especies.length)];

			Mascota<String> mascota = new Mascota<>(nombreAleatorio, edadAleatoria, especieAleatoria);
			agregarMascota(mascota);
		}
	}
}
