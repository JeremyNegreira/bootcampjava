package codigo;

public class Estudiante {
	private int id;
	private String nombre;
	private int edad;
	private double calificacion;

	public Estudiante(int id, String nombre, int edad, double calificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	public Estudiante(String nombre, int edad, double calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public int getEdad() {
		return edad;
	}

	public int getId() {
		return id;
	}
}
