/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 * Ejercicio 13 de Teams.
 */
public class _13_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escriba la nota que ha sacado en el ultimo examen: \t");
		
		float nota = entrada.nextFloat();
		
		if(nota<5) {
			System.out.printf("Tu nota es un Insuficiente.");
		}
		else if(nota >= 5 && nota < 6) {
			System.out.printf("Tu nota es un Suficiente.");
		}
		else if(nota >= 6 && nota < 7) {
			System.out.printf("Tu nota es un Bien.");
		}
		else if(nota >= 7 && nota < 9) {
			System.out.printf("Tu nota es un Notable.");
		}
		else if(nota >= 9 && nota <=10) {
			System.out.printf("Tu nota es un Excelente.");
		}
		else {
			System.out.printf("Tu nota no existe.");
		}
		
		//Acordarse siempre de cerrar el Scanner para evitar un Warning
		entrada.close();
	}

}
