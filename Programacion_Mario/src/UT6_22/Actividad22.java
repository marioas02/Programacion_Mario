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
		//EJERCICIO 1 - LIBRO1.
		Libro libro1 = new Libro("La casa de la pradera", "Chiquito de la Calzada", 10, 9);
		
		//EJERCICIO 2 - LIBRO2.
		Libro libro2 = new Libro("El ultimo mohicano", "Kiko Rivera", 5, 4);
		
		//EJERCICIO 3 - PRESTAMOS
		System.out.println("Prestamos del libro 1: " + libro1.getPrestados());
		libro1.prestamo();
		System.out.println("Prestamos del libro 1: " + libro1.getPrestados());
		
		//EJERCICIO 4 -  EJEMPLARES
		System.out.println("\nEjemplares disponibles del libro 1: " + libro1.numejemplares());
		
		//EJERCICIO 5 - PRESTAMO
		System.out.println("\nPrestamos del libro 1: " + libro1.getPrestados());
		if (libro1.prestamo()) {
			System.out.println("Se ha prestado. Libros prestados del libro1: "+ libro1.getPrestados());
		}else {
			System.out.println("No se ha prestado. Libros prestados del libro1: "+ libro1.getPrestados());
		}
		
		//EJERCICIO 6 - DEVOLVER
		System.out.println("\nEjemplares disponibles del libro 1: " + libro1.numejemplares());
		if (libro1.devolucion()) {
			System.out.println("Se ha devuelto. Ejemplares disponibles del libro 1: "+ libro1.numejemplares());
		}else {
			System.out.println("No se ha devuelto. Ejemplares disponibles del libro 1: "+ libro1.numejemplares());
		}
		
		//EJERCICIO 7 - SET0
		libro1.setPrestados(0);
		System.out.println("\nPrestamos del libro 1: " + libro1.getPrestados());
		
		//EJERCICIO 8 - DEVOLVER
		System.out.println("\nEjemplares disponibles del libro 1: " + libro1.numejemplares());
		if (libro1.devolucion()) {
			System.out.println("Se ha devuelto. Ejemplares disponibles del libro 1: "+ libro1.numejemplares());
		}else {
			System.out.println("No se ha devuelto. Ejemplares disponibles del libro 1: "+ libro1.numejemplares());
		}
		
		//EJERCICIO 9 - LIBRO2
		System.out.println(libro2.toString());
		
		//EJERCICIO 10 - LIBRO3
		Libro libro3 = new Libro();
		System.out.println("\nTitulo de tu libro: ");
		libro3.setTitulo(Scanner.nextLine());
		System.out.println("Autor de tu libro: ");
		libro3.setAutor(Scanner.nextLine());
		System.out.println("Nº de Libros: ");
		libro3.setEjemplares(Scanner.nextInt());
		System.out.println("Nº de Libros prestados: ");
		libro3.setPrestados(Scanner.nextInt());
		System.out.println("\n"+libro3.toString());

		Scanner.close();
	}

}
