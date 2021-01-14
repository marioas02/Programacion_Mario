/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _81b_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		int numero1, numero2;
		System.out.println("Escribe un numero entero: ");
		numero1 = Scanner.nextInt();
		System.out.println("Escribe otro numero entero: ");
		numero2 = Scanner.nextInt();
		
		int resultado[]=intervalo2(numero1,numero2);
			for(int i=0; i<resultado.length;i++) {
				System.out.println(resultado[i]);
			}
			
			Scanner.close();
	}
	private static int[] intervalo2(int numero1, int numero2) {
		int array1[]=new int[numero2-numero1+1];
		for(int i=numero1,j=0;i<=numero2;i++,j++) {
			array1[j]=i;
		}
		return array1;
	}

}
