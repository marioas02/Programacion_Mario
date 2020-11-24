/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;
/**
 * @author magui
 *
 */
public class _15_5_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int salir=1;
		int anio;
		int dia;
		int mes;
		
		while(salir!=0) {
		System.out.println("Introduzca el dia: ");
		dia = entrada.nextInt();
		System.out.println("Introduzca el mes: ");
		mes = entrada.nextInt();
		System.out.println("Introduzca el año: ");
		anio = entrada.nextInt();
		
		System.out.printf("Su fecha es: %d / %d / %d \n", anio, mes, dia);
		System.out.println("Pulsa 0 si quiere salir si no pulse 1");
		salir = entrada.nextInt();	
		}
		
	
	entrada.close();
	}
	
}
