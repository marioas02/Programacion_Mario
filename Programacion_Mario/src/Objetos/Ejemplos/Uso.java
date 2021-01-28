/**
 * 
 */
package Objetos.Ejemplos;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Uso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner (System.in);
		
		@SuppressWarnings("unused")
		double altura;
		@SuppressWarnings("unused")
		double radio;
		
		System.out.println("Introduce la altrua: ");
		altura=Scanner.nextDouble();
		System.out.println("Introduce el radio: ");
		radio=Scanner.nextDouble();
		
		//Cilindro micilindro=new Cilindro(altura, radio);
		//System.out.println("AREA CILINDRO: " +micilindro.area());
		
		Scanner.close();
	}

}
