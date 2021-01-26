/**
 * 
 */
package UT6_22;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Actividad22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		//Pruebas con libros predefinidos.
		Libro libro1 = new Libro("La casa de la pradera", "Chiquito de la Calzada", 10, 9);
		@SuppressWarnings("unused")
		Libro libro2 = new Libro("El ultimo mohicano", "Kiko Rivera", 5, 4);
		
		System.out.println("Prestamos del libro 1: " + libro1.getPrestados());
		libro1.devolucion();
		libro1.devolucion();
		libro1.devolucion();
		System.out.println("Prestamos del libro 1: " + libro1.getPrestados());
		
		//Prueba con libro del usuario.
		Libro libro3 = new Libro();
		System.out.println("Titulo de tu libro: ");
		libro3.setTitulo(Scanner.nextLine());
		System.out.println("Autor de tu libro: ");
		libro3.setAutor(Scanner.nextLine());
		System.out.println("Nº de Libros: ");
		libro3.setEjemplares(Scanner.nextInt());
		System.out.println("Nº de Libros prestados: ");
		libro3.setPrestados(Scanner.nextInt());
		System.out.println(libro3.toString());

		System.out.println("Prestamos de tu Libro: " + libro3.getPrestados());
		libro1.devolucion();
		libro1.devolucion();
		System.out.println("Prestamos de tu Libro: " + libro3.getPrestados());
		
		Scanner.close();
	}

}
