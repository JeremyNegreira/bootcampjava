package utils;

import logica.Proyecto;
import logica.Tarea;

public class ExploradorProyectos {

	public static String mapearProyecto(Proyecto proyecto) {
		StringBuilder mapeadoProyecto = new StringBuilder();
		mapeadoProyecto.append("Proyecto: ").append(proyecto);
		for (Tarea tarea : proyecto.getTareas()) {
			mapeadoProyecto.append(System.lineSeparator()).append("|-- ").append(mapearTarea(tarea, 1));
		}
		return mapeadoProyecto.toString();
	}

	private static String mapearTarea(Tarea tarea, int nivel) {
		StringBuilder mapeadoDirectorio = new StringBuilder();
		mapeadoDirectorio.append(nivelTarea(nivel)).append(tarea);
		for (Tarea subtarea : tarea.getSubtareas()) {
			mapeadoDirectorio.append(System.lineSeparator());
			for (int i = nivel; i > 0; i--)
				mapeadoDirectorio.append("|   ");
			mapeadoDirectorio.append("|-- ").append(mapearTarea(subtarea, nivel + 1));
		}
		return mapeadoDirectorio.toString();
	}
	
	private static String nivelTarea(int nivel) {
		if (nivel == 1) 
			return "Tarea: ";
		
		if (nivel == 2)
			return "Subtarea: ";
		
		// Si es nivel = 3 sería nivelTarea = Sub-sub-subtarea
		StringBuilder nivelTarea = new StringBuilder();
		nivelTarea.append("Sub-");
		for (int i = nivel - 3; i > 0; i--)
			nivelTarea.append("sub-");
		nivelTarea.append("subtarea: ");
		
		return nivelTarea.toString();
	}
}
