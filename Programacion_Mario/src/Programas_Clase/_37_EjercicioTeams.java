/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _37_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int fila;
		int columna;
		int contador=-1;
		int i;
		
		System.out.println("Introduce las filas del rectangulo: ");
		fila=entrada.nextInt();
		System.out.println("Introduce las columnas del rectangulo: ");
		columna=entrada.nextInt();
		
		do {
			for(i=0;i<=fila;i++){
				System.out.printf("* ");
			}
			System.out.printf("\n");
			for(i=0;i<=fila;i++){
				System.out.printf("* ");
			}
			contador++;
			i=0;
			System.out.printf("\n");
			}while(contador<columna);
	}

}
