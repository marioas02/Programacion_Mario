/**
 * 
 */
package Basicos;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class Pedir_Letras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		//OJOOOOO Que si lees numeros y letras intercaladas has de repetir la entrada
		System.out.println("Introduce un dato de tipo cadena: ");
		String frase = entrada.nextLine();
		
		System.out.printf("La frase que has introducio es: %s", frase);
		
		entrada.close();
	}

}
