package codigo;

public class Electrodomestico {

	private String cod;
	private String marca;
	private String modelo;
	private double consumo;
	private String color;

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Electrodomestico(String cod, String marca, String modelo, double consumo, String color) {
		super();
		this.cod = cod;
		this.marca = marca;
		this.modelo = modelo;
		this.consumo = consumo;
		this.color = color;
	}

	public Electrodomestico() {
		super();
	}

	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", consumo=" + consumo + "]";
	}

}
