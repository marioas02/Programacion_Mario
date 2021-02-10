/**
 * 
 */
package Objetos.UT7.UT7_25;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Actividad25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ScannerMenu = new Scanner(System.in);
		Scanner ScannerInt = new Scanner(System.in);
		Scanner ScannerString = new Scanner(System.in);

		String nombreplaylist;
		String titulo;
		String artista;
		int duracion;
		int opcion;
		int posicion;

		Playlist favoritos = new Playlist();

		System.out.printf("Como llamas a tu Playlist: ");
		nombreplaylist = ScannerString.nextLine();
		
		do {
			opcion = opciones(ScannerMenu);

			switch (opcion) {

			case 0:
				System.out.println("Has escogido la opcion 0");
				System.out.println("Gracias.");
				break;

			case 1:
				System.out.println("Has escogido la opcion 1");
				System.out.printf("Titulo de la cancion: ");
				titulo = ScannerString.nextLine();
				System.out.printf("Artista de la cancion: ");
				artista = ScannerString.nextLine();
				System.out.printf("Cuanto dura la cancion: ");
				duracion = ScannerInt.nextInt();
				favoritos.anadirCancion(titulo, artista, duracion);
				System.out.println("Cancion añadida con exito!");
				break;

			case 2:
				System.out.println("Has escogido la opcion 2");
				System.out.println("Introduce la posicion de la cancion: ");
				posicion = ScannerInt.nextInt();
				System.out.println(favoritos.obtieneCancion(posicion));
				break;

			case 3:
				System.out.println("En la Playlist " + nombreplaylist + " hay: "
						+ favoritos.obtieneTotalCanciones()
						+ " Canciones");
				break;

			case 4:
				System.out.println("Canciones en la Playlist " + nombreplaylist + ": ");
				System.out.println(favoritos.mostrarPlaylist());
				break;

			case 5:
				System.out.println("Duracion en la Playlist " + nombreplaylist + ": ");
				System.out.println(favoritos.totalDuracionPlaylist());
				break;

			case 6:
				System.out.println("Reproduciendo la Playlist " + nombreplaylist + ": ");
				System.out.println(favoritos.reproducirPlaylist());
				break;

			case 7:
				System.out.println("Posicion de la canción para reproducir: ");
				posicion = ScannerInt.nextInt();
				System.out.println(favoritos.reproducirCancion(posicion) + " ");
				break;

			case 8:
				favoritos.limpiarPlaylist();
				System.out.println("Has eliminado tu Playlist" + nombreplaylist);
				break;

			case 9:
				System.out.println("Posicion de la canción para eliminar: ");
				posicion = ScannerInt.nextInt();
				favoritos.eliminarCancion(posicion);
				System.out.println("Has eliminado la canción de la posición: " + posicion);
				break;
			
			case 10:
				System.out.printf("Título de la canción: ");
				titulo = ScannerString.nextLine();
				System.out.println("Los datos de la canción son: ");
				System.out.println(favoritos.encontrarCancionPorTitulo(titulo));
				break;
			
			case 11:
				System.out.printf("Artista de la canción: ");
				artista = ScannerString.nextLine();
				System.out.println(artista+" ha compuesto estas canciones: ");
				System.out.println(favoritos.encontrarCancionesPorArtista(artista));
				break;
			}

		} while (opcion != 0);

		ScannerInt.close();
		ScannerString.close();

	}

	private static int opciones(Scanner ScannerInt) {
		int opcion = 0;
		System.out.println("");
		System.out.println(
				"Pulsa:\n\t1: Añadir una canción."
				+ "\n\t2: Consultar canción por su posición."
				+ "\n\t3: Consulta cuantas canciones tiene tu Playlist."
				+ "\n\t4: Muestra todas las canciones que tiene tu Playlist."
				+ "\n\t5: Muestra el total de minutos que dura tu Playlist."
				+ "\n\t6: Reproduce toda la Playlsit."
				+ "\n\t7: Reproduce una canción según su posición."
				+ "\n\t8: Elimina todas las canciones de la Playlist."
				+ "\n\t9: Elimina una canción según su posición."
				+ "\n\t10: Encontrar canción por titulo."
				+ "\n\t11: Encontrar canción por artista."
				+ "\n\t0: Salir.");
		System.out.printf("Escribe un número del menú: ");
		opcion = ScannerInt.nextInt();
		System.out.println("");
		return opcion;
	}
}
