/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author MarioAguirre
 *
 */
public class _63_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int enteros[];
		enteros = new int[10];
		int suma_de_numeros=0;
		int menor = 0;
        int mayor = 0;
		//Bucle para recorrer array y completarlo con valores introducidos por el usuario
		for(int i=0; i<enteros.length; i++) {
			System.out.println("Introduce el numero de la posicion "+i);
			enteros[i]=entrada.nextInt();
		}
		// 4  6  7  1  0  3  -2  200
		menor=enteros[0];
  		mayor=enteros[0];
		for(int j=0; j<enteros.length; j++) {
			suma_de_numeros = suma_de_numeros + enteros[j];
	      	if (enteros[j]<menor)
	      		menor=enteros[j];
	      	if (enteros[j]>mayor)
	      		mayor=enteros[j];
		}
		System.out.println("La media de los numeros es " + suma_de_numeros/10);
		System.out.printf("Este es el numero menor: %d\n", menor);
	    System.out.printf("Este es el numero mayor: %d\n", mayor);
	}
}
