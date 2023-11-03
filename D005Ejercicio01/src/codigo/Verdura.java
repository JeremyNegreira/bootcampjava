package codigo;

/**
 * clase llamada Verdura, que tenga los siguientes atributos: id, nombre, color,
 * calorías, debeCocinarse (tener en cuenta todos sus atributos, constructores,
 * métodos getters y setters).
 */
public class Verdura {

	private int id;
	private String nombre;
	private String color;
	private double calorias;
	private double debeCocinarse;

	public Verdura(int id, String nombre, String color, double calorias, double debeCocinarse) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.color = color;
		this.calorias = calorias;
		this.debeCocinarse = debeCocinarse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getDebeCocinarse() {
		return debeCocinarse;
	}

	public void setDebeCocinarse(double debeCocinarse) {
		this.debeCocinarse = debeCocinarse;
	}

	@Override
	public String toString() {
		return "Verdura [id=" + id + ", nombre=" + nombre + ", color=" + color + ", calorias=" + calorias
				+ ", debeCocinarse=" + debeCocinarse + "]";
	}

}
