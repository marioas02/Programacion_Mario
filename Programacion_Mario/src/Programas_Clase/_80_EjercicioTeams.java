/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _80_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero");
		int n1 = Scanner.nextInt();
		System.out.println("Escribe un numero entero");
		int n2 = Scanner.nextInt();
		System.out.println("Escribe un numero entero");
		int n3 = Scanner.nextInt();
		
		int max=maximo(n1,n2,n3);
		System.out.println("El maximo es: " +max);
		
		Scanner.close();
	}
	
	private static int maximo(int numero1, int numero2, int numero3) {
		int maximo = 0;

		if (numero1 > numero2 && numero2 > numero3)
			maximo = numero1;
		if (numero2 > numero1 && numero1 > numero3)
			maximo = numero2;
		if (numero3 > numero1 && numero3 > numero2)
			maximo = numero3;

		return maximo;
	}
	
}
