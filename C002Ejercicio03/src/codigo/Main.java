package codigo;

import java.util.Scanner;

public class Main {

	/**
	 * Una web de meteorología necesita de un programa que, al ingresar las 7
	 * temperaturas máximas de la última semana, calcule la temperatura máxima
	 * promedio que hubo.
	 * 
	 * Para ello, deberá manejar un vector donde en cada posición se almacene la
	 * correspondiente temperatura máxima de cada día. Una vez almacenadas las
	 * temperaturas, deberá calcular el promedio de las mismas recorriendo el vector
	 * y mostrando el resultado por pantalla.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int diasSemana = 7;
			double[] temperaturas = new double[diasSemana];

			for (int i = 0; i < diasSemana; i++) {
				System.out.println("Ingrese la temperatura máxima del día " + (i + 1));
				temperaturas[i] = scanner.nextDouble();
			}

			double sumaTemperaturas = 0;
			for (int i = 0; i < diasSemana; i++) {
				sumaTemperaturas += temperaturas[i];
			}

			double promedioTemperaturas = sumaTemperaturas / diasSemana;

			System.out
					.println("El promedio de las temperaturas máximas de la última semana es " + promedioTemperaturas);
		}

	}

}
