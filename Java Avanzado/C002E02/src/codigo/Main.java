package codigo;

public class Main {

	// Contadores
	private static int metaProductos = 30;
	// Productos terminados o en proceso
	private static int productos = 0;
	private static int productosEnsambladosSinControlCalidad = 0;
	private static int productosListosParaEmbalar = 0;
	// Cantidad máxima de productos en cada fase
	private static int colaMaxima = 3;

	public synchronized static void ensamblar() {
		productosEnsambladosSinControlCalidad++;
		productos = getProductos() + 1;
	}

	public synchronized static void realizarControlCalidad() {
		productosEnsambladosSinControlCalidad--;
		productosListosParaEmbalar++;
	}

	public synchronized static void embalar() {
		productosListosParaEmbalar--;
		// Para pruebas
//		System.out.println("Productos listos/procesando: " + productos);
	}

	/**
	 * • Crea una simulación de una cadena de producción en una fábrica en la que
	 * varios trabajadores pueden realizar tareas concurrentemente.
	 * 
	 * • Cada trabajador se representa como un hilo independiente.
	 * 
	 * • Los trabajadores deben llevar a cabo tareas como ensamblar productos,
	 * realizar controles de calidad y embalar productos. • Utiliza hilos para
	 * simular la ejecución concurrente de estas tareas en diferentes estaciones de
	 * trabajo de la fábrica.
	 * 
	 * • Asegúrate de controlar la concurrencia para evitar problemas como la
	 * sobreproducción o la falta de coordinación entre las tareas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Trabajador trabajador1 = new Trabajador(1);
		Trabajador trabajador2 = new Trabajador(2);
		Trabajador trabajador3 = new Trabajador(3);
		Trabajador trabajador4 = new Trabajador(4);
		Trabajador trabajador5 = new Trabajador(5);

		trabajador1.start();
		trabajador2.start();
		trabajador3.start();
		trabajador4.start();
		trabajador5.start();

		try {
			trabajador1.join();
			trabajador2.join();
			trabajador3.join();
			trabajador4.join();
			trabajador5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized static int getProductos() {
		return productos;
	}

	public synchronized static int getProductosEnsambladosSinControlCalidad() {
		return productosEnsambladosSinControlCalidad;
	}

	public synchronized static int getProductosListosParaEmbalar() {
		return productosListosParaEmbalar;
	}

	public synchronized static int getMetaProductos() {
		return metaProductos;
	}

	public synchronized static int getColaMaxima() {
		return colaMaxima;
	}
}
