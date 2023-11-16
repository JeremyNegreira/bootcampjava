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
		Proyecto directorioRaiz = new Proyecto("C:");

		directorioRaiz.agregarArchivo("DumpStack.txt");

		// Subdirectorios del raíz
		Proyecto directorioUsers = new Proyecto("Users");

		directorioRaiz.agregarSubdirectorio(directorioUsers);

		// Subdirectorios de Users
		Proyecto directorioUserJuan = new Proyecto("Juan");
		Proyecto directorioUserPedro = new Proyecto("Pedro");

		directorioUsers.agregarSubdirectorio(directorioUserPedro);
		directorioUsers.agregarSubdirectorio(directorioUserJuan);

		// Subdirectorios y archivos de Juan
		Proyecto directorioDesktop = new Proyecto("Desktop");
		Proyecto directorioDocuments = new Proyecto("Documents");
		Proyecto directorioDownloads = new Proyecto("Downloads");

		directorioUserJuan.agregarSubdirectorio(directorioDesktop);
		directorioUserJuan.agregarSubdirectorio(directorioDocuments);
		directorioUserJuan.agregarSubdirectorio(directorioDownloads);

		directorioUserJuan.agregarArchivo("Cosas.txt");
		directorioUserJuan.agregarArchivo("Foto.png");

		// Mostramos raíz y su contenido
		System.out.println(ExploradorDirectorios.explorarDirectorio(directorioRaiz));
	}

}
