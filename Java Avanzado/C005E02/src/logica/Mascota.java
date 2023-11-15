package logica;

public class Mascota<T> {
	private static int contadorId = 1;
	private int id;
	private String nombre;
	private int edad;
	private T especie;

	public Mascota(String nombre, int edad, T especie) {
		this.id = contadorId++;
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public T getEspecie() {
		return especie;
	}

	@Override
	public String toString() {
		return "Mascota [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + "]";
	}

}
