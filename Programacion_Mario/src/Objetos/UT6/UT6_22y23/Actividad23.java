/**
 * 
 */
package Objetos.UT6.UT6_22y23;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Actividad23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ScannerMenu = new Scanner(System.in);
		Scanner ScannerInt = new Scanner(System.in);
		Scanner ScannerString = new Scanner(System.in);
		
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		int opcion;
		
		ArrayList<Libro> libros=new ArrayList<Libro>();
		
		do {
			opcion = opciones(ScannerMenu);
			
			if(opcion==0) {
				System.out.println("Has escogido la opcion 0");
				System.out.println("Gracias.");
			}
			if(opcion==1) {
				System.out.println("Has escogido la opcion 1");
				System.out.println("Titulo de tu libro: ");
				titulo = ScannerString.nextLine();
				System.out.println("Autor de tu libro: ");
				autor = ScannerString.nextLine();
				System.out.println("Nº de Libros: ");
				ejemplares = ScannerInt.nextInt();
				System.out.println("Nº de Libros prestados: ");
				prestados = ScannerInt.nextInt();
				libros.add(new Libro(titulo, autor, ejemplares, prestados));
				System.out.println("Libro dado de alta.");
	
			}
			if(opcion==2) {
				System.out.println("Has escogido la opcion 2");
				System.out.println("Introduce el titulo del libro: ");
				titulo = ScannerString.nextLine();
				for(int i=0; i<libros.size(); i++) {
					if(libros.get(i).getTitulo().equals(titulo)) {
						System.out.println("Titulo: "
								+ libros.get(i).getTitulo()
								+ "\nAutor: "
								+ libros.get(i).getAutor()
								+ "\nEjemplares: "
								+ libros.get(i).getEjemplares()
								+ "\nPrestados: "
								+ libros.get(i).getPrestados());
					}else {
						System.out.println("Libro no encontrado.");
					}
				}
			}
			if(opcion==3) {
				System.out.println("Has escogido la opcion 3");
				System.out.println("Introduce el titulo del libro que quiere borrar: ");
				titulo = ScannerString.nextLine();
				for(int i=0; i<libros.size(); i++) {
					if(libros.get(i).getTitulo().equals(titulo)) {
						libros.remove(i).getTitulo().equals(titulo);
						System.out.println("Borrado.");
					}else {
						System.out.println("Libro no encontrado.");
					}
				}
			}
			if(opcion==4) {
				System.out.println("Has escogido la opcion 4");
				System.out.println("Introduce el titulo del libro que quiere hacer un prestamo: ");
				titulo = ScannerString.nextLine();
//				for(int i=0; i<libros.size(); i++) {
//					if(libros.get(i).getTitulo().equals(titulo)) {
//						libros.get(i).setPrestados(prestados);
//						System.out.println("Libro prestado.");
//					}else {
//						System.out.println("Libro no encontrado.");
//					}
//				}
			}
			if(opcion==5) {
				System.out.println("Has escogido la opcion 5");
				System.out.println("Introduce el titulo del libro que quieres devolver: ");
				titulo = ScannerString.nextLine();
//				for(int i=0; i<libros.size(); i++) {
//					if(libros.get(i).getTitulo().equals(titulo)) {
//						libros.get(i).setPrestados(prestados);
//						System.out.println("Libro devuelto.");
//					}else {
//						System.out.println("Libro no encontrado.");
//					}
//				}
			}
			System.out.println("");
		}while(opcion!=0);
		
		ScannerInt.close();
		ScannerString.close();
	}
	
	private static int opciones(Scanner ScannerInt) {
		int opcion = 0;
		System.out.println("Pulsa:\n\t1: Alta Libro.\n\t2: Consultar Libro.\n\t3: Baja Libro.\n\t4: Prestamo Libro.\n\t0: Salir.");
		opcion = ScannerInt.nextInt();
		return opcion;
	}
}