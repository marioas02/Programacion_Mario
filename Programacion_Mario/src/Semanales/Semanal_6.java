/**
 * 
 */
package Semanales;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Semanal_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);

		int salir1 = 1, salir2 = 1;
		String frase1 = null;
		String frase2 = null;
		
		do {
			System.out.println("Escribe la primera frase:");
			frase1 = Scanner.nextLine();

			if (frase1.length() > 1000) {
				System.out.println("Esta frase es demasiada extensa, escribe otra.");
			} else {
				do {
					System.out.println("Escribe la segunda frase:");
					frase2 = Scanner.nextLine();

					if (frase2.length() > 1000) {
						System.out.println("Esta frase es demasiada extensa, escribe otra.");
					} else {
						salir1 = 0;
						salir2 = 0;
					}
				} while (salir1 != 0);
			}
		} while (salir2 != 0);

		// PASAMOS LAS FRASES A UN ARRAY DE CARACTERES.
		char[] orden1 = frase1.toCharArray();
		char[] orden2 = frase2.toCharArray();

		// ORDENAMOS LOS CARACTERES EN ORDEN ALFABETICO
		java.util.Arrays.sort(orden1);
		java.util.Arrays.sort(orden2);
		System.out.println(orden1);
		// CONVERTIMOS LOS CARACTERES EN UNA CADENA DE CARACTERES
		String frase3 = new String(orden1);
		String frase4 = new String(orden2);

		// FILTROS DE ANAGRAMAS
		if (frase3.equals(frase4)) {
			System.out.println("Son anagramas.");
		} else {
			System.out.println("No son anagramas.");
		}

		Scanner.close();
	}

}
