package utils;

import java.util.ArrayList;
import java.util.List;

import logica.Auto;

public class InventarioAutos {
	private List<Auto<?, ?>> inventario = null;

	public List<Auto<?, ?>> getInventario() {
		return inventario;
	}

	public InventarioAutos() {
		this.inventario = new ArrayList<Auto<?, ?>>();
	}

	public void agregarAuto(Auto<?, ?> auto) {
		inventario.add(auto);
	}

	public List<Auto<?, ?>> buscarAuto(Object campoBusqueda) {
		return inventario.stream()
				.filter(auto -> auto.getMarca().equals(campoBusqueda) || auto.getYear().equals(campoBusqueda)).toList();
	}

	public double calcularValorTotal() {
		return inventario.stream().mapToDouble(Auto::getPrecio).sum();
	}
}
