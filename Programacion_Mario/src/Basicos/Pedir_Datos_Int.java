/**
 * 
 */
package Basicos;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Pedir_Datos_Int {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un dato de tipo entero: ");
		int entero = entrada.nextInt();
		
		System.out.printf("El entero que has introducio es: %d", entero);
		
		entrada.close();
	}

}
