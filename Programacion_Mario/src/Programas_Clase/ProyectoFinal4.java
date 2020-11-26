/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;
//import java.util.Arrays;

/**
 * @author Mario Aguirre y Carlos Calvo
 *
 */
public class ProyectoFinal4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
//PREGUNTA PARA NAIRA: SALE DEL PROGRAMA AL FINZALIZAR UN VILLANO O HA DE CLICAR ALGO,
//PREGUNTA PARA NAIRA: SON PREDETERMINADAS LAS FILAS Y COLUMNAS?

//		int fila=0,columna=0;
		int numero[][] = new int[10][10];
		String mapa[][] = new String[10][10];
//		int heroe=1;

//		System.out.println("Indique cuantas filas tiene el mapa: ");
//		fila=entrada.nextInt();
//		System.out.println("Indique cuantas columna tiene el mapa: ");
//		columna=entrada.nextInt();

//RECORRER EL ARRAY METIENDO NUMEROS ALEATORIOS DEL 1 AL 2
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				numero[i][j] = (int) (Math.random() * 2) + 1;
			}
		}
		for (int x = 0; x < 1; x++) {
			numero[(int) (Math.random() * 9) + 0][(int) (Math.random() * 9) + 0] = 3;
		}
//PINTAR(BORRADOR)
		for (int i = 0; i < numero.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < numero[i].length; j++) {
				System.out.print(numero[i][j] + " ");
			}
		}
//CAMBIO DE NUMEROS A CARACTERES.
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				if (numero[i][j] == 1) {
					mapa[i][j] = "X";
				} else if (numero[i][j] == 2) {
					mapa[i][j] = "·";
				} else if (numero[i][j] == 3) {
					mapa[i][j] = "H";
				}
			}
		}
//PINTAR EL MAPA
		System.out.print("\n");
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
		}
//

		entrada.close();
	}

}
