package utils;

import logica.Directorio;

public class ExploradorDirectorios {

	public static String explorarDirectorio(Directorio directorio) {
		StringBuilder mapeadoDirectorio = new StringBuilder();
		mapeadoDirectorio.append(directorio);
		for (Directorio subdirectorio : directorio.getSubdirectorios()) {
			mapeadoDirectorio.append(System.lineSeparator()).append("|-->")
					.append(explorarDirectorio(subdirectorio, 1));
		}
		for (String archivo : directorio.getArchivos()) {
			mapeadoDirectorio.append(System.lineSeparator()).append("|-->").append(archivo);
		}
		return mapeadoDirectorio.toString();
	}

	private static String explorarDirectorio(Directorio directorio, int nivel) {
		StringBuilder mapeadoDirectorio = new StringBuilder();
		mapeadoDirectorio.append(directorio);
		for (Directorio subdirectorio : directorio.getSubdirectorios()) {
			mapeadoDirectorio.append(System.lineSeparator());
			for (int i = nivel; i > 0; i--)
				mapeadoDirectorio.append("|   ");
			mapeadoDirectorio.append("|-->").append(explorarDirectorio(subdirectorio, nivel + 1));
		}
		for (String archivo : directorio.getArchivos()) {
			mapeadoDirectorio.append(System.lineSeparator());
			for (int i = nivel; i > 0; i--)
				mapeadoDirectorio.append("|   ");
			mapeadoDirectorio.append("|-->").append(archivo);
		}
		return mapeadoDirectorio.toString();
	}
}
