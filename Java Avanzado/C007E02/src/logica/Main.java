package logica;

import utils.ExploradorProyectos;

public class Main {

	/**
	 * Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la
	 * recursividad para crear una estructura jerárquica de tareas. Cada tarea puede
	 * tener subtareas asociadas, y estas subtareas también pueden tener sus propias
	 * subtareas, creando así una estructura de "árbol de tareas".
	 * 
	 * El programa debe permitir al usuario agregar tareas principales y subtareas
	 * de manera recursiva. Además, debe ofrecer la capacidad de visualizar la
	 * estructura completa de tareas con sus respectivas subtareas.
	 * 
	 * 📝Extra Point (OPCIONAL): En caso que quieras agregar un poco de "arte" al
	 * ejercicio, puedes proponer que las estructuras que se muestren por pantalla
	 * sean dibujadas mediante ascii.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Proyecto ejemplo
		Proyecto proyecto = new Proyecto("Desarrollo de Software");

		// Tareas principales
		Tarea tareaPrincipal1 = new Tarea("Diseño de la Aplicación");
		proyecto.agregarTarea(tareaPrincipal1);

		Tarea tareaPrincipal2 = new Tarea("Implementación del Código");
		proyecto.agregarTarea(tareaPrincipal2);

		Tarea tareaPrincipal3 = new Tarea("Pruebas y Depuración");
		proyecto.agregarTarea(tareaPrincipal3);

		// Subtareas tareaPrincipal1
		Tarea subtarea1_1 = new Tarea("Crear Prototipo");
		tareaPrincipal1.agregarSubtarea(subtarea1_1);

		Tarea subtarea1_2 = new Tarea("Diseñar Interfaz");
		tareaPrincipal1.agregarSubtarea(subtarea1_2);

		// Subtareas tareaPrincipal2
		Tarea subtarea2_1 = new Tarea("Desarrollar Backend");
		tareaPrincipal2.agregarSubtarea(subtarea2_1);

		Tarea subtarea2_2 = new Tarea("Desarrollar Frontend");
		tareaPrincipal2.agregarSubtarea(subtarea2_2);

		// Subtareas tareaPrincipal3
		Tarea subtarea3_1 = new Tarea("Ejecutar Pruebas de Integración");
		tareaPrincipal3.agregarSubtarea(subtarea3_1);

		Tarea subtarea3_2 = new Tarea("Solucionar Errores");
		tareaPrincipal3.agregarSubtarea(subtarea3_2);

		// Sub-subtareas subtarea1_2
		Tarea subtarea1_2_1 = new Tarea("Definir Esquema de Colores");
		subtarea1_2.agregarSubtarea(subtarea1_2_1);

		Tarea subtarea1_2_2 = new Tarea("Diseñar Diseño Responsivo");
		subtarea1_2.agregarSubtarea(subtarea1_2_2);

		// Sub-subtareas subtarea2_1
		Tarea subtarea2_1_1 = new Tarea("Configurar Base de Datos");
		subtarea2_1.agregarSubtarea(subtarea2_1_1);

		Tarea subtarea2_1_2 = new Tarea("Crear Lógica de Negocios");
		subtarea2_1.agregarSubtarea(subtarea2_1_2);

		// Sub-subtareas subtarea2_2
		Tarea subtarea2_2_1 = new Tarea("Codificar Interfaz de Usuario");
		subtarea2_2.agregarSubtarea(subtarea2_2_1);

		Tarea subtarea2_2_2 = new Tarea("Integrar con Backend");
		subtarea2_2.agregarSubtarea(subtarea2_2_2);

		// Sub-sub-subtarea tareaPrincipal3
		Tarea subtarea3_2_1 = new Tarea("Solucionar más errores");
		subtarea3_2.agregarSubtarea(subtarea3_2_1);

		Tarea subTarea3_2_1_1 = new Tarea("Solucionar incluso más errores");
		subtarea3_2_1.agregarSubtarea(subTarea3_2_1_1);

		// Mostrar árbol de tareas del proyecto
		System.out.println(ExploradorProyectos.mapearProyecto(proyecto));
	}

}
