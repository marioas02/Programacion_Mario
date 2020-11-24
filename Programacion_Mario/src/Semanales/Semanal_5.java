/**
 * 
 */
package Semanales;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author magui
 *
 */
public class Semanal_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		
		char palos [] = new char [4];
		int numero [] = new int [4];
		int contador [] = new int [3];
		int cont=1;
		System.out.printf("Los palos son: \n\t D = DIAMANTES \n\t P = PICAS \n\t T = TREBOLES \n\t C = CORAZONES.\n");
		
		for(int i=0;i<numero.length;i++) {
			System.out.printf("Escribe el numero de la %da carta: ", cont);
			numero[i] = entrada.nextInt();
//			System.out.printf("Escribe el palo de la %da carta: ", i+1);
//			palos[i] = entrada.next().charAt(0);
			
			if(numero[i]>=1 && numero[i]<=13 ) {
				System.out.printf("Escribe el palo de la %da carta: ", cont);
				palos[i] = entrada.next().charAt(0);
				
				if(palos[i] == 'D'|| palos[i] == 'P'|| palos[i] == 'T'|| palos[i] == 'C') {
					
				}else {
					System.out.println("El palo tiene que ser: D, P, T o C.");
					cont=0;
				}
			}else {
				System.out.println("Los numeros tiene que ir entre 1-13");
				cont=0;
			}
		}
		
		Arrays.sort(numero);
		
//		switch (numero[3]) {
//			case 4:  System.out.printf("Falta un: %d", numero[3]+1);
//            	break;
//			case 5:  System.out.printf("Falta un: %d", numero[3]+1);
//            	break;
//			case 6:  System.out.printf("Falta un: %d", numero[3]+1);
//            	break;
//			case 7:  System.out.printf("Falta un: %d", numero[3]+1);
//            	break;
//			case 8: System.out.printf("Falta un: %d", numero[3]+1);
//            	break;
//			case 9: System.out.printf("Falta un: %d", numero[3]+1);
//        		break;
//			case 10: System.out.printf("Falta un: %d", numero[3]+1);
//        		break;
//			case 11: System.out.printf("Falta un: %d", numero[3]+1);
//        		break;
//			case 12: System.out.printf("Falta un: %d", numero[3]+1);
//        		break;
//			case 13: System.out.printf("Falta un: %d", numero[0]);
//        		break;
//			}
		for(int i=0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
		for(int i=0; i<palos.length; i++) {
			System.out.println(palos[i]);
		}
		
		
//		for(int i=0; i<numero.length; i++) {
//			System.out.println(numero[i]);
//		}
//		for(int i=0; i<palos.length; i++) {
//			System.out.println(palos[i]);
//		}
		
		
		
		//ESTO VA PARA VER SI EXISTE LA CARTE, NO FUNCIONA ;(
//		if(numero[i]>1 || numero[i]<14 ) {
//			if(palos[i] == 'D'||palos[i] == 'P'||palos[i] == 'T'||palos[i] == 'C') {
//				System.out.println("El palo tiene que ser: D, P, T o C.");
//				i=i-1;
//			}
//			else {
//				
//			}
//		}
//		else {
//			System.out.println("Los numeros tiene que ir entre 1-13");	
//			i=i-1;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
      	}
}