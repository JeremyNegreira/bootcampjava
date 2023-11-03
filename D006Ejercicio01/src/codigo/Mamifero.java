package codigo;

public class Mamifero extends Animal {
	protected int numeroPatas;
	protected String tipoReproduccion;
	protected String colorPelaje;
	protected String habitat;

	public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion,
                    int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

	@Override
	public void saludar() {
		System.out.println("Hola, soy un mamífero");
	}
}
