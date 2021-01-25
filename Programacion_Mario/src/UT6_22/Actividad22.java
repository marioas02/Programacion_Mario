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
		String titulo;
		String autor;
		int ejemplares;
		
		Libro libro1 = new Libro("La casa de la pradera", "Chiquito de la Calzada", 10, 9);
		Libro libro2 = new Libro("El ultimo mohicano", "Kiko Rivera", 5, 4);
		
		Scanner.close();
	}

}
