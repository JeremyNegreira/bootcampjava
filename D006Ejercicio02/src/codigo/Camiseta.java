package codigo;

public class Camiseta extends Vestimenta {
	protected String manga;
	protected String cuello;

    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public void mostrarMensaje() {
        System.out.println("Esta camiseta es de manga: " + manga);
    }
}
