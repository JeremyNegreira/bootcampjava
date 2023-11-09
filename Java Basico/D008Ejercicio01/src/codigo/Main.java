package codigo;

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EstudianteDAO estudianteDAO = null;
		try {
			estudianteDAO = new EstudianteDAO();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		Estudiante estudiante1 = new Estudiante("Pepe", 18, 7);
		Estudiante estudiante2 = new Estudiante("Alex", 35, 8);
		Estudiante estudiante3 = new Estudiante("Ana", 23, 9);
		Estudiante estudiante4 = new Estudiante("Nana", 19, 10);
		try {
			estudianteDAO.insertEstudiante(estudiante1);
			estudianteDAO.insertEstudiante(estudiante2);
			estudianteDAO.insertEstudiante(estudiante3);
			estudianteDAO.insertEstudiante(estudiante4);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Estudiante> estudiantes = null;
		try {
			estudiantes = estudianteDAO.selectAllEstudiantes();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Mostrar la información de los estudiantes
		for (Estudiante estudiante : estudiantes) {
			System.out.println("ID: " + estudiante.getId());
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Edad: " + estudiante.getEdad());
			System.out.println("Calificación: " + estudiante.getCalificacion());
			System.out.println();
		}
	}

}
