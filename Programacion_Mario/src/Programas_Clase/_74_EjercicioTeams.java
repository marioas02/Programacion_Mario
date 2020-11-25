/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _74_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		
		int numero[]=new int[50];
		int matriz[][];
		int divisor;
		int resultado;
		int cont=0;
		
		for(int i=0;i<numero.length;i++) {
			numero[i]=(int)(Math.random()*100)+1; 
		}
		
		for(int i=0;i<numero.length;i++) {
			System.out.print(numero[i]+" ");
		}
//Filas=divisor y columnas=resultado
		System.out.println("Numero por el que quieres dividir el Array: ");
		divisor=entrada.nextInt();
		resultado=50/divisor;
		
		matriz=new int[divisor][resultado];
//2 1 5 6 3 4 9 8 7
//2 1 5
//6 3 4
//9 8 7
		for(int i=0;i<divisor;i++) {
			for(int j=0;j<resultado;j++) {
				matriz[i][j]=numero[cont];
				cont++;
			}
		}
//Pintar la matriz.
		for(int i=0;i<matriz.length;i++) {
			System.out.print("\n");
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
		}
		
	}

}
