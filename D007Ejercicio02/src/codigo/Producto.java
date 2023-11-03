package codigo;

public class Producto {

	private int codigo;
	private String nombre;
	private String marca;
	private String tipo;
	private double precioCosto;
	private double precioVenta;
	private int stock;

	public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta,
			int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
		this.precioCosto = precioCosto;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioCosto() {
		return precioCosto;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo
				+ ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
	}
	
	

}
