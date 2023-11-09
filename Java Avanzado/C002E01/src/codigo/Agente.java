package codigo;

public class Agente extends Thread {

	private int id;

	public Agente(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		while (Main.getCodigoCliente() < 30) {
			int codCliente = Main.atenderCliente();
			try {

				System.out.println("Agente " + id + ": Recibe llamada de cliente " + codCliente);
				sleep(0);
			} catch (InterruptedException e) {

			}
			try {
				System.out.println("Agente " + id + ": Resuelve consulta de cliente " + codCliente);
				sleep(0);
			} catch (InterruptedException e) {

			}
			try {
				System.out.println("Agente " + id + ": Registra información de cliente " + codCliente);
				sleep(0);
			} catch (InterruptedException e) {

			}
		}

	}

}
