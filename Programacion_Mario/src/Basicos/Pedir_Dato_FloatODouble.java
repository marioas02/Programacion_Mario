/**
 * 
 */
package Basicos;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Pedir_Dato_FloatODouble {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce un dato de tipo decimal: ");
		float decimal = entrada.nextFloat();
		
		//Con %f puedes poner %5.2f para el formato.
		System.out.printf("El decimal que has introducio es: %f", decimal);
		
		entrada.close();
	}

}
