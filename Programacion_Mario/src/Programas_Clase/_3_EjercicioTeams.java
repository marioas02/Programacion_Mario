/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _3_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		
		 int n1;
		 int n2;
		 int resultado; 
		 
		 System.out.printf("Escribe el primer numero entero: \n"); 
		 n1 = entrada.nextInt(); 
		 System.out.printf("Escribe el Segundo numero entero: \n"); 
		 n2 = entrada.nextInt(); 
		 System.out.printf("\n"); 
		 resultado= n1+n2; 
		 System.out.printf("%d+%d=%d\n",n1, n2, resultado); 
		 resultado= n1-n2; 
		 System.out.printf("%d-%d=%d\n",n1, n2, resultado); 
		 resultado= n1*n2; 
		 System.out.printf("%d*%d=%d\n",n1, n2, resultado); 
		 resultado= n1/n2; 
		 System.out.printf("%d/%d=%d\n",n1, n2, resultado); 
		 
		 entrada.close();
	}
}
