/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _23_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		int primer_numero = 0;
		
		System.out.println("Porfavor escribe un numero y te dire los numeros pars que hay hasta ese numero.");
		numero = entrada.nextInt();
				
		while(primer_numero < numero||primer_numero < numero && primer_numero == numero - 1){
			primer_numero += 2;
			System.out.printf("%d ", primer_numero);
		}
		entrada.close();

	}

}
