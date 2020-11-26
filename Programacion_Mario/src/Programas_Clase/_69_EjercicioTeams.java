/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _69_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		
		int numero [] = new int [10];
		int posicion=0,num=0;
		
		for(int i=0;i<numero.length-2;i++) {
			numero[i]=(int)(Math.random()*100)+1; 
		}
		
		System.out.println("Asi queda el primer Array :");
		for(int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		for(int i=0;i<2;i++) {
			
			System.out.println("Escribe un numero: ");
			num=entrada.nextInt();
			System.out.println("Escribe una posicion: ");
			posicion=entrada.nextInt();
		
		
			for(int j=numero.length-1; j>posicion; j--) {
				numero[j]=numero[j-1];
			}
			numero[posicion]=num;
		}
		
		System.out.printf("Asi queda el segundo Array");
		for(int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		entrada.close();
	}

}
