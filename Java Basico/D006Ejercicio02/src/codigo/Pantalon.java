package codigo;

public class Pantalon extends Vestimenta {
	protected String estilo;
	protected String tipoTejido;

    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public void mostrarMensaje() {
        System.out.println("Estos pantalones son de estilo: " + estilo);
    }
}
