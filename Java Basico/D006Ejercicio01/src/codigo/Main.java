package codigo;

public class Main {

	public static void main(String[] args) {
		// c) Crear un objeto de cada clase hija y llamar al método saludar
		Mamifero mamifero = new Mamifero(1, "Gato", 9, "Pelo", "Carnívoro", 4, "Vivíparo", "Amarillo", "Savannah");
		Ave ave = new Ave(2, "Periquito", 3, "Plumas", "Omnívoro", 2.0, "Planeo", "Verde", "Pico cónico");
		Reptil reptil = new Reptil(3, "Lagartija", 2, "Escamas", "Insectívoro", 0.2, "Lisas", "No venenosa", "Jardín");

		mamifero.saludar();
		ave.saludar();
		reptil.saludar();

		// d) Intentar asignar un objeto Mamifero a una referencia Animal
		Animal animal = mamifero;
		System.out.println(animal);

		// e) Cambiar el modificador de acceso de los métodos de "public" a "private"
		// e intentar acceder desde el "main" a estos métodos
		// Esto da un error de compilación.
	}

}
