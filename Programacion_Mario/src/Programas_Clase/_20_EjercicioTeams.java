/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _20_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int numero=1;
		int suma=0;
		int media=0;
		int contador=0;
		
		System.out.println("Si introduce un 0 hara la suma de los numeros ya introducidos.");
		System.out.println("Escribe un numero para hacer su suma: ");
		numero = entrada.nextInt();
		
		while (numero!=0) {
			
			suma = suma + numero;
			contador=contador+1;
			if (numero==0) {
				media=suma/contador;
			}
			else {
				System.out.println("Escribe un numero para hacer su suma: ");
				numero = entrada.nextInt();
			}
		}
		System.out.printf("La suma es: %d\n", suma);
		System.out.printf("La media es: %d", media);
		entrada.close();
		}
	}