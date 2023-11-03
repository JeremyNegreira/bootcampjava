package codigo;

import java.util.ArrayList;

public class Main {

	/**
	 * Un administrador de una tienda de electrónica necesita un programa para
	 * gestionar los productos en su inventario. Para ello, necesita la creación de
	 * una clase Producto que cuente con los siguientes datos: código, nombre,
	 * marca, tipo, precio costo, precio venta, cantidad en stock.
	 * 
	 * A partir de esto, realizar las siguientes acciones en el programa
	 * desarrollado:
	 * 
	 * a) Crear 10 objetos de tipo Producto con sus correspondientes valores
	 * cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador,
	 * tablet, etc).
	 * 
	 * b) Guardar estos objetos creados en un ArrayList.
	 * 
	 * c) Recorrer el ArrayList y determinar el producto con el mayor precio de
	 * venta.
	 * 
	 * d) Recorrer el ArrayList y determinar el producto con el menor precio de
	 * costo.
	 * 
	 * e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
	 * 
	 * f) Determinar el producto que tenga la mayor cantidad en stock. A ese
	 * producto, descontarle 3 unidades del stock y actualizar el registro en la
	 * lista en base a eso.
	 * 
	 * g) Mostrar siempre por consola un mensaje informativo luego de resolver cada
	 * punto.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// a) Crear 10 objetos de tipo Producto con sus correspondientes valores
		Producto producto1 = new Producto(1, "Producto 1", "Marca 1", "Marca 1", 1, 2, 10);
		Producto producto2 = new Producto(2, "Producto 2", "Marca 2", "Marca 2", 2, 3, 20);
		Producto producto3 = new Producto(3, "Producto 3", "Marca 3", "Marca 3", 3, 4, 30);
		Producto producto4 = new Producto(4, "Producto 4", "Marca 4", "Marca 4", 4, 5, 40);
		Producto producto5 = new Producto(5, "Producto 5", "Marca 5", "Marca 5", 5, 6, 50);
		Producto producto6 = new Producto(6, "Producto 6", "Marca 6", "Marca 6", 6, 7, 60);
		Producto producto7 = new Producto(7, "Producto 7", "Marca 7", "Marca 7", 7, 8, 70);
		Producto producto8 = new Producto(8, "Producto 8", "Marca 8", "Marca 8", 8, 9, 80);
		Producto producto9 = new Producto(9, "Producto 9", "Marca 9", "Marca 9", 9, 10, 90);
		Producto producto10 = new Producto(10, "Producto 10", "Marca 10", "Marca 10", 10, 11, 100);

		// b) Guardar estos objetos creados en un ArrayList.
		ArrayList<Producto> productos = new ArrayList<>();
		productos.add(producto1);
		productos.add(producto2);
		productos.add(producto3);
		productos.add(producto4);
		productos.add(producto5);
		productos.add(producto6);
		productos.add(producto7);
		productos.add(producto8);
		productos.add(producto9);
		productos.add(producto10);

		// c) Recorrer el ArrayList y determinar el producto con el mayor precio de
		// venta.
		Producto productoMasCaro = productos.get(0);
		for (Producto producto : productos) {
			if (producto.getPrecioVenta() > productoMasCaro.getPrecioVenta()) {
				productoMasCaro = producto;
			}
		}
		System.out.println("El producto más caro es " + productoMasCaro);

		// d) Recorrer el ArrayList y determinar el producto con el menor precio de
		// costo.
		Producto productoMasBarato = productos.get(0);
		for (Producto producto : productos) {
			if (producto.getPrecioCosto() < productoMasBarato.getPrecioCosto()) {
				productoMasBarato = producto;
			}
		}
		System.out.println("El producto con el menor precio de costo es: " + productoMasBarato.getNombre());

		// e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
		if (productos.size() > 5) {
			Producto productoBorrado = productos.remove(5);
			System.out.println("Se ha eliminado el producto en la posición 5: " + productoBorrado.getNombre());
		}

		// f) Determinar el producto que tenga la mayor cantidad en stock, descontar 3
		// unidades y actualizar el registro.
		Producto productoMayorStock = productos.get(0);
		for (Producto producto : productos) {
			if (producto.getStock() > productoMayorStock.getStock()) {
				productoMayorStock = producto;
			}
		}
		System.out.println("El producto con más stock es " + productoMayorStock);

		int stockActualizado = (int) (productoMayorStock.getStock() - 3);
		productoMayorStock.setStock(stockActualizado);
		System.out.println("Se han descontado 3 unidades del stock de " + productoMayorStock);

	}

}
