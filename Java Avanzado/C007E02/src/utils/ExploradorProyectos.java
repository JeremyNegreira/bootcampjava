package utils;

import logica.Proyecto;
import logica.Tarea;

public class ExploradorProyectos {

	public static String mapearProyecto(Proyecto directorio) {
		StringBuilder mapeadoProyecto = new StringBuilder();
		mapeadoProyecto.append(directorio);
		for (Tarea tarea : directorio.getTareas()) {
			mapeadoProyecto.append(System.lineSeparator()).append("|-- ").append(mapearTarea(tarea, 1));
		}
		return mapeadoProyecto.toString();
	}

	private static String mapearTarea(Tarea tarea, int nivel) {
		StringBuilder mapeadoDirectorio = new StringBuilder();
		mapeadoDirectorio.append(tarea);
		for (Tarea subtarea : tarea.getSubtareas()) {
			mapeadoDirectorio.append(System.lineSeparator());
			for (int i = nivel; i > 0; i--)
				mapeadoDirectorio.append("|   ");
			mapeadoDirectorio.append("|-- ").append(mapearTarea(subtarea, nivel + 1));
		}
		return mapeadoDirectorio.toString();
	}
}
