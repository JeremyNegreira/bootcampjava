package logica;

import utils.ExploradorDirectorios;

public class Main {

	/**
	 * Crea un programa que simule la exploración recursiva de directorios en el
	 * sistema de archivos de un sistema operativo utilizando una estructura de
	 * datos propia.
	 * 
	 * Emplea una estructura donde cada nodo representa un directorio y contiene
	 * referencias a sus subdirectorios.
	 * 
	 * El programa debe realizar una exploración simulada para mostrar la jerarquía
	 * de directorios y archivos.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Directorio raíz y archivo
		Directorio directorioRaiz = new Directorio("C:");

		directorioRaiz.agregarArchivo("DumpStack.txt");

		// Subdirectorios del raíz
		Directorio directorioUsers = new Directorio("Users");

		directorioRaiz.agregarSubdirectorio(directorioUsers);

		// Subdirectorios de Users
		Directorio directorioUserJuan = new Directorio("Juan");
		Directorio directorioUserPedro = new Directorio("Pedro");

		directorioUsers.agregarSubdirectorio(directorioUserPedro);
		directorioUsers.agregarSubdirectorio(directorioUserJuan);

		// Subdirectorios y archivos de Juan
		Directorio directorioDesktop = new Directorio("Desktop");
		Directorio directorioDocuments = new Directorio("Documents");
		Directorio directorioDownloads = new Directorio("Downloads");

		directorioUserJuan.agregarSubdirectorio(directorioDesktop);
		directorioUserJuan.agregarSubdirectorio(directorioDocuments);
		directorioUserJuan.agregarSubdirectorio(directorioDownloads);

		directorioUserJuan.agregarArchivo("Cosas.txt");
		directorioUserJuan.agregarArchivo("Foto.png");

		// Mostramos raíz y su contenido
		System.out.println(ExploradorDirectorios.explorarDirectorio(directorioRaiz));
	}

}
