package codigo;

public class Main {

	/**
	 * Crear una clase Persona, que tenga los siguientes atributos: id, nombre,
	 * edad, dirección y número de teléfono (tener en cuenta todos sus atributos,
	 * constructores y métodos getters y setters).
	 * 
	 * a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y
	 * guardarlas en él.
	 * 
	 * b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada
	 * persona almacenada.
	 * 
	 * c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar
	 * el cambio y luego mostrar el después de los datos de las dos personas cuyos
	 * nombres fueron cambiados.
	 * 
	 * d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya
	 * edad sea mayor de 30 años.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y
		// guardarlas en él.
		Persona[] personas = { new Persona(1, "Juan", 10, "Dirección 1", "+34666666666"),
				new Persona(2, "Ana", 20, "Dirección 2", "+34666666667"),
				new Persona(3, "Elena", 30, "Dirección 3", "+34666666677"),
				new Persona(4, "Sara", 40, "Dirección 4", "+34666666777"),
				new Persona(5, "Alex", 50, "Dirección 5", "+34666667777"), };

		// b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada
		// persona almacenada.
		for (Persona persona : personas) {
			System.out.println(persona.nombreEdad());
		}

		// c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar
		// el cambio y luego mostrar el después de los datos de las dos personas cuyos
		// nombres fueron cambiados.
		{
			System.out.println();
			Persona persona1 = personas[0], persona2 = personas[1];

			System.out.println("Antes");
			System.out.println(persona1.toString());
			System.out.println(persona2.toString());

			persona1.setNombre("Juana");
			persona1.setNombre("Nana");

			System.out.println("Después");
			System.out.println(persona1.toString());
			System.out.println(persona2.toString());

		}

		// d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya
		// edad sea mayor de 30 años.
		System.out.println("\nMayores de 30 (no incluido)");
		for (Persona persona : personas) {
			// Asumimos que no estaba incluido el 30
			if (persona.getEdad() > 30)
				System.out.println(persona.toString());
		}
	}

}
