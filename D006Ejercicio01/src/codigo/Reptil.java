package codigo;

public class Reptil extends Animal {
	protected double longitud;
	protected String tipoEscamas;
	protected String tipoVeneno;
	protected String habitat;

	public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, double longitud,
			String tipoEscamas, String tipoVeneno, String habitat) {
		super(id, nombre, edad, tipoPiel, tipoAlimentacion);
		this.longitud = longitud;
		this.tipoEscamas = tipoEscamas;
		this.tipoVeneno = tipoVeneno;
		this.habitat = habitat;
	}

	@Override
	public void saludar() {
		System.out.println("Hola, soy un reptil");
	}
}
