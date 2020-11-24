/**
 * 
 */
package Semanales;

import java.util.Scanner;
/**
 * @author magui
 *
 */
public class Semanal_3V2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int metros;
		int campos;
		int div;
		
		System.out.println("Si introduce los metros cuadrados = 0, el programa finalizará.");
		System.out.println("Introduce los metros cuadrados: ");
		metros = entrada.nextInt();
		
		while (metros!=0){	
			System.out.println("Porfavor recuerda que no puedes poner en campos de fútbol = 0.");
			System.out.println("Introduce los campos de fútbol: ");
			campos = entrada.nextInt();
			
			if(campos==0) {
				System.out.println("Da ERROR!");
			}
			else {
				
				div=metros/campos;
				
				if(div>=4050 && div<=10800) {
					System.out.println("SI \n");
				}
				else { 
					System.out.println("NO \n");	
				}
				System.out.println("Si introduce los metros cuadrados = 0, el programa finalizará.");
				System.out.println("Introduce los metros cuadrados: ");
				metros = entrada.nextInt();
			}
		}
		entrada.close();
	}
}