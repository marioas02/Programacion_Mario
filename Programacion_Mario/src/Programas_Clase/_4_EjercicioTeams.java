/**
 * 
 */
package Programas_Clase;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class _4_EjercicioTeams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//ehy
		float primera;
		float segunda;
		float tercera;
		float cuarta;
		float media;
		
		System.out.println("Porfavor escriba su primera nota: ");
		primera = entrada.nextFloat();
		System.out.println("Porfavor escriba su segunda nota: ");
		segunda = entrada.nextFloat();
		System.out.println("Porfavor escriba su tercera nota: ");
		tercera = entrada.nextFloat();
		System.out.println("Porfavor escriba su cuarta nota: ");
		cuarta = entrada.nextFloat();
		
		media=(primera+segunda+tercera+cuarta)/4;
		
		System.out.printf("Su media es: %5.2f", media);
		
		entrada.close();
	}

}
