/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class ProyectoFinalV2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// PREGUNTA PARA NAIRA: SALE DEL PROGRAMA AL FINZALIZAR UN VILLANO O HA DE
		// CLICAR ALGO,
		// PREGUNTA PARA NAIRA: SON PREDETERMINADAS LAS FILAS Y COLUMNAS?

		int numero[][] = new int[10][10];
		String mapa[][] = new String[10][10];
		int fh = 0, ch = 0,paso=0;
		char direccion;
		

//DONDE QUIERE EL USUARIO EL HEROE
		System.out.printf("Diga la fila que quiere poner al heroe: ");
		fh = entrada.nextInt();
		System.out.print("\n");
		System.out.printf("Diga la columna que quiere poner al heroe: ");
		ch = entrada.nextInt();
		
//RECORRER EL ARRAY METIENDO NUMEROS ALEATORIOS DEL 1 AL 2
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				numero[i][j] = (int) (Math.random() * 2) + 1;
			}
		}
//CAMBIO DE NUMEROS A CARACTERES.
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				if (numero[i][j] == 1) {
					mapa[i][j] = "X";
				} else {
					mapa[i][j] = "·";
				}
			}
		}
		for (int i = 0; i < 1; i++) {
			mapa[fh][ch] = "H";
		}
//PINTAR EL MAPA
		
		for (int i = 0; i < mapa.length; i++) {
			System.out.print("\n");
			for (int j = 0; j < mapa[i].length; j++) {
				System.out.print(mapa[i][j] + " ");
			}
		}
//PEDIMOS DIRECCION
		
		System.out.println("\n\nLas direcciones pueden ser: \n\t r=Right \n\t l=left \n\t u=Up \n\t d=down");
		System.out.printf("Escoge una de las direcciones para mover el programa: ");
		direccion=entrada.next().charAt(0);

		
//MIRASIONES DE DIRESIONES
		int aux=0;
		aux=ch;
		if(direccion=='r') {
			while(numero[fh][aux]<2){
				
				if(numero[fh][ch+1]==1) {
					ch++;
					paso++;
					
				}else {
					System.out.printf("Ha dado: %d pasos", paso);
				}
				aux++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}
}