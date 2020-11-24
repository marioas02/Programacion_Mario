/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _22_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int base;
		int exponente;
		int operacion = 1;
		
		System.out.println("Porfavor escriba la base de la potencia: ");
		base = entrada.nextInt();
		System.out.println("Porfavor escriba el exponente de la potencia: ");
		exponente = entrada.nextInt();
		
		for(int i=1;i<=exponente;i++) {
			operacion = operacion * base;
		}
		
		System.out.printf("El resultado de %d elevado a %d es: %d", base, exponente, operacion);
		
		entrada.close();
	}
}
