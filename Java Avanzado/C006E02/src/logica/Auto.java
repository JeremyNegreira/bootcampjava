package logica;

public class Auto<TModelo, TMarca> {
	private static int contadorId = 1;
	private final int id;
	private double precio;
	private Integer year;
	private TModelo modelo;
	private TMarca marca;

	public Auto(double precio, int year, TMarca marca, TModelo modelo) {
		this.id = contadorId++;
		this.precio = precio;
		this.year = year;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Integer getYear() {
		return year;
	}

	public TModelo getModelo() {
		return modelo;
	}

	public TMarca getMarca() {
		return marca;
	}

	public double getPrecio() {
		return precio;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", precio=" + precio + ", año=" + year + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}

}
