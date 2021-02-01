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
		Scanner ScannerInt = new Scanner(System.in);
		Scanner Scanner = new Scanner(System.in);
		
		String titulo;
		String autor;
		int ejemplares;
		int prestados;
		int opcion;
		
		ArrayList<Libro> libros=new ArrayList<Libro>();
		
		do {
			System.out.println("\nPulsa:\n\t1: Alta Libro.\n\t2: Consultar Libro.\n\t3: Baja Libro.\n\t4: Prestamo Libro.\n\t0: Salir.");
			opcion = ScannerInt.nextInt();
			
			if(opcion==1) {
				System.out.println("Has escogido la opcion 1");
				System.out.println("Titulo de tu libro: ");
				titulo = Scanner.nextLine();
				System.out.println("Autor de tu libro: ");
				autor = Scanner.nextLine();
				System.out.println("Nº de Libros: ");
				ejemplares = ScannerInt.nextInt();
				System.out.println("Nº de Libros prestados: ");
				prestados = ScannerInt.nextInt();
				libros.add(new Libro(titulo, autor, ejemplares, prestados));
				System.out.println("Libro dado de alta. Nº: ");
	
			}
			if(opcion==2) {
				System.out.println("Has escogido la opcion 2");
				System.out.println("Introduce el titulo del libro: ");
				titulo = Scanner.nextLine();
				for(int i=0; i<libros.size(); i++) {
					if(libros.get(i).getTitulo().equals(titulo)) {
						System.out.println("Titulo: " + libros.get(i).getTitulo() + "\nAutor: " + libros.get(i).getAutor() + "\nEjemplares: " + libros.get(i).getEjemplares() + "\nPrestados: " + libros.get(i).getPrestados());
					}
				}
			}
			if(opcion==3) {
				System.out.println("Has escogido la opcion 3");
				//REMOVE
			}
		}while(opcion!=0);
		
		ScannerInt.close();
		Scanner.close();
	}
}