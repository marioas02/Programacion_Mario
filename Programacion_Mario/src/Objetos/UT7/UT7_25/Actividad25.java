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

		String titulo;
		String artista;
		int duracion;
		int opcion;
		int posicion;

		Playlist favoritos = new Playlist();

		do {
			opcion = opciones(ScannerMenu);

			switch (opcion) {

			case 0:
				System.out.println("Has escogido la opcion 0");
				System.out.println("Gracias.");
				break;

			case 1:
				System.out.println("Has escogido la opcion 1");
				System.out.println("Titulo de la cancion: ");
				titulo = ScannerString.nextLine();
				System.out.println("Artista de la cancion: ");
				artista = ScannerString.nextLine();
				System.out.println("Cuanto dura la cancion: ");
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
				System.out.println("En la Playlist favoritos hay: "
						+ favoritos.obtieneTotalCanciones()
						+ " Canciones");
				break;
				
			case 4:
				System.out.println(favoritos.mostrarPlaylist());
			}
			
			
				

//			if (opcion == 0) {
//				System.out.println("Has escogido la opcion 0");
//				System.out.println("Gracias.");
//			}
//			if (opcion == 1) {
//				System.out.println("Has escogido la opcion 1");
//				System.out.println("Titulo de la cancion: ");
//				titulo = ScannerString.nextLine();
//				System.out.println("Artista de la cancion: ");
//				artista = ScannerString.nextLine();
//				System.out.println("Cuanto dura la cancion: ");
//				duracion = ScannerInt.nextInt();
//				favoritos.anadirCancion(titulo, artista, duracion);
//				System.out.println("Cancion añadida con exito!");
//
//			}
//			if (opcion == 2) {
//				System.out.println("Has escogido la opcion 2");
//				System.out.println("Introduce la posicion de la cancion: ");
//				posicion = ScannerInt.nextInt();
//				for (int i = 0; i < favoritos.canciones.size(); i++) {
//
//				}
//			}
//			if(opcion==3) {
//				System.out.println("Has escogido la opcion 3");
//				System.out.println("Introduce el titulo del libro que quiere borrar: ");
//				titulo = ScannerString.nextLine();
//				for(int i=0; i<favoritos.size(); i++) {
//					if(favoritos.get(i).getTitulo().equals(titulo)) {
//						favoritos.remove(i).getTitulo().equals(titulo);
//						System.out.println("Borrado.");
//					}else {
//						System.out.println("Libro no encontrado.");
//					}
//				}
//			}
//			if(opcion==4) {
//				System.out.println("Has escogido la opcion 4");
//				System.out.println("Introduce el titulo del libro que quiere hacer un prestamo: ");
//				titulo = ScannerString.nextLine();
//				for(int i=0; i<favoritos.size(); i++) {
//					if(favoritos.get(i).getTitulo().equals(titulo)) {
//						favoritos.get(i).prestamo();
//						System.out.println("Libro prestado.");
//					}else {
//						System.out.println("Libro no encontrado.");
//					}
//				}
//			}
//			if(opcion==5) {
//				System.out.println("Has escogido la opcion 5");
//				System.out.println("Introduce el titulo del libro que quieres devolver: ");
//				titulo = ScannerString.nextLine();
//				for(int i=0; i<favoritos.size(); i++) {
//					if(favoritos.get(i).getTitulo().equals(titulo)) {
//						favoritos.get(i).devolucion();
//						System.out.println("Libro devuelto.");
//					}else {
//						System.out.println("Libro no encontrado.");
//					}
//				}
//			}
//			System.out.println("Que hay en la playlist de favs: ");
//
//			
//			System.out.println(favoritos.obtieneTotalCanciones());
//			System.out.println("");
		} while (opcion != 0);

		ScannerInt.close();
		ScannerString.close();

	}

	private static int opciones(Scanner ScannerInt) {
		int opcion = 0;
		System.out.println(
				"Pulsa:\n\t1: Añadir cancion.\n\t2: Consultar cancion.\n\t3: Baja Libro.\n\t4: Prestamo Libro.\n\t5: Devolucion Libro\n\t0: Salir.");
		opcion = ScannerInt.nextInt();
		return opcion;
	}

}
