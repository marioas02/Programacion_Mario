/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _19_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero=1;
		int suma=0;
		
		System.out.println("Si introduce un 0 hara la suma de los numeros ya introducidos.");
		
		while (numero!=0) {
			System.out.println("Escribe un numero para hacer su suma: ");
			numero = entrada.nextInt();
			suma = suma + numero;
		}
		System.out.printf("La suma es: %d", suma);
		entrada.close();
		}
	}