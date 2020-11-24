/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _36_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int lado;
		int i;
		int contador=0;
		
		System.out.println("Introduce el lado del cuadrado: ");
		lado=entrada.nextInt();
		do {
		for(i=1;i<=lado;i++){
			System.out.printf("* ");
		}
		System.out.printf("\n");
		contador++;
		i=1;
		}while(contador<lado);
		
//		* * * *
//		* * * *
//		* * * *
//		* * * *
		entrada.close();
	}
}

