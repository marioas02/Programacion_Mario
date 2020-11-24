/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _38_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int lado;
		int i;
		int contador=1;
		
		System.out.println("Introduce los * por lado del cuadrado: ");
		lado=entrada.nextInt();
		do {
		if(contador%2==0) {
		for(i=1;i<=lado;i++){
			if(i%2==0) {
			System.out.printf("* ");
			}
			else {
				System.out.printf("  ");
			}
		}
		}
		else {
			for(i=1;i<=lado;i++){
				if(i%2!=0) {
				System.out.printf("* ");
				}
				else {
					System.out.printf("  ");
				}
		}
		}
		System.out.printf("\n");
		contador++;
		}while(contador<=lado);
		
//		*   * 
//		  *   *
//		*   * 
//		  *   *
		entrada.close();
	}

}
