/**
 * 
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class FueraDeArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int indice, indice2;
		boolean ok = false;

		int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		while (!ok) {
			System.out.println("Introduce un indice del array: ");
			try {
				indice = sc.nextInt();
				System.out.println("El valor es " + test[indice]);
				ok = true;
			} catch (ArrayIndexOutOfBoundsException laexcepcion) {
				System.out.println("El indice esta fuera del array.");
				System.out.println("Ha ocurrido una excepcion: " + laexcepcion.getMessage());
			} catch (InputMismatchException ie) {
				System.out.println("Valor incorrecto para un indice.");
				System.out.println("Ha ocurrido una excepcion: " + ie.toString());
			}catch(Exception e) {
				System.out.println("Ha ocurrido una excepcion: " + e.getMessage());
			}finally {
				System.out.println("En el finally");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("Cantinuo con el programa.");

		System.out.println("Introduce otro indice: ");
		try {
			indice2 = sc.nextInt();
			System.out.println("El valor es " + test[indice2]);
		} catch (ArrayIndexOutOfBoundsException laexcepcion) {
			System.out.println("El indice esta fuera del array.");
			System.out.println("Ha ocurrido una excepcion: " + laexcepcion.getMessage());
		} catch (InputMismatchException ie) {
			System.out.println("Valor incorrecto para un indice.");
			System.out.println("Ha ocurrido una excepcion: " + ie.toString());
		}
		System.out.println("Cantinuo con el programa.");

		sc.close();
	}
}
