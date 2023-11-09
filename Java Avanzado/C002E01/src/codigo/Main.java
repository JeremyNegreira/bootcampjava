package codigo;

public class Main {

	private static int codigoCliente = 0;

	public synchronized static int atenderCliente() {
		return ++codigoCliente;
	}

	public synchronized static int getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * • Crea una simulación de un centro de atención al cliente en la que varios
	 * agentes de soporte pueden atender llamadas telefónicas concurrentemente.
	 * 
	 * • Cada agente se representa como un hilo independiente.
	 * 
	 * • Los agentes deben recibir llamadas de clientes, resolver consultas y
	 * registrar información sobre cada llamada. Utiliza hilos para simular la
	 * atención concurrente de múltiples llamadas y garantizar que los agentes
	 * puedan manejarlas de manera eficiente.
	 * 
	 * • Asegúrate de controlar la concurrencia para evitar conflictos en la
	 * asignación de llamadas a los agentes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread agente1 = new Agente(1);
		Thread agente2 = new Agente(2);
		Thread agente3 = new Agente(3);

		agente1.start();
		agente2.start();
		agente3.start();

		try {
			agente1.join();
			agente2.join();
			agente3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
