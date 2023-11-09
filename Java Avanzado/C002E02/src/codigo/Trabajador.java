package codigo;

public class Trabajador extends Thread {

	private int id;

	public Trabajador(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		// Si hay productos por hacer antes de la meta o a mitad de proceso continuará
		// el bucle
		while (Main.getProductos() < Main.getMetaProductos() || Main.getProductosEnsambladosSinControlCalidad() > 0
				|| Main.getProductosListosParaEmbalar() > 0) {
			try {
				// Si hay productos por hacer antes de la meta y si no hay demasiados productos
				if (Main.getProductos() < Main.getMetaProductos()
						&& Main.getProductosEnsambladosSinControlCalidad() < Main.getColaMaxima()) {
					System.out.println("Trabajador " + id + ": Ensambla");
					Main.ensamblar();
					sleep(0);
				}

			} catch (InterruptedException e) {
			}
			try {
				if (Main.getProductosEnsambladosSinControlCalidad() > 0
						&& Main.getProductosListosParaEmbalar() < Main.getColaMaxima()) {
					System.out.println("Trabajador " + id + ": Realiza control de calidad");
					Main.realizarControlCalidad();
					sleep(0);
				}
			} catch (InterruptedException e) {
			}
			try {
				if (Main.getProductosListosParaEmbalar() > 0) {
					System.out.println("Trabajador " + id + ": Embala");
					Main.embalar();
					sleep(0);
				}
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Trabajador " + id + ": Termina su jornada");
	}
}
