/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _81c_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner = new Scanner(System.in);
		
		int resultado[]=intervalo2(10,100,5);
		for(int i=0;i<resultado.length;i++) {
			System.out.println(resultado[i]);
		}
		
		Scanner.close();
	}
	private static int[] intervalo2(int num1, int num2, int intervalo) {
		int array1[]=new int[(num2-num1)/intervalo+1];
		for(int i=num1, j=0; i<=num2;i=i+intervalo, j++) {
			array1[j]=i;
		}
		return array1;		
	}

}
