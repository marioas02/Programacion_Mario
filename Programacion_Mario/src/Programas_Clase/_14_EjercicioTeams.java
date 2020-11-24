/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _14_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		//Scanner entrada1= new Scanner(System.in);
		
		
		
		System.out.printf("Buenos dias! introduzca 1 SI QUIERE o introduzca 0 SI NO QUIERE.\n");
		//int edad = entrada.nextInt();
		System.out.printf("Porfacor introduzca la edad del pasajero: \n");
		//System.in.;
		System.out.printf("El precio inicial del vuelo es: 100€. \n");
		System.out.printf("¿Quiere elegir asiento? ");
		int asiento = entrada.nextInt();		
		if(asiento == 1) {
			System.out.printf("Su billete ha ascendido 10€. \n");
		}
		System.out.printf("¿Quiere llevar equipaje? \n");
			
		int equipaje = entrada.nextInt();
		if(equipaje == 1) {
			System.out.printf("Su billete ha ascendido 50€. \n");
		}
		System.out.printf("¿Quiere comida durante el vuelo");
		
		int comida = entrada.nextInt();
		if(comida == 1) {
			System.out.printf("Su billete ha ascendido 20€. \n");
		}
		
		
		
		entrada.close();
	}
}
