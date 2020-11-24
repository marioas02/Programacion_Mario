/**
 * 
 */
package Semanales;

import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Semanal_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int peso_tela = 0;
		int peso_elefante;
		int suma;
		int total = 0;
		
		System.out.println("Introduzca el peso que aguanta la telaraña: ");
		peso_tela = entrada.nextInt();
		
		while(peso_tela!=0) {
			System.out.println("Introduzca el peso del elefante: ");
			peso_elefante = entrada.nextInt();
			suma = peso_elefante + total;
			total = suma;
			
			if(peso_tela<total) {
				System.out.println("Los elefantes pesan demasiado para esa telaraña. \n");
				System.out.println("Introduzca el peso que aguanta la telaraña: ");
				peso_tela = entrada.nextInt();
				total = 0;
			}
			if(peso_elefante==0) {
				System.out.println("La telaraña agunta mas. \n");
				System.out.println("Introduzca el peso que aguanta la telaraña: ");
				peso_tela = entrada.nextInt();
				total = 0;
			}
			
		}
		
		System.out.println("El peso de la telaraña no puede ser 0.");
		entrada.close();
	}
}
