/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _1_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int primer;
		int segundo;
		int suma;
		
		System.out.println("Primer numero para hacer la Suma: ");
		primer = entrada.nextInt();
		System.out.println("Segundo numero para hacer la Suma: ");
		segundo = entrada.nextInt();
		
		suma=primer+segundo;
		
		System.out.printf("La suma de %d + %d = %d", primer, segundo, suma);
	
		entrada.close();
	}
}
