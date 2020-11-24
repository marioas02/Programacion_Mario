/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _16_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int primer;
		int segundo;
		int intervalo;
		
		System.out.println("Introduce el primer numero: ");
		primer = entrada.nextInt();
		System.out.println("Introduce el segundo numero: ");
		segundo = entrada.nextInt();
		System.out.println("Introduce el intervalo de numero que quieras: ");
		intervalo = entrada.nextInt();
		
		do {
			primer=primer+intervalo;
			System.out.printf("%d ", primer);
			
		}while(primer < segundo);
		
		entrada.close();
	}

}
