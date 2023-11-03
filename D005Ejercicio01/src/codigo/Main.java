package codigo;

public class Main {

	public static void main(String[] args) {
		// a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras.
		// Crear 5 verduras y guardarlas en el vector.
		Verdura[] verduras = new Verdura[5];
		verduras[0] = new Verdura(1, "Acelga", "verde", 10, 10);
		verduras[1] = new Verdura(2, "Calabaza", "naranja", 10, 10);
		verduras[2] = new Verdura(3, "Lechuga", "verde", 10, 10);
		verduras[3] = new Verdura(4, "Col", "verde", 10, 10);
		verduras[4] = new Verdura(5, "Coliflor", "verde", 10, 10);

		// b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías
		// de las verduras almacenadas.
		for (Verdura verdura : verduras) {
			System.out.println(verdura.getNombre() + ": tiene " + verdura.getCalorias() + " calorías");
		}

		// c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de
		// todas las verduras luego del cambio.
		{
			Verdura verdura1 = verduras[3], verdura2 = verduras[4];

			verdura1.setCalorias(20);
			verdura1.setColor("rojo");
			verdura1.setDebeCocinarse(20);
			verdura1.setId(6);
			verdura1.setNombre("pimiento");

			verdura2.setCalorias(20);
			verdura2.setColor("amarillo");
			verdura2.setDebeCocinarse(20);
			verdura2.setId(7);
			verdura2.setNombre("pimiento");
		}
		for (Verdura verdura : verduras) {
			System.out.println(verdura.toString());
		}

		// d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que
		// sean de color verde.
	}

}
